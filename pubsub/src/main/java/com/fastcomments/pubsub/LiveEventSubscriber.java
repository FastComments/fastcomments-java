package com.fastcomments.pubsub;

import com.fastcomments.api.PublicApi;
import com.fastcomments.core.CommentWidgetConfig;
import com.fastcomments.invoker.ApiCallback;
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import okhttp3.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;

/**
 * Main class for subscribing to FastComments live changes
 */
public class LiveEventSubscriber {

    private static final long RECONNECT_DELAY_INITIAL_MS = 4000;
    private static final long RECONNECT_DELAY_MAX_MS = 60000;
    // A rejected upgrade (4xx: auth, rate limit, bad params) won't clear up in seconds, so it's retried rarely instead.
    private static final long REJECTED_RECONNECT_DELAY_MS = 5 * 60 * 1000;

    private static final long DEFAULT_PING_INTERVAL_SECONDS = 25;
    private static final long TESTING_PING_INTERVAL_SECONDS = 5;

    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(java.time.OffsetDateTime.class,
                    (JsonDeserializer<java.time.OffsetDateTime>) (json, type, ctx) ->
                            java.time.OffsetDateTime.parse(json.getAsString()))
            .create();
    private static final OkHttpClient httpClient = new OkHttpClient.Builder()
        .connectionPool(new ConnectionPool(5, 5, TimeUnit.MINUTES))
        .dispatcher(new Dispatcher())
        .build();
    private final OkHttpClient client;
    // Tests point this at a local server; null means the region's real host.
    private final String wsHostOverride;
    private final ScheduledThreadPoolExecutor reconnectScheduler = newReconnectScheduler();
    // Tests pin this to make reconnect timing deterministic.
    private final DoubleSupplier jitter;

    private final Map<String, Timer> debouncers = new ConcurrentHashMap<>();
    private ConnectionStatusChangeCallback onConnectionStatusChange;

    private static OkHttpClient buildClient(long pingIntervalSeconds) {
        return new OkHttpClient.Builder()
            .readTimeout(0, TimeUnit.SECONDS) // no read timeout for ws
            .pingInterval(pingIntervalSeconds, TimeUnit.SECONDS) // protocol-level WebSocket ping to keep NATs alive (emulators, silly networks, etc)
            .protocols(Collections.singletonList(Protocol.HTTP_1_1)) // just skip negotiating, server is 1.1, reduces latency
            .connectionPool(new ConnectionPool(5, 5, TimeUnit.MINUTES)) // create our own connection pool so it doesn't get shared w/ another okhttpclient config
            .dispatcher(new Dispatcher())
            .build();
    }

    // One thread per subscriber that exits when idle, instead of a Timer thread per reconnect left waiting for GC.
    private static ScheduledThreadPoolExecutor newReconnectScheduler() {
        ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1, runnable -> {
            Thread thread = new Thread(runnable, "fastcomments-ws-reconnect");
            thread.setDaemon(true);
            return thread;
        });
        scheduler.setKeepAliveTime(30, TimeUnit.SECONDS);
        scheduler.allowCoreThreadTimeOut(true);
        scheduler.setRemoveOnCancelPolicy(true);
        return scheduler;
    }

    /**
     * Delay before reconnect attempt number {@code attempt} (0-based): full jitter over a window that starts at 4s and
     * doubles to a 60s cap. A server restart drops every client at once, so the first retry (and the event-log fetch
     * each reconnect makes) has to spread over seconds, not land in one burst.
     */
    static long reconnectDelayMs(int attempt, double random) {
        long window = Math.min(RECONNECT_DELAY_MAX_MS, RECONNECT_DELAY_INITIAL_MS << Math.min(attempt, 4));
        return (long) (window * random);
    }

    /**
     * State shared by every socket one subscribeToChanges call opens, since reconnects replace the socket.
     */
    private static final class SubscriptionState {
        final AtomicBoolean closed = new AtomicBoolean();
        final AtomicReference<WebSocket> socket = new AtomicReference<>();
        // Only the newest connection may reconnect, so a late failure from a replaced socket can't open a second one.
        final AtomicInteger generation = new AtomicInteger();
        final AtomicInteger failedAttempts = new AtomicInteger();
    }

    public LiveEventSubscriber() {
        this(DEFAULT_PING_INTERVAL_SECONDS, null);
    }

    LiveEventSubscriber(long pingIntervalSeconds, String wsHostOverride) {
        this(pingIntervalSeconds, wsHostOverride, Math::random);
    }

    LiveEventSubscriber(long pingIntervalSeconds, String wsHostOverride, DoubleSupplier jitter) {
        this.client = buildClient(pingIntervalSeconds);
        this.wsHostOverride = wsHostOverride;
        this.jitter = jitter;
    }

    /**
     * Creates a LiveEventSubscriber configured for testing with a 5s ping interval,
     * useful for Android NAT environments where connections drop more aggressively.
     */
    public static LiveEventSubscriber createTesting() {
        return new LiveEventSubscriber(TESTING_PING_INTERVAL_SECONDS, null);
    }
    // Written from socket reader threads and the event-log fetch's callback thread; a lost max() update moves it
    // backwards, and the next reconnect then refetches events already delivered.
    private final AtomicLong lastEventTime = new AtomicLong();

    void recordEventTime(long timestamp) {
        lastEventTime.accumulateAndGet(timestamp, Math::max);
    }

    long getLastEventTime() {
        return lastEventTime.get();
    }

    /**
     * Interface for a callback that checks if comments can be seen before handling a live event.
     */
    public interface CanSeeCommentsCallback {
        void check(List<String> commentIds, Consumer<Map<String, String>> resultCallback);
    }

    /**
     * Interface for a callback that is invoked when a new live event is found.
     */
    public interface HandleLiveEventCallback {
        void handle(LiveEvent eventData);
    }

    /**
     * Interface for a callback that is invoked when the connection status changes.
     */
    public interface ConnectionStatusChangeCallback {
        void onChange(boolean isConnected, Long lastLiveEventTime);
    }

    public void setOnConnectionStatusChange(ConnectionStatusChangeCallback onConnectionStatusChange) {
        this.onConnectionStatusChange = onConnectionStatusChange;
    }

    /**
     * Extract comment ID from a live event
     */
    private static String extractCommentIdFromEvent(LiveEvent liveEvent) {
        if (Objects.equals(liveEvent.getType(), LiveEventType.NEW_COMMENT)) {
            //noinspection DataFlowIssue
            return liveEvent.getComment().getId();
        }
        return null;
    }

    /**
     * Process events with optional visibility check
     */
    private void processEvents(
            List<LiveEvent> events,
            CanSeeCommentsCallback canSeeCommentsCallback,
            HandleLiveEventCallback handleLiveEvent
    ) {
        if (events.isEmpty()) {
            return;
        }

        // Helper to handle events after visibility check
        Consumer<Map<String, String>> handleEvents = (Map<String, String> blockedCommentIdMap) -> {
            for (LiveEvent eventData : events) {
                try {
                    // Update the last live event time
                    if (eventData.getTimestamp() != null) {
                        recordEventTime(eventData.getTimestamp());
                    }

                    // Extract comment ID for blocking check
                    String commentId = extractCommentIdFromEvent(eventData);

                    // Process event if not blocked
                    if (blockedCommentIdMap == null || !blockedCommentIdMap.containsKey(commentId)) {
                        handleLiveEvent.handle(eventData);
                    }
                } catch (Exception e) {
                    System.err.println("FastComments: Error processing event: " + e.getMessage());
                }
            }
        };

        // Check if we need to filter comments based on visibility
        if (canSeeCommentsCallback != null) {
            List<String> ids = new ArrayList<>();

            // Collect comment IDs to check
            for (LiveEvent event : events) {
                String id = extractCommentIdFromEvent(event);
                if (id != null) {
                    ids.add(id);
                }
            }

            // If we have IDs to check, query which ones are allowed
            if (!ids.isEmpty()) {
                canSeeCommentsCallback.check(ids, handleEvents);
            } else {
                // No comments to check, process all events
                handleEvents.accept(null);
            }
        } else {
            // No visibility check needed, process all events
            handleEvents.accept(null);
        }
    }

    /**
     * WebSocket listener for FastComments events
     */
    private class FastCommentsWebSocketListener extends WebSocketListener {
        private final HandleLiveEventCallback handleLiveEvent;
        private final CanSeeCommentsCallback canSeeCommentsCallback;
        private final SubscriptionState state;
        private final int generation;
        private final CommentWidgetConfig config;
        // onClosing and onClosed both fire for one close, on different OkHttp threads, so this must be atomic: two
        // reconnects would leave a socket open that close() never reaches, delivering every event twice.
        private final AtomicBoolean reconnectScheduled = new AtomicBoolean();
        private final String tenantId;
        private final String urlId;
        private final String urlIdWS;
        private final String userIdWS;

        public FastCommentsWebSocketListener(
                HandleLiveEventCallback handleLiveEvent,
                CanSeeCommentsCallback canSeeCommentsCallback,
                SubscriptionState state,
                CommentWidgetConfig config,
                String tenantId,
                String urlId,
                String urlIdWS,
                String userIdWS
        ) {
            this.handleLiveEvent = handleLiveEvent;
            this.canSeeCommentsCallback = canSeeCommentsCallback;
            this.state = state;
            this.generation = state.generation.get();
            this.config = config;
            this.tenantId = tenantId;
            this.urlId = urlId;
            this.urlIdWS = urlIdWS;
            this.userIdWS = userIdWS;
        }

        @Override
        public void onOpen(WebSocket webSocket, Response response) {
            if (state.closed.get()) {
                webSocket.close(1000, "Intentionally closed");
                return;
            }
            state.failedAttempts.set(0);

            // Fetch missed events if we have a last event time
            long since = lastEventTime.get();
            if (since > 0) {
                fetchEventLog(config.region, tenantId, urlId, userIdWS, since, new Date().getTime(),
                        events -> processEvents(events, canSeeCommentsCallback, handleLiveEvent));
            }

            // Call connection status change callback
            if (onConnectionStatusChange != null) {
                onConnectionStatusChange.onChange(true, since);
            }
        }

        @Override
        public void onMessage(WebSocket webSocket, String text) {
            if (state.closed.get()) {
                return;
            }

            try {
                // Parse event data
                LiveEvent eventDataParsed = gson.fromJson(text, LiveEvent.class);

                // Update last event time
                if (eventDataParsed.getTimestamp() != null) {
                    recordEventTime(eventDataParsed.getTimestamp());
                } else {
                    // otherwise getTs() might not be null, but those are for presence updates only, and those are not stored in the log so we don't
                    // want to track them
                }

                // Create a list with a single event
                List<LiveEvent> singleEventList = new ArrayList<>(1);
                singleEventList.add(eventDataParsed);

                // Process the event
                processEvents(singleEventList, canSeeCommentsCallback, handleLiveEvent);
            } catch (Exception e) {
                System.err.println("FastComments: Error processing WebSocket message: " + e.getMessage());
                e.printStackTrace();
            }
        }

        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            System.err.println("FastComments: WebSocket error: " + t.getMessage());
            if (response != null) {
                System.err.println("FastComments: WebSocket error response code: " + response.code());
                System.err.println("FastComments: WebSocket error response message: " + response.message());
            }
            t.printStackTrace();

            // A failed connect or a dropped socket (a server restart, a network change) ends here, not in onClosed,
            // so this has to reconnect too. The reconnect's onOpen fetches the events missed meanwhile.
            boolean rejected = response != null && response.code() >= 400 && response.code() < 500;
            cleanup(rejected);
        }

        @Override
        public void onClosing(WebSocket webSocket, int code, String reason) {
            webSocket.close(1000, "Client closing");
            cleanup(false);
        }

        @Override
        public void onClosed(WebSocket webSocket, int code, String reason) {
            cleanup(false);
        }

        private void cleanup(boolean rejected) {
            // Clean up all debouncer timers
            for (Timer timer : debouncers.values()) {
                timer.cancel();
            }
            debouncers.clear();

            // Initialize last event time if not set
            lastEventTime.compareAndSet(0, new Date().getTime());

            // Call connection status change callback
            if (!state.closed.get() && state.generation.get() == generation
                    && reconnectScheduled.compareAndSet(false, true)) {
                if (onConnectionStatusChange != null) {
                    onConnectionStatusChange.onChange(false, lastEventTime.get());
                }

                long delay = rejected
                        ? REJECTED_RECONNECT_DELAY_MS
                        : reconnectDelayMs(state.failedAttempts.getAndIncrement(), jitter.getAsDouble());
                reconnectScheduler.schedule(() -> {
                    if (!state.closed.get()) {
                        // Same subscription state, so the caller's close() reaches the new socket
                        connect(config, tenantId, urlId, urlIdWS, userIdWS, canSeeCommentsCallback, handleLiveEvent,
                                state);
                    }
                }, delay, TimeUnit.MILLISECONDS);
            }
        }
    }

    /**
     * Fetch event log from API using PublicApi client
     */
    private static void fetchEventLog(
            String region,
            String tenantId,
            String urlId,
            String userIdWS,
            long startTime,
            long endTime,
            Consumer<List<LiveEvent>> callback
    ) {
        try {
            // Create PublicApi instance with its own HTTP client, pointed at the region's host
            // so the "fetch missed events" fallback queries EU infra for EU tenants instead of US.
            ApiClient apiClient = new ApiClient(httpClient);
            if (Objects.equals(region, "eu")) {
                apiClient.setBasePath("https://eu.fastcomments.com");
            }
            PublicApi publicApi = new PublicApi(apiClient);

            // Create API request
            PublicApi.APIgetEventLogRequest request =
                    publicApi.getEventLog(tenantId, urlId, userIdWS, startTime).endTime(endTime);

            // Execute the request asynchronously
            request.executeAsync(new ApiCallback<GetEventLogResponse>() {
                @Override
                public void onSuccess(GetEventLogResponse response, int statusCode, Map<String, List<String>> responseHeaders) {
                    List<LiveEvent> parsedEvents = new ArrayList<>();

                    try {
                        if (response == null) {
                            System.err.println("FastComments: fetchEventLog received null response");
                            callback.accept(parsedEvents);
                            return;
                        }

                        List<EventLogEntry> events = response.getEvents();

                        // Process the events if we have any
                        if (events != null && !events.isEmpty()) {
                            // Convert event entries to JSON objects
                            for (EventLogEntry event : events) {
                                String data = event.getData();
                                if (data != null && !data.isEmpty()) {
                                    try {
                                        parsedEvents.add(gson.fromJson(data, LiveEvent.class));
                                    } catch (Exception e) {
                                        System.err.println("FastComments: Error parsing event data: " + e.getMessage());
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.err.println("FastComments: Error processing event log: " + e.getMessage());
                        e.printStackTrace();
                    } finally {
                        callback.accept(parsedEvents);
                    }
                }

                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    System.err.println("FastComments: fetchEventLog FAILURE: " + e.getMessage());
                    System.err.println("FastComments: API error code: " + e.getCode());
                    System.err.println("FastComments: API error response: " + e.getResponseBody());
                    callback.accept(new ArrayList<>());
                }

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                    // Not used
                }

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                    // Not used
                }
            });
        } catch (Exception e) {
            System.err.println("FastComments: Error in fetchEventLog: " + e.getMessage());
            callback.accept(new ArrayList<>());
        }
    }

    /**
     * Subscribe to changes from FastComments.
     *
     * @param config                 The Config object
     * @param tenantIdWS             The tenant id sanitized for websocket server
     * @param urlId                  The url id that events are tied to
     * @param urlIdWS                The url id sanitized for websocket server
     * @param userIdWS               The user's "presence id"
     * @param canSeeCommentsCallback A callback invoked to check if comments can be seen
     * @param handleLiveEvent        A callback invoked when a new live event is found
     * @return A SubscribeToChangesResult that can be used to close the connection
     */
    public SubscribeToChangesResult subscribeToChanges(
            CommentWidgetConfig config,
            String tenantIdWS,
            String urlId,
            String urlIdWS,
            String userIdWS,
            CanSeeCommentsCallback canSeeCommentsCallback,
            HandleLiveEventCallback handleLiveEvent
    ) {
        try {
            // Check if live commenting is disabled in config
            if (Boolean.TRUE.equals(config.disableLiveCommenting)) {
                return null;
            }

            final SubscriptionState state = new SubscriptionState();
            lastEventTime.compareAndSet(0, new Date().getTime());

            try {
                connect(config, tenantIdWS, urlId, urlIdWS, userIdWS, canSeeCommentsCallback, handleLiveEvent, state);

                // Return result with close handler
                return new SubscribeToChangesResult(() -> {
                    state.closed.set(true);
                    // Reconnects replace the socket, so this closes whichever one is current.
                    WebSocket webSocket = state.socket.get();
                    if (webSocket != null) {
                        webSocket.close(1000, "Closed by user");
                    }
                });
            } catch (Exception e) {
                System.err.println("FastComments: Error setting up WebSocket: " + e.getMessage());
                return null;
            }
        } catch (Exception e) {
            System.err.println("FastComments: Error in subscribeToChanges: " + e.getMessage());
            return null;
        }
    }

    private void connect(
            CommentWidgetConfig config,
            String tenantIdWS,
            String urlId,
            String urlIdWS,
            String userIdWS,
            CanSeeCommentsCallback canSeeCommentsCallback,
            HandleLiveEventCallback handleLiveEvent,
            SubscriptionState state
    ) {
        state.generation.incrementAndGet();
        // Build the WebSocket URL with query parameters
        final String WS_HOST = wsHostOverride != null ? wsHostOverride
                : Objects.equals(config.region, "eu") ? "wss://ws-eu.fastcomments.com" : "wss://ws.fastcomments.com";
        String wsUrl = WS_HOST + "/sub" + "?urlId=" + urlIdWS +
                "&userIdWS=" + userIdWS +
                "&tenantIdWS=" + tenantIdWS;
        FastCommentsWebSocketListener listener = new FastCommentsWebSocketListener(
                handleLiveEvent,
                canSeeCommentsCallback,
                state,
                config,
                tenantIdWS,
                urlId,
                urlIdWS,
                userIdWS
        );
        Request request = new Request.Builder()
                .url(wsUrl)
                .build();
        state.socket.set(client.newWebSocket(request, listener));
    }

}
package com.winricklabs;

import com.fastcomments.api.PublicApi;
import com.fastcomments.core.CommentWidgetConfig;
import com.fastcomments.invoker.ApiCallback;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.*;
import com.google.gson.Gson;
import okhttp3.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * Main class for subscribing to FastComments live changes
 */
public class LiveEventSubscriber {

    private static final long SUBSCRIBE_TO_CHANGES_DEBOUNCE = 300; // milliseconds
    private static final long WEBSOCKET_PING_INTERVAL = 60000; // 60 seconds
    private static final long POLLING_INTERVAL = 2000; // 2 seconds
    private static final long RECONNECT_INTERVAL_BASE = 4000; // 4 seconds

    private static final Gson gson = new Gson();
    private final OkHttpClient client = new OkHttpClient();

    private final Map<String, Timer> debouncers = new ConcurrentHashMap<>();
    private ConnectionStatusChangeCallback onConnectionStatusChange;
    private long lastEventTime;

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

    private void setOnConnectionStatusChange(ConnectionStatusChangeCallback onConnectionStatusChange) {
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
                    long eventTimestamp = eventData.getTimestamp();
                    lastEventTime = Math.max(lastEventTime, eventTimestamp + 1);

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
        private final boolean[] isIntentionallyClosed;
        private final CommentWidgetConfig config;
        private final Timer pingTimer = new Timer();
        private final String tenantId;
        private final String urlId;
        private final String userIdWS;

        public FastCommentsWebSocketListener(
                HandleLiveEventCallback handleLiveEvent,
                CanSeeCommentsCallback canSeeCommentsCallback,
                boolean[] isIntentionallyClosed,
                CommentWidgetConfig config,
                String tenantId,
                String urlId,
                String userIdWS
        ) {
            this.handleLiveEvent = handleLiveEvent;
            this.canSeeCommentsCallback = canSeeCommentsCallback;
            this.isIntentionallyClosed = isIntentionallyClosed;
            this.config = config;
            this.tenantId = tenantId;
            this.urlId = urlId;
            this.userIdWS = userIdWS;
        }

        @Override
        public void onOpen(WebSocket webSocket, Response response) {
            if (isIntentionallyClosed[0]) {
                webSocket.close(1000, "Intentionally closed");
                return;
            }

            // Setup ping timer to keep connection alive
            pingTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    try {
                        webSocket.send("ping");
                    } catch (Exception e) {
                        // Ignore ping errors
                    }
                }
            }, WEBSOCKET_PING_INTERVAL, WEBSOCKET_PING_INTERVAL);

            // Fetch missed events if we have a last event time
            if (lastEventTime > 0) {
                fetchEventLog(tenantId, urlId, userIdWS, lastEventTime, new Date().getTime(),
                        events -> processEvents(events, canSeeCommentsCallback, handleLiveEvent));
            }

            // Call connection status change callback
            if (onConnectionStatusChange != null) {
                onConnectionStatusChange.onChange(true, lastEventTime);
            }
        }

        @Override
        public void onMessage(WebSocket webSocket, String text) {
            if (isIntentionallyClosed[0]) {
                return;
            }

            try {
                // Parse event data
                LiveEvent eventDataParsed = gson.fromJson(text, LiveEvent.class);

                // Update last event time
                long eventTimestamp = eventDataParsed.getTimestamp();
                lastEventTime = Math.max(lastEventTime, eventTimestamp);

                // Create a list with a single event
                List<LiveEvent> singleEventList = new ArrayList<>();
                singleEventList.add(eventDataParsed);

                // Process the event
                processEvents(singleEventList, canSeeCommentsCallback, handleLiveEvent);
            } catch (Exception e) {
                System.err.println("FastComments: Error processing WebSocket message: " + e.getMessage());
            }
        }

        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            System.err.println("FastComments: WebSocket error: " + t.getMessage());

            // Fetch missed events if we have a last event time
            if (lastEventTime > 0) {
                fetchEventLog(tenantId, urlId, userIdWS, lastEventTime, new Date().getTime(),
                        events -> processEvents(events, canSeeCommentsCallback, handleLiveEvent));
            }
        }

        @Override
        public void onClosing(WebSocket webSocket, int code, String reason) {
            webSocket.close(1000, "Client closing");
            cleanup();
        }

        @Override
        public void onClosed(WebSocket webSocket, int code, String reason) {
            cleanup();
        }

        private void cleanup() {
            // Clean up ping timer
            pingTimer.cancel();

            // Initialize last event time if not set
            if (lastEventTime <= 0) {
                lastEventTime = new Date().getTime();
            }

            // Call connection status change callback
            if (!isIntentionallyClosed[0]) {
                if (onConnectionStatusChange != null) {
                    onConnectionStatusChange.onChange(false, lastEventTime);
                }

                // Schedule reconnection with jitter
                double jitter = Math.random();
                long reconnectDelay = (long) (RECONNECT_INTERVAL_BASE * jitter);

                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (!isIntentionallyClosed[0]) {
                            // Reconnect using the subscribeToChanges method to handle the full setup
                            subscribeToChanges(
                                    config,
                                    tenantId,
                                    urlId,
                                    urlId, // We'll use urlId for urlIdWS too since it's already normalized
                                    userIdWS,
                                    canSeeCommentsCallback,
                                    handleLiveEvent
                            );
                        }
                    }
                }, reconnectDelay);
            }
        }
    }

    /**
     * Fetch event log from API using PublicApi client
     */
    private static void fetchEventLog(
            String tenantId,
            String urlId,
            String userIdWS,
            long startTime,
            long endTime,
            Consumer<List<LiveEvent>> callback
    ) {
        try {
            // Create PublicApi instance
            PublicApi publicApi = new PublicApi();

            // Create API request
            PublicApi.APIgetEventLogRequest request =
                    publicApi.getEventLog(tenantId, urlId, userIdWS, startTime, endTime);

            // Execute the request asynchronously
            request.executeAsync(new ApiCallback<GetEventLog200Response>() {
                @Override
                public void onSuccess(GetEventLog200Response response, int statusCode, Map<String, List<String>> responseHeaders) {
                    List<LiveEvent> parsedEvents = new ArrayList<>();

                    try {
                        if (response == null) {
                            System.err.println("FastComments: fetchEventLog received null response");
                            callback.accept(parsedEvents);
                            return;
                        }

                        if (response.getActualInstance() instanceof GetEventLogResponseAnyOf) {
                            GetEventLogResponseAnyOf eventLogResponse =
                                    ((GetEventLogResponseAnyOf) response.getActualInstance());

                            List<EventLogEntry> events = eventLogResponse.getEvents();

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
                        } else if (response.getActualInstance() instanceof APIError) {
                            APIError error = (APIError) response.getActualInstance();
                            System.err.println("FastComments: fetchEventLog API error: " +
                                    error.getReason());
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
     * @param config                   The Config object
     * @param tenantIdWS               The tenant id sanitized for websocket server
     * @param urlId                    The url id that events are tied to
     * @param urlIdWS                  The url id sanitized for websocket server
     * @param userIdWS                 The user's "presence id"
     * @param canSeeCommentsCallback   A callback invoked to check if comments can be seen
     * @param handleLiveEvent          A callback invoked when a new live event is found
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

            final boolean[] isIntentionallyClosed = {false};
            lastEventTime = lastEventTime != 0 ? lastEventTime : new Date().getTime();

            // Check if we should use polling instead of WebSocket

            // Use WebSocket for live updates
            try {
                // Build the WebSocket URL with query parameters
                final String WS_HOST = Objects.equals(config.region, "eu") ? "wss://ws-eu.fastcomments.com" : "wss://ws.fastcomments.com";
                String wsUrl = WS_HOST + "/sub" + "?urlId=" + urlIdWS +
                        "&userIdWS=" + userIdWS +
                        "&tenantIdWS=" + tenantIdWS;

                // Create WebSocket listener
                FastCommentsWebSocketListener listener = new FastCommentsWebSocketListener(
                        handleLiveEvent,
                        canSeeCommentsCallback,
                        isIntentionallyClosed,
                        config,
                        tenantIdWS,
                        urlId,
                        userIdWS
                );

                // Create request for WebSocket connection
                Request request = new Request.Builder()
                        .url(wsUrl)
                        .build();

                // Connect to WebSocket
                final WebSocket webSocket = client.newWebSocket(request, listener);

                // Return result with close handler
                return new SubscribeToChangesResult(() -> {
                    isIntentionallyClosed[0] = true;
                    webSocket.close(1000, "Closed by user");
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
}
package com.fastcomments.pubsub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.fastcomments.core.CommentWidgetConfig;
import com.fastcomments.model.LiveEvent;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import okhttp3.mockwebserver.SocketPolicy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LiveEventSubscriberReconnectTest {

    private MockWebServer server;
    private SubscribeToChangesResult subscription;

    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        server.start();
    }

    @After
    public void tearDown() throws Exception {
        if (subscription != null) {
            subscription.close();
        }
        server.shutdown();
    }

    private String wsHost() {
        String url = server.url("/").toString().replaceFirst("^http", "ws");
        return url.substring(0, url.length() - 1);
    }

    private MockResponse acceptAndSend(String message) {
        return new MockResponse()
                .withWebSocketUpgrade(
                        new WebSocketListener() {
                            @Override
                            public void onOpen(WebSocket webSocket, Response response) {
                                webSocket.send(message);
                            }

                            @Override
                            public void onClosing(WebSocket webSocket, int code, String reason) {
                                webSocket.close(1000, null);
                            }
                        });
    }

    @Test
    public void reconnectsToTheSameRoomAfterAFailedConnect() throws Exception {
        // The server dropping the upgrade is what a device saw: "unexpected end of stream", then no live updates.
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AT_START));
        server.enqueue(
                acceptAndSend(
                        "{\"type\":\"poll-update\",\"timestamp\":1,\"commentId\":\"c1\"}"));

        LiveEventSubscriber subscriber =
                new LiveEventSubscriber(5, wsHost());
        CountDownLatch received = new CountDownLatch(1);
        AtomicReference<LiveEvent> event = new AtomicReference<>();
        subscription =
                subscriber.subscribeToChanges(
                        new CommentWidgetConfig("tenant1", "page"),
                        "tenant1",
                        "page",
                        "tenant1:page",
                        "user-ws",
                        null,
                        liveEvent -> {
                            event.set(liveEvent);
                            received.countDown();
                        });

        assertNotNull(server.takeRequest(10, TimeUnit.SECONDS));
        RecordedRequest second = server.takeRequest(10, TimeUnit.SECONDS);
        assertNotNull("never reconnected after the failed connect", second);
        // A failed connect and a dropped open socket (a server restart) both land in onFailure.
        assertEquals("/sub?urlId=tenant1:page&userIdWS=user-ws&tenantIdWS=tenant1", second.getPath());
        assertEquals(true, received.await(10, TimeUnit.SECONDS));
        assertEquals("c1", event.get().getCommentId());
    }

    private SubscribeToChangesResult subscribe() {
        return new LiveEventSubscriber(5, wsHost())
                .subscribeToChanges(
                        new CommentWidgetConfig("tenant1", "page"),
                        "tenant1",
                        "page",
                        "tenant1:page",
                        "user-ws",
                        null,
                        liveEvent -> {});
    }

    @Test
    public void reconnectDelayIsFullJitterOverADoublingWindowUpToAMinute() {
        // The first retry after a mass disconnect is spread over 4s, so a server restart doesn't bring every
        // client (and its event-log fetch) back in the same instant.
        assertEquals(0, LiveEventSubscriber.reconnectDelayMs(0, 0));
        assertEquals(4000, LiveEventSubscriber.reconnectDelayMs(0, 1));
        assertEquals(2000, LiveEventSubscriber.reconnectDelayMs(0, 0.5));
        assertEquals(8000, LiveEventSubscriber.reconnectDelayMs(1, 1));
        assertEquals(16000, LiveEventSubscriber.reconnectDelayMs(2, 1));
        assertEquals(32000, LiveEventSubscriber.reconnectDelayMs(3, 1));
        assertEquals(60000, LiveEventSubscriber.reconnectDelayMs(4, 1));
        // Long outages stay at the cap instead of overflowing the shift.
        assertEquals(60000, LiveEventSubscriber.reconnectDelayMs(1000, 1));
    }

    @Test
    public void backsOffBetweenFailedReconnectsAndResetsOnceConnected() throws Exception {
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AT_START));
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AT_START));
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AT_START));
        // Opens, then the server closes it, so the next reconnect starts from the first step again.
        server.enqueue(
                new MockResponse()
                        .withWebSocketUpgrade(
                                new WebSocketListener() {
                                    @Override
                                    public void onOpen(WebSocket webSocket, Response response) {
                                        webSocket.close(1001, "restarting");
                                    }
                                }));
        server.enqueue(acceptAndSend("{\"type\":\"poll-update\",\"timestamp\":4,\"commentId\":\"c4\"}"));

        // Jitter pinned to a quarter of each window: 1s, 2s, 4s, then 1s again once a connection opens.
        subscription =
                new LiveEventSubscriber(5, wsHost(), () -> 0.25)
                        .subscribeToChanges(
                                new CommentWidgetConfig("tenant1", "page"),
                                "tenant1",
                                "page",
                                "tenant1:page",
                                "user-ws",
                                null,
                                liveEvent -> {});
        long[] arrivals = new long[5];
        for (int i = 0; i < arrivals.length; i++) {
            assertNotNull("attempt " + i + " never came", server.takeRequest(20, TimeUnit.SECONDS));
            arrivals[i] = System.nanoTime();
        }
        long[] expected = {1000, 2000, 4000, 1000};
        StringBuilder gaps = new StringBuilder();
        for (int i = 0; i < expected.length; i++) {
            gaps.append(TimeUnit.NANOSECONDS.toMillis(arrivals[i + 1] - arrivals[i])).append("ms ");
        }
        for (int i = 0; i < expected.length; i++) {
            long gap = TimeUnit.NANOSECONDS.toMillis(arrivals[i + 1] - arrivals[i]);
            assertTrue("gap " + i + " should be ~" + expected[i] + "ms: " + gaps,
                    gap >= expected[i] - 100 && gap <= expected[i] + 700);
        }
    }

    @Test
    public void lastEventTimeNeverMovesBackwardsUnderConcurrentEvents() throws Exception {
        // Socket reader threads and the event-log fetch both record times. A lost update moves it backwards, and the
        // next reconnect then refetches (and redelivers) events the app already has.
        LiveEventSubscriber subscriber = new LiveEventSubscriber(5, wsHost());
        int writers = 4;
        long perWriter = 2_000_000;
        AtomicBoolean done = new AtomicBoolean();
        AtomicReference<String> regression = new AtomicReference<>();
        Thread watcher = new Thread(() -> {
            long seen = 0;
            while (!done.get() && regression.get() == null) {
                long now = subscriber.getLastEventTime();
                if (now < seen) {
                    regression.set(seen + " -> " + now);
                }
                seen = now;
            }
        });
        watcher.start();
        Thread[] threads = new Thread[writers];
        for (int w = 0; w < writers; w++) {
            final int offset = w;
            threads[w] = new Thread(() -> {
                for (long i = 1; i <= perWriter; i++) {
                    subscriber.recordEventTime(i * writers + offset);
                }
            });
            threads[w].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        done.set(true);
        watcher.join();
        assertNull("lastEventTime moved backwards: " + regression.get(), regression.get());
        assertEquals(perWriter * writers + writers - 1, subscriber.getLastEventTime());
    }

    @Test
    public void aServerCloseSchedulesOneReconnect() throws Exception {
        // The server closes, so onClosing replies with close() and OkHttp's writer thread runs onClosed while
        // onClosing is still in cleanup. Two reconnects would leave a second socket open that close() never reaches.
        server.enqueue(
                new MockResponse()
                        .withWebSocketUpgrade(
                                new WebSocketListener() {
                                    @Override
                                    public void onOpen(WebSocket webSocket, Response response) {
                                        webSocket.close(1001, "restarting");
                                    }
                                }));
        server.enqueue(acceptAndSend("{\"type\":\"poll-update\",\"timestamp\":6,\"commentId\":\"c6\"}"));
        server.enqueue(acceptAndSend("{\"type\":\"poll-update\",\"timestamp\":7,\"commentId\":\"c7\"}"));

        LiveEventSubscriber subscriber = new LiveEventSubscriber(5, wsHost(), () -> 0);
        AtomicInteger disconnects = new AtomicInteger();
        // A slow status callback holds cleanup open long enough for both close callbacks to be inside it.
        subscriber.setOnConnectionStatusChange((isConnected, lastLiveEventTime) -> {
            if (!isConnected) {
                disconnects.incrementAndGet();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        subscription =
                subscriber.subscribeToChanges(
                        new CommentWidgetConfig("tenant1", "page"),
                        "tenant1",
                        "page",
                        "tenant1:page",
                        "user-ws",
                        null,
                        liveEvent -> {});

        assertNotNull(server.takeRequest(10, TimeUnit.SECONDS));
        assertNotNull("never reconnected after the server closed", server.takeRequest(10, TimeUnit.SECONDS));
        assertNull("one close opened two reconnects", server.takeRequest(2, TimeUnit.SECONDS));
        assertEquals(1, disconnects.get());
    }

    @Test
    public void aRejectedUpgradeIsNotRetriedRightAway() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(403));
        server.enqueue(acceptAndSend("{\"type\":\"poll-update\",\"timestamp\":5,\"commentId\":\"c5\"}"));

        subscription = subscribe();
        assertNotNull(server.takeRequest(10, TimeUnit.SECONDS));
        // A 4xx won't fix itself within seconds, so retrying on the normal schedule would only hammer the server.
        assertNull("retried a 403 right away", server.takeRequest(6, TimeUnit.SECONDS));
    }

    @Test
    public void closeAfterAReconnectClosesTheNewSocket() throws Exception {
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AT_START));
        CountDownLatch serverSawClose = new CountDownLatch(1);
        server.enqueue(
                new MockResponse()
                        .withWebSocketUpgrade(
                                new WebSocketListener() {
                                    @Override
                                    public void onOpen(WebSocket webSocket, Response response) {
                                        webSocket.send(
                                                "{\"type\":\"poll-update\",\"timestamp\":3,\"commentId\":\"c3\"}");
                                    }

                                    @Override
                                    public void onClosing(WebSocket webSocket, int code, String reason) {
                                        serverSawClose.countDown();
                                        webSocket.close(1000, null);
                                    }
                                }));

        LiveEventSubscriber subscriber =
                new LiveEventSubscriber(5, wsHost());
        CountDownLatch received = new CountDownLatch(1);
        subscription =
                subscriber.subscribeToChanges(
                        new CommentWidgetConfig("tenant1", "page"),
                        "tenant1",
                        "page",
                        "tenant1:page",
                        "user-ws",
                        null,
                        liveEvent -> received.countDown());
        assertEquals(true, received.await(15, TimeUnit.SECONDS));

        subscription.close();
        subscription = null;
        assertEquals("close() left the reconnected socket open", true, serverSawClose.await(5, TimeUnit.SECONDS));
        server.takeRequest(1, TimeUnit.SECONDS);
        server.takeRequest(1, TimeUnit.SECONDS);
        assertNull("reconnected again after close()", server.takeRequest(6, TimeUnit.SECONDS));
    }
}

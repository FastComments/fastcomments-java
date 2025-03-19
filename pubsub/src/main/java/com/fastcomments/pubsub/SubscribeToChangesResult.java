package com.fastcomments.pubsub;

/**
 * Result of subscribing to changes, providing a way to close the connection.
 */
public class SubscribeToChangesResult {
    private final Runnable closeAction;

    public SubscribeToChangesResult(Runnable closeAction) {
        this.closeAction = closeAction;
    }

    public void close() {
        if (closeAction != null) {
            closeAction.run();
        }
    }
}
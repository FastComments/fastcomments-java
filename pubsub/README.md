# FastComments Java PubSub

The FastComments Java PubSub package provides real-time functionality for subscribing to comment events from the FastComments platform. This package enables applications to receive live updates for comments, votes, and other actions.

## Overview

The PubSub package allows Java applications to:

- Subscribe to live comment events
- Receive real-time notifications for new comments, edits, votes, etc.
- Maintain a synchronized state with the FastComments service

## Installation

### Maven

Add the Repsy repository to your project's POM:

```xml
<repositories>
    <repository>
        <id>repsy</id>
        <name>FastComments Maven Repository on Repsy</name>
        <url>https://repo.repsy.io/mvn/winrid/fastcomments</url>
    </repository>
</repositories>
```

Then add the dependency:

```xml
<dependency>
  <groupId>com.fastcomments</groupId>
  <artifactId>pubsub</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle

Add the Repsy repository to your build.gradle file:

```groovy
repositories {
    mavenCentral()
    maven {
        url "https://repo.repsy.io/mvn/winrid/fastcomments"
    }
}
```

Then add the dependency:

```groovy
implementation 'com.fastcomments:pubsub:0.0.1'
```

## Key Components

### LiveEventSubscriber

The `LiveEventSubscriber` class is the main entry point for subscribing to live events. It manages the WebSocket connection and event handling.

### SubscribeToChangesResult

The `SubscribeToChangesResult` class represents the result of subscribing to changes, including success status and error information.

## Usage Example

```java
import com.fastcomments.pubsub.LiveEventSubscriber;
import com.fastcomments.model.LiveEvent;
import com.fastcomments.model.LiveEventType;
import com.fastcomments.model.PubSubComment;

// Create a subscriber
LiveEventSubscriber subscriber = new LiveEventSubscriber(
    "your-tenant-id", 
    "page-url-id", 
    "https://example.com/article"
);

// Set event handlers
subscriber.setOnCommentEvent((LiveEvent<PubSubComment> event) -> {
    switch (event.getType()) {
        case COMMENT_CREATED:
            System.out.println("New comment: " + event.getData().getComment());
            break;
        case COMMENT_UPDATED:
            System.out.println("Comment updated: " + event.getData().getComment());
            break;
        case COMMENT_DELETED:
            System.out.println("Comment deleted: " + event.getData().getId());
            break;
    }
});

// Connect and subscribe
subscriber.connect();
```

## Dependencies

- FastComments Core
- FastComments Client
- Java 8 or higher
- WebSocket implementation

## Integration with Android SDK

The PubSub package can be used with the FastComments Android SDK to add real-time capabilities to Android applications. The Android SDK provides UI components that use this package to display live updates.
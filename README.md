# fastcomments-java
The FastComments Java SDK. You can use this to build secure and scalable backend applications that interact with FastComments, or build reactive client applications.

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

Then add the dependencies you need:

```xml
<dependencies>
    <!-- API Client -->
    <dependency>
        <groupId>com.fastcomments</groupId>
        <artifactId>client</artifactId>
        <version>0.0.1</version>
    </dependency>
    
    <!-- Core Library (includes SSO) -->
    <dependency>
        <groupId>com.fastcomments</groupId>
        <artifactId>core</artifactId>
        <version>0.0.1</version>
    </dependency>
    
    <!-- PubSub Library (for live events) -->
    <dependency>
        <groupId>com.fastcomments</groupId>
        <artifactId>pubsub</artifactId>
        <version>0.0.1</version>
    </dependency>
</dependencies>
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

dependencies {
    // API Client
    implementation "com.fastcomments:client:0.0.1"
    
    // Core Library (includes SSO)
    implementation "com.fastcomments:core:0.0.1"
    
    // PubSub Library (for live events)
    implementation "com.fastcomments:pubsub:0.0.1"
}
```

### Library Contents

This library contains three modules. The generated API client, the core Java library which contains hand-written utilities
to make working with the API easier, and the `pubsub` module which is a library for subscribing to change feeds.

- [API Client Library Docs](./client/README.md)
- [Core Library Docs, Including SSO Examples](./core/README.md)
- [PubSub Library Docs](./pubsub/README.md)

### Public vs Secured APIs

For the API client, there are two classes, `DefaultApi` and `PublicApi`. The `DefaultApi` contains methods that take your API key, and `PublicApi` contains api calls
that can be made directly from a browser/mobile device/etc.

## Notes

### Broadcast Ids

You'll see you're supposed to pass a `broadcastId` in some API calls. When you receive events, you'll get this ID back, so you know to ignore the event if you plan to optimistically apply changes on the client
(which you'll probably want to do since it offers the best experience). Pass a UUID here. The ID should be unique enough to not occur twice in a browser session.

# FastComments Java Core

The FastComments Java Core package provides the foundational components for integrating FastComments functionality into Java applications and Android applications. This package contains the core models, configurations, and utilities required to work with the FastComments platform.

## Overview

The core package serves as the base for FastComments Java implementations, providing:

- Comment widget configuration
- SSO (Single Sign-On) implementation
- Callback interfaces for events
- Core models for data representation

## Installation

### Maven

```xml
<dependency>
  <groupId>com.fastcomments</groupId>
  <artifactId>core</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.fastcomments:core:0.0.1'
```

## Key Components

### CommentWidgetConfig

The `CommentWidgetConfig` class provides configuration options for the FastComments widget. It includes settings for:

- Tenant identification
- Page/URL configuration
- UI customization
- Feature toggles
- Authentication settings
- Callback registration

Example usage:

```java
CommentWidgetConfig config = new CommentWidgetConfig("your-tenant-id", "page-url-id", 
                                                    "https://example.com/article", 
                                                    "example.com", 
                                                    "Article Title");
// Configure additional options
config.showLiveRightAway = true;
```

### SSO Integration

The core package provides SSO (Single Sign-On) support through the following classes:

- `FastCommentsSSO`: Main class for SSO configuration
- `SecureSSOPayload`: For secure SSO implementation
- `SecureSSOUserData`: User data for secure SSO
- `SimpleSSOUserData`: Simplified user data for basic SSO

#### Example Secure SSO usage:

```java
// Create user data for SSO (server side DO NOT DO ON THE CLIENT/MOBILE)
SecureSSOUserData userData = new SecureSSOUserData();
userData.id = "user-123";
userData.email = "user@example.com";
userData.username = "ExampleUser";
userData.avatar = "https://example.com/avatar.jpg";

// Create SSO payload
long timestamp = System.currentTimeMillis();
SecureSSOPayload payload = new SecureSSOPayload();
payload.userDataJSONBase64 = toJSONBase64(userData);
payload.verificationHash = generateHash(userData, "your-api-key", timestamp);
payload.timestamp = timestamp;

// Create SSO configuration
FastCommentsSSO sso = new FastCommentsSSO(payload);

// Add to widget config
config.sso = sso;
```

#### Example Secure SSO usage:

```java
// Create user data for SSO (server side DO NOT DO ON THE CLIENT/MOBILE)
SecureSSOUserData userData = new SecureSSOUserData();
userData.id = "user-123";
userData.email = "user@example.com";
userData.username = "ExampleUser";
userData.avatar = "https://example.com/avatar.jpg";

// Create SSO payload
long timestamp = System.currentTimeMillis();
SecureSSOPayload payload = new SecureSSOPayload();
payload.userDataJSONBase64 = toJSONBase64(userData);
payload.verificationHash = generateHash(userData, "your-api-key", timestamp);
payload.timestamp = timestamp;

// Create SSO configuration
FastCommentsSSO sso = new FastCommentsSSO(payload);

// then call the comments api with it
publicApi.getComments(config.tenantId, config.urlId).sso(sso.createToken())

// ... or add to the widget config for the Android SDK
config.sso = sso;
```

#### Example Simple SSO usage:

```java
// Create user data for SSO (usually client side, less secure)
SimpleSSOUserData userData = new SimpleSSOUserData("ExampleUser", "user@example.com", "https://example.com/avatar.jpg");

// Create SSO configuration
FastCommentsSSO sso = new FastCommentsSSO(userData);

// then call the comments api with it
publicApi.getComments(config.tenantId, config.urlId).sso(sso.createToken())

// ... or add to the widget config for the Android SDK
config.sso = sso;
```

### Callbacks

The core package includes several callback interfaces for handling events:

- `CommentFlaggedCallback`: Called when a comment is flagged
- `CommentSubmitStartCallback`: Called when a comment submission starts
- `InstanceCallback`: Generic instance callback
- `OpenProfileCallback`: Called when a user profile should be opened
- `UserBlockedCallback`: Called when a user is blocked
- `VoteSuccessCallback`: Called when a vote is successful

## Integration with Android SDK

The core package is designed to work seamlessly with the FastComments Android SDK, providing the foundation for Android applications that want to integrate FastComments functionality.

## Requirements

- Java 8 or higher

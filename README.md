# fastcomments-java
The FastComments Java SDK. You can use this to build secure and scalable backend applications that interact with FastComments, or build reactive client applications.

### Library Contents

This library contains three modules. The generated API client, the core Java library which contains hand-written utilities
to make working with the API easier, and the `pubsub` module which is a library for subscribing to change feeds.

- [API Client Library Docs](./client/README.md)
- [Core Library Docs, Including SSO Examples](./core/README.md)
- [PubSub Library Docs](./pubsub/README.md)

## Notes

### Broadcast Ids

You'll see you're supposed to pass a `broadcastId` in some API calls. When you receive events, you'll get this ID back, so you know to ignore the event if you plan to optimistically apply changes on the client
(which you'll probably want to do since it offers the best experience). Pass a UUID here. The ID should be unique enough to not occur twice in a browser session.

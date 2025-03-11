package com.fastcomments.core;

import java.util.function.Consumer;

public class FastCommentsSSO {
    /**
     * The user's data (FastCommentsSSOUserData) represented as JSON, then Base64’d.
     * Leave empty for an unauthenticated user.
     */
    public String userDataJSONBase64;
    /**
     * The HMAC-SHA256 hash of the userDataJSONBase64 field, using your secret key.
     */
    public String verificationHash;
    /**
     * The timestamp of when the verificationHash was created.
     */
    public Long timestamp;

    // For URL- or callback-based parameters.
    /**
     * The logout URL for the user.
     */
    public String logoutURL;
    /**
     * The login URL for the user.
     */
    public String loginURL;
    /**
     * Callback invoked on logout.
     */
    public Consumer<String> logoutCallback;
    /**
     * Callback invoked on login.
     */
    public Consumer<String> loginCallback;

    public FastCommentsSSO(String userDataJSONBase64, String verificationHash, Long timestamp) {
        this.userDataJSONBase64 = userDataJSONBase64;
        this.verificationHash = verificationHash;
        this.timestamp = timestamp;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public FastCommentsSSO() {

    }
}

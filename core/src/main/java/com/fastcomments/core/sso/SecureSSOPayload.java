package com.fastcomments.core.sso;

public class SecureSSOPayload {
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

    public SecureSSOPayload(String userDataJSONBase64, String verificationHash, Long timestamp) {
        this.userDataJSONBase64 = userDataJSONBase64;
        this.verificationHash = verificationHash;
        this.timestamp = timestamp;
    }
}

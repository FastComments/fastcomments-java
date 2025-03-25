package com.fastcomments.core.sso;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

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

    /**
     * <p>Example Usage:
     * <pre>{@code
     * final long timestamp = System.currentTimeMillis();
     * final String userDataString = Base64.encodeBase64String(gson.toJson(secureSSOUserData).getBytes(StandardCharsets.UTF_8));
     * final String hash = SecureSSOPayload.createVerificationHash(apiKey, timestamp, userDataString);
     * final String ssoQueryParam = new FastCommentsSSO(new SecureSSOPayload(userDataString, hash, timestamp)).prepareToSend();
     * }</pre>
     */
    public SecureSSOPayload(String userDataJSONBase64, String verificationHash, Long timestamp) {
        this.userDataJSONBase64 = userDataJSONBase64;
        this.verificationHash = verificationHash;
        this.timestamp = timestamp;
    }

    public static String createVerificationHash(String apiKey, long timestamp, String userDataJSONBase64) throws NoSuchAlgorithmException, InvalidKeyException {
        final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(apiKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        return getBytesAsHex(sha256_HMAC.doFinal((timestamp + userDataJSONBase64).getBytes(StandardCharsets.UTF_8)));
    }

    private static String getBytesAsHex(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        for (byte b : bytes) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

}

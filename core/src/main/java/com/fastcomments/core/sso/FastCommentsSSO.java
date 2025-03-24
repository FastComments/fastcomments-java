package com.fastcomments.core.sso;

import com.google.gson.Gson;
import org.apache.commons.codec.binary.Base64;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;

public class FastCommentsSSO {
    private SecureSSOPayload secureSSOPayload;
    private SimpleSSOUserData simpleSSOUserData;
    private String cachedToken;

    // For URL- or callback-based parameters.
    /**
     * The login URL for the user.
     */
    public String loginURL;
    /**
     * The logout URL for the user.
     */
    public String logoutURL;
    /**
     * Callback invoked on login.
     */
    public Consumer<String> loginCallback;
    /**
     * Callback invoked on logout.
     */
    public Consumer<String> logoutCallback;
    private static final Gson gson = new Gson();

    public FastCommentsSSO(SecureSSOPayload secureSSOPayload) {
        this.secureSSOPayload = secureSSOPayload;
        this.simpleSSOUserData = null;
    }

    public FastCommentsSSO(SimpleSSOUserData simpleSSOUserData) {
        this.secureSSOPayload = null;
        this.simpleSSOUserData = simpleSSOUserData;
    }

    public static FastCommentsSSO createSecure(String apiKey, SecureSSOUserData secureSSOUserData) throws NoSuchAlgorithmException, InvalidKeyException {
        final long timestamp = System.currentTimeMillis();
        final String userDataString = Base64.encodeBase64String(gson.toJson(secureSSOUserData).getBytes());
        final String hash = SecureSSOPayload.createVerificationHash(apiKey, timestamp, userDataString);
        return new FastCommentsSSO(new SecureSSOPayload(userDataString, hash, timestamp));
    }

    public FastCommentsSSO(SecureSSOPayload secureSSOPayload, String loginURL, String logoutURL) {
        this(secureSSOPayload);
        this.loginURL = loginURL;
        this.logoutURL = logoutURL;
    }

    public FastCommentsSSO(SimpleSSOUserData simpleSSOUserData, Consumer<String> loginCallback, Consumer<String> logoutCallback) {
        this(simpleSSOUserData);
        this.loginCallback = loginCallback;
        this.logoutCallback = logoutCallback;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public FastCommentsSSO() {

    }

    private String createToken() {
        if (secureSSOPayload != null) {
            return gson.toJson(secureSSOPayload);
        }
        return gson.toJson(simpleSSOUserData);
    }

    public String prepareToSend() {
        if (cachedToken == null) {
            cachedToken = createToken();
        }
        return cachedToken;
    }

    public SecureSSOPayload getSecureSSOPayload() {
        return secureSSOPayload;
    }

    public SimpleSSOUserData getSimpleSSOUserData() {
        return simpleSSOUserData;
    }

    public void setSecureSSOPayload(SecureSSOPayload secureSSOPayload) {
        this.secureSSOPayload = secureSSOPayload;
        this.resetToken();
    }

    public void setSimpleSSOUserData(SimpleSSOUserData simpleSSOUserData) {
        this.simpleSSOUserData = simpleSSOUserData;
        this.resetToken();
    }

    /**
     * You probably don't want to call this. Calling the set methods already resets the token.
     */
    public void resetToken() {
        this.cachedToken = null;
    }
}

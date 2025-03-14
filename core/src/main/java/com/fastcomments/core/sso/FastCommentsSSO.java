package com.fastcomments.core.sso;

import com.google.gson.Gson;

import java.util.function.Consumer;

public class FastCommentsSSO {
    public SecureSSOPayload secureSSOPayload;
    public SimpleSSOUserData simpleSSOUserData;

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

    public String prepareToSend() {
        if (secureSSOPayload != null) {
            return gson.toJson(secureSSOPayload);
        }
        return gson.toJson(simpleSSOUserData);
    }
}

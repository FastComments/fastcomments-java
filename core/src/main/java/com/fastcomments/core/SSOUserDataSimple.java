package com.fastcomments.core;

import java.util.function.Consumer;

/**
 * An object that represents a user, for SimpleSSO.
 */
public class SSOUserDataSimple {
    /** This must be unique when paired with an email. */
    public String username;
    /** The user's email. */
    public String email;
    /** The user's avatar. */
    public String avatar;
    /** The user's website, blog, or personal account page. */
    public String websiteUrl;

    // For URL- or callback-based parameters.
    public String logoutURL;
    public String loginURL;
    public Consumer<String> logoutCallback;
    public Consumer<String> loginCallback;

    public SSOUserDataSimple(String username) {
        this.username = username;
    }

    public SSOUserDataSimple(String username, String email, String avatar) {
        this.username = username;
        this.email = email;
        this.avatar = avatar;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public SSOUserDataSimple() {
    }
}


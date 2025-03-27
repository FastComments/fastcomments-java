package com.fastcomments.core.sso;

import java.util.function.Consumer;

/**
 * An object that represents a user, for SimpleSSO.
 */
public class SimpleSSOUserData {
    /**
     * If you don't set id, it defaults to their email.
     */
    public String id;
    /**
     * Their locale, for email notifications etc, in the format "en_us".
     */
    public String locale;
    public Boolean optedInNotifications;
    /**
     * Show a nice label with their comments, like "VIP User".
     */
    public String displayLabel;
    /**
     * Set a non-unique name (since username must be unique within your tenant).
     */
    public String displayName;
    /**
     * Defaults to true when null.
     */
    public Boolean isProfileActivityPrivate;

    /** This must be unique when paired with an email. */
    public String username;
    /** The user's email. */
    public String email;
    /** The user's avatar. */
    public String avatar;
    /** The user's website, blog, or personal account page to show with their comments. */
    public String websiteUrl;

    public SimpleSSOUserData(String username) {
        this.username = username;
    }

    public SimpleSSOUserData(String username, String email, String avatar) {
        this.username = username;
        this.email = email;
        this.avatar = avatar;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public SimpleSSOUserData() {
    }
}


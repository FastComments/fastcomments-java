package com.fastcomments.core.sso;

import java.util.List;

/**
 * An object that represents a user, for SecureSSO.
 */
public class SecureSSOUserData {
    // Required. 1k Characters Max.
    public String id;
    // Required. 1k Characters Max. Must be unique.
    public String email;
    // Required. 1k Characters Max. Note: The username cannot be an email.
    public String username;
    // Optional. 3k Characters Max for URLs. Default is from gravatar based on email.
    public String avatar;
    // Optional. Default false.
    public Boolean optedInNotifications;
    // Optional. 100 Characters Max.
    public String displayLabel;
    // Optional. 500 Characters Max.
    public String displayName;
    // Optional. 2k Characters Max.
    public String websiteUrl;
    // Optional. Up to 100 groups per user.
    public List<String> groupIds;
    // Optional. Denotes the user as an administrator.
    public Boolean isAdmin;
    // Optional. Denotes the user as a moderator.
    public Boolean isModerator;
    // Optional, default true.
    public Boolean isProfileActivityPrivate;

    public SecureSSOUserData(String id) {
        this.id = id;
    }

    public SecureSSOUserData(String id, String email, String username, String avatar) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.avatar = avatar;
    }
}

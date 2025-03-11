package com.fastcomments.core;

public class UserSessionDetails {
    public String id;
    /**
     * Since 2021 this is almost always true, even for anon sessions.
     */
    public boolean authorized;
    public String avatarSrc;
    public String displayLabel;
    public String email;
    /** Indicates if the user has blocked one or more users. */
    public boolean hasBlockedUsers;
    /** If the user is not fully logged in. */
    public Boolean isAnonSession;
    public String sessionId;
    public String username;
    public String websiteUrl;
}

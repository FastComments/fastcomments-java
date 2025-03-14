package com.fastcomments.core;

/**
 * Information about a user session for use with FastComments API
 */
public class UserSessionInfo {
    private String userName;
    private String email;
    private String displayName;
    private String apiKey;
    private String ssoUserToken;
    private Boolean isSso;
    private String sessionId;
    
    /**
     * Creates a new UserSessionInfo with no data (anonymous)
     */
    public UserSessionInfo() {
    }
    
    /**
     * Creates a new UserSessionInfo with login details
     * 
     * @param userName The username
     * @param email The user's email
     * @param displayName The user's display name
     */
    public UserSessionInfo(String userName, String email, String displayName) {
        this.userName = userName;
        this.email = email;
        this.displayName = displayName;
    }
    
    /**
     * Creates a new UserSessionInfo with API key
     * 
     * @param userName The username
     * @param email The user's email
     * @param displayName The user's display name
     * @param apiKey The API key for authentication
     */
    public UserSessionInfo(String userName, String email, String displayName, String apiKey) {
        this.userName = userName;
        this.email = email;
        this.displayName = displayName;
        this.apiKey = apiKey;
    }
    
    /**
     * Creates a new UserSessionInfo for SSO
     * 
     * @param userName The username
     * @param email The user's email
     * @param displayName The user's display name
     * @param ssoUserToken The SSO user token
     * @param isSso Whether this is an SSO authentication
     */
    public UserSessionInfo(String userName, String email, String displayName, String ssoUserToken, Boolean isSso) {
        this.userName = userName;
        this.email = email;
        this.displayName = displayName;
        this.ssoUserToken = ssoUserToken;
        this.isSso = isSso;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // For compatibility with generated model
    public String getUsername() {
        return userName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    public String getApiKey() {
        return apiKey;
    }
    
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    
    public String getSsoUserToken() {
        return ssoUserToken;
    }
    
    public void setSsoUserToken(String ssoUserToken) {
        this.ssoUserToken = ssoUserToken;
    }
    
    public Boolean getIsSso() {
        return isSso;
    }
    
    public void setIsSso(Boolean isSso) {
        this.isSso = isSso;
    }
    
    public String getSessionId() {
        return sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
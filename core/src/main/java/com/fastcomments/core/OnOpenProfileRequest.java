package com.fastcomments.core;

import com.fastcomments.model.PublicComment;

public class OnOpenProfileRequest {
    public final String userId;
    public final UserSessionDetails currentUser;
    public final PublicComment comment;

    public OnOpenProfileRequest(String userId, UserSessionDetails currentUser, PublicComment comment) {
        this.userId = userId;
        this.currentUser = currentUser;
        this.comment = comment;
    }
}

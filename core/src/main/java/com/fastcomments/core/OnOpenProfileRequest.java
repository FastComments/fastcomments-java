package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;

public class OnOpenProfileRequest {
    public final String userId;
    public final UserSessionDetails currentUser;
    public final APICommentPublicComment comment;

    public OnOpenProfileRequest(String userId, UserSessionDetails currentUser, APICommentPublicComment comment) {
        this.userId = userId;
        this.currentUser = currentUser;
        this.comment = comment;
    }
}

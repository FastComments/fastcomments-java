package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;

@FunctionalInterface
interface UserBlockedCallback {
    void onUserBlocked(String userId, APICommentPublicComment comment, boolean isBlocked);
}

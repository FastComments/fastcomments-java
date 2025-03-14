package com.fastcomments.core;

import com.fastcomments.model.PublicComment;

@FunctionalInterface
interface UserBlockedCallback {
    void onUserBlocked(String userId, PublicComment comment, boolean isBlocked);
}

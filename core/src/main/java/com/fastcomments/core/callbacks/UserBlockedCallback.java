package com.fastcomments.core.callbacks;

import com.fastcomments.model.PublicComment;

@FunctionalInterface
public interface UserBlockedCallback {
    void onUserBlocked(String userId, PublicComment comment, boolean isBlocked);
}

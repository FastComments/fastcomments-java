package com.fastcomments.core;

import com.fastcomments.model.PublicComment;

@FunctionalInterface
public interface CommentFlaggedCallback {
    void onCommentFlagged(String userId, PublicComment comment, boolean isFlagged);
}

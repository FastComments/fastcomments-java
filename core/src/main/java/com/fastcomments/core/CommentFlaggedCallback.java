package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;

@FunctionalInterface
public interface CommentFlaggedCallback {
    void onCommentFlagged(String userId, APICommentPublicComment comment, boolean isFlagged);
}

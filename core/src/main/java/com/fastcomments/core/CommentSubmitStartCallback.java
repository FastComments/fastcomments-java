package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;

import java.util.function.Consumer;

@FunctionalInterface
public interface CommentSubmitStartCallback {
    void onCommentSubmitStart(APICommentPublicComment comment, Runnable continueSubmitFn, Consumer<String> cancelFn);
}

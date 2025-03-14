package com.fastcomments.core;

import com.fastcomments.model.PublicComment;

import java.util.function.Consumer;

@FunctionalInterface
public interface CommentSubmitStartCallback {
    void onCommentSubmitStart(PublicComment comment, Runnable continueSubmitFn, Consumer<String> cancelFn);
}

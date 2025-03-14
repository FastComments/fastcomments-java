package com.fastcomments.core;

import com.fastcomments.model.PublicComment;

@FunctionalInterface
public interface VoteSuccessCallback {
    void onVoteSuccess(PublicComment comment, String voteId, String direction, String status);
}

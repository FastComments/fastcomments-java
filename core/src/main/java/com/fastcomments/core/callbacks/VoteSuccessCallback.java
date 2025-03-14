package com.fastcomments.core.callbacks;

import com.fastcomments.model.PublicComment;

@FunctionalInterface
public interface VoteSuccessCallback {
    void onVoteSuccess(PublicComment comment, String voteId, String direction, String status);
}

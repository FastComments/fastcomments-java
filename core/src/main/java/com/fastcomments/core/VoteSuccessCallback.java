package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;

@FunctionalInterface
public interface VoteSuccessCallback {
    void onVoteSuccess(APICommentPublicComment comment, String voteId, String direction, String status);
}

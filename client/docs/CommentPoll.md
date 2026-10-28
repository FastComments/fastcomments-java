

# CommentPoll

A poll attached to a comment. Vote counts are denormalized here; individual votes live in PollVote.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**question** | **String** |  |  |
|**options** | [**List&lt;CommentPollOption&gt;**](CommentPollOption.md) |  |  |
|**totalVotes** | **Integer** |  |  |
|**closesAt** | **OffsetDateTime** |  |  [optional] |
|**privacy** | **PollPrivacy** |  |  [optional] |
|**requireVoteToSeeResults** | **Boolean** |  |  [optional] |




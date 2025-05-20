

# PublicComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** |  |  |
|**id** | **String** |  |  |
|**userId** | **String** |  |  [optional] |
|**anonUserId** | **String** |  |  [optional] |
|**commenterName** | **String** |  |  |
|**commenterLink** | **String** |  |  [optional] |
|**commentHTML** | **String** |  |  |
|**parentId** | **String** |  |  [optional] |
|**votes** | **Integer** |  |  [optional] |
|**votesUp** | **Integer** |  |  [optional] |
|**votesDown** | **Integer** |  |  [optional] |
|**verified** | **Boolean** |  |  |
|**avatarSrc** | **String** |  |  [optional] |
|**isSpam** | **Boolean** |  |  [optional] |
|**hasImages** | **Boolean** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**isDeletedUser** | **Boolean** |  |  [optional] |
|**isByAdmin** | **Boolean** |  |  [optional] |
|**isByModerator** | **Boolean** |  |  [optional] |
|**isPinned** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**rating** | **Double** |  |  [optional] |
|**displayLabel** | **String** |  |  [optional] |
|**badges** | [**List&lt;CommentUserBadgeInfo&gt;**](CommentUserBadgeInfo.md) |  |  [optional] |
|**feedbackIds** | **List&lt;String&gt;** |  |  [optional] |
|**viewCount** | **Double** |  |  [optional] |
|**requiresVerification** | **Boolean** |  |  [optional] |
|**editKey** | **String** |  |  [optional] |
|**isUnread** | **Boolean** |  |  [optional] |
|**myVoteId** | **String** |  |  [optional] |
|**isVotedDown** | **Boolean** |  |  [optional] |
|**isVotedUp** | **Boolean** |  |  [optional] |
|**hasChildren** | **Boolean** | This is always set when asTree&#x3D;true |  [optional] |
|**nestedChildrenCount** | **Integer** | The total nested child count included in this response (may be more available w/ pagination) Only set with asTree&#x3D;true, otherwise this will be null. |  [optional] |
|**childCount** | **Integer** | You must ask the API to count children (with asTree&#x3D;true&amp;countChildren&#x3D;true), otherwise this will be null. This will be the complete direct child count, whereas children may only contain a subset based on pagination. |  [optional] |
|**children** | [**List&lt;PublicComment&gt;**](PublicComment.md) |  |  [optional] |
|**isFlagged** | **Boolean** |  |  [optional] |
|**isBlocked** | **Boolean** |  |  [optional] |




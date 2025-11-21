

# PublicComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**userId** | **String** |  |  [optional] |
|**commenterName** | **String** |  |  |
|**commenterLink** | **String** |  |  [optional] |
|**commentHTML** | **String** |  |  |
|**parentId** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  |
|**votes** | **Integer** |  |  [optional] |
|**votesUp** | **Integer** |  |  [optional] |
|**votesDown** | **Integer** |  |  [optional] |
|**verified** | **Boolean** |  |  |
|**avatarSrc** | **String** |  |  [optional] |
|**hasImages** | **Boolean** |  |  [optional] |
|**isByAdmin** | **Boolean** |  |  [optional] |
|**isByModerator** | **Boolean** |  |  [optional] |
|**isPinned** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**displayLabel** | **String** |  |  [optional] |
|**rating** | **Double** |  |  [optional] |
|**badges** | [**List&lt;CommentUserBadgeInfo&gt;**](CommentUserBadgeInfo.md) |  |  [optional] |
|**viewCount** | **Long** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**isDeletedUser** | **Boolean** |  |  [optional] |
|**isSpam** | **Boolean** |  |  [optional] |
|**anonUserId** | **String** |  |  [optional] |
|**feedbackIds** | **List&lt;String&gt;** |  |  [optional] |
|**requiresVerification** | **Boolean** |  |  [optional] |
|**editKey** | **String** |  |  [optional] |
|**approved** | **Boolean** |  |  [optional] |
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




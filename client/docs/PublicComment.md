

# PublicComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**url** | **String** |  |  |
|**pageTitle** | **String** |  |  [optional] |
|**approved** | **Boolean** |  |  |
|**commentHTML** | **String** |  |  |
|**urlIdRaw** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**anonUserId** | **String** |  |  [optional] |
|**commenterEmail** | **String** |  |  [optional] |
|**commenterName** | **String** |  |  |
|**commenterLink** | **String** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  |
|**localDateString** | **String** |  |  [optional] |
|**localDateHours** | **Integer** |  |  [optional] |
|**votes** | **Integer** |  |  |
|**votesUp** | **Integer** |  |  |
|**votesDown** | **Integer** |  |  |
|**expireAt** | **OffsetDateTime** |  |  [optional] |
|**verified** | **Boolean** |  |  |
|**verifiedDate** | **OffsetDateTime** |  |  [optional] |
|**verificationId** | **String** |  |  [optional] |
|**notificationSentForParent** | **Boolean** |  |  [optional] |
|**notificationSentForParentTenant** | **Boolean** |  |  [optional] |
|**reviewed** | **Boolean** |  |  [optional] |
|**imported** | **Boolean** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**externalParentId** | **String** |  |  [optional] |
|**avatarSrc** | **String** |  |  [optional] |
|**isSpam** | **Boolean** |  |  [optional] |
|**aiDeterminedSpam** | **Boolean** |  |  [optional] |
|**hasImages** | **Boolean** |  |  [optional] |
|**pageNumber** | **Integer** |  |  [optional] |
|**pageNumberOF** | **Integer** |  |  [optional] |
|**pageNumberNF** | **Integer** |  |  [optional] |
|**hasCode** | **Boolean** |  |  [optional] |
|**locale** | **String** |  |  |
|**isDeleted** | **Boolean** |  |  [optional] |
|**isDeletedUser** | **Boolean** |  |  [optional] |
|**isBannedUser** | **Boolean** |  |  [optional] |
|**isByAdmin** | **Boolean** |  |  [optional] |
|**isByModerator** | **Boolean** |  |  [optional] |
|**isPinned** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**flagCount** | **Integer** |  |  [optional] |
|**rating** | **Double** |  |  [optional] |
|**displayLabel** | **String** |  |  [optional] |
|**fromProductId** | **Integer** |  |  [optional] |
|**meta** | **PickFCommentExcludeKeyofFCommentLogsOrTenantIdOrCommentOrHasLinksOrUrlIdMeta** |  |  [optional] |
|**ipHash** | **String** |  |  [optional] |
|**mentions** | [**List&lt;CommentUserMentionInfo&gt;**](CommentUserMentionInfo.md) |  |  [optional] |
|**hashTags** | [**List&lt;CommentUserHashTagInfo&gt;**](CommentUserHashTagInfo.md) |  |  [optional] |
|**badges** | [**List&lt;CommentUserBadgeInfo&gt;**](CommentUserBadgeInfo.md) |  |  [optional] |
|**domain** | **String** |  |  [optional] |
|**veteranBadgeProcessed** | **String** |  |  [optional] |
|**moderationGroupIds** | **List&lt;String&gt;** |  |  [optional] |
|**didProcessBadges** | **Boolean** |  |  [optional] |
|**fromOfflineRestore** | **Boolean** |  |  [optional] |
|**autoplayJobId** | **String** |  |  [optional] |
|**autoplayDelayMS** | **Long** |  |  [optional] |
|**feedbackIds** | **List&lt;String&gt;** |  |  [optional] |
|**groupIds** | **List&lt;String&gt;** |  |  [optional] |
|**viewCount** | **Double** |  |  [optional] |
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






# FComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**tenantId** | **String** |  |  |
|**urlId** | **String** |  |  |
|**urlIdRaw** | **String** |  |  [optional] |
|**url** | **String** |  |  |
|**pageTitle** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**anonUserId** | **String** |  |  [optional] |
|**commenterEmail** | **String** |  |  [optional] |
|**commenterName** | **String** |  |  |
|**commenterLink** | **String** |  |  [optional] |
|**comment** | **String** |  |  |
|**commentHTML** | **String** |  |  |
|**parentId** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  |
|**localDateString** | **String** |  |  [optional] |
|**localDateHours** | **Integer** |  |  [optional] |
|**votes** | **Integer** |  |  [optional] |
|**votesUp** | **Integer** |  |  [optional] |
|**votesDown** | **Integer** |  |  [optional] |
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
|**hasLinks** | **Boolean** |  |  [optional] |
|**hasCode** | **Boolean** |  |  [optional] |
|**approved** | **Boolean** |  |  |
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
|**meta** | **FCommentMeta** |  |  [optional] |
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
|**logs** | **List&lt;List&lt;Object&gt;&gt;** |  |  [optional] |
|**groupIds** | **List&lt;String&gt;** |  |  [optional] |
|**viewCount** | **Double** |  |  [optional] |




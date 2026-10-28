

# QuestionResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**tenantId** | **String** |  |  |
|**urlId** | **String** |  |  |
|**anonUserId** | **String** |  |  |
|**userId** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**value** | **Integer** | The answer. For multi-choice questions this is the number of selected options and the options are in values. |  |
|**values** | **List&lt;Double&gt;** | Selected option indexes, multi-choice questions only. |  [optional] |
|**commentId** | **String** |  |  [optional] |
|**questionId** | **String** |  |  |
|**meta** | [**List&lt;MetaItem&gt;**](MetaItem.md) |  |  [optional] |
|**ipHash** | **String** |  |  |




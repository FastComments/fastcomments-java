

# ModerationFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reviewed** | **Boolean** |  |  [optional] |
|**approved** | **Boolean** |  |  [optional] |
|**isSpam** | **Boolean** |  |  [optional] |
|**isBannedUser** | **Boolean** |  |  [optional] |
|**isLocked** | **Boolean** |  |  [optional] |
|**flagCountGt** | **Double** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**urlId** | **String** |  |  [optional] |
|**domain** | **String** |  |  [optional] |
|**moderationGroupIds** | **List&lt;String&gt;** |  |  [optional] |
|**commentTextSearch** | **List&lt;String&gt;** | Text search terms. Each term is matched case-insensitively against the comment text. A term wrapped in quotes means exact phrase match. |  [optional] |
|**exactCommentText** | **String** | Set by the &#x60;exact&#x3D;\&quot;...\&quot;&#x60; search syntax. The comment text must equal this value exactly (case-sensitive, full-string), as opposed to the substring matching of commentTextSearch. |  [optional] |




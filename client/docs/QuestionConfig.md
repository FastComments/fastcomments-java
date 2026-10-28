

# QuestionConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**tenantId** | **String** |  |  |
|**name** | **String** |  |  |
|**question** | **String** |  |  |
|**summaryLabel** | **String** |  |  [optional] |
|**helpText** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**createdBy** | **String** |  |  |
|**usedCount** | **Double** |  |  |
|**lastUsed** | **OffsetDateTime** |  |  |
|**type** | **String** | One of nps, slider, star, thumbs, choice, multi, emoji, scale. Answers: nps 0-10, slider min-max, star 1-numStars, thumbs 1 (up) or 0 (down), choice &#x3D; option index, multi &#x3D; option indexes (values), emoji/scale &#x3D; option index + 1. |  |
|**numStars** | **Double** |  |  |
|**min** | **Double** |  |  |
|**max** | **Double** |  |  |
|**defaultValue** | **Double** |  |  |
|**labelNegative** | **String** |  |  |
|**labelPositive** | **String** |  |  |
|**customOptions** | [**List&lt;QuestionConfigCustomOptionsInner&gt;**](QuestionConfigCustomOptionsInner.md) | Option labels for choice, multi, emoji and scale questions. |  |
|**subQuestionIds** | **List&lt;String&gt;** |  |  |
|**alwaysShowSubQuestions** | **Boolean** |  |  |
|**subQuestionConditions** | [**List&lt;SubQuestionCondition&gt;**](SubQuestionCondition.md) | Sub-questions listed here only show when this question&#39;s answer matches. Others always show. |  [optional] |
|**commentBoxCondition** | [**QuestionCondition**](QuestionCondition.md) |  |  [optional] |
|**commentBoxPrompt** | **String** | Placeholder for the comment box when commentBoxCondition reveals it. |  [optional] |
|**reportingOrder** | **Double** |  |  |




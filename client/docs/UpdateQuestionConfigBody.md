

# UpdateQuestionConfigBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**question** | **String** |  |  [optional] |
|**helpText** | **String** |  |  [optional] |
|**type** | **String** | One of nps, slider, star, thumbs, choice, multi, emoji, scale. |  [optional] |
|**numStars** | **Double** |  |  [optional] |
|**min** | **Double** |  |  [optional] |
|**max** | **Double** |  |  [optional] |
|**defaultValue** | **Double** |  |  [optional] |
|**labelNegative** | **String** |  |  [optional] |
|**labelPositive** | **String** |  |  [optional] |
|**customOptions** | [**List&lt;QuestionConfigCustomOptionsInner&gt;**](QuestionConfigCustomOptionsInner.md) |  |  [optional] |
|**subQuestionIds** | **List&lt;String&gt;** |  |  [optional] |
|**alwaysShowSubQuestions** | **Boolean** |  |  [optional] |
|**subQuestionConditions** | [**List&lt;SubQuestionCondition&gt;**](SubQuestionCondition.md) |  |  [optional] |
|**commentBoxCondition** | [**QuestionCondition**](QuestionCondition.md) |  |  [optional] |
|**commentBoxPrompt** | **String** |  |  [optional] |
|**reportingOrder** | **Double** |  |  [optional] |




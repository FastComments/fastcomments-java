

# CreateQuestionConfigBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**question** | **String** |  |  |
|**helpText** | **String** |  |  [optional] |
|**type** | **String** | One of nps, slider, star, thumbs, choice, multi, emoji, scale. choice, multi, emoji and scale take their labels from customOptions (choice/multi 2-20 options, emoji/scale 3-7). |  |
|**numStars** | **Double** |  |  [optional] |
|**min** | **Double** |  |  [optional] |
|**max** | **Double** |  |  [optional] |
|**defaultValue** | **Double** |  |  [optional] |
|**labelNegative** | **String** |  |  [optional] |
|**labelPositive** | **String** |  |  [optional] |
|**customOptions** | [**List&lt;QuestionConfigCustomOptionsInner&gt;**](QuestionConfigCustomOptionsInner.md) |  |  [optional] |
|**subQuestionIds** | **List&lt;String&gt;** |  |  [optional] |
|**alwaysShowSubQuestions** | **Boolean** |  |  [optional] |
|**subQuestionConditions** | [**List&lt;SubQuestionCondition&gt;**](SubQuestionCondition.md) | Show a sub-question only when this question&#39;s answer matches its rule. |  [optional] |
|**commentBoxCondition** | [**QuestionCondition**](QuestionCondition.md) |  |  [optional] |
|**commentBoxPrompt** | **String** | Comment box placeholder when commentBoxCondition reveals it. |  [optional] |
|**reportingOrder** | **Double** |  |  |




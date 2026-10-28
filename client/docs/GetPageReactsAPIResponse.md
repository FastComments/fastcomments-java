

# GetPageReactsAPIResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**users** | [**List&lt;PageCustomReactUser&gt;**](PageCustomReactUser.md) | One entry per react, most recent first. Present when includeUserInfo is passed. Capped at 100 reacts. |  [optional] |
|**counts** | **Map&lt;String, Double&gt;** | Construct a type with a set of properties K of type T |  [optional] |
|**status** | **String** |  |  |




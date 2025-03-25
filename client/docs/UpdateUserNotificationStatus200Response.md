

# UpdateUserNotificationStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **ImportedAPIStatusFAILED** |  |  |
|**matchedCount** | **Double** |  |  |
|**modifiedCount** | **Double** |  |  |
|**note** | [**NoteEnum**](#NoteEnum) |  |  |
|**reason** | **String** |  |  |
|**code** | **String** |  |  |
|**secondaryCode** | **String** |  |  [optional] |
|**bannedUntil** | **Double** |  |  [optional] |
|**maxCharacterLength** | **Double** |  |  [optional] |
|**translatedError** | **String** |  |  [optional] |
|**customConfig** | [**CustomConfigParameters**](CustomConfigParameters.md) |  |  [optional] |



## Enum: NoteEnum

| Name | Value |
|---- | -----|
| IGNORED_SINCE_IMPERSONATED | &quot;ignored-since-impersonated&quot; |
| DEMO_NOOP | &quot;demo-noop&quot; |






# UpdateUserNotificationStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **ImportedAPIStatusFAILED** |  |  |
|**matchedCount** | **Long** |  |  |
|**modifiedCount** | **Long** |  |  |
|**note** | [**NoteEnum**](#NoteEnum) |  |  |
|**reason** | **String** |  |  |
|**code** | **String** |  |  |
|**secondaryCode** | **String** |  |  [optional] |
|**bannedUntil** | **Long** |  |  [optional] |
|**maxCharacterLength** | **Integer** |  |  [optional] |
|**translatedError** | **String** |  |  [optional] |
|**customConfig** | [**CustomConfigParameters**](CustomConfigParameters.md) |  |  [optional] |



## Enum: NoteEnum

| Name | Value |
|---- | -----|
| IGNORED_SINCE_IMPERSONATED | &quot;ignored-since-impersonated&quot; |
| DEMO_NOOP | &quot;demo-noop&quot; |




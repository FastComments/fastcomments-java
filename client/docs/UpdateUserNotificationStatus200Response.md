

# UpdateUserNotificationStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **APIStatus** |  |  |
|**matchedCount** | **Long** |  |  [optional] |
|**modifiedCount** | **Long** |  |  [optional] |
|**note** | [**NoteEnum**](#NoteEnum) |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
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




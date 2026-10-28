

# PublicWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**url** | **String** |  |  |
|**event** | **WebhookEventName** |  |  |
|**domain** | **String** |  |  |
|**method** | **WebhookHTTPMethod** |  |  |
|**source** | **WebhookSource** |  |  |
|**enabled** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**lastSuccessAt** | **OffsetDateTime** |  |  [optional] |
|**lastFailureAt** | **OffsetDateTime** |  |  [optional] |
|**failingSince** | **OffsetDateTime** |  |  [optional] |
|**disabledAt** | **OffsetDateTime** |  |  [optional] |
|**disabledReason** | [**DisabledReasonEnum**](#DisabledReasonEnum) |  |  [optional] |



## Enum: DisabledReasonEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |




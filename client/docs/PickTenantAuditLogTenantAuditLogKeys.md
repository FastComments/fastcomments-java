

# PickTenantAuditLogTenantAuditLogKeys

From T, pick a set of properties whose keys are in the union K

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**url** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**resourceName** | **String** |  |  |
|**crudType** | [**CrudTypeEnum**](#CrudTypeEnum) |  |  |
|**from** | [**FromEnum**](#FromEnum) |  |  [optional] |
|**ip** | **String** |  |  [optional] |
|**when** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**serverStartDate** | **OffsetDateTime** |  |  [optional] |
|**objectDetails** | **Map&lt;String, Object&gt;** | Construct a type with a set of properties K of type T |  [optional] |



## Enum: CrudTypeEnum

| Name | Value |
|---- | -----|
| C | &quot;c&quot; |
| R | &quot;r&quot; |
| U | &quot;u&quot; |
| D | &quot;d&quot; |
| LOGIN | &quot;login&quot; |



## Enum: FromEnum

| Name | Value |
|---- | -----|
| UI | &quot;ui&quot; |
| API | &quot;api&quot; |
| CRON | &quot;cron&quot; |




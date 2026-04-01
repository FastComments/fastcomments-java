

# VoteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**voteId** | **String** |  |  [optional] |
|**isVerified** | **Boolean** |  |  [optional] |
|**user** | [**VoteResponseUser**](VoteResponseUser.md) |  |  [optional] |
|**editKey** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |
| PENDING_VERIFICATION | &quot;pending-verification&quot; |




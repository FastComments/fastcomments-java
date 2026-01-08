

# APITenant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**email** | **String** |  |  [optional] |
|**signUpDate** | **Double** |  |  |
|**packageId** | **String** |  |  |
|**paymentFrequency** | **Double** |  |  |
|**billingInfoValid** | **Boolean** |  |  |
|**billingHandledExternally** | **Boolean** |  |  [optional] |
|**createdBy** | **String** |  |  |
|**isSetup** | **Boolean** |  |  |
|**domainConfiguration** | [**List&lt;APIDomainConfiguration&gt;**](APIDomainConfiguration.md) |  |  |
|**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional] |
|**stripeCustomerId** | **String** |  |  [optional] |
|**stripeSubscriptionId** | **String** |  |  [optional] |
|**stripePlanId** | **String** |  |  [optional] |
|**enableProfanityFilter** | **Boolean** |  |  |
|**enableSpamFilter** | **Boolean** |  |  |
|**lastBillingIssueReminderDate** | **OffsetDateTime** |  |  [optional] |
|**removeUnverifiedComments** | **Boolean** |  |  [optional] |
|**unverifiedCommentsTTLms** | **Double** |  |  [optional] |
|**commentsRequireApproval** | **Boolean** |  |  [optional] |
|**autoApproveCommentOnVerification** | **Boolean** |  |  [optional] |
|**sendProfaneToSpam** | **Boolean** |  |  [optional] |
|**hasFlexPricing** | **Boolean** |  |  [optional] |
|**hasAuditing** | **Boolean** |  |  [optional] |
|**flexLastBilledAmount** | **Double** |  |  [optional] |
|**deAnonIpAddr** | **Double** |  |  [optional] |
|**meta** | **Map&lt;String, String&gt;** | Construct a type with a set of properties K of type T |  [optional] |




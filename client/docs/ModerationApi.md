# ModerationApi
FastComments API Client - A SDK for interacting with the FastComments API

All URIs are relative to *https://fastcomments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteModerationVote**](ModerationApi.md#deleteModerationVote) | **DELETE** /auth/my-account/moderate-comments/vote/{commentId}/{voteId} |  |
| [**getApiComments**](ModerationApi.md#getApiComments) | **GET** /auth/my-account/moderate-comments/api/comments |  |
| [**getApiExportStatus**](ModerationApi.md#getApiExportStatus) | **GET** /auth/my-account/moderate-comments/api/export/status |  |
| [**getApiIds**](ModerationApi.md#getApiIds) | **GET** /auth/my-account/moderate-comments/api/ids |  |
| [**getBanUsersFromComment**](ModerationApi.md#getBanUsersFromComment) | **GET** /auth/my-account/moderate-comments/ban-users/from-comment/{commentId} |  |
| [**getCommentBanStatus**](ModerationApi.md#getCommentBanStatus) | **GET** /auth/my-account/moderate-comments/get-comment-ban-status/{commentId} |  |
| [**getCommentChildren**](ModerationApi.md#getCommentChildren) | **GET** /auth/my-account/moderate-comments/comment-children/{commentId} |  |
| [**getCount**](ModerationApi.md#getCount) | **GET** /auth/my-account/moderate-comments/count |  |
| [**getCounts**](ModerationApi.md#getCounts) | **GET** /auth/my-account/moderate-comments/banned-users/counts |  |
| [**getLogs**](ModerationApi.md#getLogs) | **GET** /auth/my-account/moderate-comments/logs/{commentId} |  |
| [**getManualBadges**](ModerationApi.md#getManualBadges) | **GET** /auth/my-account/moderate-comments/get-manual-badges |  |
| [**getManualBadgesForUser**](ModerationApi.md#getManualBadgesForUser) | **GET** /auth/my-account/moderate-comments/get-manual-badges-for-user |  |
| [**getModerationComment**](ModerationApi.md#getModerationComment) | **GET** /auth/my-account/moderate-comments/comment/{commentId} |  |
| [**getModerationCommentText**](ModerationApi.md#getModerationCommentText) | **GET** /auth/my-account/moderate-comments/get-comment-text/{commentId} |  |
| [**getPreBanSummary**](ModerationApi.md#getPreBanSummary) | **GET** /auth/my-account/moderate-comments/pre-ban-summary/{commentId} |  |
| [**getSearchCommentsSummary**](ModerationApi.md#getSearchCommentsSummary) | **GET** /auth/my-account/moderate-comments/search/comments/summary |  |
| [**getSearchPages**](ModerationApi.md#getSearchPages) | **GET** /auth/my-account/moderate-comments/search/pages |  |
| [**getSearchSites**](ModerationApi.md#getSearchSites) | **GET** /auth/my-account/moderate-comments/search/sites |  |
| [**getSearchSuggest**](ModerationApi.md#getSearchSuggest) | **GET** /auth/my-account/moderate-comments/search/suggest |  |
| [**getSearchUsers**](ModerationApi.md#getSearchUsers) | **GET** /auth/my-account/moderate-comments/search/users |  |
| [**getTrustFactor**](ModerationApi.md#getTrustFactor) | **GET** /auth/my-account/moderate-comments/get-trust-factor |  |
| [**getUserBanPreference**](ModerationApi.md#getUserBanPreference) | **GET** /auth/my-account/moderate-comments/user-ban-preference |  |
| [**getUserInternalProfile**](ModerationApi.md#getUserInternalProfile) | **GET** /auth/my-account/moderate-comments/get-user-internal-profile |  |
| [**postAdjustCommentVotes**](ModerationApi.md#postAdjustCommentVotes) | **POST** /auth/my-account/moderate-comments/adjust-comment-votes/{commentId} |  |
| [**postApiExport**](ModerationApi.md#postApiExport) | **POST** /auth/my-account/moderate-comments/api/export |  |
| [**postBanUserFromComment**](ModerationApi.md#postBanUserFromComment) | **POST** /auth/my-account/moderate-comments/ban-user/from-comment/{commentId} |  |
| [**postBanUserUndo**](ModerationApi.md#postBanUserUndo) | **POST** /auth/my-account/moderate-comments/ban-user/undo |  |
| [**postBulkPreBanSummary**](ModerationApi.md#postBulkPreBanSummary) | **POST** /auth/my-account/moderate-comments/bulk-pre-ban-summary |  |
| [**postCommentsByIds**](ModerationApi.md#postCommentsByIds) | **POST** /auth/my-account/moderate-comments/comments-by-ids |  |
| [**postFlagComment**](ModerationApi.md#postFlagComment) | **POST** /auth/my-account/moderate-comments/flag-comment/{commentId} |  |
| [**postRemoveComment**](ModerationApi.md#postRemoveComment) | **POST** /auth/my-account/moderate-comments/remove-comment/{commentId} |  |
| [**postRestoreDeletedComment**](ModerationApi.md#postRestoreDeletedComment) | **POST** /auth/my-account/moderate-comments/restore-deleted-comment/{commentId} |  |
| [**postSetCommentApprovalStatus**](ModerationApi.md#postSetCommentApprovalStatus) | **POST** /auth/my-account/moderate-comments/set-comment-approval-status/{commentId} |  |
| [**postSetCommentReviewStatus**](ModerationApi.md#postSetCommentReviewStatus) | **POST** /auth/my-account/moderate-comments/set-comment-review-status/{commentId} |  |
| [**postSetCommentSpamStatus**](ModerationApi.md#postSetCommentSpamStatus) | **POST** /auth/my-account/moderate-comments/set-comment-spam-status/{commentId} |  |
| [**postSetCommentText**](ModerationApi.md#postSetCommentText) | **POST** /auth/my-account/moderate-comments/set-comment-text/{commentId} |  |
| [**postUnFlagComment**](ModerationApi.md#postUnFlagComment) | **POST** /auth/my-account/moderate-comments/un-flag-comment/{commentId} |  |
| [**postVote**](ModerationApi.md#postVote) | **POST** /auth/my-account/moderate-comments/vote/{commentId} |  |
| [**putAwardBadge**](ModerationApi.md#putAwardBadge) | **PUT** /auth/my-account/moderate-comments/award-badge |  |
| [**putCloseThread**](ModerationApi.md#putCloseThread) | **PUT** /auth/my-account/moderate-comments/close-thread |  |
| [**putRemoveBadge**](ModerationApi.md#putRemoveBadge) | **PUT** /auth/my-account/moderate-comments/remove-badge |  |
| [**putReopenThread**](ModerationApi.md#putReopenThread) | **PUT** /auth/my-account/moderate-comments/reopen-thread |  |
| [**setTrustFactor**](ModerationApi.md#setTrustFactor) | **PUT** /auth/my-account/moderate-comments/set-trust-factor |  |


<a id="deleteModerationVote"></a>
# **deleteModerationVote**
> DeleteModerationVoteResponse deleteModerationVote(commentId, voteId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String voteId = "voteId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      DeleteModerationVoteResponse result = apiInstance.deleteModerationVote(commentId, voteId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#deleteModerationVote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **voteId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**DeleteModerationVoteResponse**](DeleteModerationVoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getApiComments"></a>
# **getApiComments**
> GetApiCommentsResponse getApiComments().page(page).count(count).textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).sorts(sorts).demo(demo).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    Double page = 3.4D; // Double | 
    Double count = 3.4D; // Double | 
    String textSearch = "textSearch_example"; // String | 
    String byIPFromComment = "byIPFromComment_example"; // String | 
    String filters = "filters_example"; // String | 
    String searchFilters = "searchFilters_example"; // String | 
    String sorts = "sorts_example"; // String | 
    Boolean demo = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetApiCommentsResponse result = apiInstance.getApiComments()
            .page(page)
            .count(count)
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .sorts(sorts)
            .demo(demo)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getApiComments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Double**|  | [optional] |
| **count** | **Double**|  | [optional] |
| **textSearch** | **String**|  | [optional] |
| **byIPFromComment** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |
| **searchFilters** | **String**|  | [optional] |
| **sorts** | **String**|  | [optional] |
| **demo** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetApiCommentsResponse**](GetApiCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getApiExportStatus"></a>
# **getApiExportStatus**
> GetApiExportStatusResponse getApiExportStatus().batchJobId(batchJobId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String batchJobId = "batchJobId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetApiExportStatusResponse result = apiInstance.getApiExportStatus()
            .batchJobId(batchJobId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getApiExportStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchJobId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetApiExportStatusResponse**](GetApiExportStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getApiIds"></a>
# **getApiIds**
> GetApiIdsResponse getApiIds().textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).afterId(afterId).demo(demo).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String textSearch = "textSearch_example"; // String | 
    String byIPFromComment = "byIPFromComment_example"; // String | 
    String filters = "filters_example"; // String | 
    String searchFilters = "searchFilters_example"; // String | 
    String afterId = "afterId_example"; // String | 
    Boolean demo = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetApiIdsResponse result = apiInstance.getApiIds()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .afterId(afterId)
            .demo(demo)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getApiIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textSearch** | **String**|  | [optional] |
| **byIPFromComment** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |
| **searchFilters** | **String**|  | [optional] |
| **afterId** | **String**|  | [optional] |
| **demo** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetApiIdsResponse**](GetApiIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getBanUsersFromComment"></a>
# **getBanUsersFromComment**
> GetBanUsersFromCommentResponse getBanUsersFromComment(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetBanUsersFromCommentResponse result = apiInstance.getBanUsersFromComment(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getBanUsersFromComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetBanUsersFromCommentResponse**](GetBanUsersFromCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentBanStatus"></a>
# **getCommentBanStatus**
> GetCommentBanStatusResponse1 getCommentBanStatus(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCommentBanStatusResponse1 result = apiInstance.getCommentBanStatus(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getCommentBanStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentBanStatusResponse1**](GetCommentBanStatusResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentChildren"></a>
# **getCommentChildren**
> GetCommentChildrenResponse getCommentChildren(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCommentChildrenResponse result = apiInstance.getCommentChildren(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getCommentChildren");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentChildrenResponse**](GetCommentChildrenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCount"></a>
# **getCount**
> GetCountResponse getCount().textSearch(textSearch).byIPFromComment(byIPFromComment).filter(filter).searchFilters(searchFilters).demo(demo).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String textSearch = "textSearch_example"; // String | 
    String byIPFromComment = "byIPFromComment_example"; // String | 
    String filter = "filter_example"; // String | 
    String searchFilters = "searchFilters_example"; // String | 
    Boolean demo = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCountResponse result = apiInstance.getCount()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filter(filter)
            .searchFilters(searchFilters)
            .demo(demo)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textSearch** | **String**|  | [optional] |
| **byIPFromComment** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **searchFilters** | **String**|  | [optional] |
| **demo** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCountResponse**](GetCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCounts"></a>
# **getCounts**
> GetCountsResponse getCounts().tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCountsResponse result = apiInstance.getCounts()
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getCounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCountsResponse**](GetCountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getLogs"></a>
# **getLogs**
> GetLogsResponse getLogs(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetLogsResponse result = apiInstance.getLogs(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetLogsResponse**](GetLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getManualBadges"></a>
# **getManualBadges**
> GetManualBadgesResponse getManualBadges().tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetManualBadgesResponse result = apiInstance.getManualBadges()
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getManualBadges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetManualBadgesResponse**](GetManualBadgesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getManualBadgesForUser"></a>
# **getManualBadgesForUser**
> GetManualBadgesForUserResponse getManualBadgesForUser().badgesUserId(badgesUserId).commentId(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String badgesUserId = "badgesUserId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetManualBadgesForUserResponse result = apiInstance.getManualBadgesForUser()
            .badgesUserId(badgesUserId)
            .commentId(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getManualBadgesForUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **badgesUserId** | **String**|  | [optional] |
| **commentId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetManualBadgesForUserResponse**](GetManualBadgesForUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getModerationComment"></a>
# **getModerationComment**
> GetModerationCommentResponse getModerationComment(commentId).includeEmail(includeEmail).includeIP(includeIP).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean includeEmail = true; // Boolean | 
    Boolean includeIP = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetModerationCommentResponse result = apiInstance.getModerationComment(commentId)
            .includeEmail(includeEmail)
            .includeIP(includeIP)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getModerationComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **includeEmail** | **Boolean**|  | [optional] |
| **includeIP** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetModerationCommentResponse**](GetModerationCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getModerationCommentText"></a>
# **getModerationCommentText**
> GetModerationCommentTextResponse getModerationCommentText(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetModerationCommentTextResponse result = apiInstance.getModerationCommentText(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getModerationCommentText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetModerationCommentTextResponse**](GetModerationCommentTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getPreBanSummary"></a>
# **getPreBanSummary**
> GetPreBanSummaryResponse getPreBanSummary(commentId).includeByUserIdAndEmail(includeByUserIdAndEmail).includeByIP(includeByIP).includeByEmailDomain(includeByEmailDomain).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean includeByUserIdAndEmail = true; // Boolean | 
    Boolean includeByIP = true; // Boolean | 
    Boolean includeByEmailDomain = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetPreBanSummaryResponse result = apiInstance.getPreBanSummary(commentId)
            .includeByUserIdAndEmail(includeByUserIdAndEmail)
            .includeByIP(includeByIP)
            .includeByEmailDomain(includeByEmailDomain)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getPreBanSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **includeByUserIdAndEmail** | **Boolean**|  | [optional] |
| **includeByIP** | **Boolean**|  | [optional] |
| **includeByEmailDomain** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetPreBanSummaryResponse**](GetPreBanSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSearchCommentsSummary"></a>
# **getSearchCommentsSummary**
> GetSearchCommentsSummaryResponse getSearchCommentsSummary().value(value).filters(filters).searchFilters(searchFilters).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String value = "value_example"; // String | 
    String filters = "filters_example"; // String | 
    String searchFilters = "searchFilters_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetSearchCommentsSummaryResponse result = apiInstance.getSearchCommentsSummary()
            .value(value)
            .filters(filters)
            .searchFilters(searchFilters)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getSearchCommentsSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **value** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |
| **searchFilters** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetSearchCommentsSummaryResponse**](GetSearchCommentsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSearchPages"></a>
# **getSearchPages**
> GetSearchPagesResponse getSearchPages().value(value).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String value = "value_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetSearchPagesResponse result = apiInstance.getSearchPages()
            .value(value)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getSearchPages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **value** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetSearchPagesResponse**](GetSearchPagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSearchSites"></a>
# **getSearchSites**
> GetSearchSitesResponse getSearchSites().value(value).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String value = "value_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetSearchSitesResponse result = apiInstance.getSearchSites()
            .value(value)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getSearchSites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **value** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetSearchSitesResponse**](GetSearchSitesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSearchSuggest"></a>
# **getSearchSuggest**
> GetSearchSuggestResponse getSearchSuggest().textSearch(textSearch).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String textSearch = "textSearch_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetSearchSuggestResponse result = apiInstance.getSearchSuggest()
            .textSearch(textSearch)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getSearchSuggest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textSearch** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetSearchSuggestResponse**](GetSearchSuggestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getSearchUsers"></a>
# **getSearchUsers**
> GetSearchUsersResponse getSearchUsers().value(value).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String value = "value_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetSearchUsersResponse result = apiInstance.getSearchUsers()
            .value(value)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getSearchUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **value** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetSearchUsersResponse**](GetSearchUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getTrustFactor"></a>
# **getTrustFactor**
> GetTrustFactorResponse getTrustFactor().userId(userId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String userId = "userId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetTrustFactorResponse result = apiInstance.getTrustFactor()
            .userId(userId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getTrustFactor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetTrustFactorResponse**](GetTrustFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUserBanPreference"></a>
# **getUserBanPreference**
> GetUserBanPreferenceResponse getUserBanPreference().tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetUserBanPreferenceResponse result = apiInstance.getUserBanPreference()
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getUserBanPreference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserBanPreferenceResponse**](GetUserBanPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUserInternalProfile"></a>
# **getUserInternalProfile**
> GetUserInternalProfileResponse1 getUserInternalProfile().commentId(commentId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetUserInternalProfileResponse1 result = apiInstance.getUserInternalProfile()
            .commentId(commentId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#getUserInternalProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserInternalProfileResponse1**](GetUserInternalProfileResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postAdjustCommentVotes"></a>
# **postAdjustCommentVotes**
> PostAdjustCommentVotesResponse postAdjustCommentVotes(commentId, adjustCommentVotesParams).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    AdjustCommentVotesParams adjustCommentVotesParams = new AdjustCommentVotesParams(); // AdjustCommentVotesParams | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostAdjustCommentVotesResponse result = apiInstance.postAdjustCommentVotes(commentId, adjustCommentVotesParams)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postAdjustCommentVotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **adjustCommentVotesParams** | [**AdjustCommentVotesParams**](AdjustCommentVotesParams.md)|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostAdjustCommentVotesResponse**](PostAdjustCommentVotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postApiExport"></a>
# **postApiExport**
> PostApiExportResponse postApiExport().textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).sorts(sorts).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String textSearch = "textSearch_example"; // String | 
    String byIPFromComment = "byIPFromComment_example"; // String | 
    String filters = "filters_example"; // String | 
    String searchFilters = "searchFilters_example"; // String | 
    String sorts = "sorts_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostApiExportResponse result = apiInstance.postApiExport()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .sorts(sorts)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postApiExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textSearch** | **String**|  | [optional] |
| **byIPFromComment** | **String**|  | [optional] |
| **filters** | **String**|  | [optional] |
| **searchFilters** | **String**|  | [optional] |
| **sorts** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostApiExportResponse**](PostApiExportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postBanUserFromComment"></a>
# **postBanUserFromComment**
> PostBanUserFromCommentResponse postBanUserFromComment(commentId).banEmail(banEmail).banEmailDomain(banEmailDomain).banIP(banIP).deleteAllUsersComments(deleteAllUsersComments).bannedUntil(bannedUntil).isShadowBan(isShadowBan).updateId(updateId).banReason(banReason).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean banEmail = true; // Boolean | 
    Boolean banEmailDomain = true; // Boolean | 
    Boolean banIP = true; // Boolean | 
    Boolean deleteAllUsersComments = true; // Boolean | 
    String bannedUntil = "bannedUntil_example"; // String | 
    Boolean isShadowBan = true; // Boolean | 
    String updateId = "updateId_example"; // String | 
    String banReason = "banReason_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostBanUserFromCommentResponse result = apiInstance.postBanUserFromComment(commentId)
            .banEmail(banEmail)
            .banEmailDomain(banEmailDomain)
            .banIP(banIP)
            .deleteAllUsersComments(deleteAllUsersComments)
            .bannedUntil(bannedUntil)
            .isShadowBan(isShadowBan)
            .updateId(updateId)
            .banReason(banReason)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postBanUserFromComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **banEmail** | **Boolean**|  | [optional] |
| **banEmailDomain** | **Boolean**|  | [optional] |
| **banIP** | **Boolean**|  | [optional] |
| **deleteAllUsersComments** | **Boolean**|  | [optional] |
| **bannedUntil** | **String**|  | [optional] |
| **isShadowBan** | **Boolean**|  | [optional] |
| **updateId** | **String**|  | [optional] |
| **banReason** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostBanUserFromCommentResponse**](PostBanUserFromCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postBanUserUndo"></a>
# **postBanUserUndo**
> PostBanUserUndoResponse postBanUserUndo(banUserUndoParams).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    BanUserUndoParams banUserUndoParams = new BanUserUndoParams(); // BanUserUndoParams | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostBanUserUndoResponse result = apiInstance.postBanUserUndo(banUserUndoParams)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postBanUserUndo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **banUserUndoParams** | [**BanUserUndoParams**](BanUserUndoParams.md)|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostBanUserUndoResponse**](PostBanUserUndoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postBulkPreBanSummary"></a>
# **postBulkPreBanSummary**
> PostBulkPreBanSummaryResponse postBulkPreBanSummary(bulkPreBanParams).includeByUserIdAndEmail(includeByUserIdAndEmail).includeByIP(includeByIP).includeByEmailDomain(includeByEmailDomain).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    BulkPreBanParams bulkPreBanParams = new BulkPreBanParams(); // BulkPreBanParams | 
    Boolean includeByUserIdAndEmail = true; // Boolean | 
    Boolean includeByIP = true; // Boolean | 
    Boolean includeByEmailDomain = true; // Boolean | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostBulkPreBanSummaryResponse result = apiInstance.postBulkPreBanSummary(bulkPreBanParams)
            .includeByUserIdAndEmail(includeByUserIdAndEmail)
            .includeByIP(includeByIP)
            .includeByEmailDomain(includeByEmailDomain)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postBulkPreBanSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkPreBanParams** | [**BulkPreBanParams**](BulkPreBanParams.md)|  | |
| **includeByUserIdAndEmail** | **Boolean**|  | [optional] |
| **includeByIP** | **Boolean**|  | [optional] |
| **includeByEmailDomain** | **Boolean**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostBulkPreBanSummaryResponse**](PostBulkPreBanSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postCommentsByIds"></a>
# **postCommentsByIds**
> PostCommentsByIdsResponse postCommentsByIds(commentsByIdsParams).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    CommentsByIdsParams commentsByIdsParams = new CommentsByIdsParams(); // CommentsByIdsParams | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostCommentsByIdsResponse result = apiInstance.postCommentsByIds(commentsByIdsParams)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postCommentsByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentsByIdsParams** | [**CommentsByIdsParams**](CommentsByIdsParams.md)|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostCommentsByIdsResponse**](PostCommentsByIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postFlagComment"></a>
# **postFlagComment**
> PostFlagCommentResponse postFlagComment(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostFlagCommentResponse result = apiInstance.postFlagComment(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postFlagComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostFlagCommentResponse**](PostFlagCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postRemoveComment"></a>
# **postRemoveComment**
> PostRemoveCommentResponse postRemoveComment(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostRemoveCommentResponse result = apiInstance.postRemoveComment(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postRemoveComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostRemoveCommentResponse**](PostRemoveCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postRestoreDeletedComment"></a>
# **postRestoreDeletedComment**
> PostRestoreDeletedCommentResponse postRestoreDeletedComment(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostRestoreDeletedCommentResponse result = apiInstance.postRestoreDeletedComment(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postRestoreDeletedComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostRestoreDeletedCommentResponse**](PostRestoreDeletedCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postSetCommentApprovalStatus"></a>
# **postSetCommentApprovalStatus**
> PostSetCommentApprovalStatusResponse postSetCommentApprovalStatus(commentId).approved(approved).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean approved = true; // Boolean | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostSetCommentApprovalStatusResponse result = apiInstance.postSetCommentApprovalStatus(commentId)
            .approved(approved)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postSetCommentApprovalStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **approved** | **Boolean**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostSetCommentApprovalStatusResponse**](PostSetCommentApprovalStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postSetCommentReviewStatus"></a>
# **postSetCommentReviewStatus**
> PostSetCommentReviewStatusResponse postSetCommentReviewStatus(commentId).reviewed(reviewed).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean reviewed = true; // Boolean | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostSetCommentReviewStatusResponse result = apiInstance.postSetCommentReviewStatus(commentId)
            .reviewed(reviewed)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postSetCommentReviewStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **reviewed** | **Boolean**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostSetCommentReviewStatusResponse**](PostSetCommentReviewStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postSetCommentSpamStatus"></a>
# **postSetCommentSpamStatus**
> PostSetCommentSpamStatusResponse postSetCommentSpamStatus(commentId).spam(spam).permNotSpam(permNotSpam).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    Boolean spam = true; // Boolean | 
    Boolean permNotSpam = true; // Boolean | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostSetCommentSpamStatusResponse result = apiInstance.postSetCommentSpamStatus(commentId)
            .spam(spam)
            .permNotSpam(permNotSpam)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postSetCommentSpamStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **spam** | **Boolean**|  | [optional] |
| **permNotSpam** | **Boolean**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostSetCommentSpamStatusResponse**](PostSetCommentSpamStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postSetCommentText"></a>
# **postSetCommentText**
> PostSetCommentTextResponse postSetCommentText(commentId, setCommentTextParams).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    SetCommentTextParams setCommentTextParams = new SetCommentTextParams(); // SetCommentTextParams | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostSetCommentTextResponse result = apiInstance.postSetCommentText(commentId, setCommentTextParams)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postSetCommentText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **setCommentTextParams** | [**SetCommentTextParams**](SetCommentTextParams.md)|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostSetCommentTextResponse**](PostSetCommentTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postUnFlagComment"></a>
# **postUnFlagComment**
> PostUnFlagCommentResponse postUnFlagComment(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostUnFlagCommentResponse result = apiInstance.postUnFlagComment(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postUnFlagComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostUnFlagCommentResponse**](PostUnFlagCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="postVote"></a>
# **postVote**
> PostVoteResponse postVote(commentId).direction(direction).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String commentId = "commentId_example"; // String | 
    String direction = "direction_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PostVoteResponse result = apiInstance.postVote(commentId)
            .direction(direction)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#postVote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **String**|  | |
| **direction** | **String**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PostVoteResponse**](PostVoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="putAwardBadge"></a>
# **putAwardBadge**
> PutAwardBadgeResponse putAwardBadge(badgeId).userId(userId).commentId(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String badgeId = "badgeId_example"; // String | 
    String userId = "userId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PutAwardBadgeResponse result = apiInstance.putAwardBadge(badgeId)
            .userId(userId)
            .commentId(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#putAwardBadge");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **badgeId** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **commentId** | **String**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PutAwardBadgeResponse**](PutAwardBadgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="putCloseThread"></a>
# **putCloseThread**
> PutCloseThreadResponse putCloseThread(urlId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String urlId = "urlId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PutCloseThreadResponse result = apiInstance.putCloseThread(urlId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#putCloseThread");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **urlId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PutCloseThreadResponse**](PutCloseThreadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="putRemoveBadge"></a>
# **putRemoveBadge**
> PutRemoveBadgeResponse putRemoveBadge(badgeId).userId(userId).commentId(commentId).broadcastId(broadcastId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String badgeId = "badgeId_example"; // String | 
    String userId = "userId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PutRemoveBadgeResponse result = apiInstance.putRemoveBadge(badgeId)
            .userId(userId)
            .commentId(commentId)
            .broadcastId(broadcastId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#putRemoveBadge");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **badgeId** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **commentId** | **String**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PutRemoveBadgeResponse**](PutRemoveBadgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="putReopenThread"></a>
# **putReopenThread**
> PutReopenThreadResponse putReopenThread(urlId).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String urlId = "urlId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PutReopenThreadResponse result = apiInstance.putReopenThread(urlId)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#putReopenThread");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **urlId** | **String**|  | |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**PutReopenThreadResponse**](PutReopenThreadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="setTrustFactor"></a>
# **setTrustFactor**
> SetTrustFactorResponse setTrustFactor().userId(userId).trustFactor(trustFactor).tenantId(tenantId).sso(sso).execute();



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fastcomments.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String userId = "userId_example"; // String | 
    String trustFactor = "trustFactor_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      SetTrustFactorResponse result = apiInstance.setTrustFactor()
            .userId(userId)
            .trustFactor(trustFactor)
            .tenantId(tenantId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#setTrustFactor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | [optional] |
| **trustFactor** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**SetTrustFactorResponse**](SetTrustFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


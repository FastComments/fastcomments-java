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
> VoteDeleteResponse deleteModerationVote(commentId, voteId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      VoteDeleteResponse result = apiInstance.deleteModerationVote(commentId, voteId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**VoteDeleteResponse**](VoteDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getApiComments"></a>
# **getApiComments**
> ModerationAPIGetCommentsResponse getApiComments().page(page).count(count).textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).sorts(sorts).demo(demo).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPIGetCommentsResponse result = apiInstance.getApiComments()
            .page(page)
            .count(count)
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .sorts(sorts)
            .demo(demo)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPIGetCommentsResponse**](ModerationAPIGetCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getApiExportStatus"></a>
# **getApiExportStatus**
> ModerationExportStatusResponse getApiExportStatus().batchJobId(batchJobId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationExportStatusResponse result = apiInstance.getApiExportStatus()
            .batchJobId(batchJobId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationExportStatusResponse**](ModerationExportStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getApiIds"></a>
# **getApiIds**
> ModerationAPIGetCommentIdsResponse getApiIds().textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).afterId(afterId).demo(demo).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPIGetCommentIdsResponse result = apiInstance.getApiIds()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .afterId(afterId)
            .demo(demo)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPIGetCommentIdsResponse**](ModerationAPIGetCommentIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getBanUsersFromComment"></a>
# **getBanUsersFromComment**
> GetBannedUsersFromCommentResponse getBanUsersFromComment(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetBannedUsersFromCommentResponse result = apiInstance.getBanUsersFromComment(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetBannedUsersFromCommentResponse**](GetBannedUsersFromCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getCommentBanStatus"></a>
# **getCommentBanStatus**
> GetCommentBanStatusResponse getCommentBanStatus(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetCommentBanStatusResponse result = apiInstance.getCommentBanStatus(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentBanStatusResponse**](GetCommentBanStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getCommentChildren"></a>
# **getCommentChildren**
> ModerationAPIChildCommentsResponse getCommentChildren(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPIChildCommentsResponse result = apiInstance.getCommentChildren(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPIChildCommentsResponse**](ModerationAPIChildCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getCount"></a>
# **getCount**
> ModerationAPICountCommentsResponse getCount().textSearch(textSearch).byIPFromComment(byIPFromComment).filter(filter).searchFilters(searchFilters).demo(demo).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPICountCommentsResponse result = apiInstance.getCount()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filter(filter)
            .searchFilters(searchFilters)
            .demo(demo)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPICountCommentsResponse**](ModerationAPICountCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getCounts"></a>
# **getCounts**
> GetBannedUsersCountResponse getCounts().sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetBannedUsersCountResponse result = apiInstance.getCounts()
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetBannedUsersCountResponse**](GetBannedUsersCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getLogs"></a>
# **getLogs**
> ModerationAPIGetLogsResponse getLogs(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPIGetLogsResponse result = apiInstance.getLogs(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPIGetLogsResponse**](ModerationAPIGetLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getManualBadges"></a>
# **getManualBadges**
> GetTenantManualBadgesResponse getManualBadges().sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetTenantManualBadgesResponse result = apiInstance.getManualBadges()
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetTenantManualBadgesResponse**](GetTenantManualBadgesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getManualBadgesForUser"></a>
# **getManualBadgesForUser**
> GetUserManualBadgesResponse getManualBadgesForUser().badgesUserId(badgesUserId).commentId(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetUserManualBadgesResponse result = apiInstance.getManualBadgesForUser()
            .badgesUserId(badgesUserId)
            .commentId(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserManualBadgesResponse**](GetUserManualBadgesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getModerationComment"></a>
# **getModerationComment**
> ModerationAPICommentResponse getModerationComment(commentId).includeEmail(includeEmail).includeIP(includeIP).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPICommentResponse result = apiInstance.getModerationComment(commentId)
            .includeEmail(includeEmail)
            .includeIP(includeIP)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPICommentResponse**](ModerationAPICommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getModerationCommentText"></a>
# **getModerationCommentText**
> GetCommentTextResponse getModerationCommentText(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetCommentTextResponse result = apiInstance.getModerationCommentText(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentTextResponse**](GetCommentTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getPreBanSummary"></a>
# **getPreBanSummary**
> PreBanSummary getPreBanSummary(commentId).includeByUserIdAndEmail(includeByUserIdAndEmail).includeByIP(includeByIP).includeByEmailDomain(includeByEmailDomain).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      PreBanSummary result = apiInstance.getPreBanSummary(commentId)
            .includeByUserIdAndEmail(includeByUserIdAndEmail)
            .includeByIP(includeByIP)
            .includeByEmailDomain(includeByEmailDomain)
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
| **sso** | **String**|  | [optional] |

### Return type

[**PreBanSummary**](PreBanSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getSearchCommentsSummary"></a>
# **getSearchCommentsSummary**
> ModerationCommentSearchResponse getSearchCommentsSummary().value(value).filters(filters).searchFilters(searchFilters).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationCommentSearchResponse result = apiInstance.getSearchCommentsSummary()
            .value(value)
            .filters(filters)
            .searchFilters(searchFilters)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationCommentSearchResponse**](ModerationCommentSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getSearchPages"></a>
# **getSearchPages**
> ModerationPageSearchResponse getSearchPages().value(value).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationPageSearchResponse result = apiInstance.getSearchPages()
            .value(value)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationPageSearchResponse**](ModerationPageSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getSearchSites"></a>
# **getSearchSites**
> ModerationSiteSearchResponse getSearchSites().value(value).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationSiteSearchResponse result = apiInstance.getSearchSites()
            .value(value)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationSiteSearchResponse**](ModerationSiteSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getSearchSuggest"></a>
# **getSearchSuggest**
> ModerationSuggestResponse getSearchSuggest().textSearch(textSearch).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationSuggestResponse result = apiInstance.getSearchSuggest()
            .textSearch(textSearch)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationSuggestResponse**](ModerationSuggestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getSearchUsers"></a>
# **getSearchUsers**
> ModerationUserSearchResponse getSearchUsers().value(value).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationUserSearchResponse result = apiInstance.getSearchUsers()
            .value(value)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationUserSearchResponse**](ModerationUserSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getTrustFactor"></a>
# **getTrustFactor**
> GetUserTrustFactorResponse getTrustFactor().userId(userId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetUserTrustFactorResponse result = apiInstance.getTrustFactor()
            .userId(userId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserTrustFactorResponse**](GetUserTrustFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getUserBanPreference"></a>
# **getUserBanPreference**
> APIModerateGetUserBanPreferencesResponse getUserBanPreference().sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIModerateGetUserBanPreferencesResponse result = apiInstance.getUserBanPreference()
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIModerateGetUserBanPreferencesResponse**](APIModerateGetUserBanPreferencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="getUserInternalProfile"></a>
# **getUserInternalProfile**
> GetUserInternalProfileResponse getUserInternalProfile().commentId(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      GetUserInternalProfileResponse result = apiInstance.getUserInternalProfile()
            .commentId(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserInternalProfileResponse**](GetUserInternalProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postAdjustCommentVotes"></a>
# **postAdjustCommentVotes**
> AdjustVotesResponse postAdjustCommentVotes(commentId, adjustCommentVotesParams).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      AdjustVotesResponse result = apiInstance.postAdjustCommentVotes(commentId, adjustCommentVotesParams)
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
| **sso** | **String**|  | [optional] |

### Return type

[**AdjustVotesResponse**](AdjustVotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postApiExport"></a>
# **postApiExport**
> ModerationExportResponse postApiExport().textSearch(textSearch).byIPFromComment(byIPFromComment).filters(filters).searchFilters(searchFilters).sorts(sorts).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationExportResponse result = apiInstance.postApiExport()
            .textSearch(textSearch)
            .byIPFromComment(byIPFromComment)
            .filters(filters)
            .searchFilters(searchFilters)
            .sorts(sorts)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationExportResponse**](ModerationExportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postBanUserFromComment"></a>
# **postBanUserFromComment**
> BanUserFromCommentResult postBanUserFromComment(commentId).banEmail(banEmail).banEmailDomain(banEmailDomain).banIP(banIP).deleteAllUsersComments(deleteAllUsersComments).bannedUntil(bannedUntil).isShadowBan(isShadowBan).updateId(updateId).banReason(banReason).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      BanUserFromCommentResult result = apiInstance.postBanUserFromComment(commentId)
            .banEmail(banEmail)
            .banEmailDomain(banEmailDomain)
            .banIP(banIP)
            .deleteAllUsersComments(deleteAllUsersComments)
            .bannedUntil(bannedUntil)
            .isShadowBan(isShadowBan)
            .updateId(updateId)
            .banReason(banReason)
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
| **sso** | **String**|  | [optional] |

### Return type

[**BanUserFromCommentResult**](BanUserFromCommentResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postBanUserUndo"></a>
# **postBanUserUndo**
> APIEmptyResponse postBanUserUndo(banUserUndoParams).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postBanUserUndo(banUserUndoParams)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postBulkPreBanSummary"></a>
# **postBulkPreBanSummary**
> BulkPreBanSummary postBulkPreBanSummary(bulkPreBanParams).includeByUserIdAndEmail(includeByUserIdAndEmail).includeByIP(includeByIP).includeByEmailDomain(includeByEmailDomain).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      BulkPreBanSummary result = apiInstance.postBulkPreBanSummary(bulkPreBanParams)
            .includeByUserIdAndEmail(includeByUserIdAndEmail)
            .includeByIP(includeByIP)
            .includeByEmailDomain(includeByEmailDomain)
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
| **sso** | **String**|  | [optional] |

### Return type

[**BulkPreBanSummary**](BulkPreBanSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postCommentsByIds"></a>
# **postCommentsByIds**
> ModerationAPIChildCommentsResponse postCommentsByIds(commentsByIdsParams).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      ModerationAPIChildCommentsResponse result = apiInstance.postCommentsByIds(commentsByIdsParams)
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
| **sso** | **String**|  | [optional] |

### Return type

[**ModerationAPIChildCommentsResponse**](ModerationAPIChildCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postFlagComment"></a>
# **postFlagComment**
> APIEmptyResponse postFlagComment(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postFlagComment(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postRemoveComment"></a>
# **postRemoveComment**
> PostRemoveCommentResponse postRemoveComment(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      PostRemoveCommentResponse result = apiInstance.postRemoveComment(commentId)
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
| **0** | Error |  -  |

<a id="postRestoreDeletedComment"></a>
# **postRestoreDeletedComment**
> APIEmptyResponse postRestoreDeletedComment(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postRestoreDeletedComment(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postSetCommentApprovalStatus"></a>
# **postSetCommentApprovalStatus**
> SetCommentApprovedResponse postSetCommentApprovalStatus(commentId).approved(approved).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      SetCommentApprovedResponse result = apiInstance.postSetCommentApprovalStatus(commentId)
            .approved(approved)
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
| **sso** | **String**|  | [optional] |

### Return type

[**SetCommentApprovedResponse**](SetCommentApprovedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postSetCommentReviewStatus"></a>
# **postSetCommentReviewStatus**
> APIEmptyResponse postSetCommentReviewStatus(commentId).reviewed(reviewed).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postSetCommentReviewStatus(commentId)
            .reviewed(reviewed)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postSetCommentSpamStatus"></a>
# **postSetCommentSpamStatus**
> APIEmptyResponse postSetCommentSpamStatus(commentId).spam(spam).permNotSpam(permNotSpam).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postSetCommentSpamStatus(commentId)
            .spam(spam)
            .permNotSpam(permNotSpam)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postSetCommentText"></a>
# **postSetCommentText**
> SetCommentTextResponse postSetCommentText(commentId, setCommentTextParams).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      SetCommentTextResponse result = apiInstance.postSetCommentText(commentId, setCommentTextParams)
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
| **sso** | **String**|  | [optional] |

### Return type

[**SetCommentTextResponse**](SetCommentTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postUnFlagComment"></a>
# **postUnFlagComment**
> APIEmptyResponse postUnFlagComment(commentId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.postUnFlagComment(commentId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="postVote"></a>
# **postVote**
> VoteResponse postVote(commentId).direction(direction).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      VoteResponse result = apiInstance.postVote(commentId)
            .direction(direction)
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
| **sso** | **String**|  | [optional] |

### Return type

[**VoteResponse**](VoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="putAwardBadge"></a>
# **putAwardBadge**
> AwardUserBadgeResponse putAwardBadge(badgeId).userId(userId).commentId(commentId).broadcastId(broadcastId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      AwardUserBadgeResponse result = apiInstance.putAwardBadge(badgeId)
            .userId(userId)
            .commentId(commentId)
            .broadcastId(broadcastId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**AwardUserBadgeResponse**](AwardUserBadgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="putCloseThread"></a>
# **putCloseThread**
> APIEmptyResponse putCloseThread(urlId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.putCloseThread(urlId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="putRemoveBadge"></a>
# **putRemoveBadge**
> RemoveUserBadgeResponse putRemoveBadge(badgeId).userId(userId).commentId(commentId).broadcastId(broadcastId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      RemoveUserBadgeResponse result = apiInstance.putRemoveBadge(badgeId)
            .userId(userId)
            .commentId(commentId)
            .broadcastId(broadcastId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**RemoveUserBadgeResponse**](RemoveUserBadgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="putReopenThread"></a>
# **putReopenThread**
> APIEmptyResponse putReopenThread(urlId).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      APIEmptyResponse result = apiInstance.putReopenThread(urlId)
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
| **sso** | **String**|  | [optional] |

### Return type

[**APIEmptyResponse**](APIEmptyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |

<a id="setTrustFactor"></a>
# **setTrustFactor**
> SetUserTrustFactorResponse setTrustFactor().userId(userId).trustFactor(trustFactor).sso(sso).execute();



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
    String sso = "sso_example"; // String | 
    try {
      SetUserTrustFactorResponse result = apiInstance.setTrustFactor()
            .userId(userId)
            .trustFactor(trustFactor)
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
| **sso** | **String**|  | [optional] |

### Return type

[**SetUserTrustFactorResponse**](SetUserTrustFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | Error |  -  |


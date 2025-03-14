# PublicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockFromComment**](PublicApi.md#blockFromComment) | **POST** /block-from-comment/{commentId} |  |
| [**checkedCommentsForBlocked**](PublicApi.md#checkedCommentsForBlocked) | **GET** /check-blocked-comments |  |
| [**createComment**](PublicApi.md#createComment) | **POST** /comments/{tenantId} |  |
| [**deleteComment**](PublicApi.md#deleteComment) | **DELETE** /comments/{tenantId}/{commentId} |  |
| [**deleteCommentVote**](PublicApi.md#deleteCommentVote) | **DELETE** /comments/{tenantId}/{commentId}/vote/{voteId} |  |
| [**flagComment**](PublicApi.md#flagComment) | **POST** /flag-comment/{commentId} |  |
| [**getCommentText**](PublicApi.md#getCommentText) | **GET** /comments/{tenantId}/{commentId}/text |  |
| [**getCommentVoteUserNames**](PublicApi.md#getCommentVoteUserNames) | **GET** /comments/{tenantId}/{commentId}/votes |  |
| [**getComments**](PublicApi.md#getComments) | **GET** /comments/{tenantId} |  |
| [**getUserNotificationCount**](PublicApi.md#getUserNotificationCount) | **GET** /user-notifications/get-count |  |
| [**getUserNotifications**](PublicApi.md#getUserNotifications) | **GET** /user-notifications |  |
| [**lockComment**](PublicApi.md#lockComment) | **POST** /comments/{tenantId}/{commentId}/lock |  |
| [**pinComment**](PublicApi.md#pinComment) | **POST** /comments/{tenantId}/{commentId}/pin |  |
| [**resetUserNotificationCount**](PublicApi.md#resetUserNotificationCount) | **POST** /user-notifications/reset-count |  |
| [**resetUserNotifications**](PublicApi.md#resetUserNotifications) | **POST** /user-notifications/reset |  |
| [**setCommentText**](PublicApi.md#setCommentText) | **POST** /comments/{tenantId}/{commentId}/update-text |  |
| [**unBlockComment**](PublicApi.md#unBlockComment) | **DELETE** /block-from-comment/{commentId} |  |
| [**unLockComment**](PublicApi.md#unLockComment) | **POST** /comments/{tenantId}/{commentId}/unlock |  |
| [**unPinComment**](PublicApi.md#unPinComment) | **POST** /comments/{tenantId}/{commentId}/unpin |  |
| [**updateUserNotificationCommentSubscriptionStatus**](PublicApi.md#updateUserNotificationCommentSubscriptionStatus) | **POST** /user-notifications/{notificationId}/mark-opted/{optedInOrOut} |  |
| [**updateUserNotificationPageSubscriptionStatus**](PublicApi.md#updateUserNotificationPageSubscriptionStatus) | **POST** /user-notifications/set-subscription-state/{subscribedOrUnsubscribed} |  |
| [**updateUserNotificationStatus**](PublicApi.md#updateUserNotificationStatus) | **POST** /user-notifications/{notificationId}/mark/{newStatus} |  |
| [**voteComment**](PublicApi.md#voteComment) | **POST** /comments/{tenantId}/{commentId}/vote |  |


<a id="blockFromComment"></a>
# **blockFromComment**
> BlockFromComment200Response blockFromComment(tenantId, commentId, blockFromCommentParams, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    BlockFromCommentParams blockFromCommentParams = new BlockFromCommentParams(); // BlockFromCommentParams | 
    String sso = "sso_example"; // String | 
    try {
      BlockFromComment200Response result = apiInstance.blockFromComment(tenantId, commentId, blockFromCommentParams, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#blockFromComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **blockFromCommentParams** | [**BlockFromCommentParams**](BlockFromCommentParams.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**BlockFromComment200Response**](BlockFromComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="checkedCommentsForBlocked"></a>
# **checkedCommentsForBlocked**
> CheckedCommentsForBlocked200Response checkedCommentsForBlocked(tenantId, commentIds, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentIds = "commentIds_example"; // String | A comma separated list of comment ids.
    String sso = "sso_example"; // String | 
    try {
      CheckedCommentsForBlocked200Response result = apiInstance.checkedCommentsForBlocked(tenantId, commentIds, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#checkedCommentsForBlocked");
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
| **tenantId** | **String**|  | |
| **commentIds** | **String**| A comma separated list of comment ids. | |
| **sso** | **String**|  | [optional] |

### Return type

[**CheckedCommentsForBlocked200Response**](CheckedCommentsForBlocked200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createComment"></a>
# **createComment**
> CreateComment200Response createComment(tenantId, urlId, broadcastId, commentData, sessionId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    CommentData commentData = new CommentData(); // CommentData | 
    String sessionId = "sessionId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      CreateComment200Response result = apiInstance.createComment(tenantId, urlId, broadcastId, commentData, sessionId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#createComment");
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
| **tenantId** | **String**|  | |
| **urlId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **commentData** | [**CommentData**](CommentData.md)|  | |
| **sessionId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**CreateComment200Response**](CreateComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteComment"></a>
# **deleteComment**
> DeleteComment200Response deleteComment(tenantId, commentId, broadcastId, editKey)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    try {
      DeleteComment200Response result = apiInstance.deleteComment(tenantId, commentId, broadcastId, editKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **editKey** | **String**|  | [optional] |

### Return type

[**DeleteComment200Response**](DeleteComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteCommentVote"></a>
# **deleteCommentVote**
> DeleteCommentVote200Response deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId, editKey, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String voteId = "voteId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      DeleteCommentVote200Response result = apiInstance.deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId, editKey, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteCommentVote");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **voteId** | **String**|  | |
| **urlId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **editKey** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**DeleteCommentVote200Response**](DeleteCommentVote200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="flagComment"></a>
# **flagComment**
> FlagComment200Response flagComment(tenantId, commentId, isFlagged, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    BooleanQueryParam isFlagged = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    String sso = "sso_example"; // String | 
    try {
      FlagComment200Response result = apiInstance.flagComment(tenantId, commentId, isFlagged, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#flagComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **isFlagged** | [**BooleanQueryParam**](.md)|  | [enum: true, false] |
| **sso** | **String**|  | [optional] |

### Return type

[**FlagComment200Response**](FlagComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentText"></a>
# **getCommentText**
> GetCommentText200Response getCommentText(tenantId, commentId, editKey, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCommentText200Response result = apiInstance.getCommentText(tenantId, commentId, editKey, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getCommentText");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **editKey** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentText200Response**](GetCommentText200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentVoteUserNames"></a>
# **getCommentVoteUserNames**
> GetCommentVoteUserNames200Response getCommentVoteUserNames(tenantId, commentId, direction, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    Double direction = 3.4D; // Double | Pass 1 for getting the names of users that up voted, and -1 for the usernames for users that down voted.
    String sso = "sso_example"; // String | 
    try {
      GetCommentVoteUserNames200Response result = apiInstance.getCommentVoteUserNames(tenantId, commentId, direction, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getCommentVoteUserNames");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **direction** | **Double**| Pass 1 for getting the names of users that up voted, and -1 for the usernames for users that down voted. | |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentVoteUserNames200Response**](GetCommentVoteUserNames200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getComments"></a>
# **getComments**
> GetComments200Response getComments(tenantId, urlId, page, direction, sso, skip, skipChildren, limit, limitChildren, lastGenDate, fetchPageForCommentId, includeConfig, countAll, includei10n, locale, modules, isCrawler, includeNotificationCount, asTree, maxTreeDepth, useFullTranslationIds, parentId, searchText, hashTags, userId, customConfigStr)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    Double page = 3.4D; // Double | 
    SortDirections direction = SortDirections.fromValue("OF"); // SortDirections | 
    String sso = "sso_example"; // String | 
    Double skip = 3.4D; // Double | 
    Double skipChildren = 3.4D; // Double | 
    Double limit = 3.4D; // Double | 
    Double limitChildren = 3.4D; // Double | 
    Double lastGenDate = 3.4D; // Double | 
    String fetchPageForCommentId = "fetchPageForCommentId_example"; // String | 
    BooleanQueryParam includeConfig = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam countAll = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam includei10n = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    String locale = "locale_example"; // String | 
    String modules = "modules_example"; // String | 
    BooleanQueryParam isCrawler = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam includeNotificationCount = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam asTree = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    Double maxTreeDepth = 3.4D; // Double | 
    BooleanQueryParam useFullTranslationIds = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    String parentId = "parentId_example"; // String | 
    String searchText = "searchText_example"; // String | 
    List<String> hashTags = Arrays.asList(); // List<String> | 
    String userId = "userId_example"; // String | 
    String customConfigStr = "customConfigStr_example"; // String | 
    try {
      GetComments200Response result = apiInstance.getComments(tenantId, urlId, page, direction, sso, skip, skipChildren, limit, limitChildren, lastGenDate, fetchPageForCommentId, includeConfig, countAll, includei10n, locale, modules, isCrawler, includeNotificationCount, asTree, maxTreeDepth, useFullTranslationIds, parentId, searchText, hashTags, userId, customConfigStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getComments");
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
| **tenantId** | **String**|  | |
| **urlId** | **String**|  | |
| **page** | **Double**|  | [optional] |
| **direction** | [**SortDirections**](.md)|  | [optional] [enum: OF, NF, MR] |
| **sso** | **String**|  | [optional] |
| **skip** | **Double**|  | [optional] |
| **skipChildren** | **Double**|  | [optional] |
| **limit** | **Double**|  | [optional] |
| **limitChildren** | **Double**|  | [optional] |
| **lastGenDate** | **Double**|  | [optional] |
| **fetchPageForCommentId** | **String**|  | [optional] |
| **includeConfig** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **countAll** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **includei10n** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **locale** | **String**|  | [optional] |
| **modules** | **String**|  | [optional] |
| **isCrawler** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **includeNotificationCount** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **asTree** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **maxTreeDepth** | **Double**|  | [optional] |
| **useFullTranslationIds** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **parentId** | **String**|  | [optional] |
| **searchText** | **String**|  | [optional] |
| **hashTags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userId** | **String**|  | [optional] |
| **customConfigStr** | **String**|  | [optional] |

### Return type

[**GetComments200Response**](GetComments200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUserNotificationCount"></a>
# **getUserNotificationCount**
> GetUserNotificationCount200Response getUserNotificationCount(tenantId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetUserNotificationCount200Response result = apiInstance.getUserNotificationCount(tenantId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserNotificationCount");
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
| **tenantId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserNotificationCount200Response**](GetUserNotificationCount200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUserNotifications"></a>
# **getUserNotifications**
> GetUserNotifications200Response getUserNotifications(tenantId, pageSize, afterId, includeContext, afterCreatedAt, unreadOnly, dmOnly, noDm, includeTranslations, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    Double pageSize = 3.4D; // Double | Defaults to 20.
    String afterId = "afterId_example"; // String | 
    BooleanQueryParam includeContext = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    Double afterCreatedAt = 3.4D; // Double | 
    BooleanQueryParam unreadOnly = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam dmOnly = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam noDm = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam includeTranslations = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    String sso = "sso_example"; // String | 
    try {
      GetUserNotifications200Response result = apiInstance.getUserNotifications(tenantId, pageSize, afterId, includeContext, afterCreatedAt, unreadOnly, dmOnly, noDm, includeTranslations, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserNotifications");
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
| **tenantId** | **String**|  | |
| **pageSize** | **Double**| Defaults to 20. | [optional] |
| **afterId** | **String**|  | [optional] |
| **includeContext** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **afterCreatedAt** | **Double**|  | [optional] |
| **unreadOnly** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **dmOnly** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **noDm** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **includeTranslations** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserNotifications200Response**](GetUserNotifications200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="lockComment"></a>
# **lockComment**
> LockComment200Response lockComment(tenantId, commentId, broadcastId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      LockComment200Response result = apiInstance.lockComment(tenantId, commentId, broadcastId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#lockComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**LockComment200Response**](LockComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="pinComment"></a>
# **pinComment**
> PinComment200Response pinComment(tenantId, commentId, broadcastId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PinComment200Response result = apiInstance.pinComment(tenantId, commentId, broadcastId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#pinComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**PinComment200Response**](PinComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="resetUserNotificationCount"></a>
# **resetUserNotificationCount**
> ResetUserNotifications200Response resetUserNotificationCount(tenantId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      ResetUserNotifications200Response result = apiInstance.resetUserNotificationCount(tenantId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#resetUserNotificationCount");
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
| **tenantId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**ResetUserNotifications200Response**](ResetUserNotifications200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="resetUserNotifications"></a>
# **resetUserNotifications**
> ResetUserNotifications200Response resetUserNotifications(tenantId, afterId, afterCreatedAt, unreadOnly, dmOnly, noDm, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String afterId = "afterId_example"; // String | 
    Double afterCreatedAt = 3.4D; // Double | 
    BooleanQueryParam unreadOnly = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam dmOnly = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    BooleanQueryParam noDm = BooleanQueryParam.fromValue("true"); // BooleanQueryParam | 
    String sso = "sso_example"; // String | 
    try {
      ResetUserNotifications200Response result = apiInstance.resetUserNotifications(tenantId, afterId, afterCreatedAt, unreadOnly, dmOnly, noDm, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#resetUserNotifications");
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
| **tenantId** | **String**|  | |
| **afterId** | **String**|  | [optional] |
| **afterCreatedAt** | **Double**|  | [optional] |
| **unreadOnly** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **dmOnly** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **noDm** | [**BooleanQueryParam**](.md)|  | [optional] [enum: true, false] |
| **sso** | **String**|  | [optional] |

### Return type

[**ResetUserNotifications200Response**](ResetUserNotifications200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="setCommentText"></a>
# **setCommentText**
> SetCommentText200Response setCommentText(tenantId, commentId, broadcastId, editKey, commentTextUpdateRequest, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    CommentTextUpdateRequest commentTextUpdateRequest = new CommentTextUpdateRequest(); // CommentTextUpdateRequest | 
    String sso = "sso_example"; // String | 
    try {
      SetCommentText200Response result = apiInstance.setCommentText(tenantId, commentId, broadcastId, editKey, commentTextUpdateRequest, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#setCommentText");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **editKey** | **String**|  | |
| **commentTextUpdateRequest** | [**CommentTextUpdateRequest**](CommentTextUpdateRequest.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**SetCommentText200Response**](SetCommentText200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="unBlockComment"></a>
# **unBlockComment**
> UnBlockComment200Response unBlockComment(tenantId, commentId, blockFromCommentParams, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    BlockFromCommentParams blockFromCommentParams = new BlockFromCommentParams(); // BlockFromCommentParams | 
    String sso = "sso_example"; // String | 
    try {
      UnBlockComment200Response result = apiInstance.unBlockComment(tenantId, commentId, blockFromCommentParams, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#unBlockComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **blockFromCommentParams** | [**BlockFromCommentParams**](BlockFromCommentParams.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**UnBlockComment200Response**](UnBlockComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="unLockComment"></a>
# **unLockComment**
> LockComment200Response unLockComment(tenantId, commentId, broadcastId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      LockComment200Response result = apiInstance.unLockComment(tenantId, commentId, broadcastId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#unLockComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**LockComment200Response**](LockComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="unPinComment"></a>
# **unPinComment**
> PinComment200Response unPinComment(tenantId, commentId, broadcastId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PinComment200Response result = apiInstance.unPinComment(tenantId, commentId, broadcastId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#unPinComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**PinComment200Response**](PinComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="updateUserNotificationCommentSubscriptionStatus"></a>
# **updateUserNotificationCommentSubscriptionStatus**
> UpdateUserNotificationStatus200Response updateUserNotificationCommentSubscriptionStatus(tenantId, notificationId, optedInOrOut, commentId, sso)



Enable or disable notifications for a specific comment.

### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    String optedInOrOut = "in"; // String | 
    String commentId = "commentId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationStatus200Response result = apiInstance.updateUserNotificationCommentSubscriptionStatus(tenantId, notificationId, optedInOrOut, commentId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#updateUserNotificationCommentSubscriptionStatus");
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
| **tenantId** | **String**|  | |
| **notificationId** | **String**|  | |
| **optedInOrOut** | **String**|  | [enum: in, out] |
| **commentId** | **String**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**UpdateUserNotificationStatus200Response**](UpdateUserNotificationStatus200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="updateUserNotificationPageSubscriptionStatus"></a>
# **updateUserNotificationPageSubscriptionStatus**
> UpdateUserNotificationStatus200Response updateUserNotificationPageSubscriptionStatus(tenantId, urlId, url, pageTitle, subscribedOrUnsubscribed, sso)



Enable or disable notifications for a page. When users are subscribed to a page, notifications are created for new root comments, and also

### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String url = "url_example"; // String | 
    String pageTitle = "pageTitle_example"; // String | 
    String subscribedOrUnsubscribed = "subscribe"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationStatus200Response result = apiInstance.updateUserNotificationPageSubscriptionStatus(tenantId, urlId, url, pageTitle, subscribedOrUnsubscribed, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#updateUserNotificationPageSubscriptionStatus");
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
| **tenantId** | **String**|  | |
| **urlId** | **String**|  | |
| **url** | **String**|  | |
| **pageTitle** | **String**|  | |
| **subscribedOrUnsubscribed** | **String**|  | [enum: subscribe, unsubscribe] |
| **sso** | **String**|  | [optional] |

### Return type

[**UpdateUserNotificationStatus200Response**](UpdateUserNotificationStatus200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="updateUserNotificationStatus"></a>
# **updateUserNotificationStatus**
> UpdateUserNotificationStatus200Response updateUserNotificationStatus(tenantId, notificationId, newStatus, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    String newStatus = "read"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationStatus200Response result = apiInstance.updateUserNotificationStatus(tenantId, notificationId, newStatus, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#updateUserNotificationStatus");
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
| **tenantId** | **String**|  | |
| **notificationId** | **String**|  | |
| **newStatus** | **String**|  | [enum: read, unread] |
| **sso** | **String**|  | [optional] |

### Return type

[**UpdateUserNotificationStatus200Response**](UpdateUserNotificationStatus200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="voteComment"></a>
# **voteComment**
> VoteComment200Response voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams, sessionId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    VoteBodyParams voteBodyParams = new VoteBodyParams(); // VoteBodyParams | 
    String sessionId = "sessionId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      VoteComment200Response result = apiInstance.voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams, sessionId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#voteComment");
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
| **tenantId** | **String**|  | |
| **commentId** | **String**|  | |
| **urlId** | **String**|  | |
| **broadcastId** | **String**|  | |
| **voteBodyParams** | [**VoteBodyParams**](VoteBodyParams.md)|  | |
| **sessionId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**VoteComment200Response**](VoteComment200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


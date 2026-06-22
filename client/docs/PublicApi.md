# PublicApi
FastComments API Client - A SDK for interacting with the FastComments API

All URIs are relative to *https://fastcomments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockFromCommentPublic**](PublicApi.md#blockFromCommentPublic) | **POST** /block-from-comment/{commentId} |  |
| [**checkedCommentsForBlocked**](PublicApi.md#checkedCommentsForBlocked) | **GET** /check-blocked-comments |  |
| [**createCommentPublic**](PublicApi.md#createCommentPublic) | **POST** /comments/{tenantId} |  |
| [**createFeedPostPublic**](PublicApi.md#createFeedPostPublic) | **POST** /feed-posts/{tenantId} |  |
| [**createV1PageReact**](PublicApi.md#createV1PageReact) | **POST** /page-reacts/v1/likes/{tenantId} |  |
| [**createV2PageReact**](PublicApi.md#createV2PageReact) | **POST** /page-reacts/v2/{tenantId} |  |
| [**deleteCommentPublic**](PublicApi.md#deleteCommentPublic) | **DELETE** /comments/{tenantId}/{commentId} |  |
| [**deleteCommentVote**](PublicApi.md#deleteCommentVote) | **DELETE** /comments/{tenantId}/{commentId}/vote/{voteId} |  |
| [**deleteFeedPostPublic**](PublicApi.md#deleteFeedPostPublic) | **DELETE** /feed-posts/{tenantId}/{postId} |  |
| [**deleteV1PageReact**](PublicApi.md#deleteV1PageReact) | **DELETE** /page-reacts/v1/likes/{tenantId} |  |
| [**deleteV2PageReact**](PublicApi.md#deleteV2PageReact) | **DELETE** /page-reacts/v2/{tenantId} |  |
| [**flagCommentPublic**](PublicApi.md#flagCommentPublic) | **POST** /flag-comment/{commentId} |  |
| [**getCommentText**](PublicApi.md#getCommentText) | **GET** /comments/{tenantId}/{commentId}/text |  |
| [**getCommentVoteUserNames**](PublicApi.md#getCommentVoteUserNames) | **GET** /comments/{tenantId}/{commentId}/votes |  |
| [**getCommentsForUser**](PublicApi.md#getCommentsForUser) | **GET** /comments-for-user |  |
| [**getCommentsPublic**](PublicApi.md#getCommentsPublic) | **GET** /comments/{tenantId} |  |
| [**getEventLog**](PublicApi.md#getEventLog) | **GET** /event-log/{tenantId} |  |
| [**getFeedPostsPublic**](PublicApi.md#getFeedPostsPublic) | **GET** /feed-posts/{tenantId} |  |
| [**getFeedPostsStats**](PublicApi.md#getFeedPostsStats) | **GET** /feed-posts/{tenantId}/stats |  |
| [**getGifLarge**](PublicApi.md#getGifLarge) | **GET** /gifs/get-large/{tenantId} |  |
| [**getGifsSearch**](PublicApi.md#getGifsSearch) | **GET** /gifs/search/{tenantId} |  |
| [**getGifsTrending**](PublicApi.md#getGifsTrending) | **GET** /gifs/trending/{tenantId} |  |
| [**getGlobalEventLog**](PublicApi.md#getGlobalEventLog) | **GET** /event-log/global/{tenantId} |  |
| [**getOfflineUsers**](PublicApi.md#getOfflineUsers) | **GET** /pages/{tenantId}/users/offline |  |
| [**getOnlineUsers**](PublicApi.md#getOnlineUsers) | **GET** /pages/{tenantId}/users/online |  |
| [**getPagesPublic**](PublicApi.md#getPagesPublic) | **GET** /pages/{tenantId} |  |
| [**getTranslations**](PublicApi.md#getTranslations) | **GET** /translations/{namespace}/{component} |  |
| [**getUserNotificationCount**](PublicApi.md#getUserNotificationCount) | **GET** /user-notifications/get-count |  |
| [**getUserNotifications**](PublicApi.md#getUserNotifications) | **GET** /user-notifications |  |
| [**getUserPresenceStatuses**](PublicApi.md#getUserPresenceStatuses) | **GET** /user-presence-status |  |
| [**getUserReactsPublic**](PublicApi.md#getUserReactsPublic) | **GET** /feed-posts/{tenantId}/user-reacts |  |
| [**getUsersInfo**](PublicApi.md#getUsersInfo) | **GET** /pages/{tenantId}/users/info |  |
| [**getV1PageLikes**](PublicApi.md#getV1PageLikes) | **GET** /page-reacts/v1/likes/{tenantId} |  |
| [**getV2PageReactUsers**](PublicApi.md#getV2PageReactUsers) | **GET** /page-reacts/v2/{tenantId}/list |  |
| [**getV2PageReacts**](PublicApi.md#getV2PageReacts) | **GET** /page-reacts/v2/{tenantId} |  |
| [**lockComment**](PublicApi.md#lockComment) | **POST** /comments/{tenantId}/{commentId}/lock |  |
| [**logoutPublic**](PublicApi.md#logoutPublic) | **PUT** /auth/logout |  |
| [**pinComment**](PublicApi.md#pinComment) | **POST** /comments/{tenantId}/{commentId}/pin |  |
| [**reactFeedPostPublic**](PublicApi.md#reactFeedPostPublic) | **POST** /feed-posts/{tenantId}/react/{postId} |  |
| [**resetUserNotificationCount**](PublicApi.md#resetUserNotificationCount) | **POST** /user-notifications/reset-count |  |
| [**resetUserNotifications**](PublicApi.md#resetUserNotifications) | **POST** /user-notifications/reset |  |
| [**searchUsers**](PublicApi.md#searchUsers) | **GET** /user-search/{tenantId} |  |
| [**setCommentText**](PublicApi.md#setCommentText) | **POST** /comments/{tenantId}/{commentId}/update-text |  |
| [**unBlockCommentPublic**](PublicApi.md#unBlockCommentPublic) | **DELETE** /block-from-comment/{commentId} |  |
| [**unLockComment**](PublicApi.md#unLockComment) | **POST** /comments/{tenantId}/{commentId}/unlock |  |
| [**unPinComment**](PublicApi.md#unPinComment) | **POST** /comments/{tenantId}/{commentId}/unpin |  |
| [**updateFeedPostPublic**](PublicApi.md#updateFeedPostPublic) | **PUT** /feed-posts/{tenantId}/{postId} |  |
| [**updateUserNotificationCommentSubscriptionStatus**](PublicApi.md#updateUserNotificationCommentSubscriptionStatus) | **POST** /user-notifications/{notificationId}/mark-opted/{optedInOrOut} |  |
| [**updateUserNotificationPageSubscriptionStatus**](PublicApi.md#updateUserNotificationPageSubscriptionStatus) | **POST** /user-notifications/set-subscription-state/{subscribedOrUnsubscribed} |  |
| [**updateUserNotificationStatus**](PublicApi.md#updateUserNotificationStatus) | **POST** /user-notifications/{notificationId}/mark/{newStatus} |  |
| [**uploadImage**](PublicApi.md#uploadImage) | **POST** /upload-image/{tenantId} |  |
| [**voteComment**](PublicApi.md#voteComment) | **POST** /comments/{tenantId}/{commentId}/vote |  |


<a id="blockFromCommentPublic"></a>
# **blockFromCommentPublic**
> BlockFromCommentPublicResponse blockFromCommentPublic(tenantId, commentId, publicBlockFromCommentParams).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    PublicBlockFromCommentParams publicBlockFromCommentParams = new PublicBlockFromCommentParams(); // PublicBlockFromCommentParams | 
    String sso = "sso_example"; // String | 
    try {
      BlockFromCommentPublicResponse result = apiInstance.blockFromCommentPublic(tenantId, commentId, publicBlockFromCommentParams)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#blockFromCommentPublic");
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
| **publicBlockFromCommentParams** | [**PublicBlockFromCommentParams**](PublicBlockFromCommentParams.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**BlockFromCommentPublicResponse**](BlockFromCommentPublicResponse.md)

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
> CheckedCommentsForBlockedResponse checkedCommentsForBlocked(tenantId, commentIds).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentIds = "commentIds_example"; // String | A comma separated list of comment ids.
    String sso = "sso_example"; // String | 
    try {
      CheckedCommentsForBlockedResponse result = apiInstance.checkedCommentsForBlocked(tenantId, commentIds)
            .sso(sso)
            .execute();
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

[**CheckedCommentsForBlockedResponse**](CheckedCommentsForBlockedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createCommentPublic"></a>
# **createCommentPublic**
> CreateCommentPublicResponse createCommentPublic(tenantId, urlId, broadcastId, commentData).sessionId(sessionId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    CommentData commentData = new CommentData(); // CommentData | 
    String sessionId = "sessionId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      CreateCommentPublicResponse result = apiInstance.createCommentPublic(tenantId, urlId, broadcastId, commentData)
            .sessionId(sessionId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#createCommentPublic");
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

[**CreateCommentPublicResponse**](CreateCommentPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createFeedPostPublic"></a>
# **createFeedPostPublic**
> CreateFeedPostPublicResponse createFeedPostPublic(tenantId, createFeedPostParams).broadcastId(broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    CreateFeedPostParams createFeedPostParams = new CreateFeedPostParams(); // CreateFeedPostParams | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      CreateFeedPostPublicResponse result = apiInstance.createFeedPostPublic(tenantId, createFeedPostParams)
            .broadcastId(broadcastId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#createFeedPostPublic");
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
| **createFeedPostParams** | [**CreateFeedPostParams**](CreateFeedPostParams.md)|  | |
| **broadcastId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**CreateFeedPostPublicResponse**](CreateFeedPostPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createV1PageReact"></a>
# **createV1PageReact**
> CreateV1PageReactResponse createV1PageReact(tenantId, urlId).title(title).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String title = "title_example"; // String | 
    try {
      CreateV1PageReactResponse result = apiInstance.createV1PageReact(tenantId, urlId)
            .title(title)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#createV1PageReact");
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
| **title** | **String**|  | [optional] |

### Return type

[**CreateV1PageReactResponse**](CreateV1PageReactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createV2PageReact"></a>
# **createV2PageReact**
> CreateV2PageReactResponse createV2PageReact(tenantId, urlId, id).title(title).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String id = "id_example"; // String | 
    String title = "title_example"; // String | 
    try {
      CreateV2PageReactResponse result = apiInstance.createV2PageReact(tenantId, urlId, id)
            .title(title)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#createV2PageReact");
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
| **id** | **String**|  | |
| **title** | **String**|  | [optional] |

### Return type

[**CreateV2PageReactResponse**](CreateV2PageReactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteCommentPublic"></a>
# **deleteCommentPublic**
> DeleteCommentPublicResponse deleteCommentPublic(tenantId, commentId, broadcastId).editKey(editKey).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      DeleteCommentPublicResponse result = apiInstance.deleteCommentPublic(tenantId, commentId, broadcastId)
            .editKey(editKey)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteCommentPublic");
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
| **sso** | **String**|  | [optional] |

### Return type

[**DeleteCommentPublicResponse**](DeleteCommentPublicResponse.md)

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
> DeleteCommentVoteResponse deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId).editKey(editKey).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String voteId = "voteId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      DeleteCommentVoteResponse result = apiInstance.deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId)
            .editKey(editKey)
            .sso(sso)
            .execute();
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

[**DeleteCommentVoteResponse**](DeleteCommentVoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteFeedPostPublic"></a>
# **deleteFeedPostPublic**
> DeleteFeedPostPublicResponse deleteFeedPostPublic(tenantId, postId).broadcastId(broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String postId = "postId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      DeleteFeedPostPublicResponse result = apiInstance.deleteFeedPostPublic(tenantId, postId)
            .broadcastId(broadcastId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteFeedPostPublic");
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
| **postId** | **String**|  | |
| **broadcastId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**DeleteFeedPostPublicResponse**](DeleteFeedPostPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteV1PageReact"></a>
# **deleteV1PageReact**
> DeleteV1PageReactResponse deleteV1PageReact(tenantId, urlId).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    try {
      DeleteV1PageReactResponse result = apiInstance.deleteV1PageReact(tenantId, urlId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteV1PageReact");
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

### Return type

[**DeleteV1PageReactResponse**](DeleteV1PageReactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="deleteV2PageReact"></a>
# **deleteV2PageReact**
> DeleteV2PageReactResponse deleteV2PageReact(tenantId, urlId, id).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String id = "id_example"; // String | 
    try {
      DeleteV2PageReactResponse result = apiInstance.deleteV2PageReact(tenantId, urlId, id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#deleteV2PageReact");
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
| **id** | **String**|  | |

### Return type

[**DeleteV2PageReactResponse**](DeleteV2PageReactResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="flagCommentPublic"></a>
# **flagCommentPublic**
> FlagCommentPublicResponse flagCommentPublic(tenantId, commentId, isFlagged).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    Boolean isFlagged = true; // Boolean | 
    String sso = "sso_example"; // String | 
    try {
      FlagCommentPublicResponse result = apiInstance.flagCommentPublic(tenantId, commentId, isFlagged)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#flagCommentPublic");
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
| **isFlagged** | **Boolean**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**FlagCommentPublicResponse**](FlagCommentPublicResponse.md)

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
> GetCommentTextResponse1 getCommentText(tenantId, commentId).editKey(editKey).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetCommentTextResponse1 result = apiInstance.getCommentText(tenantId, commentId)
            .editKey(editKey)
            .sso(sso)
            .execute();
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

[**GetCommentTextResponse1**](GetCommentTextResponse1.md)

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
> GetCommentVoteUserNamesResponse getCommentVoteUserNames(tenantId, commentId, dir).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    Integer dir = 56; // Integer | 
    String sso = "sso_example"; // String | 
    try {
      GetCommentVoteUserNamesResponse result = apiInstance.getCommentVoteUserNames(tenantId, commentId, dir)
            .sso(sso)
            .execute();
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
| **dir** | **Integer**|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**GetCommentVoteUserNamesResponse**](GetCommentVoteUserNamesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentsForUser"></a>
# **getCommentsForUser**
> GetCommentsForUserResponse1 getCommentsForUser().userId(userId).direction(direction).repliesToUserId(repliesToUserId).page(page).includei10n(includei10n).locale(locale).isCrawler(isCrawler).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String userId = "userId_example"; // String | 
    SortDirections direction = SortDirections.fromValue("OF"); // SortDirections | 
    String repliesToUserId = "repliesToUserId_example"; // String | 
    Double page = 3.4D; // Double | 
    Boolean includei10n = true; // Boolean | 
    String locale = "locale_example"; // String | 
    Boolean isCrawler = true; // Boolean | 
    try {
      GetCommentsForUserResponse1 result = apiInstance.getCommentsForUser()
            .userId(userId)
            .direction(direction)
            .repliesToUserId(repliesToUserId)
            .page(page)
            .includei10n(includei10n)
            .locale(locale)
            .isCrawler(isCrawler)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getCommentsForUser");
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
| **direction** | [**SortDirections**](.md)|  | [optional] [enum: OF, NF, MR] |
| **repliesToUserId** | **String**|  | [optional] |
| **page** | **Double**|  | [optional] |
| **includei10n** | **Boolean**|  | [optional] |
| **locale** | **String**|  | [optional] |
| **isCrawler** | **Boolean**|  | [optional] |

### Return type

[**GetCommentsForUserResponse1**](GetCommentsForUserResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getCommentsPublic"></a>
# **getCommentsPublic**
> GetCommentsPublicResponse getCommentsPublic(tenantId, urlId).page(page).direction(direction).sso(sso).skip(skip).skipChildren(skipChildren).limit(limit).limitChildren(limitChildren).countChildren(countChildren).fetchPageForCommentId(fetchPageForCommentId).includeConfig(includeConfig).countAll(countAll).includei10n(includei10n).locale(locale).modules(modules).isCrawler(isCrawler).includeNotificationCount(includeNotificationCount).asTree(asTree).maxTreeDepth(maxTreeDepth).useFullTranslationIds(useFullTranslationIds).parentId(parentId).searchText(searchText).hashTags(hashTags).userId(userId).customConfigStr(customConfigStr).afterCommentId(afterCommentId).beforeCommentId(beforeCommentId).execute();



 req tenantId urlId

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    Integer page = 56; // Integer | 
    SortDirections direction = SortDirections.fromValue("OF"); // SortDirections | 
    String sso = "sso_example"; // String | 
    Integer skip = 56; // Integer | 
    Integer skipChildren = 56; // Integer | 
    Integer limit = 56; // Integer | 
    Integer limitChildren = 56; // Integer | 
    Boolean countChildren = true; // Boolean | 
    String fetchPageForCommentId = "fetchPageForCommentId_example"; // String | 
    Boolean includeConfig = true; // Boolean | 
    Boolean countAll = true; // Boolean | 
    Boolean includei10n = true; // Boolean | 
    String locale = "locale_example"; // String | 
    String modules = "modules_example"; // String | 
    Boolean isCrawler = true; // Boolean | 
    Boolean includeNotificationCount = true; // Boolean | 
    Boolean asTree = true; // Boolean | 
    Integer maxTreeDepth = 56; // Integer | 
    Boolean useFullTranslationIds = true; // Boolean | 
    String parentId = "parentId_example"; // String | 
    String searchText = "searchText_example"; // String | 
    List<String> hashTags = Arrays.asList(); // List<String> | 
    String userId = "userId_example"; // String | 
    String customConfigStr = "customConfigStr_example"; // String | 
    String afterCommentId = "afterCommentId_example"; // String | 
    String beforeCommentId = "beforeCommentId_example"; // String | 
    try {
      GetCommentsPublicResponse result = apiInstance.getCommentsPublic(tenantId, urlId)
            .page(page)
            .direction(direction)
            .sso(sso)
            .skip(skip)
            .skipChildren(skipChildren)
            .limit(limit)
            .limitChildren(limitChildren)
            .countChildren(countChildren)
            .fetchPageForCommentId(fetchPageForCommentId)
            .includeConfig(includeConfig)
            .countAll(countAll)
            .includei10n(includei10n)
            .locale(locale)
            .modules(modules)
            .isCrawler(isCrawler)
            .includeNotificationCount(includeNotificationCount)
            .asTree(asTree)
            .maxTreeDepth(maxTreeDepth)
            .useFullTranslationIds(useFullTranslationIds)
            .parentId(parentId)
            .searchText(searchText)
            .hashTags(hashTags)
            .userId(userId)
            .customConfigStr(customConfigStr)
            .afterCommentId(afterCommentId)
            .beforeCommentId(beforeCommentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getCommentsPublic");
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
| **page** | **Integer**|  | [optional] |
| **direction** | [**SortDirections**](.md)|  | [optional] [enum: OF, NF, MR] |
| **sso** | **String**|  | [optional] |
| **skip** | **Integer**|  | [optional] |
| **skipChildren** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **limitChildren** | **Integer**|  | [optional] |
| **countChildren** | **Boolean**|  | [optional] |
| **fetchPageForCommentId** | **String**|  | [optional] |
| **includeConfig** | **Boolean**|  | [optional] |
| **countAll** | **Boolean**|  | [optional] |
| **includei10n** | **Boolean**|  | [optional] |
| **locale** | **String**|  | [optional] |
| **modules** | **String**|  | [optional] |
| **isCrawler** | **Boolean**|  | [optional] |
| **includeNotificationCount** | **Boolean**|  | [optional] |
| **asTree** | **Boolean**|  | [optional] |
| **maxTreeDepth** | **Integer**|  | [optional] |
| **useFullTranslationIds** | **Boolean**|  | [optional] |
| **parentId** | **String**|  | [optional] |
| **searchText** | **String**|  | [optional] |
| **hashTags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userId** | **String**|  | [optional] |
| **customConfigStr** | **String**|  | [optional] |
| **afterCommentId** | **String**|  | [optional] |
| **beforeCommentId** | **String**|  | [optional] |

### Return type

[**GetCommentsPublicResponse**](GetCommentsPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getEventLog"></a>
# **getEventLog**
> GetEventLogResponse1 getEventLog(tenantId, urlId, userIdWS, startTime).endTime(endTime).execute();



 req tenantId urlId userIdWS

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String userIdWS = "userIdWS_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      GetEventLogResponse1 result = apiInstance.getEventLog(tenantId, urlId, userIdWS, startTime)
            .endTime(endTime)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getEventLog");
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
| **userIdWS** | **String**|  | |
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | [optional] |

### Return type

[**GetEventLogResponse1**](GetEventLogResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getFeedPostsPublic"></a>
# **getFeedPostsPublic**
> GetFeedPostsPublicResponse getFeedPostsPublic(tenantId).afterId(afterId).limit(limit).tags(tags).sso(sso).isCrawler(isCrawler).includeUserInfo(includeUserInfo).execute();



 req tenantId afterId

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String afterId = "afterId_example"; // String | 
    Integer limit = 56; // Integer | 
    List<String> tags = Arrays.asList(); // List<String> | 
    String sso = "sso_example"; // String | 
    Boolean isCrawler = true; // Boolean | 
    Boolean includeUserInfo = true; // Boolean | 
    try {
      GetFeedPostsPublicResponse result = apiInstance.getFeedPostsPublic(tenantId)
            .afterId(afterId)
            .limit(limit)
            .tags(tags)
            .sso(sso)
            .isCrawler(isCrawler)
            .includeUserInfo(includeUserInfo)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFeedPostsPublic");
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
| **limit** | **Integer**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sso** | **String**|  | [optional] |
| **isCrawler** | **Boolean**|  | [optional] |
| **includeUserInfo** | **Boolean**|  | [optional] |

### Return type

[**GetFeedPostsPublicResponse**](GetFeedPostsPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getFeedPostsStats"></a>
# **getFeedPostsStats**
> GetFeedPostsStatsResponse getFeedPostsStats(tenantId, postIds).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    List<String> postIds = Arrays.asList(); // List<String> | 
    String sso = "sso_example"; // String | 
    try {
      GetFeedPostsStatsResponse result = apiInstance.getFeedPostsStats(tenantId, postIds)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFeedPostsStats");
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
| **postIds** | [**List&lt;String&gt;**](String.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**GetFeedPostsStatsResponse**](GetFeedPostsStatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getGifLarge"></a>
# **getGifLarge**
> GetGifLargeResponse getGifLarge(tenantId, largeInternalURLSanitized).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String largeInternalURLSanitized = "largeInternalURLSanitized_example"; // String | 
    try {
      GetGifLargeResponse result = apiInstance.getGifLarge(tenantId, largeInternalURLSanitized)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGifLarge");
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
| **largeInternalURLSanitized** | **String**|  | |

### Return type

[**GetGifLargeResponse**](GetGifLargeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** | Validation Failed |  -  |

<a id="getGifsSearch"></a>
# **getGifsSearch**
> GetGifsSearchResponse getGifsSearch(tenantId, search).locale(locale).rating(rating).page(page).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String search = "search_example"; // String | 
    String locale = "locale_example"; // String | 
    String rating = "rating_example"; // String | 
    Double page = 3.4D; // Double | 
    try {
      GetGifsSearchResponse result = apiInstance.getGifsSearch(tenantId, search)
            .locale(locale)
            .rating(rating)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGifsSearch");
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
| **search** | **String**|  | |
| **locale** | **String**|  | [optional] |
| **rating** | **String**|  | [optional] |
| **page** | **Double**|  | [optional] |

### Return type

[**GetGifsSearchResponse**](GetGifsSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** | Validation Failed |  -  |

<a id="getGifsTrending"></a>
# **getGifsTrending**
> GetGifsTrendingResponse getGifsTrending(tenantId).locale(locale).rating(rating).page(page).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String locale = "locale_example"; // String | 
    String rating = "rating_example"; // String | 
    Double page = 3.4D; // Double | 
    try {
      GetGifsTrendingResponse result = apiInstance.getGifsTrending(tenantId)
            .locale(locale)
            .rating(rating)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGifsTrending");
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
| **locale** | **String**|  | [optional] |
| **rating** | **String**|  | [optional] |
| **page** | **Double**|  | [optional] |

### Return type

[**GetGifsTrendingResponse**](GetGifsTrendingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getGlobalEventLog"></a>
# **getGlobalEventLog**
> GetGlobalEventLogResponse getGlobalEventLog(tenantId, urlId, userIdWS, startTime).endTime(endTime).execute();



 req tenantId urlId userIdWS

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String userIdWS = "userIdWS_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    try {
      GetGlobalEventLogResponse result = apiInstance.getGlobalEventLog(tenantId, urlId, userIdWS, startTime)
            .endTime(endTime)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGlobalEventLog");
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
| **userIdWS** | **String**|  | |
| **startTime** | **Long**|  | |
| **endTime** | **Long**|  | [optional] |

### Return type

[**GetGlobalEventLogResponse**](GetGlobalEventLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getOfflineUsers"></a>
# **getOfflineUsers**
> GetOfflineUsersResponse getOfflineUsers(tenantId, urlId).afterName(afterName).afterUserId(afterUserId).execute();



Past commenters on the page who are NOT currently online. Sorted by displayName. Use this after exhausting /users/online to render a \&quot;Members\&quot; section. Cursor pagination on commenterName: server walks the partial {tenantId, urlId, commenterName} index from afterName forward via $gt, no $skip cost.

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | Page URL identifier (cleaned server-side).
    String afterName = "afterName_example"; // String | Cursor: pass nextAfterName from the previous response.
    String afterUserId = "afterUserId_example"; // String | Cursor tiebreaker: pass nextAfterUserId from the previous response. Required when afterName is set so name-ties don't drop entries.
    try {
      GetOfflineUsersResponse result = apiInstance.getOfflineUsers(tenantId, urlId)
            .afterName(afterName)
            .afterUserId(afterUserId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getOfflineUsers");
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
| **urlId** | **String**| Page URL identifier (cleaned server-side). | |
| **afterName** | **String**| Cursor: pass nextAfterName from the previous response. | [optional] |
| **afterUserId** | **String**| Cursor tiebreaker: pass nextAfterUserId from the previous response. Required when afterName is set so name-ties don&#39;t drop entries. | [optional] |

### Return type

[**GetOfflineUsersResponse**](GetOfflineUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Failed |  -  |

<a id="getOnlineUsers"></a>
# **getOnlineUsers**
> GetOnlineUsersResponse getOnlineUsers(tenantId, urlId).afterName(afterName).afterUserId(afterUserId).execute();



Currently-online viewers of a page: people whose websocket session is subscribed to the page right now. Returns anonCount + totalCount (room-wide subscribers, including anon viewers we don&#39;t enumerate).

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | Page URL identifier (cleaned server-side).
    String afterName = "afterName_example"; // String | Cursor: pass nextAfterName from the previous response.
    String afterUserId = "afterUserId_example"; // String | Cursor tiebreaker: pass nextAfterUserId from the previous response. Required when afterName is set so name-ties don't drop entries.
    try {
      GetOnlineUsersResponse result = apiInstance.getOnlineUsers(tenantId, urlId)
            .afterName(afterName)
            .afterUserId(afterUserId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getOnlineUsers");
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
| **urlId** | **String**| Page URL identifier (cleaned server-side). | |
| **afterName** | **String**| Cursor: pass nextAfterName from the previous response. | [optional] |
| **afterUserId** | **String**| Cursor tiebreaker: pass nextAfterUserId from the previous response. Required when afterName is set so name-ties don&#39;t drop entries. | [optional] |

### Return type

[**GetOnlineUsersResponse**](GetOnlineUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Failed |  -  |

<a id="getPagesPublic"></a>
# **getPagesPublic**
> GetPagesPublicResponse getPagesPublic(tenantId).cursor(cursor).limit(limit).q(q).sortBy(sortBy).hasComments(hasComments).execute();



List pages for a tenant. Used by the FChat desktop client to populate its room list. Requires &#x60;enableFChat&#x60; to be true on the resolved custom config for each page. Pages that require SSO are filtered against the requesting user&#39;s group access.

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String cursor = "cursor_example"; // String | Opaque pagination cursor returned as `nextCursor` from a prior request. Tied to the same `sortBy`.
    Integer limit = 56; // Integer | 1..200, default 50
    String q = "q_example"; // String | Optional case-insensitive title prefix filter.
    PagesSortBy sortBy = PagesSortBy.fromValue("updatedAt"); // PagesSortBy | Sort order. `updatedAt` (default, newest first), `commentCount` (most comments first), or `title` (alphabetical).
    Boolean hasComments = true; // Boolean | If true, only return pages with at least one comment.
    try {
      GetPagesPublicResponse result = apiInstance.getPagesPublic(tenantId)
            .cursor(cursor)
            .limit(limit)
            .q(q)
            .sortBy(sortBy)
            .hasComments(hasComments)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPagesPublic");
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
| **cursor** | **String**| Opaque pagination cursor returned as &#x60;nextCursor&#x60; from a prior request. Tied to the same &#x60;sortBy&#x60;. | [optional] |
| **limit** | **Integer**| 1..200, default 50 | [optional] |
| **q** | **String**| Optional case-insensitive title prefix filter. | [optional] |
| **sortBy** | [**PagesSortBy**](.md)| Sort order. &#x60;updatedAt&#x60; (default, newest first), &#x60;commentCount&#x60; (most comments first), or &#x60;title&#x60; (alphabetical). | [optional] [enum: updatedAt, commentCount, title] |
| **hasComments** | **Boolean**| If true, only return pages with at least one comment. | [optional] |

### Return type

[**GetPagesPublicResponse**](GetPagesPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getTranslations"></a>
# **getTranslations**
> GetTranslationsResponse1 getTranslations(namespace, component).locale(locale).useFullTranslationIds(useFullTranslationIds).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String namespace = "namespace_example"; // String | 
    String component = "component_example"; // String | 
    String locale = "locale_example"; // String | 
    Boolean useFullTranslationIds = true; // Boolean | 
    try {
      GetTranslationsResponse1 result = apiInstance.getTranslations(namespace, component)
            .locale(locale)
            .useFullTranslationIds(useFullTranslationIds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getTranslations");
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
| **namespace** | **String**|  | |
| **component** | **String**|  | |
| **locale** | **String**|  | [optional] |
| **useFullTranslationIds** | **Boolean**|  | [optional] |

### Return type

[**GetTranslationsResponse1**](GetTranslationsResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** | Validation Failed |  -  |
| **500** | Internal |  -  |

<a id="getUserNotificationCount"></a>
# **getUserNotificationCount**
> GetUserNotificationCountResponse1 getUserNotificationCount(tenantId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      GetUserNotificationCountResponse1 result = apiInstance.getUserNotificationCount(tenantId)
            .sso(sso)
            .execute();
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

[**GetUserNotificationCountResponse1**](GetUserNotificationCountResponse1.md)

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
> GetUserNotificationsResponse getUserNotifications(tenantId).urlId(urlId).pageSize(pageSize).afterId(afterId).includeContext(includeContext).afterCreatedAt(afterCreatedAt).unreadOnly(unreadOnly).dmOnly(dmOnly).noDm(noDm).includeTranslations(includeTranslations).includeTenantNotifications(includeTenantNotifications).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | Used to determine whether the current page is subscribed.
    Integer pageSize = 56; // Integer | 
    String afterId = "afterId_example"; // String | 
    Boolean includeContext = true; // Boolean | 
    Long afterCreatedAt = 56L; // Long | 
    Boolean unreadOnly = true; // Boolean | 
    Boolean dmOnly = true; // Boolean | 
    Boolean noDm = true; // Boolean | 
    Boolean includeTranslations = true; // Boolean | 
    Boolean includeTenantNotifications = true; // Boolean | 
    String sso = "sso_example"; // String | 
    try {
      GetUserNotificationsResponse result = apiInstance.getUserNotifications(tenantId)
            .urlId(urlId)
            .pageSize(pageSize)
            .afterId(afterId)
            .includeContext(includeContext)
            .afterCreatedAt(afterCreatedAt)
            .unreadOnly(unreadOnly)
            .dmOnly(dmOnly)
            .noDm(noDm)
            .includeTranslations(includeTranslations)
            .includeTenantNotifications(includeTenantNotifications)
            .sso(sso)
            .execute();
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
| **urlId** | **String**| Used to determine whether the current page is subscribed. | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **afterId** | **String**|  | [optional] |
| **includeContext** | **Boolean**|  | [optional] |
| **afterCreatedAt** | **Long**|  | [optional] |
| **unreadOnly** | **Boolean**|  | [optional] |
| **dmOnly** | **Boolean**|  | [optional] |
| **noDm** | **Boolean**|  | [optional] |
| **includeTranslations** | **Boolean**|  | [optional] |
| **includeTenantNotifications** | **Boolean**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserNotificationsResponse**](GetUserNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUserPresenceStatuses"></a>
# **getUserPresenceStatuses**
> GetUserPresenceStatusesResponse1 getUserPresenceStatuses(tenantId, urlIdWS, userIds).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlIdWS = "urlIdWS_example"; // String | 
    String userIds = "userIds_example"; // String | 
    try {
      GetUserPresenceStatusesResponse1 result = apiInstance.getUserPresenceStatuses(tenantId, urlIdWS, userIds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserPresenceStatuses");
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
| **urlIdWS** | **String**|  | |
| **userIds** | **String**|  | |

### Return type

[**GetUserPresenceStatusesResponse1**](GetUserPresenceStatusesResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** | Validation Failed |  -  |

<a id="getUserReactsPublic"></a>
# **getUserReactsPublic**
> GetUserReactsPublicResponse getUserReactsPublic(tenantId).postIds(postIds).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    List<String> postIds = Arrays.asList(); // List<String> | 
    String sso = "sso_example"; // String | 
    try {
      GetUserReactsPublicResponse result = apiInstance.getUserReactsPublic(tenantId)
            .postIds(postIds)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserReactsPublic");
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
| **postIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**GetUserReactsPublicResponse**](GetUserReactsPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getUsersInfo"></a>
# **getUsersInfo**
> GetUsersInfoResponse getUsersInfo(tenantId, ids).execute();



Bulk user info for a tenant. Given userIds, return display info from User / SSOUser. Used by the comment widget to enrich users that just appeared via a presence event. No page context: privacy is enforced uniformly (private profiles are masked).

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String ids = "ids_example"; // String | Comma-delimited userIds.
    try {
      GetUsersInfoResponse result = apiInstance.getUsersInfo(tenantId, ids)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUsersInfo");
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
| **ids** | **String**| Comma-delimited userIds. | |

### Return type

[**GetUsersInfoResponse**](GetUsersInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **422** | Validation Failed |  -  |

<a id="getV1PageLikes"></a>
# **getV1PageLikes**
> GetV1PageLikesResponse getV1PageLikes(tenantId, urlId).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    try {
      GetV1PageLikesResponse result = apiInstance.getV1PageLikes(tenantId, urlId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getV1PageLikes");
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

### Return type

[**GetV1PageLikesResponse**](GetV1PageLikesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getV2PageReactUsers"></a>
# **getV2PageReactUsers**
> GetV2PageReactUsersResponse1 getV2PageReactUsers(tenantId, urlId, id).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String id = "id_example"; // String | 
    try {
      GetV2PageReactUsersResponse1 result = apiInstance.getV2PageReactUsers(tenantId, urlId, id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getV2PageReactUsers");
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
| **id** | **String**|  | |

### Return type

[**GetV2PageReactUsersResponse1**](GetV2PageReactUsersResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getV2PageReacts"></a>
# **getV2PageReacts**
> GetV2PageReactsResponse getV2PageReacts(tenantId, urlId).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    try {
      GetV2PageReactsResponse result = apiInstance.getV2PageReacts(tenantId, urlId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getV2PageReacts");
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

### Return type

[**GetV2PageReactsResponse**](GetV2PageReactsResponse.md)

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
> LockCommentResponse lockComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      LockCommentResponse result = apiInstance.lockComment(tenantId, commentId, broadcastId)
            .sso(sso)
            .execute();
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

[**LockCommentResponse**](LockCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="logoutPublic"></a>
# **logoutPublic**
> APIEmptyResponse logoutPublic().execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    try {
      APIEmptyResponse result = apiInstance.logoutPublic()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#logoutPublic");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="pinComment"></a>
# **pinComment**
> PinCommentResponse pinComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      PinCommentResponse result = apiInstance.pinComment(tenantId, commentId, broadcastId)
            .sso(sso)
            .execute();
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

[**PinCommentResponse**](PinCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="reactFeedPostPublic"></a>
# **reactFeedPostPublic**
> ReactFeedPostPublicResponse reactFeedPostPublic(tenantId, postId, reactBodyParams).isUndo(isUndo).broadcastId(broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String postId = "postId_example"; // String | 
    ReactBodyParams reactBodyParams = new ReactBodyParams(); // ReactBodyParams | 
    Boolean isUndo = true; // Boolean | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      ReactFeedPostPublicResponse result = apiInstance.reactFeedPostPublic(tenantId, postId, reactBodyParams)
            .isUndo(isUndo)
            .broadcastId(broadcastId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#reactFeedPostPublic");
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
| **postId** | **String**|  | |
| **reactBodyParams** | [**ReactBodyParams**](ReactBodyParams.md)|  | |
| **isUndo** | **Boolean**|  | [optional] |
| **broadcastId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**ReactFeedPostPublicResponse**](ReactFeedPostPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="resetUserNotificationCount"></a>
# **resetUserNotificationCount**
> ResetUserNotificationCountResponse resetUserNotificationCount(tenantId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      ResetUserNotificationCountResponse result = apiInstance.resetUserNotificationCount(tenantId)
            .sso(sso)
            .execute();
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

[**ResetUserNotificationCountResponse**](ResetUserNotificationCountResponse.md)

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
> ResetUserNotificationsResponse1 resetUserNotifications(tenantId).afterId(afterId).afterCreatedAt(afterCreatedAt).unreadOnly(unreadOnly).dmOnly(dmOnly).noDm(noDm).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String afterId = "afterId_example"; // String | 
    Long afterCreatedAt = 56L; // Long | 
    Boolean unreadOnly = true; // Boolean | 
    Boolean dmOnly = true; // Boolean | 
    Boolean noDm = true; // Boolean | 
    String sso = "sso_example"; // String | 
    try {
      ResetUserNotificationsResponse1 result = apiInstance.resetUserNotifications(tenantId)
            .afterId(afterId)
            .afterCreatedAt(afterCreatedAt)
            .unreadOnly(unreadOnly)
            .dmOnly(dmOnly)
            .noDm(noDm)
            .sso(sso)
            .execute();
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
| **afterCreatedAt** | **Long**|  | [optional] |
| **unreadOnly** | **Boolean**|  | [optional] |
| **dmOnly** | **Boolean**|  | [optional] |
| **noDm** | **Boolean**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**ResetUserNotificationsResponse1**](ResetUserNotificationsResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="searchUsers"></a>
# **searchUsers**
> SearchUsersResponse1 searchUsers(tenantId, urlId).usernameStartsWith(usernameStartsWith).mentionGroupIds(mentionGroupIds).sso(sso).searchSection(searchSection).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String usernameStartsWith = "usernameStartsWith_example"; // String | 
    List<String> mentionGroupIds = Arrays.asList(); // List<String> | 
    String sso = "sso_example"; // String | 
    String searchSection = "fast"; // String | 
    try {
      SearchUsersResponse1 result = apiInstance.searchUsers(tenantId, urlId)
            .usernameStartsWith(usernameStartsWith)
            .mentionGroupIds(mentionGroupIds)
            .sso(sso)
            .searchSection(searchSection)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#searchUsers");
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
| **usernameStartsWith** | **String**|  | [optional] |
| **mentionGroupIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sso** | **String**|  | [optional] |
| **searchSection** | **String**|  | [optional] [enum: fast, site] |

### Return type

[**SearchUsersResponse1**](SearchUsersResponse1.md)

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
> SetCommentTextResponse1 setCommentText(tenantId, commentId, broadcastId, commentTextUpdateRequest).editKey(editKey).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    CommentTextUpdateRequest commentTextUpdateRequest = new CommentTextUpdateRequest(); // CommentTextUpdateRequest | 
    String editKey = "editKey_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      SetCommentTextResponse1 result = apiInstance.setCommentText(tenantId, commentId, broadcastId, commentTextUpdateRequest)
            .editKey(editKey)
            .sso(sso)
            .execute();
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
| **commentTextUpdateRequest** | [**CommentTextUpdateRequest**](CommentTextUpdateRequest.md)|  | |
| **editKey** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**SetCommentTextResponse1**](SetCommentTextResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="unBlockCommentPublic"></a>
# **unBlockCommentPublic**
> UnBlockCommentPublicResponse unBlockCommentPublic(tenantId, commentId, publicBlockFromCommentParams).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    PublicBlockFromCommentParams publicBlockFromCommentParams = new PublicBlockFromCommentParams(); // PublicBlockFromCommentParams | 
    String sso = "sso_example"; // String | 
    try {
      UnBlockCommentPublicResponse result = apiInstance.unBlockCommentPublic(tenantId, commentId, publicBlockFromCommentParams)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#unBlockCommentPublic");
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
| **publicBlockFromCommentParams** | [**PublicBlockFromCommentParams**](PublicBlockFromCommentParams.md)|  | |
| **sso** | **String**|  | [optional] |

### Return type

[**UnBlockCommentPublicResponse**](UnBlockCommentPublicResponse.md)

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
> UnLockCommentResponse unLockComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UnLockCommentResponse result = apiInstance.unLockComment(tenantId, commentId, broadcastId)
            .sso(sso)
            .execute();
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

[**UnLockCommentResponse**](UnLockCommentResponse.md)

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
> UnPinCommentResponse unPinComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UnPinCommentResponse result = apiInstance.unPinComment(tenantId, commentId, broadcastId)
            .sso(sso)
            .execute();
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

[**UnPinCommentResponse**](UnPinCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="updateFeedPostPublic"></a>
# **updateFeedPostPublic**
> UpdateFeedPostPublicResponse updateFeedPostPublic(tenantId, postId, updateFeedPostParams).broadcastId(broadcastId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String postId = "postId_example"; // String | 
    UpdateFeedPostParams updateFeedPostParams = new UpdateFeedPostParams(); // UpdateFeedPostParams | 
    String broadcastId = "broadcastId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateFeedPostPublicResponse result = apiInstance.updateFeedPostPublic(tenantId, postId, updateFeedPostParams)
            .broadcastId(broadcastId)
            .sso(sso)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#updateFeedPostPublic");
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
| **postId** | **String**|  | |
| **updateFeedPostParams** | [**UpdateFeedPostParams**](UpdateFeedPostParams.md)|  | |
| **broadcastId** | **String**|  | [optional] |
| **sso** | **String**|  | [optional] |

### Return type

[**UpdateFeedPostPublicResponse**](UpdateFeedPostPublicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="updateUserNotificationCommentSubscriptionStatus"></a>
# **updateUserNotificationCommentSubscriptionStatus**
> UpdateUserNotificationCommentSubscriptionStatusResponse updateUserNotificationCommentSubscriptionStatus(tenantId, notificationId, optedInOrOut, commentId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    String optedInOrOut = "in"; // String | 
    String commentId = "commentId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationCommentSubscriptionStatusResponse result = apiInstance.updateUserNotificationCommentSubscriptionStatus(tenantId, notificationId, optedInOrOut, commentId)
            .sso(sso)
            .execute();
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

[**UpdateUserNotificationCommentSubscriptionStatusResponse**](UpdateUserNotificationCommentSubscriptionStatusResponse.md)

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
> UpdateUserNotificationPageSubscriptionStatusResponse updateUserNotificationPageSubscriptionStatus(tenantId, urlId, url, pageTitle, subscribedOrUnsubscribed).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String url = "url_example"; // String | 
    String pageTitle = "pageTitle_example"; // String | 
    String subscribedOrUnsubscribed = "subscribe"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationPageSubscriptionStatusResponse result = apiInstance.updateUserNotificationPageSubscriptionStatus(tenantId, urlId, url, pageTitle, subscribedOrUnsubscribed)
            .sso(sso)
            .execute();
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

[**UpdateUserNotificationPageSubscriptionStatusResponse**](UpdateUserNotificationPageSubscriptionStatusResponse.md)

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
> UpdateUserNotificationStatusResponse updateUserNotificationStatus(tenantId, notificationId, newStatus).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    String newStatus = "read"; // String | 
    String sso = "sso_example"; // String | 
    try {
      UpdateUserNotificationStatusResponse result = apiInstance.updateUserNotificationStatus(tenantId, notificationId, newStatus)
            .sso(sso)
            .execute();
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

[**UpdateUserNotificationStatusResponse**](UpdateUserNotificationStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="uploadImage"></a>
# **uploadImage**
> UploadImageResponse uploadImage(tenantId, _file).sizePreset(sizePreset).urlId(urlId).execute();



Upload and resize an image

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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    SizePreset sizePreset = SizePreset.fromValue("Default"); // SizePreset | Size preset: \"Default\" (1000x1000px) or \"CrossPlatform\" (creates sizes for popular devices)
    String urlId = "urlId_example"; // String | Page id that upload is happening from, to configure
    try {
      UploadImageResponse result = apiInstance.uploadImage(tenantId, _file)
            .sizePreset(sizePreset)
            .urlId(urlId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#uploadImage");
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
| **_file** | **File**|  | |
| **sizePreset** | [**SizePreset**](.md)| Size preset: \&quot;Default\&quot; (1000x1000px) or \&quot;CrossPlatform\&quot; (creates sizes for popular devices) | [optional] [enum: Default, CrossPlatform] |
| **urlId** | **String**| Page id that upload is happening from, to configure | [optional] |

### Return type

[**UploadImageResponse**](UploadImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="voteComment"></a>
# **voteComment**
> VoteCommentResponse voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams).sessionId(sessionId).sso(sso).execute();



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
    defaultClient.setBasePath("https://fastcomments.com");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String commentId = "commentId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    VoteBodyParams voteBodyParams = new VoteBodyParams(); // VoteBodyParams | 
    String sessionId = "sessionId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      VoteCommentResponse result = apiInstance.voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams)
            .sessionId(sessionId)
            .sso(sso)
            .execute();
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

[**VoteCommentResponse**](VoteCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


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
> BlockSuccess blockFromCommentPublic(tenantId, commentId, publicBlockFromCommentParams).sso(sso).execute();



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
      BlockSuccess result = apiInstance.blockFromCommentPublic(tenantId, commentId, publicBlockFromCommentParams)
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

[**BlockSuccess**](BlockSuccess.md)

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

<a id="checkedCommentsForBlocked"></a>
# **checkedCommentsForBlocked**
> CheckBlockedCommentsResponse checkedCommentsForBlocked(tenantId, commentIds).sso(sso).execute();



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
      CheckBlockedCommentsResponse result = apiInstance.checkedCommentsForBlocked(tenantId, commentIds)
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

[**CheckBlockedCommentsResponse**](CheckBlockedCommentsResponse.md)

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

<a id="createCommentPublic"></a>
# **createCommentPublic**
> SaveCommentsResponseWithPresence createCommentPublic(tenantId, urlId, broadcastId, commentData).sessionId(sessionId).sso(sso).execute();



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
      SaveCommentsResponseWithPresence result = apiInstance.createCommentPublic(tenantId, urlId, broadcastId, commentData)
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

[**SaveCommentsResponseWithPresence**](SaveCommentsResponseWithPresence.md)

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

<a id="createFeedPostPublic"></a>
# **createFeedPostPublic**
> CreateFeedPostResponse createFeedPostPublic(tenantId, createFeedPostParams).broadcastId(broadcastId).sso(sso).execute();



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
      CreateFeedPostResponse result = apiInstance.createFeedPostPublic(tenantId, createFeedPostParams)
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

[**CreateFeedPostResponse**](CreateFeedPostResponse.md)

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

<a id="createV1PageReact"></a>
# **createV1PageReact**
> CreateV1PageReact createV1PageReact(tenantId, urlId).title(title).execute();



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
      CreateV1PageReact result = apiInstance.createV1PageReact(tenantId, urlId)
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

[**CreateV1PageReact**](CreateV1PageReact.md)

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

<a id="createV2PageReact"></a>
# **createV2PageReact**
> CreateV1PageReact createV2PageReact(tenantId, urlId, id).title(title).execute();



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
      CreateV1PageReact result = apiInstance.createV2PageReact(tenantId, urlId, id)
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

[**CreateV1PageReact**](CreateV1PageReact.md)

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

<a id="deleteCommentPublic"></a>
# **deleteCommentPublic**
> PublicAPIDeleteCommentResponse deleteCommentPublic(tenantId, commentId, broadcastId).editKey(editKey).sso(sso).execute();



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
      PublicAPIDeleteCommentResponse result = apiInstance.deleteCommentPublic(tenantId, commentId, broadcastId)
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

[**PublicAPIDeleteCommentResponse**](PublicAPIDeleteCommentResponse.md)

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

<a id="deleteCommentVote"></a>
# **deleteCommentVote**
> VoteDeleteResponse deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId).editKey(editKey).sso(sso).execute();



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
      VoteDeleteResponse result = apiInstance.deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId)
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
| **0** | Error |  -  |

<a id="deleteV1PageReact"></a>
# **deleteV1PageReact**
> CreateV1PageReact deleteV1PageReact(tenantId, urlId).execute();



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
      CreateV1PageReact result = apiInstance.deleteV1PageReact(tenantId, urlId)
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

[**CreateV1PageReact**](CreateV1PageReact.md)

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

<a id="deleteV2PageReact"></a>
# **deleteV2PageReact**
> CreateV1PageReact deleteV2PageReact(tenantId, urlId, id).execute();



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
      CreateV1PageReact result = apiInstance.deleteV2PageReact(tenantId, urlId, id)
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

[**CreateV1PageReact**](CreateV1PageReact.md)

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

<a id="flagCommentPublic"></a>
# **flagCommentPublic**
> APIEmptyResponse flagCommentPublic(tenantId, commentId, isFlagged).sso(sso).execute();



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
      APIEmptyResponse result = apiInstance.flagCommentPublic(tenantId, commentId, isFlagged)
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

<a id="getCommentText"></a>
# **getCommentText**
> PublicAPIGetCommentTextResponse getCommentText(tenantId, commentId).editKey(editKey).sso(sso).execute();



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
      PublicAPIGetCommentTextResponse result = apiInstance.getCommentText(tenantId, commentId)
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

[**PublicAPIGetCommentTextResponse**](PublicAPIGetCommentTextResponse.md)

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

<a id="getCommentVoteUserNames"></a>
# **getCommentVoteUserNames**
> GetCommentVoteUserNamesSuccessResponse getCommentVoteUserNames(tenantId, commentId, dir).sso(sso).execute();



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
      GetCommentVoteUserNamesSuccessResponse result = apiInstance.getCommentVoteUserNames(tenantId, commentId, dir)
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

[**GetCommentVoteUserNamesSuccessResponse**](GetCommentVoteUserNamesSuccessResponse.md)

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

<a id="getCommentsForUser"></a>
# **getCommentsForUser**
> GetCommentsForUserResponse getCommentsForUser().userId(userId).direction(direction).repliesToUserId(repliesToUserId).page(page).includei10n(includei10n).locale(locale).isCrawler(isCrawler).execute();



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
      GetCommentsForUserResponse result = apiInstance.getCommentsForUser()
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

[**GetCommentsForUserResponse**](GetCommentsForUserResponse.md)

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

<a id="getCommentsPublic"></a>
# **getCommentsPublic**
> GetCommentsResponseWithPresencePublicComment getCommentsPublic(tenantId, urlId).page(page).direction(direction).sso(sso).skip(skip).skipChildren(skipChildren).limit(limit).limitChildren(limitChildren).countChildren(countChildren).fetchPageForCommentId(fetchPageForCommentId).includeConfig(includeConfig).countAll(countAll).includei10n(includei10n).locale(locale).modules(modules).isCrawler(isCrawler).includeNotificationCount(includeNotificationCount).asTree(asTree).maxTreeDepth(maxTreeDepth).useFullTranslationIds(useFullTranslationIds).parentId(parentId).searchText(searchText).hashTags(hashTags).userId(userId).customConfigStr(customConfigStr).afterCommentId(afterCommentId).beforeCommentId(beforeCommentId).execute();



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
      GetCommentsResponseWithPresencePublicComment result = apiInstance.getCommentsPublic(tenantId, urlId)
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

[**GetCommentsResponseWithPresencePublicComment**](GetCommentsResponseWithPresencePublicComment.md)

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

<a id="getEventLog"></a>
# **getEventLog**
> GetEventLogResponse getEventLog(tenantId, urlId, userIdWS, startTime).endTime(endTime).execute();



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
      GetEventLogResponse result = apiInstance.getEventLog(tenantId, urlId, userIdWS, startTime)
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

[**GetEventLogResponse**](GetEventLogResponse.md)

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

<a id="getFeedPostsPublic"></a>
# **getFeedPostsPublic**
> PublicFeedPostsResponse getFeedPostsPublic(tenantId).afterId(afterId).limit(limit).tags(tags).sso(sso).isCrawler(isCrawler).includeUserInfo(includeUserInfo).execute();



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
      PublicFeedPostsResponse result = apiInstance.getFeedPostsPublic(tenantId)
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

[**PublicFeedPostsResponse**](PublicFeedPostsResponse.md)

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

<a id="getFeedPostsStats"></a>
# **getFeedPostsStats**
> FeedPostsStatsResponse getFeedPostsStats(tenantId, postIds).sso(sso).execute();



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
      FeedPostsStatsResponse result = apiInstance.getFeedPostsStats(tenantId, postIds)
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

[**FeedPostsStatsResponse**](FeedPostsStatsResponse.md)

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

<a id="getGifLarge"></a>
# **getGifLarge**
> GifGetLargeResponse getGifLarge(tenantId, largeInternalURLSanitized).execute();



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
      GifGetLargeResponse result = apiInstance.getGifLarge(tenantId, largeInternalURLSanitized)
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

[**GifGetLargeResponse**](GifGetLargeResponse.md)

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
| **0** | Error |  -  |

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
| **0** | Error |  -  |

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
> GetEventLogResponse getGlobalEventLog(tenantId, urlId, userIdWS, startTime).endTime(endTime).execute();



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
      GetEventLogResponse result = apiInstance.getGlobalEventLog(tenantId, urlId, userIdWS, startTime)
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

[**GetEventLogResponse**](GetEventLogResponse.md)

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

<a id="getOfflineUsers"></a>
# **getOfflineUsers**
> PageUsersOfflineResponse getOfflineUsers(tenantId, urlId).afterName(afterName).afterUserId(afterUserId).execute();



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
      PageUsersOfflineResponse result = apiInstance.getOfflineUsers(tenantId, urlId)
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

[**PageUsersOfflineResponse**](PageUsersOfflineResponse.md)

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
| **0** | Error |  -  |

<a id="getOnlineUsers"></a>
# **getOnlineUsers**
> PageUsersOnlineResponse getOnlineUsers(tenantId, urlId).afterName(afterName).afterUserId(afterUserId).execute();



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
      PageUsersOnlineResponse result = apiInstance.getOnlineUsers(tenantId, urlId)
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

[**PageUsersOnlineResponse**](PageUsersOnlineResponse.md)

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
| **0** | Error |  -  |

<a id="getPagesPublic"></a>
# **getPagesPublic**
> GetPublicPagesResponse getPagesPublic(tenantId).cursor(cursor).limit(limit).q(q).sortBy(sortBy).hasComments(hasComments).execute();



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
      GetPublicPagesResponse result = apiInstance.getPagesPublic(tenantId)
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

[**GetPublicPagesResponse**](GetPublicPagesResponse.md)

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

<a id="getTranslations"></a>
# **getTranslations**
> GetTranslationsResponse getTranslations(namespace, component).locale(locale).useFullTranslationIds(useFullTranslationIds).execute();



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
      GetTranslationsResponse result = apiInstance.getTranslations(namespace, component)
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

[**GetTranslationsResponse**](GetTranslationsResponse.md)

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
| **0** | Error |  -  |

<a id="getUserNotificationCount"></a>
# **getUserNotificationCount**
> GetUserNotificationCountResponse getUserNotificationCount(tenantId).sso(sso).execute();



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
      GetUserNotificationCountResponse result = apiInstance.getUserNotificationCount(tenantId)
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

[**GetUserNotificationCountResponse**](GetUserNotificationCountResponse.md)

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

<a id="getUserNotifications"></a>
# **getUserNotifications**
> GetMyNotificationsResponse getUserNotifications(tenantId).urlId(urlId).pageSize(pageSize).afterId(afterId).includeContext(includeContext).afterCreatedAt(afterCreatedAt).unreadOnly(unreadOnly).dmOnly(dmOnly).noDm(noDm).includeTranslations(includeTranslations).includeTenantNotifications(includeTenantNotifications).sso(sso).execute();



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
      GetMyNotificationsResponse result = apiInstance.getUserNotifications(tenantId)
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

[**GetMyNotificationsResponse**](GetMyNotificationsResponse.md)

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

<a id="getUserPresenceStatuses"></a>
# **getUserPresenceStatuses**
> GetUserPresenceStatusesResponse getUserPresenceStatuses(tenantId, urlIdWS, userIds).execute();



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
      GetUserPresenceStatusesResponse result = apiInstance.getUserPresenceStatuses(tenantId, urlIdWS, userIds)
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

[**GetUserPresenceStatusesResponse**](GetUserPresenceStatusesResponse.md)

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
| **0** | Error |  -  |

<a id="getUserReactsPublic"></a>
# **getUserReactsPublic**
> UserReactsResponse getUserReactsPublic(tenantId).postIds(postIds).sso(sso).execute();



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
      UserReactsResponse result = apiInstance.getUserReactsPublic(tenantId)
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

[**UserReactsResponse**](UserReactsResponse.md)

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

<a id="getUsersInfo"></a>
# **getUsersInfo**
> PageUsersInfoResponse getUsersInfo(tenantId, ids).execute();



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
      PageUsersInfoResponse result = apiInstance.getUsersInfo(tenantId, ids)
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

[**PageUsersInfoResponse**](PageUsersInfoResponse.md)

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
| **0** | Error |  -  |

<a id="getV1PageLikes"></a>
# **getV1PageLikes**
> GetV1PageLikes getV1PageLikes(tenantId, urlId).execute();



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
      GetV1PageLikes result = apiInstance.getV1PageLikes(tenantId, urlId)
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

[**GetV1PageLikes**](GetV1PageLikes.md)

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

<a id="getV2PageReactUsers"></a>
# **getV2PageReactUsers**
> GetV2PageReactUsersResponse getV2PageReactUsers(tenantId, urlId, id).execute();



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
      GetV2PageReactUsersResponse result = apiInstance.getV2PageReactUsers(tenantId, urlId, id)
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

[**GetV2PageReactUsersResponse**](GetV2PageReactUsersResponse.md)

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

<a id="getV2PageReacts"></a>
# **getV2PageReacts**
> GetV2PageReacts getV2PageReacts(tenantId, urlId).execute();



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
      GetV2PageReacts result = apiInstance.getV2PageReacts(tenantId, urlId)
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

[**GetV2PageReacts**](GetV2PageReacts.md)

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

<a id="lockComment"></a>
# **lockComment**
> APIEmptyResponse lockComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
      APIEmptyResponse result = apiInstance.lockComment(tenantId, commentId, broadcastId)
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
> ChangeCommentPinStatusResponse pinComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
      ChangeCommentPinStatusResponse result = apiInstance.pinComment(tenantId, commentId, broadcastId)
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

[**ChangeCommentPinStatusResponse**](ChangeCommentPinStatusResponse.md)

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

<a id="reactFeedPostPublic"></a>
# **reactFeedPostPublic**
> ReactFeedPostResponse reactFeedPostPublic(tenantId, postId, reactBodyParams).isUndo(isUndo).broadcastId(broadcastId).sso(sso).execute();



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
      ReactFeedPostResponse result = apiInstance.reactFeedPostPublic(tenantId, postId, reactBodyParams)
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

[**ReactFeedPostResponse**](ReactFeedPostResponse.md)

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

<a id="resetUserNotificationCount"></a>
# **resetUserNotificationCount**
> ResetUserNotificationsResponse resetUserNotificationCount(tenantId).sso(sso).execute();



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
      ResetUserNotificationsResponse result = apiInstance.resetUserNotificationCount(tenantId)
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

[**ResetUserNotificationsResponse**](ResetUserNotificationsResponse.md)

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

<a id="resetUserNotifications"></a>
# **resetUserNotifications**
> ResetUserNotificationsResponse resetUserNotifications(tenantId).afterId(afterId).afterCreatedAt(afterCreatedAt).unreadOnly(unreadOnly).dmOnly(dmOnly).noDm(noDm).sso(sso).execute();



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
      ResetUserNotificationsResponse result = apiInstance.resetUserNotifications(tenantId)
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

[**ResetUserNotificationsResponse**](ResetUserNotificationsResponse.md)

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

<a id="searchUsers"></a>
# **searchUsers**
> SearchUsersResult searchUsers(tenantId, urlId).usernameStartsWith(usernameStartsWith).mentionGroupIds(mentionGroupIds).sso(sso).searchSection(searchSection).execute();



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
      SearchUsersResult result = apiInstance.searchUsers(tenantId, urlId)
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

[**SearchUsersResult**](SearchUsersResult.md)

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

<a id="setCommentText"></a>
# **setCommentText**
> PublicAPISetCommentTextResponse setCommentText(tenantId, commentId, broadcastId, commentTextUpdateRequest).editKey(editKey).sso(sso).execute();



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
      PublicAPISetCommentTextResponse result = apiInstance.setCommentText(tenantId, commentId, broadcastId, commentTextUpdateRequest)
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

[**PublicAPISetCommentTextResponse**](PublicAPISetCommentTextResponse.md)

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

<a id="unBlockCommentPublic"></a>
# **unBlockCommentPublic**
> UnblockSuccess unBlockCommentPublic(tenantId, commentId, publicBlockFromCommentParams).sso(sso).execute();



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
      UnblockSuccess result = apiInstance.unBlockCommentPublic(tenantId, commentId, publicBlockFromCommentParams)
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

[**UnblockSuccess**](UnblockSuccess.md)

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

<a id="unLockComment"></a>
# **unLockComment**
> APIEmptyResponse unLockComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
      APIEmptyResponse result = apiInstance.unLockComment(tenantId, commentId, broadcastId)
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

<a id="unPinComment"></a>
# **unPinComment**
> ChangeCommentPinStatusResponse unPinComment(tenantId, commentId, broadcastId).sso(sso).execute();



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
      ChangeCommentPinStatusResponse result = apiInstance.unPinComment(tenantId, commentId, broadcastId)
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

[**ChangeCommentPinStatusResponse**](ChangeCommentPinStatusResponse.md)

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

<a id="updateFeedPostPublic"></a>
# **updateFeedPostPublic**
> CreateFeedPostResponse updateFeedPostPublic(tenantId, postId, updateFeedPostParams).broadcastId(broadcastId).sso(sso).execute();



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
      CreateFeedPostResponse result = apiInstance.updateFeedPostPublic(tenantId, postId, updateFeedPostParams)
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

[**CreateFeedPostResponse**](CreateFeedPostResponse.md)

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
| **0** | Error |  -  |

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
| **0** | Error |  -  |

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
| **0** | Error |  -  |

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
> VoteResponse voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams).sessionId(sessionId).sso(sso).execute();



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
      VoteResponse result = apiInstance.voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams)
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

[**VoteResponse**](VoteResponse.md)

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


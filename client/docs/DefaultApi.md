# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commentsOptions**](DefaultApi.md#commentsOptions) | **OPTIONS** /comments/{tenantId} |  |
| [**createUser**](DefaultApi.md#createUser) | **POST** /comments/{tenantId} |  |
| [**getComments**](DefaultApi.md#getComments) | **GET** /comments/{tenantId} |  |


<a id="commentsOptions"></a>
# **commentsOptions**
> String commentsOptions(tenantId)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    try {
      String result = apiInstance.commentsOptions(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#commentsOptions");
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

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="createUser"></a>
# **createUser**
> CreateUser200Response createUser(tenantId, urlId, broadcastId, commentData, sessionId, sso)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String urlId = "urlId_example"; // String | 
    String broadcastId = "broadcastId_example"; // String | 
    CommentData commentData = new CommentData(); // CommentData | 
    String sessionId = "sessionId_example"; // String | 
    String sso = "sso_example"; // String | 
    try {
      CreateUser200Response result = apiInstance.createUser(tenantId, urlId, broadcastId, commentData, sessionId, sso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createUser");
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

[**CreateUser200Response**](CreateUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="getComments"></a>
# **getComments**
> GetComments200Response getComments(tenantId, page, direction, sso, skip, skipChildren, limit, limitChildren, lastGenDate, fetchPageForCommentId, includeConfig, countAll, includei10n, locale, modules, isCrawler, includeNotificationCount, asTree, maxTreeDepth, useFullTranslationIds, parentId, searchText, hashTags, userId, customConfigStr)



### Example
```java
// Import classes:
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.models.*;
import com.fastcomments.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    Double page = 3.4D; // Double | 
    SortDirections direction = SortDirections.fromValue("OF"); // SortDirections | 
    String sso = "sso_example"; // String | 
    Double skip = 3.4D; // Double | 
    Double skipChildren = 3.4D; // Double | 
    Double limit = 3.4D; // Double | 
    Double limitChildren = 3.4D; // Double | 
    Double lastGenDate = 3.4D; // Double | 
    String fetchPageForCommentId = "fetchPageForCommentId_example"; // String | 
    Boolean includeConfig = true; // Boolean | 
    Boolean countAll = true; // Boolean | 
    Boolean includei10n = true; // Boolean | 
    String locale = "locale_example"; // String | 
    String modules = "modules_example"; // String | 
    Boolean isCrawler = true; // Boolean | 
    Boolean includeNotificationCount = true; // Boolean | 
    Boolean asTree = true; // Boolean | 
    Double maxTreeDepth = 3.4D; // Double | 
    Boolean useFullTranslationIds = true; // Boolean | 
    String parentId = "parentId_example"; // String | 
    String searchText = "searchText_example"; // String | 
    List<String> hashTags = Arrays.asList(); // List<String> | 
    String userId = "userId_example"; // String | 
    String customConfigStr = "customConfigStr_example"; // String | 
    try {
      GetComments200Response result = apiInstance.getComments(tenantId, page, direction, sso, skip, skipChildren, limit, limitChildren, lastGenDate, fetchPageForCommentId, includeConfig, countAll, includei10n, locale, modules, isCrawler, includeNotificationCount, asTree, maxTreeDepth, useFullTranslationIds, parentId, searchText, hashTags, userId, customConfigStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getComments");
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
| **page** | **Double**|  | [optional] |
| **direction** | [**SortDirections**](.md)|  | [optional] [enum: OF, NF, MR] |
| **sso** | **String**|  | [optional] |
| **skip** | **Double**|  | [optional] |
| **skipChildren** | **Double**|  | [optional] |
| **limit** | **Double**|  | [optional] |
| **limitChildren** | **Double**|  | [optional] |
| **lastGenDate** | **Double**|  | [optional] |
| **fetchPageForCommentId** | **String**|  | [optional] |
| **includeConfig** | **Boolean**|  | [optional] |
| **countAll** | **Boolean**|  | [optional] |
| **includei10n** | **Boolean**|  | [optional] |
| **locale** | **String**|  | [optional] |
| **modules** | **String**|  | [optional] |
| **isCrawler** | **Boolean**|  | [optional] |
| **includeNotificationCount** | **Boolean**|  | [optional] |
| **asTree** | **Boolean**|  | [optional] |
| **maxTreeDepth** | **Double**|  | [optional] |
| **useFullTranslationIds** | **Boolean**|  | [optional] |
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


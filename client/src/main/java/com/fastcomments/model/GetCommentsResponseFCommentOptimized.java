/*
 * fastcomments
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fastcomments.model;

import java.util.Objects;
import com.fastcomments.model.APICommentFCommentOptimized;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.UserSessionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fastcomments.invoker.JSON;

/**
 * GetCommentsResponseFCommentOptimized
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-13T13:29:44.579096779-08:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetCommentsResponseFCommentOptimized {
  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  @javax.annotation.Nullable
  private Double statusCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private String code;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  @javax.annotation.Nonnull
  private List<APICommentFCommentOptimized> comments = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nullable
  private UserSessionInfo user;

  public static final String SERIALIZED_NAME_URL_ID_CLEAN = "urlIdClean";
  @SerializedName(SERIALIZED_NAME_URL_ID_CLEAN)
  @javax.annotation.Nullable
  private String urlIdClean;

  public static final String SERIALIZED_NAME_LAST_GEN_DATE = "lastGenDate";
  @SerializedName(SERIALIZED_NAME_LAST_GEN_DATE)
  @javax.annotation.Nullable
  private Double lastGenDate;

  public static final String SERIALIZED_NAME_INCLUDES_PAST_PAGES = "includesPastPages";
  @SerializedName(SERIALIZED_NAME_INCLUDES_PAST_PAGES)
  @javax.annotation.Nullable
  private Boolean includesPastPages;

  public static final String SERIALIZED_NAME_IS_DEMO = "isDemo";
  @SerializedName(SERIALIZED_NAME_IS_DEMO)
  @javax.annotation.Nullable
  private Boolean isDemo;

  public static final String SERIALIZED_NAME_COMMENT_COUNT = "commentCount";
  @SerializedName(SERIALIZED_NAME_COMMENT_COUNT)
  @javax.annotation.Nullable
  private Double commentCount;

  public static final String SERIALIZED_NAME_IS_SITE_ADMIN = "isSiteAdmin";
  @SerializedName(SERIALIZED_NAME_IS_SITE_ADMIN)
  @javax.annotation.Nullable
  private Boolean isSiteAdmin;

  public static final String SERIALIZED_NAME_HAS_BILLING_ISSUE = "hasBillingIssue";
  @SerializedName(SERIALIZED_NAME_HAS_BILLING_ISSUE)
  @javax.annotation.Nullable
  private Boolean hasBillingIssue;

  public static final String SERIALIZED_NAME_IS_COMMENTS_HIDDEN = "isCommentsHidden";
  @SerializedName(SERIALIZED_NAME_IS_COMMENTS_HIDDEN)
  @javax.annotation.Nullable
  private Boolean isCommentsHidden;

  public static final String SERIALIZED_NAME_MODULE_DATA = "moduleData";
  @SerializedName(SERIALIZED_NAME_MODULE_DATA)
  @javax.annotation.Nullable
  private Map<String, Object> moduleData = new HashMap<>();

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  @javax.annotation.Nonnull
  private Double pageNumber;

  public static final String SERIALIZED_NAME_IS_WHITE_LABELED = "isWhiteLabeled";
  @SerializedName(SERIALIZED_NAME_IS_WHITE_LABELED)
  @javax.annotation.Nullable
  private Boolean isWhiteLabeled;

  public static final String SERIALIZED_NAME_IS_PROD = "isProd";
  @SerializedName(SERIALIZED_NAME_IS_PROD)
  @javax.annotation.Nullable
  private Boolean isProd;

  public static final String SERIALIZED_NAME_IS_CRAWLER = "isCrawler";
  @SerializedName(SERIALIZED_NAME_IS_CRAWLER)
  @javax.annotation.Nullable
  private Boolean isCrawler;

  public static final String SERIALIZED_NAME_NOTIFICATION_COUNT = "notificationCount";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_COUNT)
  @javax.annotation.Nullable
  private Double notificationCount;

  public static final String SERIALIZED_NAME_HAS_MORE = "hasMore";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  @javax.annotation.Nullable
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_IS_CLOSED = "isClosed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  @javax.annotation.Nullable
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_PRESENCE_POLL_STATE = "presencePollState";
  @SerializedName(SERIALIZED_NAME_PRESENCE_POLL_STATE)
  @javax.annotation.Nullable
  private Double presencePollState;

  public static final String SERIALIZED_NAME_CUSTOM_CONFIG = "customConfig";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CONFIG)
  @javax.annotation.Nullable
  private CustomConfigParameters customConfig;

  public GetCommentsResponseFCommentOptimized() {
  }

  public GetCommentsResponseFCommentOptimized statusCode(@javax.annotation.Nullable Double statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Double getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@javax.annotation.Nullable Double statusCode) {
    this.statusCode = statusCode;
  }


  public GetCommentsResponseFCommentOptimized status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  public GetCommentsResponseFCommentOptimized code(@javax.annotation.Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }


  public GetCommentsResponseFCommentOptimized reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public GetCommentsResponseFCommentOptimized comments(@javax.annotation.Nonnull List<APICommentFCommentOptimized> comments) {
    this.comments = comments;
    return this;
  }

  public GetCommentsResponseFCommentOptimized addCommentsItem(APICommentFCommentOptimized commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  @javax.annotation.Nonnull
  public List<APICommentFCommentOptimized> getComments() {
    return comments;
  }

  public void setComments(@javax.annotation.Nonnull List<APICommentFCommentOptimized> comments) {
    this.comments = comments;
  }


  public GetCommentsResponseFCommentOptimized user(@javax.annotation.Nullable UserSessionInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public UserSessionInfo getUser() {
    return user;
  }

  public void setUser(@javax.annotation.Nullable UserSessionInfo user) {
    this.user = user;
  }


  public GetCommentsResponseFCommentOptimized urlIdClean(@javax.annotation.Nullable String urlIdClean) {
    this.urlIdClean = urlIdClean;
    return this;
  }

  /**
   * Get urlIdClean
   * @return urlIdClean
   */
  @javax.annotation.Nullable
  public String getUrlIdClean() {
    return urlIdClean;
  }

  public void setUrlIdClean(@javax.annotation.Nullable String urlIdClean) {
    this.urlIdClean = urlIdClean;
  }


  public GetCommentsResponseFCommentOptimized lastGenDate(@javax.annotation.Nullable Double lastGenDate) {
    this.lastGenDate = lastGenDate;
    return this;
  }

  /**
   * Get lastGenDate
   * @return lastGenDate
   */
  @javax.annotation.Nullable
  public Double getLastGenDate() {
    return lastGenDate;
  }

  public void setLastGenDate(@javax.annotation.Nullable Double lastGenDate) {
    this.lastGenDate = lastGenDate;
  }


  public GetCommentsResponseFCommentOptimized includesPastPages(@javax.annotation.Nullable Boolean includesPastPages) {
    this.includesPastPages = includesPastPages;
    return this;
  }

  /**
   * Get includesPastPages
   * @return includesPastPages
   */
  @javax.annotation.Nullable
  public Boolean getIncludesPastPages() {
    return includesPastPages;
  }

  public void setIncludesPastPages(@javax.annotation.Nullable Boolean includesPastPages) {
    this.includesPastPages = includesPastPages;
  }


  public GetCommentsResponseFCommentOptimized isDemo(@javax.annotation.Nullable Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

  /**
   * Get isDemo
   * @return isDemo
   */
  @javax.annotation.Nullable
  public Boolean getIsDemo() {
    return isDemo;
  }

  public void setIsDemo(@javax.annotation.Nullable Boolean isDemo) {
    this.isDemo = isDemo;
  }


  public GetCommentsResponseFCommentOptimized commentCount(@javax.annotation.Nullable Double commentCount) {
    this.commentCount = commentCount;
    return this;
  }

  /**
   * Get commentCount
   * @return commentCount
   */
  @javax.annotation.Nullable
  public Double getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(@javax.annotation.Nullable Double commentCount) {
    this.commentCount = commentCount;
  }


  public GetCommentsResponseFCommentOptimized isSiteAdmin(@javax.annotation.Nullable Boolean isSiteAdmin) {
    this.isSiteAdmin = isSiteAdmin;
    return this;
  }

  /**
   * Get isSiteAdmin
   * @return isSiteAdmin
   */
  @javax.annotation.Nullable
  public Boolean getIsSiteAdmin() {
    return isSiteAdmin;
  }

  public void setIsSiteAdmin(@javax.annotation.Nullable Boolean isSiteAdmin) {
    this.isSiteAdmin = isSiteAdmin;
  }


  public GetCommentsResponseFCommentOptimized hasBillingIssue(@javax.annotation.Nullable Boolean hasBillingIssue) {
    this.hasBillingIssue = hasBillingIssue;
    return this;
  }

  /**
   * Get hasBillingIssue
   * @return hasBillingIssue
   */
  @javax.annotation.Nullable
  public Boolean getHasBillingIssue() {
    return hasBillingIssue;
  }

  public void setHasBillingIssue(@javax.annotation.Nullable Boolean hasBillingIssue) {
    this.hasBillingIssue = hasBillingIssue;
  }


  public GetCommentsResponseFCommentOptimized isCommentsHidden(@javax.annotation.Nullable Boolean isCommentsHidden) {
    this.isCommentsHidden = isCommentsHidden;
    return this;
  }

  /**
   * Get isCommentsHidden
   * @return isCommentsHidden
   */
  @javax.annotation.Nullable
  public Boolean getIsCommentsHidden() {
    return isCommentsHidden;
  }

  public void setIsCommentsHidden(@javax.annotation.Nullable Boolean isCommentsHidden) {
    this.isCommentsHidden = isCommentsHidden;
  }


  public GetCommentsResponseFCommentOptimized moduleData(@javax.annotation.Nullable Map<String, Object> moduleData) {
    this.moduleData = moduleData;
    return this;
  }

  public GetCommentsResponseFCommentOptimized putModuleDataItem(String key, Object moduleDataItem) {
    if (this.moduleData == null) {
      this.moduleData = new HashMap<>();
    }
    this.moduleData.put(key, moduleDataItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return moduleData
   */
  @javax.annotation.Nullable
  public Map<String, Object> getModuleData() {
    return moduleData;
  }

  public void setModuleData(@javax.annotation.Nullable Map<String, Object> moduleData) {
    this.moduleData = moduleData;
  }


  public GetCommentsResponseFCommentOptimized pageNumber(@javax.annotation.Nonnull Double pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
   */
  @javax.annotation.Nonnull
  public Double getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(@javax.annotation.Nonnull Double pageNumber) {
    this.pageNumber = pageNumber;
  }


  public GetCommentsResponseFCommentOptimized isWhiteLabeled(@javax.annotation.Nullable Boolean isWhiteLabeled) {
    this.isWhiteLabeled = isWhiteLabeled;
    return this;
  }

  /**
   * Get isWhiteLabeled
   * @return isWhiteLabeled
   */
  @javax.annotation.Nullable
  public Boolean getIsWhiteLabeled() {
    return isWhiteLabeled;
  }

  public void setIsWhiteLabeled(@javax.annotation.Nullable Boolean isWhiteLabeled) {
    this.isWhiteLabeled = isWhiteLabeled;
  }


  public GetCommentsResponseFCommentOptimized isProd(@javax.annotation.Nullable Boolean isProd) {
    this.isProd = isProd;
    return this;
  }

  /**
   * Get isProd
   * @return isProd
   */
  @javax.annotation.Nullable
  public Boolean getIsProd() {
    return isProd;
  }

  public void setIsProd(@javax.annotation.Nullable Boolean isProd) {
    this.isProd = isProd;
  }


  public GetCommentsResponseFCommentOptimized isCrawler(@javax.annotation.Nullable Boolean isCrawler) {
    this.isCrawler = isCrawler;
    return this;
  }

  /**
   * Get isCrawler
   * @return isCrawler
   */
  @javax.annotation.Nullable
  public Boolean getIsCrawler() {
    return isCrawler;
  }

  public void setIsCrawler(@javax.annotation.Nullable Boolean isCrawler) {
    this.isCrawler = isCrawler;
  }


  public GetCommentsResponseFCommentOptimized notificationCount(@javax.annotation.Nullable Double notificationCount) {
    this.notificationCount = notificationCount;
    return this;
  }

  /**
   * Get notificationCount
   * @return notificationCount
   */
  @javax.annotation.Nullable
  public Double getNotificationCount() {
    return notificationCount;
  }

  public void setNotificationCount(@javax.annotation.Nullable Double notificationCount) {
    this.notificationCount = notificationCount;
  }


  public GetCommentsResponseFCommentOptimized hasMore(@javax.annotation.Nullable Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @javax.annotation.Nullable
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@javax.annotation.Nullable Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public GetCommentsResponseFCommentOptimized isClosed(@javax.annotation.Nullable Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

  /**
   * Get isClosed
   * @return isClosed
   */
  @javax.annotation.Nullable
  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(@javax.annotation.Nullable Boolean isClosed) {
    this.isClosed = isClosed;
  }


  public GetCommentsResponseFCommentOptimized presencePollState(@javax.annotation.Nullable Double presencePollState) {
    this.presencePollState = presencePollState;
    return this;
  }

  /**
   * Get presencePollState
   * @return presencePollState
   */
  @javax.annotation.Nullable
  public Double getPresencePollState() {
    return presencePollState;
  }

  public void setPresencePollState(@javax.annotation.Nullable Double presencePollState) {
    this.presencePollState = presencePollState;
  }


  public GetCommentsResponseFCommentOptimized customConfig(@javax.annotation.Nullable CustomConfigParameters customConfig) {
    this.customConfig = customConfig;
    return this;
  }

  /**
   * Get customConfig
   * @return customConfig
   */
  @javax.annotation.Nullable
  public CustomConfigParameters getCustomConfig() {
    return customConfig;
  }

  public void setCustomConfig(@javax.annotation.Nullable CustomConfigParameters customConfig) {
    this.customConfig = customConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCommentsResponseFCommentOptimized getCommentsResponseFCommentOptimized = (GetCommentsResponseFCommentOptimized) o;
    return Objects.equals(this.statusCode, getCommentsResponseFCommentOptimized.statusCode) &&
        Objects.equals(this.status, getCommentsResponseFCommentOptimized.status) &&
        Objects.equals(this.code, getCommentsResponseFCommentOptimized.code) &&
        Objects.equals(this.reason, getCommentsResponseFCommentOptimized.reason) &&
        Objects.equals(this.comments, getCommentsResponseFCommentOptimized.comments) &&
        Objects.equals(this.user, getCommentsResponseFCommentOptimized.user) &&
        Objects.equals(this.urlIdClean, getCommentsResponseFCommentOptimized.urlIdClean) &&
        Objects.equals(this.lastGenDate, getCommentsResponseFCommentOptimized.lastGenDate) &&
        Objects.equals(this.includesPastPages, getCommentsResponseFCommentOptimized.includesPastPages) &&
        Objects.equals(this.isDemo, getCommentsResponseFCommentOptimized.isDemo) &&
        Objects.equals(this.commentCount, getCommentsResponseFCommentOptimized.commentCount) &&
        Objects.equals(this.isSiteAdmin, getCommentsResponseFCommentOptimized.isSiteAdmin) &&
        Objects.equals(this.hasBillingIssue, getCommentsResponseFCommentOptimized.hasBillingIssue) &&
        Objects.equals(this.isCommentsHidden, getCommentsResponseFCommentOptimized.isCommentsHidden) &&
        Objects.equals(this.moduleData, getCommentsResponseFCommentOptimized.moduleData) &&
        Objects.equals(this.pageNumber, getCommentsResponseFCommentOptimized.pageNumber) &&
        Objects.equals(this.isWhiteLabeled, getCommentsResponseFCommentOptimized.isWhiteLabeled) &&
        Objects.equals(this.isProd, getCommentsResponseFCommentOptimized.isProd) &&
        Objects.equals(this.isCrawler, getCommentsResponseFCommentOptimized.isCrawler) &&
        Objects.equals(this.notificationCount, getCommentsResponseFCommentOptimized.notificationCount) &&
        Objects.equals(this.hasMore, getCommentsResponseFCommentOptimized.hasMore) &&
        Objects.equals(this.isClosed, getCommentsResponseFCommentOptimized.isClosed) &&
        Objects.equals(this.presencePollState, getCommentsResponseFCommentOptimized.presencePollState) &&
        Objects.equals(this.customConfig, getCommentsResponseFCommentOptimized.customConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, status, code, reason, comments, user, urlIdClean, lastGenDate, includesPastPages, isDemo, commentCount, isSiteAdmin, hasBillingIssue, isCommentsHidden, moduleData, pageNumber, isWhiteLabeled, isProd, isCrawler, notificationCount, hasMore, isClosed, presencePollState, customConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommentsResponseFCommentOptimized {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    urlIdClean: ").append(toIndentedString(urlIdClean)).append("\n");
    sb.append("    lastGenDate: ").append(toIndentedString(lastGenDate)).append("\n");
    sb.append("    includesPastPages: ").append(toIndentedString(includesPastPages)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    isSiteAdmin: ").append(toIndentedString(isSiteAdmin)).append("\n");
    sb.append("    hasBillingIssue: ").append(toIndentedString(hasBillingIssue)).append("\n");
    sb.append("    isCommentsHidden: ").append(toIndentedString(isCommentsHidden)).append("\n");
    sb.append("    moduleData: ").append(toIndentedString(moduleData)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    isWhiteLabeled: ").append(toIndentedString(isWhiteLabeled)).append("\n");
    sb.append("    isProd: ").append(toIndentedString(isProd)).append("\n");
    sb.append("    isCrawler: ").append(toIndentedString(isCrawler)).append("\n");
    sb.append("    notificationCount: ").append(toIndentedString(notificationCount)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    presencePollState: ").append(toIndentedString(presencePollState)).append("\n");
    sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("statusCode");
    openapiFields.add("status");
    openapiFields.add("code");
    openapiFields.add("reason");
    openapiFields.add("comments");
    openapiFields.add("user");
    openapiFields.add("urlIdClean");
    openapiFields.add("lastGenDate");
    openapiFields.add("includesPastPages");
    openapiFields.add("isDemo");
    openapiFields.add("commentCount");
    openapiFields.add("isSiteAdmin");
    openapiFields.add("hasBillingIssue");
    openapiFields.add("isCommentsHidden");
    openapiFields.add("moduleData");
    openapiFields.add("pageNumber");
    openapiFields.add("isWhiteLabeled");
    openapiFields.add("isProd");
    openapiFields.add("isCrawler");
    openapiFields.add("notificationCount");
    openapiFields.add("hasMore");
    openapiFields.add("isClosed");
    openapiFields.add("presencePollState");
    openapiFields.add("customConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("pageNumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCommentsResponseFCommentOptimized
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCommentsResponseFCommentOptimized.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCommentsResponseFCommentOptimized is not found in the empty JSON string", GetCommentsResponseFCommentOptimized.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCommentsResponseFCommentOptimized.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCommentsResponseFCommentOptimized` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCommentsResponseFCommentOptimized.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("comments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }

      JsonArray jsonArraycomments = jsonObj.getAsJsonArray("comments");
      // validate the required field `comments` (array)
      for (int i = 0; i < jsonArraycomments.size(); i++) {
        APICommentFCommentOptimized.validateJsonElement(jsonArraycomments.get(i));
      };
      // validate the required field `user`
      UserSessionInfo.validateJsonElement(jsonObj.get("user"));
      if ((jsonObj.get("urlIdClean") != null && !jsonObj.get("urlIdClean").isJsonNull()) && !jsonObj.get("urlIdClean").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlIdClean` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlIdClean").toString()));
      }
      // validate the optional field `customConfig`
      if (jsonObj.get("customConfig") != null && !jsonObj.get("customConfig").isJsonNull()) {
        CustomConfigParameters.validateJsonElement(jsonObj.get("customConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCommentsResponseFCommentOptimized.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCommentsResponseFCommentOptimized' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCommentsResponseFCommentOptimized> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCommentsResponseFCommentOptimized.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCommentsResponseFCommentOptimized>() {
           @Override
           public void write(JsonWriter out, GetCommentsResponseFCommentOptimized value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCommentsResponseFCommentOptimized read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCommentsResponseFCommentOptimized given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCommentsResponseFCommentOptimized
   * @throws IOException if the JSON string is invalid with respect to GetCommentsResponseFCommentOptimized
   */
  public static GetCommentsResponseFCommentOptimized fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCommentsResponseFCommentOptimized.class);
  }

  /**
   * Convert an instance of GetCommentsResponseFCommentOptimized to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


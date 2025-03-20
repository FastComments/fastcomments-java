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
import com.fastcomments.model.NotificationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * UserNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-20T08:57:28.309985161-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class UserNotification {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nonnull
  private String tenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_ANON_USER_ID = "anonUserId";
  @SerializedName(SERIALIZED_NAME_ANON_USER_ID)
  @javax.annotation.Nullable
  private String anonUserId;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  @javax.annotation.Nonnull
  private String urlId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "pageTitle";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  @javax.annotation.Nullable
  private String pageTitle;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "relatedObjectType";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  @javax.annotation.Nonnull
  private Double relatedObjectType;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "relatedObjectId";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  @javax.annotation.Nonnull
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_VIEWED = "viewed";
  @SerializedName(SERIALIZED_NAME_VIEWED)
  @javax.annotation.Nonnull
  private Boolean viewed;

  public static final String SERIALIZED_NAME_IS_UNREAD_MESSAGE = "isUnreadMessage";
  @SerializedName(SERIALIZED_NAME_IS_UNREAD_MESSAGE)
  @javax.annotation.Nonnull
  private Boolean isUnreadMessage;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  @javax.annotation.Nonnull
  private Boolean sent;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private NotificationType type;

  public static final String SERIALIZED_NAME_FROM_COMMENT_ID = "fromCommentId";
  @SerializedName(SERIALIZED_NAME_FROM_COMMENT_ID)
  @javax.annotation.Nullable
  private String fromCommentId;

  public static final String SERIALIZED_NAME_FROM_VOTE_ID = "fromVoteId";
  @SerializedName(SERIALIZED_NAME_FROM_VOTE_ID)
  @javax.annotation.Nullable
  private String fromVoteId;

  public static final String SERIALIZED_NAME_FROM_USER_NAME = "fromUserName";
  @SerializedName(SERIALIZED_NAME_FROM_USER_NAME)
  @javax.annotation.Nullable
  private String fromUserName;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "fromUserId";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  @javax.annotation.Nullable
  private String fromUserId;

  public static final String SERIALIZED_NAME_FROM_USER_AVATAR_SRC = "fromUserAvatarSrc";
  @SerializedName(SERIALIZED_NAME_FROM_USER_AVATAR_SRC)
  @javax.annotation.Nullable
  private String fromUserAvatarSrc;

  public static final String SERIALIZED_NAME_OPTED_OUT = "optedOut";
  @SerializedName(SERIALIZED_NAME_OPTED_OUT)
  @javax.annotation.Nonnull
  private Boolean optedOut;

  public UserNotification() {
  }

  public UserNotification id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public UserNotification tenantId(@javax.annotation.Nonnull String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nonnull String tenantId) {
    this.tenantId = tenantId;
  }


  public UserNotification userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public UserNotification anonUserId(@javax.annotation.Nullable String anonUserId) {
    this.anonUserId = anonUserId;
    return this;
  }

  /**
   * Get anonUserId
   * @return anonUserId
   */
  @javax.annotation.Nullable
  public String getAnonUserId() {
    return anonUserId;
  }

  public void setAnonUserId(@javax.annotation.Nullable String anonUserId) {
    this.anonUserId = anonUserId;
  }


  public UserNotification urlId(@javax.annotation.Nonnull String urlId) {
    this.urlId = urlId;
    return this;
  }

  /**
   * Get urlId
   * @return urlId
   */
  @javax.annotation.Nonnull
  public String getUrlId() {
    return urlId;
  }

  public void setUrlId(@javax.annotation.Nonnull String urlId) {
    this.urlId = urlId;
  }


  public UserNotification url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public UserNotification pageTitle(@javax.annotation.Nullable String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Get pageTitle
   * @return pageTitle
   */
  @javax.annotation.Nullable
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(@javax.annotation.Nullable String pageTitle) {
    this.pageTitle = pageTitle;
  }


  public UserNotification relatedObjectType(@javax.annotation.Nonnull Double relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
    return this;
  }

  /**
   * Get relatedObjectType
   * @return relatedObjectType
   */
  @javax.annotation.Nonnull
  public Double getRelatedObjectType() {
    return relatedObjectType;
  }

  public void setRelatedObjectType(@javax.annotation.Nonnull Double relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public UserNotification relatedObjectId(@javax.annotation.Nonnull String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
    return this;
  }

  /**
   * Get relatedObjectId
   * @return relatedObjectId
   */
  @javax.annotation.Nonnull
  public String getRelatedObjectId() {
    return relatedObjectId;
  }

  public void setRelatedObjectId(@javax.annotation.Nonnull String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public UserNotification viewed(@javax.annotation.Nonnull Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

  /**
   * Get viewed
   * @return viewed
   */
  @javax.annotation.Nonnull
  public Boolean getViewed() {
    return viewed;
  }

  public void setViewed(@javax.annotation.Nonnull Boolean viewed) {
    this.viewed = viewed;
  }


  public UserNotification isUnreadMessage(@javax.annotation.Nonnull Boolean isUnreadMessage) {
    this.isUnreadMessage = isUnreadMessage;
    return this;
  }

  /**
   * Get isUnreadMessage
   * @return isUnreadMessage
   */
  @javax.annotation.Nonnull
  public Boolean getIsUnreadMessage() {
    return isUnreadMessage;
  }

  public void setIsUnreadMessage(@javax.annotation.Nonnull Boolean isUnreadMessage) {
    this.isUnreadMessage = isUnreadMessage;
  }


  public UserNotification sent(@javax.annotation.Nonnull Boolean sent) {
    this.sent = sent;
    return this;
  }

  /**
   * Get sent
   * @return sent
   */
  @javax.annotation.Nonnull
  public Boolean getSent() {
    return sent;
  }

  public void setSent(@javax.annotation.Nonnull Boolean sent) {
    this.sent = sent;
  }


  public UserNotification createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public UserNotification type(@javax.annotation.Nonnull NotificationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public NotificationType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull NotificationType type) {
    this.type = type;
  }


  public UserNotification fromCommentId(@javax.annotation.Nullable String fromCommentId) {
    this.fromCommentId = fromCommentId;
    return this;
  }

  /**
   * Get fromCommentId
   * @return fromCommentId
   */
  @javax.annotation.Nullable
  public String getFromCommentId() {
    return fromCommentId;
  }

  public void setFromCommentId(@javax.annotation.Nullable String fromCommentId) {
    this.fromCommentId = fromCommentId;
  }


  public UserNotification fromVoteId(@javax.annotation.Nullable String fromVoteId) {
    this.fromVoteId = fromVoteId;
    return this;
  }

  /**
   * Get fromVoteId
   * @return fromVoteId
   */
  @javax.annotation.Nullable
  public String getFromVoteId() {
    return fromVoteId;
  }

  public void setFromVoteId(@javax.annotation.Nullable String fromVoteId) {
    this.fromVoteId = fromVoteId;
  }


  public UserNotification fromUserName(@javax.annotation.Nullable String fromUserName) {
    this.fromUserName = fromUserName;
    return this;
  }

  /**
   * Get fromUserName
   * @return fromUserName
   */
  @javax.annotation.Nullable
  public String getFromUserName() {
    return fromUserName;
  }

  public void setFromUserName(@javax.annotation.Nullable String fromUserName) {
    this.fromUserName = fromUserName;
  }


  public UserNotification fromUserId(@javax.annotation.Nullable String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

  /**
   * Get fromUserId
   * @return fromUserId
   */
  @javax.annotation.Nullable
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(@javax.annotation.Nullable String fromUserId) {
    this.fromUserId = fromUserId;
  }


  public UserNotification fromUserAvatarSrc(@javax.annotation.Nullable String fromUserAvatarSrc) {
    this.fromUserAvatarSrc = fromUserAvatarSrc;
    return this;
  }

  /**
   * Get fromUserAvatarSrc
   * @return fromUserAvatarSrc
   */
  @javax.annotation.Nullable
  public String getFromUserAvatarSrc() {
    return fromUserAvatarSrc;
  }

  public void setFromUserAvatarSrc(@javax.annotation.Nullable String fromUserAvatarSrc) {
    this.fromUserAvatarSrc = fromUserAvatarSrc;
  }


  public UserNotification optedOut(@javax.annotation.Nonnull Boolean optedOut) {
    this.optedOut = optedOut;
    return this;
  }

  /**
   * Get optedOut
   * @return optedOut
   */
  @javax.annotation.Nonnull
  public Boolean getOptedOut() {
    return optedOut;
  }

  public void setOptedOut(@javax.annotation.Nonnull Boolean optedOut) {
    this.optedOut = optedOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotification userNotification = (UserNotification) o;
    return Objects.equals(this.id, userNotification.id) &&
        Objects.equals(this.tenantId, userNotification.tenantId) &&
        Objects.equals(this.userId, userNotification.userId) &&
        Objects.equals(this.anonUserId, userNotification.anonUserId) &&
        Objects.equals(this.urlId, userNotification.urlId) &&
        Objects.equals(this.url, userNotification.url) &&
        Objects.equals(this.pageTitle, userNotification.pageTitle) &&
        Objects.equals(this.relatedObjectType, userNotification.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, userNotification.relatedObjectId) &&
        Objects.equals(this.viewed, userNotification.viewed) &&
        Objects.equals(this.isUnreadMessage, userNotification.isUnreadMessage) &&
        Objects.equals(this.sent, userNotification.sent) &&
        Objects.equals(this.createdAt, userNotification.createdAt) &&
        Objects.equals(this.type, userNotification.type) &&
        Objects.equals(this.fromCommentId, userNotification.fromCommentId) &&
        Objects.equals(this.fromVoteId, userNotification.fromVoteId) &&
        Objects.equals(this.fromUserName, userNotification.fromUserName) &&
        Objects.equals(this.fromUserId, userNotification.fromUserId) &&
        Objects.equals(this.fromUserAvatarSrc, userNotification.fromUserAvatarSrc) &&
        Objects.equals(this.optedOut, userNotification.optedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, userId, anonUserId, urlId, url, pageTitle, relatedObjectType, relatedObjectId, viewed, isUnreadMessage, sent, createdAt, type, fromCommentId, fromVoteId, fromUserName, fromUserId, fromUserAvatarSrc, optedOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    anonUserId: ").append(toIndentedString(anonUserId)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    isUnreadMessage: ").append(toIndentedString(isUnreadMessage)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromCommentId: ").append(toIndentedString(fromCommentId)).append("\n");
    sb.append("    fromVoteId: ").append(toIndentedString(fromVoteId)).append("\n");
    sb.append("    fromUserName: ").append(toIndentedString(fromUserName)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    fromUserAvatarSrc: ").append(toIndentedString(fromUserAvatarSrc)).append("\n");
    sb.append("    optedOut: ").append(toIndentedString(optedOut)).append("\n");
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
    openapiFields.add("_id");
    openapiFields.add("tenantId");
    openapiFields.add("userId");
    openapiFields.add("anonUserId");
    openapiFields.add("urlId");
    openapiFields.add("url");
    openapiFields.add("pageTitle");
    openapiFields.add("relatedObjectType");
    openapiFields.add("relatedObjectId");
    openapiFields.add("viewed");
    openapiFields.add("isUnreadMessage");
    openapiFields.add("sent");
    openapiFields.add("createdAt");
    openapiFields.add("type");
    openapiFields.add("fromCommentId");
    openapiFields.add("fromVoteId");
    openapiFields.add("fromUserName");
    openapiFields.add("fromUserId");
    openapiFields.add("fromUserAvatarSrc");
    openapiFields.add("optedOut");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("relatedObjectType");
    openapiRequiredFields.add("relatedObjectId");
    openapiRequiredFields.add("viewed");
    openapiRequiredFields.add("isUnreadMessage");
    openapiRequiredFields.add("sent");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("optedOut");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserNotification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserNotification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserNotification is not found in the empty JSON string", UserNotification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserNotification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserNotification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserNotification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("anonUserId") != null && !jsonObj.get("anonUserId").isJsonNull()) && !jsonObj.get("anonUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anonUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anonUserId").toString()));
      }
      if (!jsonObj.get("urlId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlId").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("pageTitle") != null && !jsonObj.get("pageTitle").isJsonNull()) && !jsonObj.get("pageTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageTitle").toString()));
      }
      if (!jsonObj.get("relatedObjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedObjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relatedObjectId").toString()));
      }
      // validate the required field `type`
      NotificationType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("fromCommentId") != null && !jsonObj.get("fromCommentId").isJsonNull()) && !jsonObj.get("fromCommentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromCommentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromCommentId").toString()));
      }
      if ((jsonObj.get("fromVoteId") != null && !jsonObj.get("fromVoteId").isJsonNull()) && !jsonObj.get("fromVoteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromVoteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromVoteId").toString()));
      }
      if ((jsonObj.get("fromUserName") != null && !jsonObj.get("fromUserName").isJsonNull()) && !jsonObj.get("fromUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserName").toString()));
      }
      if ((jsonObj.get("fromUserId") != null && !jsonObj.get("fromUserId").isJsonNull()) && !jsonObj.get("fromUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserId").toString()));
      }
      if ((jsonObj.get("fromUserAvatarSrc") != null && !jsonObj.get("fromUserAvatarSrc").isJsonNull()) && !jsonObj.get("fromUserAvatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserAvatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserAvatarSrc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<UserNotification>() {
           @Override
           public void write(JsonWriter out, UserNotification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserNotification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserNotification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserNotification
   * @throws IOException if the JSON string is invalid with respect to UserNotification
   */
  public static UserNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserNotification.class);
  }

  /**
   * Convert an instance of UserNotification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


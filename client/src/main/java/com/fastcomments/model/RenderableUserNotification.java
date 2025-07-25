/*
 * fastcomments
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: support@fastcomments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fastcomments.model;

import java.util.Objects;
import com.fastcomments.model.NotificationObjectType;
import com.fastcomments.model.NotificationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RenderableUserNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class RenderableUserNotification {
  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversationId";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  @javax.annotation.Nullable
  private String conversationId;

  public static final String SERIALIZED_NAME_CONTEXT_H_T_M_L = "contextHTML";
  @SerializedName(SERIALIZED_NAME_CONTEXT_H_T_M_L)
  @javax.annotation.Nullable
  private String contextHTML;

  public static final String SERIALIZED_NAME_FROM_USER_NAMES = "fromUserNames";
  @SerializedName(SERIALIZED_NAME_FROM_USER_NAMES)
  @javax.annotation.Nullable
  private List<String> fromUserNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_FROM_USER_IDS = "fromUserIds";
  @SerializedName(SERIALIZED_NAME_FROM_USER_IDS)
  @javax.annotation.Nullable
  private List<String> fromUserIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELATED_IDS = "relatedIds";
  @SerializedName(SERIALIZED_NAME_RELATED_IDS)
  @javax.annotation.Nullable
  private List<String> relatedIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @javax.annotation.Nullable
  private Double count;

  public static final String SERIALIZED_NAME_OPTED_OUT = "optedOut";
  @SerializedName(SERIALIZED_NAME_OPTED_OUT)
  @javax.annotation.Nonnull
  private Boolean optedOut;

  public static final String SERIALIZED_NAME_FROM_USER_AVATAR_SRC = "fromUserAvatarSrc";
  @SerializedName(SERIALIZED_NAME_FROM_USER_AVATAR_SRC)
  @javax.annotation.Nullable
  private String fromUserAvatarSrc;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "fromUserId";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  @javax.annotation.Nullable
  private String fromUserId;

  public static final String SERIALIZED_NAME_FROM_USER_NAME = "fromUserName";
  @SerializedName(SERIALIZED_NAME_FROM_USER_NAME)
  @javax.annotation.Nullable
  private String fromUserName;

  public static final String SERIALIZED_NAME_FROM_COMMENT_ID = "fromCommentId";
  @SerializedName(SERIALIZED_NAME_FROM_COMMENT_ID)
  @javax.annotation.Nullable
  private String fromCommentId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private NotificationType type;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  @javax.annotation.Nonnull
  private String sent;

  public static final String SERIALIZED_NAME_VIEWED = "viewed";
  @SerializedName(SERIALIZED_NAME_VIEWED)
  @javax.annotation.Nonnull
  private String viewed;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "relatedObjectId";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  @javax.annotation.Nonnull
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "relatedObjectType";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  @javax.annotation.Nonnull
  private NotificationObjectType relatedObjectType;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "pageTitle";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  @javax.annotation.Nullable
  private String pageTitle;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  @javax.annotation.Nonnull
  private String urlId;

  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public RenderableUserNotification() {
  }

  public RenderableUserNotification conversationId(@javax.annotation.Nullable String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  /**
   * Get conversationId
   * @return conversationId
   */
  @javax.annotation.Nullable
  public String getConversationId() {
    return conversationId;
  }

  public void setConversationId(@javax.annotation.Nullable String conversationId) {
    this.conversationId = conversationId;
  }


  public RenderableUserNotification contextHTML(@javax.annotation.Nullable String contextHTML) {
    this.contextHTML = contextHTML;
    return this;
  }

  /**
   * Get contextHTML
   * @return contextHTML
   */
  @javax.annotation.Nullable
  public String getContextHTML() {
    return contextHTML;
  }

  public void setContextHTML(@javax.annotation.Nullable String contextHTML) {
    this.contextHTML = contextHTML;
  }


  public RenderableUserNotification fromUserNames(@javax.annotation.Nullable List<String> fromUserNames) {
    this.fromUserNames = fromUserNames;
    return this;
  }

  public RenderableUserNotification addFromUserNamesItem(String fromUserNamesItem) {
    if (this.fromUserNames == null) {
      this.fromUserNames = new ArrayList<>();
    }
    this.fromUserNames.add(fromUserNamesItem);
    return this;
  }

  /**
   * Get fromUserNames
   * @return fromUserNames
   */
  @javax.annotation.Nullable
  public List<String> getFromUserNames() {
    return fromUserNames;
  }

  public void setFromUserNames(@javax.annotation.Nullable List<String> fromUserNames) {
    this.fromUserNames = fromUserNames;
  }


  public RenderableUserNotification fromUserIds(@javax.annotation.Nullable List<String> fromUserIds) {
    this.fromUserIds = fromUserIds;
    return this;
  }

  public RenderableUserNotification addFromUserIdsItem(String fromUserIdsItem) {
    if (this.fromUserIds == null) {
      this.fromUserIds = new ArrayList<>();
    }
    this.fromUserIds.add(fromUserIdsItem);
    return this;
  }

  /**
   * Get fromUserIds
   * @return fromUserIds
   */
  @javax.annotation.Nullable
  public List<String> getFromUserIds() {
    return fromUserIds;
  }

  public void setFromUserIds(@javax.annotation.Nullable List<String> fromUserIds) {
    this.fromUserIds = fromUserIds;
  }


  public RenderableUserNotification relatedIds(@javax.annotation.Nullable List<String> relatedIds) {
    this.relatedIds = relatedIds;
    return this;
  }

  public RenderableUserNotification addRelatedIdsItem(String relatedIdsItem) {
    if (this.relatedIds == null) {
      this.relatedIds = new ArrayList<>();
    }
    this.relatedIds.add(relatedIdsItem);
    return this;
  }

  /**
   * Get relatedIds
   * @return relatedIds
   */
  @javax.annotation.Nullable
  public List<String> getRelatedIds() {
    return relatedIds;
  }

  public void setRelatedIds(@javax.annotation.Nullable List<String> relatedIds) {
    this.relatedIds = relatedIds;
  }


  public RenderableUserNotification count(@javax.annotation.Nullable Double count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  public Double getCount() {
    return count;
  }

  public void setCount(@javax.annotation.Nullable Double count) {
    this.count = count;
  }


  public RenderableUserNotification optedOut(@javax.annotation.Nonnull Boolean optedOut) {
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


  public RenderableUserNotification fromUserAvatarSrc(@javax.annotation.Nullable String fromUserAvatarSrc) {
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


  public RenderableUserNotification fromUserId(@javax.annotation.Nullable String fromUserId) {
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


  public RenderableUserNotification fromUserName(@javax.annotation.Nullable String fromUserName) {
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


  public RenderableUserNotification fromCommentId(@javax.annotation.Nullable String fromCommentId) {
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


  public RenderableUserNotification type(@javax.annotation.Nonnull NotificationType type) {
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


  public RenderableUserNotification createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public RenderableUserNotification sent(@javax.annotation.Nonnull String sent) {
    this.sent = sent;
    return this;
  }

  /**
   * Get sent
   * @return sent
   */
  @javax.annotation.Nonnull
  public String getSent() {
    return sent;
  }

  public void setSent(@javax.annotation.Nonnull String sent) {
    this.sent = sent;
  }


  public RenderableUserNotification viewed(@javax.annotation.Nonnull String viewed) {
    this.viewed = viewed;
    return this;
  }

  /**
   * Get viewed
   * @return viewed
   */
  @javax.annotation.Nonnull
  public String getViewed() {
    return viewed;
  }

  public void setViewed(@javax.annotation.Nonnull String viewed) {
    this.viewed = viewed;
  }


  public RenderableUserNotification relatedObjectId(@javax.annotation.Nonnull String relatedObjectId) {
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


  public RenderableUserNotification relatedObjectType(@javax.annotation.Nonnull NotificationObjectType relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
    return this;
  }

  /**
   * Get relatedObjectType
   * @return relatedObjectType
   */
  @javax.annotation.Nonnull
  public NotificationObjectType getRelatedObjectType() {
    return relatedObjectType;
  }

  public void setRelatedObjectType(@javax.annotation.Nonnull NotificationObjectType relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public RenderableUserNotification pageTitle(@javax.annotation.Nullable String pageTitle) {
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


  public RenderableUserNotification url(@javax.annotation.Nonnull String url) {
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


  public RenderableUserNotification urlId(@javax.annotation.Nonnull String urlId) {
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


  public RenderableUserNotification id(@javax.annotation.Nonnull String id) {
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RenderableUserNotification instance itself
   */
  public RenderableUserNotification putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderableUserNotification renderableUserNotification = (RenderableUserNotification) o;
    return Objects.equals(this.conversationId, renderableUserNotification.conversationId) &&
        Objects.equals(this.contextHTML, renderableUserNotification.contextHTML) &&
        Objects.equals(this.fromUserNames, renderableUserNotification.fromUserNames) &&
        Objects.equals(this.fromUserIds, renderableUserNotification.fromUserIds) &&
        Objects.equals(this.relatedIds, renderableUserNotification.relatedIds) &&
        Objects.equals(this.count, renderableUserNotification.count) &&
        Objects.equals(this.optedOut, renderableUserNotification.optedOut) &&
        Objects.equals(this.fromUserAvatarSrc, renderableUserNotification.fromUserAvatarSrc) &&
        Objects.equals(this.fromUserId, renderableUserNotification.fromUserId) &&
        Objects.equals(this.fromUserName, renderableUserNotification.fromUserName) &&
        Objects.equals(this.fromCommentId, renderableUserNotification.fromCommentId) &&
        Objects.equals(this.type, renderableUserNotification.type) &&
        Objects.equals(this.createdAt, renderableUserNotification.createdAt) &&
        Objects.equals(this.sent, renderableUserNotification.sent) &&
        Objects.equals(this.viewed, renderableUserNotification.viewed) &&
        Objects.equals(this.relatedObjectId, renderableUserNotification.relatedObjectId) &&
        Objects.equals(this.relatedObjectType, renderableUserNotification.relatedObjectType) &&
        Objects.equals(this.pageTitle, renderableUserNotification.pageTitle) &&
        Objects.equals(this.url, renderableUserNotification.url) &&
        Objects.equals(this.urlId, renderableUserNotification.urlId) &&
        Objects.equals(this.id, renderableUserNotification.id)&&
        Objects.equals(this.additionalProperties, renderableUserNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, contextHTML, fromUserNames, fromUserIds, relatedIds, count, optedOut, fromUserAvatarSrc, fromUserId, fromUserName, fromCommentId, type, createdAt, sent, viewed, relatedObjectId, relatedObjectType, pageTitle, url, urlId, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderableUserNotification {\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    contextHTML: ").append(toIndentedString(contextHTML)).append("\n");
    sb.append("    fromUserNames: ").append(toIndentedString(fromUserNames)).append("\n");
    sb.append("    fromUserIds: ").append(toIndentedString(fromUserIds)).append("\n");
    sb.append("    relatedIds: ").append(toIndentedString(relatedIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    optedOut: ").append(toIndentedString(optedOut)).append("\n");
    sb.append("    fromUserAvatarSrc: ").append(toIndentedString(fromUserAvatarSrc)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    fromUserName: ").append(toIndentedString(fromUserName)).append("\n");
    sb.append("    fromCommentId: ").append(toIndentedString(fromCommentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("conversationId");
    openapiFields.add("contextHTML");
    openapiFields.add("fromUserNames");
    openapiFields.add("fromUserIds");
    openapiFields.add("relatedIds");
    openapiFields.add("count");
    openapiFields.add("optedOut");
    openapiFields.add("fromUserAvatarSrc");
    openapiFields.add("fromUserId");
    openapiFields.add("fromUserName");
    openapiFields.add("fromCommentId");
    openapiFields.add("type");
    openapiFields.add("createdAt");
    openapiFields.add("sent");
    openapiFields.add("viewed");
    openapiFields.add("relatedObjectId");
    openapiFields.add("relatedObjectType");
    openapiFields.add("pageTitle");
    openapiFields.add("url");
    openapiFields.add("urlId");
    openapiFields.add("_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("optedOut");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("sent");
    openapiRequiredFields.add("viewed");
    openapiRequiredFields.add("relatedObjectId");
    openapiRequiredFields.add("relatedObjectType");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenderableUserNotification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenderableUserNotification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenderableUserNotification is not found in the empty JSON string", RenderableUserNotification.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RenderableUserNotification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("conversationId") != null && !jsonObj.get("conversationId").isJsonNull()) && !jsonObj.get("conversationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversationId").toString()));
      }
      if ((jsonObj.get("contextHTML") != null && !jsonObj.get("contextHTML").isJsonNull()) && !jsonObj.get("contextHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextHTML").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fromUserNames") != null && !jsonObj.get("fromUserNames").isJsonNull() && !jsonObj.get("fromUserNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserNames` to be an array in the JSON string but got `%s`", jsonObj.get("fromUserNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fromUserIds") != null && !jsonObj.get("fromUserIds").isJsonNull() && !jsonObj.get("fromUserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("fromUserIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("relatedIds") != null && !jsonObj.get("relatedIds").isJsonNull() && !jsonObj.get("relatedIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedIds` to be an array in the JSON string but got `%s`", jsonObj.get("relatedIds").toString()));
      }
      if ((jsonObj.get("fromUserAvatarSrc") != null && !jsonObj.get("fromUserAvatarSrc").isJsonNull()) && !jsonObj.get("fromUserAvatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserAvatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserAvatarSrc").toString()));
      }
      if ((jsonObj.get("fromUserId") != null && !jsonObj.get("fromUserId").isJsonNull()) && !jsonObj.get("fromUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserId").toString()));
      }
      if ((jsonObj.get("fromUserName") != null && !jsonObj.get("fromUserName").isJsonNull()) && !jsonObj.get("fromUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserName").toString()));
      }
      if ((jsonObj.get("fromCommentId") != null && !jsonObj.get("fromCommentId").isJsonNull()) && !jsonObj.get("fromCommentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromCommentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromCommentId").toString()));
      }
      // validate the required field `type`
      NotificationType.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if (!jsonObj.get("sent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sent").toString()));
      }
      if (!jsonObj.get("viewed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewed").toString()));
      }
      if (!jsonObj.get("relatedObjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedObjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relatedObjectId").toString()));
      }
      // validate the required field `relatedObjectType`
      NotificationObjectType.validateJsonElement(jsonObj.get("relatedObjectType"));
      if ((jsonObj.get("pageTitle") != null && !jsonObj.get("pageTitle").isJsonNull()) && !jsonObj.get("pageTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageTitle").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("urlId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlId").toString()));
      }
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenderableUserNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenderableUserNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenderableUserNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenderableUserNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<RenderableUserNotification>() {
           @Override
           public void write(JsonWriter out, RenderableUserNotification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RenderableUserNotification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RenderableUserNotification instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenderableUserNotification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenderableUserNotification
   * @throws IOException if the JSON string is invalid with respect to RenderableUserNotification
   */
  public static RenderableUserNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenderableUserNotification.class);
  }

  /**
   * Convert an instance of RenderableUserNotification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


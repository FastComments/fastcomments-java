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
 * RenderableUserNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T08:44:18.870123162-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class RenderableUserNotification {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

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

  public static final String SERIALIZED_NAME_FROM_USER_NAME = "fromUserName";
  @SerializedName(SERIALIZED_NAME_FROM_USER_NAME)
  @javax.annotation.Nonnull
  private String fromUserName;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "fromUserId";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  @javax.annotation.Nonnull
  private String fromUserId;

  public static final String SERIALIZED_NAME_FROM_USER_AVATAR_SRC = "fromUserAvatarSrc";
  @SerializedName(SERIALIZED_NAME_FROM_USER_AVATAR_SRC)
  @javax.annotation.Nullable
  private String fromUserAvatarSrc;

  public static final String SERIALIZED_NAME_OPTED_OUT = "optedOut";
  @SerializedName(SERIALIZED_NAME_OPTED_OUT)
  @javax.annotation.Nonnull
  private Boolean optedOut;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversationId";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  @javax.annotation.Nullable
  private String conversationId;

  public static final String SERIALIZED_NAME_CONTEXT_H_T_M_L = "contextHTML";
  @SerializedName(SERIALIZED_NAME_CONTEXT_H_T_M_L)
  @javax.annotation.Nullable
  private String contextHTML;

  public RenderableUserNotification() {
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


  public RenderableUserNotification relatedObjectType(@javax.annotation.Nonnull Double relatedObjectType) {
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


  public RenderableUserNotification viewed(@javax.annotation.Nonnull Boolean viewed) {
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


  public RenderableUserNotification sent(@javax.annotation.Nonnull Boolean sent) {
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


  public RenderableUserNotification createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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


  public RenderableUserNotification fromUserName(@javax.annotation.Nonnull String fromUserName) {
    this.fromUserName = fromUserName;
    return this;
  }

  /**
   * Get fromUserName
   * @return fromUserName
   */
  @javax.annotation.Nonnull
  public String getFromUserName() {
    return fromUserName;
  }

  public void setFromUserName(@javax.annotation.Nonnull String fromUserName) {
    this.fromUserName = fromUserName;
  }


  public RenderableUserNotification fromUserId(@javax.annotation.Nonnull String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

  /**
   * Get fromUserId
   * @return fromUserId
   */
  @javax.annotation.Nonnull
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(@javax.annotation.Nonnull String fromUserId) {
    this.fromUserId = fromUserId;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderableUserNotification renderableUserNotification = (RenderableUserNotification) o;
    return Objects.equals(this.id, renderableUserNotification.id) &&
        Objects.equals(this.urlId, renderableUserNotification.urlId) &&
        Objects.equals(this.url, renderableUserNotification.url) &&
        Objects.equals(this.pageTitle, renderableUserNotification.pageTitle) &&
        Objects.equals(this.relatedObjectType, renderableUserNotification.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, renderableUserNotification.relatedObjectId) &&
        Objects.equals(this.viewed, renderableUserNotification.viewed) &&
        Objects.equals(this.sent, renderableUserNotification.sent) &&
        Objects.equals(this.createdAt, renderableUserNotification.createdAt) &&
        Objects.equals(this.type, renderableUserNotification.type) &&
        Objects.equals(this.fromCommentId, renderableUserNotification.fromCommentId) &&
        Objects.equals(this.fromUserName, renderableUserNotification.fromUserName) &&
        Objects.equals(this.fromUserId, renderableUserNotification.fromUserId) &&
        Objects.equals(this.fromUserAvatarSrc, renderableUserNotification.fromUserAvatarSrc) &&
        Objects.equals(this.optedOut, renderableUserNotification.optedOut) &&
        Objects.equals(this.conversationId, renderableUserNotification.conversationId) &&
        Objects.equals(this.contextHTML, renderableUserNotification.contextHTML);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, urlId, url, pageTitle, relatedObjectType, relatedObjectId, viewed, sent, createdAt, type, fromCommentId, fromUserName, fromUserId, fromUserAvatarSrc, optedOut, conversationId, contextHTML);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderableUserNotification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromCommentId: ").append(toIndentedString(fromCommentId)).append("\n");
    sb.append("    fromUserName: ").append(toIndentedString(fromUserName)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    fromUserAvatarSrc: ").append(toIndentedString(fromUserAvatarSrc)).append("\n");
    sb.append("    optedOut: ").append(toIndentedString(optedOut)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    contextHTML: ").append(toIndentedString(contextHTML)).append("\n");
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
    openapiFields.add("urlId");
    openapiFields.add("url");
    openapiFields.add("pageTitle");
    openapiFields.add("relatedObjectType");
    openapiFields.add("relatedObjectId");
    openapiFields.add("viewed");
    openapiFields.add("sent");
    openapiFields.add("createdAt");
    openapiFields.add("type");
    openapiFields.add("fromCommentId");
    openapiFields.add("fromUserName");
    openapiFields.add("fromUserId");
    openapiFields.add("fromUserAvatarSrc");
    openapiFields.add("optedOut");
    openapiFields.add("conversationId");
    openapiFields.add("contextHTML");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("relatedObjectType");
    openapiRequiredFields.add("relatedObjectId");
    openapiRequiredFields.add("viewed");
    openapiRequiredFields.add("sent");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("fromUserName");
    openapiRequiredFields.add("fromUserId");
    openapiRequiredFields.add("optedOut");
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenderableUserNotification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenderableUserNotification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RenderableUserNotification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
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
      if (!jsonObj.get("fromUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserName").toString()));
      }
      if (!jsonObj.get("fromUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserId").toString()));
      }
      if ((jsonObj.get("fromUserAvatarSrc") != null && !jsonObj.get("fromUserAvatarSrc").isJsonNull()) && !jsonObj.get("fromUserAvatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserAvatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserAvatarSrc").toString()));
      }
      if ((jsonObj.get("conversationId") != null && !jsonObj.get("conversationId").isJsonNull()) && !jsonObj.get("conversationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversationId").toString()));
      }
      if ((jsonObj.get("contextHTML") != null && !jsonObj.get("contextHTML").isJsonNull()) && !jsonObj.get("contextHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextHTML").toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public RenderableUserNotification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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


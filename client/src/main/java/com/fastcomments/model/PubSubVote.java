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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * PubSubVote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PubSubVote {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nonnull
  private String tenantId;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  @javax.annotation.Nonnull
  private String urlId;

  public static final String SERIALIZED_NAME_URL_ID_RAW = "urlIdRaw";
  @SerializedName(SERIALIZED_NAME_URL_ID_RAW)
  @javax.annotation.Nonnull
  private String urlIdRaw;

  public static final String SERIALIZED_NAME_COMMENT_ID = "commentId";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  @javax.annotation.Nonnull
  private String commentId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  @javax.annotation.Nonnull
  private Integer direction;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private Long createdAt;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verificationId";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  @javax.annotation.Nullable
  private String verificationId;

  public PubSubVote() {
  }

  public PubSubVote id(@javax.annotation.Nonnull String id) {
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


  public PubSubVote tenantId(@javax.annotation.Nonnull String tenantId) {
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


  public PubSubVote urlId(@javax.annotation.Nonnull String urlId) {
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


  public PubSubVote urlIdRaw(@javax.annotation.Nonnull String urlIdRaw) {
    this.urlIdRaw = urlIdRaw;
    return this;
  }

  /**
   * Get urlIdRaw
   * @return urlIdRaw
   */
  @javax.annotation.Nonnull
  public String getUrlIdRaw() {
    return urlIdRaw;
  }

  public void setUrlIdRaw(@javax.annotation.Nonnull String urlIdRaw) {
    this.urlIdRaw = urlIdRaw;
  }


  public PubSubVote commentId(@javax.annotation.Nonnull String commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
   */
  @javax.annotation.Nonnull
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(@javax.annotation.Nonnull String commentId) {
    this.commentId = commentId;
  }


  public PubSubVote userId(@javax.annotation.Nullable String userId) {
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


  public PubSubVote direction(@javax.annotation.Nonnull Integer direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nonnull
  public Integer getDirection() {
    return direction;
  }

  public void setDirection(@javax.annotation.Nonnull Integer direction) {
    this.direction = direction;
  }


  public PubSubVote createdAt(@javax.annotation.Nonnull Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull Long createdAt) {
    this.createdAt = createdAt;
  }


  public PubSubVote verificationId(@javax.annotation.Nullable String verificationId) {
    this.verificationId = verificationId;
    return this;
  }

  /**
   * Get verificationId
   * @return verificationId
   */
  @javax.annotation.Nullable
  public String getVerificationId() {
    return verificationId;
  }

  public void setVerificationId(@javax.annotation.Nullable String verificationId) {
    this.verificationId = verificationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PubSubVote pubSubVote = (PubSubVote) o;
    return Objects.equals(this.id, pubSubVote.id) &&
        Objects.equals(this.tenantId, pubSubVote.tenantId) &&
        Objects.equals(this.urlId, pubSubVote.urlId) &&
        Objects.equals(this.urlIdRaw, pubSubVote.urlIdRaw) &&
        Objects.equals(this.commentId, pubSubVote.commentId) &&
        Objects.equals(this.userId, pubSubVote.userId) &&
        Objects.equals(this.direction, pubSubVote.direction) &&
        Objects.equals(this.createdAt, pubSubVote.createdAt) &&
        Objects.equals(this.verificationId, pubSubVote.verificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, urlId, urlIdRaw, commentId, userId, direction, createdAt, verificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubSubVote {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    urlIdRaw: ").append(toIndentedString(urlIdRaw)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
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
    openapiFields.add("urlId");
    openapiFields.add("urlIdRaw");
    openapiFields.add("commentId");
    openapiFields.add("userId");
    openapiFields.add("direction");
    openapiFields.add("createdAt");
    openapiFields.add("verificationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("urlIdRaw");
    openapiRequiredFields.add("commentId");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("verificationId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PubSubVote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PubSubVote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PubSubVote is not found in the empty JSON string", PubSubVote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PubSubVote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PubSubVote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PubSubVote.openapiRequiredFields) {
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
      if (!jsonObj.get("urlId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlId").toString()));
      }
      if (!jsonObj.get("urlIdRaw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlIdRaw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlIdRaw").toString()));
      }
      if (!jsonObj.get("commentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("verificationId") != null && !jsonObj.get("verificationId").isJsonNull()) && !jsonObj.get("verificationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PubSubVote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PubSubVote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PubSubVote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PubSubVote.class));

       return (TypeAdapter<T>) new TypeAdapter<PubSubVote>() {
           @Override
           public void write(JsonWriter out, PubSubVote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PubSubVote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PubSubVote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PubSubVote
   * @throws IOException if the JSON string is invalid with respect to PubSubVote
   */
  public static PubSubVote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PubSubVote.class);
  }

  /**
   * Convert an instance of PubSubVote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


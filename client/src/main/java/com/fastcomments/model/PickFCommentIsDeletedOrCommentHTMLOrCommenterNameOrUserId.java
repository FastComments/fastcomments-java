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
 * From T, pick a set of properties whose keys are in the union K
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T19:15:59.035975264-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId {
  public static final String SERIALIZED_NAME_COMMENT_H_T_M_L = "commentHTML";
  @SerializedName(SERIALIZED_NAME_COMMENT_H_T_M_L)
  @javax.annotation.Nonnull
  private String commentHTML;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_COMMENTER_NAME = "commenterName";
  @SerializedName(SERIALIZED_NAME_COMMENTER_NAME)
  @javax.annotation.Nonnull
  private String commenterName;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  @javax.annotation.Nullable
  private Boolean isDeleted;

  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId() {
  }

  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId commentHTML(@javax.annotation.Nonnull String commentHTML) {
    this.commentHTML = commentHTML;
    return this;
  }

  /**
   * Get commentHTML
   * @return commentHTML
   */
  @javax.annotation.Nonnull
  public String getCommentHTML() {
    return commentHTML;
  }

  public void setCommentHTML(@javax.annotation.Nonnull String commentHTML) {
    this.commentHTML = commentHTML;
  }


  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId userId(@javax.annotation.Nullable String userId) {
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


  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId commenterName(@javax.annotation.Nonnull String commenterName) {
    this.commenterName = commenterName;
    return this;
  }

  /**
   * Get commenterName
   * @return commenterName
   */
  @javax.annotation.Nonnull
  public String getCommenterName() {
    return commenterName;
  }

  public void setCommenterName(@javax.annotation.Nonnull String commenterName) {
    this.commenterName = commenterName;
  }


  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId isDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId pickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId = (PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId) o;
    return Objects.equals(this.commentHTML, pickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.commentHTML) &&
        Objects.equals(this.userId, pickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.userId) &&
        Objects.equals(this.commenterName, pickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.commenterName) &&
        Objects.equals(this.isDeleted, pickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentHTML, userId, commenterName, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId {\n");
    sb.append("    commentHTML: ").append(toIndentedString(commentHTML)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    commenterName: ").append(toIndentedString(commenterName)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("commentHTML");
    openapiFields.add("userId");
    openapiFields.add("commenterName");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commentHTML");
    openapiRequiredFields.add("commenterName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId is not found in the empty JSON string", PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("commentHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentHTML").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("commenterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.class));

       return (TypeAdapter<T>) new TypeAdapter<PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId>() {
           @Override
           public void write(JsonWriter out, PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId
   * @throws IOException if the JSON string is invalid with respect to PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId
   */
  public static PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.class);
  }

  /**
   * Convert an instance of PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


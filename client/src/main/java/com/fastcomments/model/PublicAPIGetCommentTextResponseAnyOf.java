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
import com.fastcomments.model.ImportedAPIStatusSUCCESS;
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
 * PublicAPIGetCommentTextResponseAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-20T09:43:57.934745832-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class PublicAPIGetCommentTextResponseAnyOf {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_COMMENT_TEXT = "commentText";
  @SerializedName(SERIALIZED_NAME_COMMENT_TEXT)
  @javax.annotation.Nonnull
  private String commentText;

  public static final String SERIALIZED_NAME_SANITIZED_COMMENT_TEXT = "sanitizedCommentText";
  @SerializedName(SERIALIZED_NAME_SANITIZED_COMMENT_TEXT)
  @javax.annotation.Nonnull
  private String sanitizedCommentText;

  public PublicAPIGetCommentTextResponseAnyOf() {
  }

  public PublicAPIGetCommentTextResponseAnyOf status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ImportedAPIStatusSUCCESS getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
    this.status = status;
  }


  public PublicAPIGetCommentTextResponseAnyOf commentText(@javax.annotation.Nonnull String commentText) {
    this.commentText = commentText;
    return this;
  }

  /**
   * Get commentText
   * @return commentText
   */
  @javax.annotation.Nonnull
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(@javax.annotation.Nonnull String commentText) {
    this.commentText = commentText;
  }


  public PublicAPIGetCommentTextResponseAnyOf sanitizedCommentText(@javax.annotation.Nonnull String sanitizedCommentText) {
    this.sanitizedCommentText = sanitizedCommentText;
    return this;
  }

  /**
   * Get sanitizedCommentText
   * @return sanitizedCommentText
   */
  @javax.annotation.Nonnull
  public String getSanitizedCommentText() {
    return sanitizedCommentText;
  }

  public void setSanitizedCommentText(@javax.annotation.Nonnull String sanitizedCommentText) {
    this.sanitizedCommentText = sanitizedCommentText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicAPIGetCommentTextResponseAnyOf publicAPIGetCommentTextResponseAnyOf = (PublicAPIGetCommentTextResponseAnyOf) o;
    return Objects.equals(this.status, publicAPIGetCommentTextResponseAnyOf.status) &&
        Objects.equals(this.commentText, publicAPIGetCommentTextResponseAnyOf.commentText) &&
        Objects.equals(this.sanitizedCommentText, publicAPIGetCommentTextResponseAnyOf.sanitizedCommentText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, commentText, sanitizedCommentText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAPIGetCommentTextResponseAnyOf {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    sanitizedCommentText: ").append(toIndentedString(sanitizedCommentText)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("commentText");
    openapiFields.add("sanitizedCommentText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("commentText");
    openapiRequiredFields.add("sanitizedCommentText");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PublicAPIGetCommentTextResponseAnyOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicAPIGetCommentTextResponseAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicAPIGetCommentTextResponseAnyOf is not found in the empty JSON string", PublicAPIGetCommentTextResponseAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicAPIGetCommentTextResponseAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicAPIGetCommentTextResponseAnyOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicAPIGetCommentTextResponseAnyOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("commentText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentText").toString()));
      }
      if (!jsonObj.get("sanitizedCommentText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sanitizedCommentText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sanitizedCommentText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicAPIGetCommentTextResponseAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicAPIGetCommentTextResponseAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicAPIGetCommentTextResponseAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicAPIGetCommentTextResponseAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicAPIGetCommentTextResponseAnyOf>() {
           @Override
           public void write(JsonWriter out, PublicAPIGetCommentTextResponseAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicAPIGetCommentTextResponseAnyOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PublicAPIGetCommentTextResponseAnyOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublicAPIGetCommentTextResponseAnyOf
   * @throws IOException if the JSON string is invalid with respect to PublicAPIGetCommentTextResponseAnyOf
   */
  public static PublicAPIGetCommentTextResponseAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicAPIGetCommentTextResponseAnyOf.class);
  }

  /**
   * Convert an instance of PublicAPIGetCommentTextResponseAnyOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


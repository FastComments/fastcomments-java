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
import java.util.HashMap;
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
 * CheckBlockedCommentsResponseAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-16T11:11:50.799538535-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class CheckBlockedCommentsResponseAnyOf {
  public static final String SERIALIZED_NAME_COMMENT_STATUSES = "commentStatuses";
  @SerializedName(SERIALIZED_NAME_COMMENT_STATUSES)
  @javax.annotation.Nonnull
  private Map<String, Boolean> commentStatuses = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public CheckBlockedCommentsResponseAnyOf() {
  }

  public CheckBlockedCommentsResponseAnyOf commentStatuses(@javax.annotation.Nonnull Map<String, Boolean> commentStatuses) {
    this.commentStatuses = commentStatuses;
    return this;
  }

  public CheckBlockedCommentsResponseAnyOf putCommentStatusesItem(String key, Boolean commentStatusesItem) {
    if (this.commentStatuses == null) {
      this.commentStatuses = new HashMap<>();
    }
    this.commentStatuses.put(key, commentStatusesItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return commentStatuses
   */
  @javax.annotation.Nonnull
  public Map<String, Boolean> getCommentStatuses() {
    return commentStatuses;
  }

  public void setCommentStatuses(@javax.annotation.Nonnull Map<String, Boolean> commentStatuses) {
    this.commentStatuses = commentStatuses;
  }


  public CheckBlockedCommentsResponseAnyOf status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckBlockedCommentsResponseAnyOf checkBlockedCommentsResponseAnyOf = (CheckBlockedCommentsResponseAnyOf) o;
    return Objects.equals(this.commentStatuses, checkBlockedCommentsResponseAnyOf.commentStatuses) &&
        Objects.equals(this.status, checkBlockedCommentsResponseAnyOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentStatuses, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckBlockedCommentsResponseAnyOf {\n");
    sb.append("    commentStatuses: ").append(toIndentedString(commentStatuses)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("commentStatuses");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commentStatuses");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CheckBlockedCommentsResponseAnyOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckBlockedCommentsResponseAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckBlockedCommentsResponseAnyOf is not found in the empty JSON string", CheckBlockedCommentsResponseAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckBlockedCommentsResponseAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckBlockedCommentsResponseAnyOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckBlockedCommentsResponseAnyOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckBlockedCommentsResponseAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckBlockedCommentsResponseAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckBlockedCommentsResponseAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckBlockedCommentsResponseAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckBlockedCommentsResponseAnyOf>() {
           @Override
           public void write(JsonWriter out, CheckBlockedCommentsResponseAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckBlockedCommentsResponseAnyOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CheckBlockedCommentsResponseAnyOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckBlockedCommentsResponseAnyOf
   * @throws IOException if the JSON string is invalid with respect to CheckBlockedCommentsResponseAnyOf
   */
  public static CheckBlockedCommentsResponseAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckBlockedCommentsResponseAnyOf.class);
  }

  /**
   * Convert an instance of CheckBlockedCommentsResponseAnyOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


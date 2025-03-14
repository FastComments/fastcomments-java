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
import com.fastcomments.model.PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId;
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
 * PublicAPIDeleteCommentResponseAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T21:53:04.228145884-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class PublicAPIDeleteCommentResponseAnyOf {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId comment;

  public static final String SERIALIZED_NAME_HARD_REMOVED = "hardRemoved";
  @SerializedName(SERIALIZED_NAME_HARD_REMOVED)
  @javax.annotation.Nonnull
  private Boolean hardRemoved;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public PublicAPIDeleteCommentResponseAnyOf() {
  }

  public PublicAPIDeleteCommentResponseAnyOf comment(@javax.annotation.Nullable PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId comment) {
    this.comment = comment;
  }


  public PublicAPIDeleteCommentResponseAnyOf hardRemoved(@javax.annotation.Nonnull Boolean hardRemoved) {
    this.hardRemoved = hardRemoved;
    return this;
  }

  /**
   * Get hardRemoved
   * @return hardRemoved
   */
  @javax.annotation.Nonnull
  public Boolean getHardRemoved() {
    return hardRemoved;
  }

  public void setHardRemoved(@javax.annotation.Nonnull Boolean hardRemoved) {
    this.hardRemoved = hardRemoved;
  }


  public PublicAPIDeleteCommentResponseAnyOf status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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
    PublicAPIDeleteCommentResponseAnyOf publicAPIDeleteCommentResponseAnyOf = (PublicAPIDeleteCommentResponseAnyOf) o;
    return Objects.equals(this.comment, publicAPIDeleteCommentResponseAnyOf.comment) &&
        Objects.equals(this.hardRemoved, publicAPIDeleteCommentResponseAnyOf.hardRemoved) &&
        Objects.equals(this.status, publicAPIDeleteCommentResponseAnyOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, hardRemoved, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAPIDeleteCommentResponseAnyOf {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    hardRemoved: ").append(toIndentedString(hardRemoved)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("hardRemoved");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hardRemoved");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PublicAPIDeleteCommentResponseAnyOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicAPIDeleteCommentResponseAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicAPIDeleteCommentResponseAnyOf is not found in the empty JSON string", PublicAPIDeleteCommentResponseAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicAPIDeleteCommentResponseAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicAPIDeleteCommentResponseAnyOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicAPIDeleteCommentResponseAnyOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `comment`
      if (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) {
        PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.validateJsonElement(jsonObj.get("comment"));
      }
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicAPIDeleteCommentResponseAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicAPIDeleteCommentResponseAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicAPIDeleteCommentResponseAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicAPIDeleteCommentResponseAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicAPIDeleteCommentResponseAnyOf>() {
           @Override
           public void write(JsonWriter out, PublicAPIDeleteCommentResponseAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicAPIDeleteCommentResponseAnyOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PublicAPIDeleteCommentResponseAnyOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublicAPIDeleteCommentResponseAnyOf
   * @throws IOException if the JSON string is invalid with respect to PublicAPIDeleteCommentResponseAnyOf
   */
  public static PublicAPIDeleteCommentResponseAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicAPIDeleteCommentResponseAnyOf.class);
  }

  /**
   * Convert an instance of PublicAPIDeleteCommentResponseAnyOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


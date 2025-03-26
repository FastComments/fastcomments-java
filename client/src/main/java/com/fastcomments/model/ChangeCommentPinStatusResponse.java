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
import com.fastcomments.model.ImportedAPIStatusSUCCESS;
import com.fastcomments.model.RecordStringBeforeStringOrNullAfterStringOrNullValue;
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
 * ChangeCommentPinStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T13:48:29.746754041-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class ChangeCommentPinStatusResponse {
  public static final String SERIALIZED_NAME_COMMENT_POSITIONS = "commentPositions";
  @SerializedName(SERIALIZED_NAME_COMMENT_POSITIONS)
  @javax.annotation.Nonnull
  private Map<String, RecordStringBeforeStringOrNullAfterStringOrNullValue> commentPositions = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public ChangeCommentPinStatusResponse() {
  }

  public ChangeCommentPinStatusResponse commentPositions(@javax.annotation.Nonnull Map<String, RecordStringBeforeStringOrNullAfterStringOrNullValue> commentPositions) {
    this.commentPositions = commentPositions;
    return this;
  }

  public ChangeCommentPinStatusResponse putCommentPositionsItem(String key, RecordStringBeforeStringOrNullAfterStringOrNullValue commentPositionsItem) {
    if (this.commentPositions == null) {
      this.commentPositions = new HashMap<>();
    }
    this.commentPositions.put(key, commentPositionsItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return commentPositions
   */
  @javax.annotation.Nonnull
  public Map<String, RecordStringBeforeStringOrNullAfterStringOrNullValue> getCommentPositions() {
    return commentPositions;
  }

  public void setCommentPositions(@javax.annotation.Nonnull Map<String, RecordStringBeforeStringOrNullAfterStringOrNullValue> commentPositions) {
    this.commentPositions = commentPositions;
  }


  public ChangeCommentPinStatusResponse status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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
    ChangeCommentPinStatusResponse changeCommentPinStatusResponse = (ChangeCommentPinStatusResponse) o;
    return Objects.equals(this.commentPositions, changeCommentPinStatusResponse.commentPositions) &&
        Objects.equals(this.status, changeCommentPinStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentPositions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCommentPinStatusResponse {\n");
    sb.append("    commentPositions: ").append(toIndentedString(commentPositions)).append("\n");
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
    openapiFields.add("commentPositions");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commentPositions");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChangeCommentPinStatusResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeCommentPinStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeCommentPinStatusResponse is not found in the empty JSON string", ChangeCommentPinStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeCommentPinStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeCommentPinStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChangeCommentPinStatusResponse.openapiRequiredFields) {
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
       if (!ChangeCommentPinStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeCommentPinStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeCommentPinStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeCommentPinStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeCommentPinStatusResponse>() {
           @Override
           public void write(JsonWriter out, ChangeCommentPinStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeCommentPinStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChangeCommentPinStatusResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChangeCommentPinStatusResponse
   * @throws IOException if the JSON string is invalid with respect to ChangeCommentPinStatusResponse
   */
  public static ChangeCommentPinStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeCommentPinStatusResponse.class);
  }

  /**
   * Convert an instance of ChangeCommentPinStatusResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


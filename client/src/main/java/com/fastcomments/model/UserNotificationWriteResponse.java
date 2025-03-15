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
 * UserNotificationWriteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T19:15:59.035975264-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class UserNotificationWriteResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_MATCHED_COUNT = "matchedCount";
  @SerializedName(SERIALIZED_NAME_MATCHED_COUNT)
  @javax.annotation.Nonnull
  private Double matchedCount;

  public static final String SERIALIZED_NAME_MODIFIED_COUNT = "modifiedCount";
  @SerializedName(SERIALIZED_NAME_MODIFIED_COUNT)
  @javax.annotation.Nonnull
  private Double modifiedCount;

  public UserNotificationWriteResponse() {
  }

  public UserNotificationWriteResponse status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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


  public UserNotificationWriteResponse matchedCount(@javax.annotation.Nonnull Double matchedCount) {
    this.matchedCount = matchedCount;
    return this;
  }

  /**
   * Get matchedCount
   * @return matchedCount
   */
  @javax.annotation.Nonnull
  public Double getMatchedCount() {
    return matchedCount;
  }

  public void setMatchedCount(@javax.annotation.Nonnull Double matchedCount) {
    this.matchedCount = matchedCount;
  }


  public UserNotificationWriteResponse modifiedCount(@javax.annotation.Nonnull Double modifiedCount) {
    this.modifiedCount = modifiedCount;
    return this;
  }

  /**
   * Get modifiedCount
   * @return modifiedCount
   */
  @javax.annotation.Nonnull
  public Double getModifiedCount() {
    return modifiedCount;
  }

  public void setModifiedCount(@javax.annotation.Nonnull Double modifiedCount) {
    this.modifiedCount = modifiedCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationWriteResponse userNotificationWriteResponse = (UserNotificationWriteResponse) o;
    return Objects.equals(this.status, userNotificationWriteResponse.status) &&
        Objects.equals(this.matchedCount, userNotificationWriteResponse.matchedCount) &&
        Objects.equals(this.modifiedCount, userNotificationWriteResponse.modifiedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, matchedCount, modifiedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationWriteResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    matchedCount: ").append(toIndentedString(matchedCount)).append("\n");
    sb.append("    modifiedCount: ").append(toIndentedString(modifiedCount)).append("\n");
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
    openapiFields.add("matchedCount");
    openapiFields.add("modifiedCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("matchedCount");
    openapiRequiredFields.add("modifiedCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserNotificationWriteResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserNotificationWriteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserNotificationWriteResponse is not found in the empty JSON string", UserNotificationWriteResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserNotificationWriteResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserNotificationWriteResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserNotificationWriteResponse.openapiRequiredFields) {
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
       if (!UserNotificationWriteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserNotificationWriteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserNotificationWriteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserNotificationWriteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UserNotificationWriteResponse>() {
           @Override
           public void write(JsonWriter out, UserNotificationWriteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserNotificationWriteResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserNotificationWriteResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserNotificationWriteResponse
   * @throws IOException if the JSON string is invalid with respect to UserNotificationWriteResponse
   */
  public static UserNotificationWriteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserNotificationWriteResponse.class);
  }

  /**
   * Convert an instance of UserNotificationWriteResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


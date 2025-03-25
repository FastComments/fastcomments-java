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
import com.fastcomments.model.FComment;
import com.fastcomments.model.ImportedAPIStatusSUCCESS;
import com.fastcomments.model.UserSessionInfo;
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
 * SaveCommentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T16:43:49.680707237-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class SaveCommentResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nonnull
  private FComment comment;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nullable
  private UserSessionInfo user;

  public static final String SERIALIZED_NAME_MODULE_DATA = "moduleData";
  @SerializedName(SERIALIZED_NAME_MODULE_DATA)
  @javax.annotation.Nullable
  private Map<String, Object> moduleData = new HashMap<>();

  public SaveCommentResponse() {
  }

  public SaveCommentResponse status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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


  public SaveCommentResponse comment(@javax.annotation.Nonnull FComment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nonnull
  public FComment getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nonnull FComment comment) {
    this.comment = comment;
  }


  public SaveCommentResponse user(@javax.annotation.Nullable UserSessionInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public UserSessionInfo getUser() {
    return user;
  }

  public void setUser(@javax.annotation.Nullable UserSessionInfo user) {
    this.user = user;
  }


  public SaveCommentResponse moduleData(@javax.annotation.Nullable Map<String, Object> moduleData) {
    this.moduleData = moduleData;
    return this;
  }

  public SaveCommentResponse putModuleDataItem(String key, Object moduleDataItem) {
    if (this.moduleData == null) {
      this.moduleData = new HashMap<>();
    }
    this.moduleData.put(key, moduleDataItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return moduleData
   */
  @javax.annotation.Nullable
  public Map<String, Object> getModuleData() {
    return moduleData;
  }

  public void setModuleData(@javax.annotation.Nullable Map<String, Object> moduleData) {
    this.moduleData = moduleData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveCommentResponse saveCommentResponse = (SaveCommentResponse) o;
    return Objects.equals(this.status, saveCommentResponse.status) &&
        Objects.equals(this.comment, saveCommentResponse.comment) &&
        Objects.equals(this.user, saveCommentResponse.user) &&
        Objects.equals(this.moduleData, saveCommentResponse.moduleData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, comment, user, moduleData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveCommentResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    moduleData: ").append(toIndentedString(moduleData)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("user");
    openapiFields.add("moduleData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("user");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SaveCommentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaveCommentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveCommentResponse is not found in the empty JSON string", SaveCommentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaveCommentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveCommentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SaveCommentResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
      // validate the required field `comment`
      FComment.validateJsonElement(jsonObj.get("comment"));
      // validate the required field `user`
      UserSessionInfo.validateJsonElement(jsonObj.get("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveCommentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveCommentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveCommentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveCommentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveCommentResponse>() {
           @Override
           public void write(JsonWriter out, SaveCommentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveCommentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SaveCommentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SaveCommentResponse
   * @throws IOException if the JSON string is invalid with respect to SaveCommentResponse
   */
  public static SaveCommentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveCommentResponse.class);
  }

  /**
   * Convert an instance of SaveCommentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


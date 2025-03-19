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
import com.fastcomments.model.PublicComment;
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
 * SaveCommentsResponseWithPresence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-19T12:19:32.030658181-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class SaveCommentsResponseWithPresence {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nonnull
  private PublicComment comment;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nullable
  private UserSessionInfo user;

  public static final String SERIALIZED_NAME_MODULE_DATA = "moduleData";
  @SerializedName(SERIALIZED_NAME_MODULE_DATA)
  @javax.annotation.Nullable
  private Map<String, Object> moduleData = new HashMap<>();

  public static final String SERIALIZED_NAME_USER_ID_W_S = "userIdWS";
  @SerializedName(SERIALIZED_NAME_USER_ID_W_S)
  @javax.annotation.Nullable
  private String userIdWS;

  public SaveCommentsResponseWithPresence() {
  }

  public SaveCommentsResponseWithPresence status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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


  public SaveCommentsResponseWithPresence comment(@javax.annotation.Nonnull PublicComment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nonnull
  public PublicComment getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nonnull PublicComment comment) {
    this.comment = comment;
  }


  public SaveCommentsResponseWithPresence user(@javax.annotation.Nullable UserSessionInfo user) {
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


  public SaveCommentsResponseWithPresence moduleData(@javax.annotation.Nullable Map<String, Object> moduleData) {
    this.moduleData = moduleData;
    return this;
  }

  public SaveCommentsResponseWithPresence putModuleDataItem(String key, Object moduleDataItem) {
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


  public SaveCommentsResponseWithPresence userIdWS(@javax.annotation.Nullable String userIdWS) {
    this.userIdWS = userIdWS;
    return this;
  }

  /**
   * Get userIdWS
   * @return userIdWS
   */
  @javax.annotation.Nullable
  public String getUserIdWS() {
    return userIdWS;
  }

  public void setUserIdWS(@javax.annotation.Nullable String userIdWS) {
    this.userIdWS = userIdWS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveCommentsResponseWithPresence saveCommentsResponseWithPresence = (SaveCommentsResponseWithPresence) o;
    return Objects.equals(this.status, saveCommentsResponseWithPresence.status) &&
        Objects.equals(this.comment, saveCommentsResponseWithPresence.comment) &&
        Objects.equals(this.user, saveCommentsResponseWithPresence.user) &&
        Objects.equals(this.moduleData, saveCommentsResponseWithPresence.moduleData) &&
        Objects.equals(this.userIdWS, saveCommentsResponseWithPresence.userIdWS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, comment, user, moduleData, userIdWS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveCommentsResponseWithPresence {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    moduleData: ").append(toIndentedString(moduleData)).append("\n");
    sb.append("    userIdWS: ").append(toIndentedString(userIdWS)).append("\n");
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
    openapiFields.add("userIdWS");

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
   * @throws IOException if the JSON Element is invalid with respect to SaveCommentsResponseWithPresence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaveCommentsResponseWithPresence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveCommentsResponseWithPresence is not found in the empty JSON string", SaveCommentsResponseWithPresence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaveCommentsResponseWithPresence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveCommentsResponseWithPresence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SaveCommentsResponseWithPresence.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
      // validate the required field `comment`
      PublicComment.validateJsonElement(jsonObj.get("comment"));
      // validate the required field `user`
      UserSessionInfo.validateJsonElement(jsonObj.get("user"));
      if ((jsonObj.get("userIdWS") != null && !jsonObj.get("userIdWS").isJsonNull()) && !jsonObj.get("userIdWS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdWS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIdWS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveCommentsResponseWithPresence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveCommentsResponseWithPresence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveCommentsResponseWithPresence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveCommentsResponseWithPresence.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveCommentsResponseWithPresence>() {
           @Override
           public void write(JsonWriter out, SaveCommentsResponseWithPresence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveCommentsResponseWithPresence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SaveCommentsResponseWithPresence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SaveCommentsResponseWithPresence
   * @throws IOException if the JSON string is invalid with respect to SaveCommentsResponseWithPresence
   */
  public static SaveCommentsResponseWithPresence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveCommentsResponseWithPresence.class);
  }

  /**
   * Convert an instance of SaveCommentsResponseWithPresence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


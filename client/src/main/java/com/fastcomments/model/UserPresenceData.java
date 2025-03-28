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
 * UserPresenceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UserPresenceData {
  public static final String SERIALIZED_NAME_URL_ID_W_S = "urlIdWS";
  @SerializedName(SERIALIZED_NAME_URL_ID_W_S)
  @javax.annotation.Nullable
  private String urlIdWS;

  public static final String SERIALIZED_NAME_USER_ID_W_S = "userIdWS";
  @SerializedName(SERIALIZED_NAME_USER_ID_W_S)
  @javax.annotation.Nullable
  private String userIdWS;

  public static final String SERIALIZED_NAME_TENANT_ID_W_S = "tenantIdWS";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_W_S)
  @javax.annotation.Nullable
  private String tenantIdWS;

  public UserPresenceData() {
  }

  public UserPresenceData urlIdWS(@javax.annotation.Nullable String urlIdWS) {
    this.urlIdWS = urlIdWS;
    return this;
  }

  /**
   * Get urlIdWS
   * @return urlIdWS
   */
  @javax.annotation.Nullable
  public String getUrlIdWS() {
    return urlIdWS;
  }

  public void setUrlIdWS(@javax.annotation.Nullable String urlIdWS) {
    this.urlIdWS = urlIdWS;
  }


  public UserPresenceData userIdWS(@javax.annotation.Nullable String userIdWS) {
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


  public UserPresenceData tenantIdWS(@javax.annotation.Nullable String tenantIdWS) {
    this.tenantIdWS = tenantIdWS;
    return this;
  }

  /**
   * Get tenantIdWS
   * @return tenantIdWS
   */
  @javax.annotation.Nullable
  public String getTenantIdWS() {
    return tenantIdWS;
  }

  public void setTenantIdWS(@javax.annotation.Nullable String tenantIdWS) {
    this.tenantIdWS = tenantIdWS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPresenceData userPresenceData = (UserPresenceData) o;
    return Objects.equals(this.urlIdWS, userPresenceData.urlIdWS) &&
        Objects.equals(this.userIdWS, userPresenceData.userIdWS) &&
        Objects.equals(this.tenantIdWS, userPresenceData.tenantIdWS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlIdWS, userIdWS, tenantIdWS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceData {\n");
    sb.append("    urlIdWS: ").append(toIndentedString(urlIdWS)).append("\n");
    sb.append("    userIdWS: ").append(toIndentedString(userIdWS)).append("\n");
    sb.append("    tenantIdWS: ").append(toIndentedString(tenantIdWS)).append("\n");
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
    openapiFields.add("urlIdWS");
    openapiFields.add("userIdWS");
    openapiFields.add("tenantIdWS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserPresenceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserPresenceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserPresenceData is not found in the empty JSON string", UserPresenceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserPresenceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserPresenceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("urlIdWS") != null && !jsonObj.get("urlIdWS").isJsonNull()) && !jsonObj.get("urlIdWS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlIdWS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlIdWS").toString()));
      }
      if ((jsonObj.get("userIdWS") != null && !jsonObj.get("userIdWS").isJsonNull()) && !jsonObj.get("userIdWS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdWS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIdWS").toString()));
      }
      if ((jsonObj.get("tenantIdWS") != null && !jsonObj.get("tenantIdWS").isJsonNull()) && !jsonObj.get("tenantIdWS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantIdWS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantIdWS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPresenceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPresenceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPresenceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPresenceData.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPresenceData>() {
           @Override
           public void write(JsonWriter out, UserPresenceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserPresenceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserPresenceData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserPresenceData
   * @throws IOException if the JSON string is invalid with respect to UserPresenceData
   */
  public static UserPresenceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserPresenceData.class);
  }

  /**
   * Convert an instance of UserPresenceData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


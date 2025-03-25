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
import java.time.OffsetDateTime;
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
 * EventLogEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T23:58:52.285256603-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class EventLogEntry {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nonnull
  private String tenantId;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  @javax.annotation.Nonnull
  private String urlId;

  public static final String SERIALIZED_NAME_BROADCAST_ID = "broadcastId";
  @SerializedName(SERIALIZED_NAME_BROADCAST_ID)
  @javax.annotation.Nonnull
  private String broadcastId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private String data;

  public EventLogEntry() {
  }

  public EventLogEntry id(@javax.annotation.Nonnull String id) {
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


  public EventLogEntry createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EventLogEntry tenantId(@javax.annotation.Nonnull String tenantId) {
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


  public EventLogEntry urlId(@javax.annotation.Nonnull String urlId) {
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


  public EventLogEntry broadcastId(@javax.annotation.Nonnull String broadcastId) {
    this.broadcastId = broadcastId;
    return this;
  }

  /**
   * Get broadcastId
   * @return broadcastId
   */
  @javax.annotation.Nonnull
  public String getBroadcastId() {
    return broadcastId;
  }

  public void setBroadcastId(@javax.annotation.Nonnull String broadcastId) {
    this.broadcastId = broadcastId;
  }


  public EventLogEntry data(@javax.annotation.Nonnull String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull String data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventLogEntry eventLogEntry = (EventLogEntry) o;
    return Objects.equals(this.id, eventLogEntry.id) &&
        Objects.equals(this.createdAt, eventLogEntry.createdAt) &&
        Objects.equals(this.tenantId, eventLogEntry.tenantId) &&
        Objects.equals(this.urlId, eventLogEntry.urlId) &&
        Objects.equals(this.broadcastId, eventLogEntry.broadcastId) &&
        Objects.equals(this.data, eventLogEntry.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, tenantId, urlId, broadcastId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    broadcastId: ").append(toIndentedString(broadcastId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("tenantId");
    openapiFields.add("urlId");
    openapiFields.add("broadcastId");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("broadcastId");
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventLogEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventLogEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventLogEntry is not found in the empty JSON string", EventLogEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventLogEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventLogEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventLogEntry.openapiRequiredFields) {
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
      if (!jsonObj.get("broadcastId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `broadcastId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("broadcastId").toString()));
      }
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventLogEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventLogEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventLogEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventLogEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<EventLogEntry>() {
           @Override
           public void write(JsonWriter out, EventLogEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventLogEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventLogEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventLogEntry
   * @throws IOException if the JSON string is invalid with respect to EventLogEntry
   */
  public static EventLogEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventLogEntry.class);
  }

  /**
   * Convert an instance of EventLogEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


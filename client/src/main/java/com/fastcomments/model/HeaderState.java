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
import com.fastcomments.model.NotificationAndCount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * HeaderState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T17:00:29.454973715-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class HeaderState {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "NotificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  @javax.annotation.Nonnull
  private Object notificationType;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nonnull
  private String userId;

  public static final String SERIALIZED_NAME_USER_ID_W_S = "userIdWS";
  @SerializedName(SERIALIZED_NAME_USER_ID_W_S)
  @javax.annotation.Nonnull
  private String userIdWS;

  public static final String SERIALIZED_NAME_NOTIFICATION_COUNTS = "notificationCounts";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_COUNTS)
  @javax.annotation.Nonnull
  private List<NotificationAndCount> notificationCounts = new ArrayList<>();

  public HeaderState() {
  }

  public HeaderState status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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


  public HeaderState notificationType(@javax.annotation.Nonnull Object notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
   */
  @javax.annotation.Nonnull
  public Object getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(@javax.annotation.Nonnull Object notificationType) {
    this.notificationType = notificationType;
  }


  public HeaderState userId(@javax.annotation.Nonnull String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nonnull String userId) {
    this.userId = userId;
  }


  public HeaderState userIdWS(@javax.annotation.Nonnull String userIdWS) {
    this.userIdWS = userIdWS;
    return this;
  }

  /**
   * Get userIdWS
   * @return userIdWS
   */
  @javax.annotation.Nonnull
  public String getUserIdWS() {
    return userIdWS;
  }

  public void setUserIdWS(@javax.annotation.Nonnull String userIdWS) {
    this.userIdWS = userIdWS;
  }


  public HeaderState notificationCounts(@javax.annotation.Nonnull List<NotificationAndCount> notificationCounts) {
    this.notificationCounts = notificationCounts;
    return this;
  }

  public HeaderState addNotificationCountsItem(NotificationAndCount notificationCountsItem) {
    if (this.notificationCounts == null) {
      this.notificationCounts = new ArrayList<>();
    }
    this.notificationCounts.add(notificationCountsItem);
    return this;
  }

  /**
   * Get notificationCounts
   * @return notificationCounts
   */
  @javax.annotation.Nonnull
  public List<NotificationAndCount> getNotificationCounts() {
    return notificationCounts;
  }

  public void setNotificationCounts(@javax.annotation.Nonnull List<NotificationAndCount> notificationCounts) {
    this.notificationCounts = notificationCounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderState headerState = (HeaderState) o;
    return Objects.equals(this.status, headerState.status) &&
        Objects.equals(this.notificationType, headerState.notificationType) &&
        Objects.equals(this.userId, headerState.userId) &&
        Objects.equals(this.userIdWS, headerState.userIdWS) &&
        Objects.equals(this.notificationCounts, headerState.notificationCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, notificationType, userId, userIdWS, notificationCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderState {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userIdWS: ").append(toIndentedString(userIdWS)).append("\n");
    sb.append("    notificationCounts: ").append(toIndentedString(notificationCounts)).append("\n");
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
    openapiFields.add("NotificationType");
    openapiFields.add("userId");
    openapiFields.add("userIdWS");
    openapiFields.add("notificationCounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("NotificationType");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("userIdWS");
    openapiRequiredFields.add("notificationCounts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HeaderState
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HeaderState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HeaderState is not found in the empty JSON string", HeaderState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HeaderState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HeaderState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HeaderState.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("userIdWS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdWS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIdWS").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("notificationCounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationCounts` to be an array in the JSON string but got `%s`", jsonObj.get("notificationCounts").toString()));
      }

      JsonArray jsonArraynotificationCounts = jsonObj.getAsJsonArray("notificationCounts");
      // validate the required field `notificationCounts` (array)
      for (int i = 0; i < jsonArraynotificationCounts.size(); i++) {
        NotificationAndCount.validateJsonElement(jsonArraynotificationCounts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HeaderState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HeaderState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HeaderState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HeaderState.class));

       return (TypeAdapter<T>) new TypeAdapter<HeaderState>() {
           @Override
           public void write(JsonWriter out, HeaderState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HeaderState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HeaderState given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HeaderState
   * @throws IOException if the JSON string is invalid with respect to HeaderState
   */
  public static HeaderState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HeaderState.class);
  }

  /**
   * Convert an instance of HeaderState to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


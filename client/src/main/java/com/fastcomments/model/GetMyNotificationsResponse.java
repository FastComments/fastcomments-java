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
import com.fastcomments.model.RenderableUserNotification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * GetMyNotificationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T00:29:23.180320485-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetMyNotificationsResponse {
  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  @javax.annotation.Nullable
  private Map<String, String> translations = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED = "isSubscribed";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED)
  @javax.annotation.Nonnull
  private Boolean isSubscribed;

  public static final String SERIALIZED_NAME_HAS_MORE = "hasMore";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  @javax.annotation.Nonnull
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  @javax.annotation.Nonnull
  private List<RenderableUserNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public GetMyNotificationsResponse() {
  }

  public GetMyNotificationsResponse translations(@javax.annotation.Nullable Map<String, String> translations) {
    this.translations = translations;
    return this;
  }

  public GetMyNotificationsResponse putTranslationsItem(String key, String translationsItem) {
    if (this.translations == null) {
      this.translations = new HashMap<>();
    }
    this.translations.put(key, translationsItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return translations
   */
  @javax.annotation.Nullable
  public Map<String, String> getTranslations() {
    return translations;
  }

  public void setTranslations(@javax.annotation.Nullable Map<String, String> translations) {
    this.translations = translations;
  }


  public GetMyNotificationsResponse isSubscribed(@javax.annotation.Nonnull Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
    return this;
  }

  /**
   * Get isSubscribed
   * @return isSubscribed
   */
  @javax.annotation.Nonnull
  public Boolean getIsSubscribed() {
    return isSubscribed;
  }

  public void setIsSubscribed(@javax.annotation.Nonnull Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }


  public GetMyNotificationsResponse hasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @javax.annotation.Nonnull
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public GetMyNotificationsResponse notifications(@javax.annotation.Nonnull List<RenderableUserNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public GetMyNotificationsResponse addNotificationsItem(RenderableUserNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   */
  @javax.annotation.Nonnull
  public List<RenderableUserNotification> getNotifications() {
    return notifications;
  }

  public void setNotifications(@javax.annotation.Nonnull List<RenderableUserNotification> notifications) {
    this.notifications = notifications;
  }


  public GetMyNotificationsResponse status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
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
    GetMyNotificationsResponse getMyNotificationsResponse = (GetMyNotificationsResponse) o;
    return Objects.equals(this.translations, getMyNotificationsResponse.translations) &&
        Objects.equals(this.isSubscribed, getMyNotificationsResponse.isSubscribed) &&
        Objects.equals(this.hasMore, getMyNotificationsResponse.hasMore) &&
        Objects.equals(this.notifications, getMyNotificationsResponse.notifications) &&
        Objects.equals(this.status, getMyNotificationsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations, isSubscribed, hasMore, notifications, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMyNotificationsResponse {\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
    openapiFields.add("translations");
    openapiFields.add("isSubscribed");
    openapiFields.add("hasMore");
    openapiFields.add("notifications");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isSubscribed");
    openapiRequiredFields.add("hasMore");
    openapiRequiredFields.add("notifications");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMyNotificationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMyNotificationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMyNotificationsResponse is not found in the empty JSON string", GetMyNotificationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMyNotificationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMyNotificationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMyNotificationsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("notifications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
      }

      JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
      // validate the required field `notifications` (array)
      for (int i = 0; i < jsonArraynotifications.size(); i++) {
        RenderableUserNotification.validateJsonElement(jsonArraynotifications.get(i));
      };
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMyNotificationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMyNotificationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMyNotificationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMyNotificationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMyNotificationsResponse>() {
           @Override
           public void write(JsonWriter out, GetMyNotificationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMyNotificationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetMyNotificationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMyNotificationsResponse
   * @throws IOException if the JSON string is invalid with respect to GetMyNotificationsResponse
   */
  public static GetMyNotificationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMyNotificationsResponse.class);
  }

  /**
   * Convert an instance of GetMyNotificationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


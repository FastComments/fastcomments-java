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
 * UserBadge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UserBadge {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nonnull
  private String userId;

  public static final String SERIALIZED_NAME_BADGE_ID = "badgeId";
  @SerializedName(SERIALIZED_NAME_BADGE_ID)
  @javax.annotation.Nonnull
  private String badgeId;

  public static final String SERIALIZED_NAME_FROM_TENANT_ID = "fromTenantId";
  @SerializedName(SERIALIZED_NAME_FROM_TENANT_ID)
  @javax.annotation.Nonnull
  private String fromTenantId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private Double type;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  @javax.annotation.Nonnull
  private Double threshold;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  @javax.annotation.Nonnull
  private String displayLabel;

  public static final String SERIALIZED_NAME_DISPLAY_SRC = "displaySrc";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SRC)
  @javax.annotation.Nullable
  private String displaySrc;

  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  @javax.annotation.Nullable
  private String backgroundColor;

  public static final String SERIALIZED_NAME_BORDER_COLOR = "borderColor";
  @SerializedName(SERIALIZED_NAME_BORDER_COLOR)
  @javax.annotation.Nullable
  private String borderColor;

  public static final String SERIALIZED_NAME_TEXT_COLOR = "textColor";
  @SerializedName(SERIALIZED_NAME_TEXT_COLOR)
  @javax.annotation.Nullable
  private String textColor;

  public static final String SERIALIZED_NAME_CSS_CLASS = "cssClass";
  @SerializedName(SERIALIZED_NAME_CSS_CLASS)
  @javax.annotation.Nullable
  private String cssClass;

  public static final String SERIALIZED_NAME_VETERAN_USER_THRESHOLD_MILLIS = "veteranUserThresholdMillis";
  @SerializedName(SERIALIZED_NAME_VETERAN_USER_THRESHOLD_MILLIS)
  @javax.annotation.Nonnull
  private Double veteranUserThresholdMillis;

  public static final String SERIALIZED_NAME_DISPLAYED_ON_COMMENTS = "displayedOnComments";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_ON_COMMENTS)
  @javax.annotation.Nonnull
  private Boolean displayedOnComments;

  public static final String SERIALIZED_NAME_RECEIVED_AT = "receivedAt";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime receivedAt;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private Double order;

  public UserBadge() {
  }

  public UserBadge id(@javax.annotation.Nonnull String id) {
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


  public UserBadge userId(@javax.annotation.Nonnull String userId) {
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


  public UserBadge badgeId(@javax.annotation.Nonnull String badgeId) {
    this.badgeId = badgeId;
    return this;
  }

  /**
   * Get badgeId
   * @return badgeId
   */
  @javax.annotation.Nonnull
  public String getBadgeId() {
    return badgeId;
  }

  public void setBadgeId(@javax.annotation.Nonnull String badgeId) {
    this.badgeId = badgeId;
  }


  public UserBadge fromTenantId(@javax.annotation.Nonnull String fromTenantId) {
    this.fromTenantId = fromTenantId;
    return this;
  }

  /**
   * Get fromTenantId
   * @return fromTenantId
   */
  @javax.annotation.Nonnull
  public String getFromTenantId() {
    return fromTenantId;
  }

  public void setFromTenantId(@javax.annotation.Nonnull String fromTenantId) {
    this.fromTenantId = fromTenantId;
  }


  public UserBadge createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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


  public UserBadge type(@javax.annotation.Nonnull Double type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public Double getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull Double type) {
    this.type = type;
  }


  public UserBadge threshold(@javax.annotation.Nonnull Double threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @javax.annotation.Nonnull
  public Double getThreshold() {
    return threshold;
  }

  public void setThreshold(@javax.annotation.Nonnull Double threshold) {
    this.threshold = threshold;
  }


  public UserBadge description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public UserBadge displayLabel(@javax.annotation.Nonnull String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
   */
  @javax.annotation.Nonnull
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(@javax.annotation.Nonnull String displayLabel) {
    this.displayLabel = displayLabel;
  }


  public UserBadge displaySrc(@javax.annotation.Nullable String displaySrc) {
    this.displaySrc = displaySrc;
    return this;
  }

  /**
   * Get displaySrc
   * @return displaySrc
   */
  @javax.annotation.Nullable
  public String getDisplaySrc() {
    return displaySrc;
  }

  public void setDisplaySrc(@javax.annotation.Nullable String displaySrc) {
    this.displaySrc = displaySrc;
  }


  public UserBadge backgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  @javax.annotation.Nullable
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public UserBadge borderColor(@javax.annotation.Nullable String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Get borderColor
   * @return borderColor
   */
  @javax.annotation.Nullable
  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(@javax.annotation.Nullable String borderColor) {
    this.borderColor = borderColor;
  }


  public UserBadge textColor(@javax.annotation.Nullable String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
   */
  @javax.annotation.Nullable
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(@javax.annotation.Nullable String textColor) {
    this.textColor = textColor;
  }


  public UserBadge cssClass(@javax.annotation.Nullable String cssClass) {
    this.cssClass = cssClass;
    return this;
  }

  /**
   * Get cssClass
   * @return cssClass
   */
  @javax.annotation.Nullable
  public String getCssClass() {
    return cssClass;
  }

  public void setCssClass(@javax.annotation.Nullable String cssClass) {
    this.cssClass = cssClass;
  }


  public UserBadge veteranUserThresholdMillis(@javax.annotation.Nonnull Double veteranUserThresholdMillis) {
    this.veteranUserThresholdMillis = veteranUserThresholdMillis;
    return this;
  }

  /**
   * Get veteranUserThresholdMillis
   * @return veteranUserThresholdMillis
   */
  @javax.annotation.Nonnull
  public Double getVeteranUserThresholdMillis() {
    return veteranUserThresholdMillis;
  }

  public void setVeteranUserThresholdMillis(@javax.annotation.Nonnull Double veteranUserThresholdMillis) {
    this.veteranUserThresholdMillis = veteranUserThresholdMillis;
  }


  public UserBadge displayedOnComments(@javax.annotation.Nonnull Boolean displayedOnComments) {
    this.displayedOnComments = displayedOnComments;
    return this;
  }

  /**
   * Get displayedOnComments
   * @return displayedOnComments
   */
  @javax.annotation.Nonnull
  public Boolean getDisplayedOnComments() {
    return displayedOnComments;
  }

  public void setDisplayedOnComments(@javax.annotation.Nonnull Boolean displayedOnComments) {
    this.displayedOnComments = displayedOnComments;
  }


  public UserBadge receivedAt(@javax.annotation.Nonnull OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  /**
   * Get receivedAt
   * @return receivedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(@javax.annotation.Nonnull OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }


  public UserBadge order(@javax.annotation.Nullable Double order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  public Double getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nullable Double order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBadge userBadge = (UserBadge) o;
    return Objects.equals(this.id, userBadge.id) &&
        Objects.equals(this.userId, userBadge.userId) &&
        Objects.equals(this.badgeId, userBadge.badgeId) &&
        Objects.equals(this.fromTenantId, userBadge.fromTenantId) &&
        Objects.equals(this.createdAt, userBadge.createdAt) &&
        Objects.equals(this.type, userBadge.type) &&
        Objects.equals(this.threshold, userBadge.threshold) &&
        Objects.equals(this.description, userBadge.description) &&
        Objects.equals(this.displayLabel, userBadge.displayLabel) &&
        Objects.equals(this.displaySrc, userBadge.displaySrc) &&
        Objects.equals(this.backgroundColor, userBadge.backgroundColor) &&
        Objects.equals(this.borderColor, userBadge.borderColor) &&
        Objects.equals(this.textColor, userBadge.textColor) &&
        Objects.equals(this.cssClass, userBadge.cssClass) &&
        Objects.equals(this.veteranUserThresholdMillis, userBadge.veteranUserThresholdMillis) &&
        Objects.equals(this.displayedOnComments, userBadge.displayedOnComments) &&
        Objects.equals(this.receivedAt, userBadge.receivedAt) &&
        Objects.equals(this.order, userBadge.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, badgeId, fromTenantId, createdAt, type, threshold, description, displayLabel, displaySrc, backgroundColor, borderColor, textColor, cssClass, veteranUserThresholdMillis, displayedOnComments, receivedAt, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBadge {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
    sb.append("    fromTenantId: ").append(toIndentedString(fromTenantId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displaySrc: ").append(toIndentedString(displaySrc)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    cssClass: ").append(toIndentedString(cssClass)).append("\n");
    sb.append("    veteranUserThresholdMillis: ").append(toIndentedString(veteranUserThresholdMillis)).append("\n");
    sb.append("    displayedOnComments: ").append(toIndentedString(displayedOnComments)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("badgeId");
    openapiFields.add("fromTenantId");
    openapiFields.add("createdAt");
    openapiFields.add("type");
    openapiFields.add("threshold");
    openapiFields.add("description");
    openapiFields.add("displayLabel");
    openapiFields.add("displaySrc");
    openapiFields.add("backgroundColor");
    openapiFields.add("borderColor");
    openapiFields.add("textColor");
    openapiFields.add("cssClass");
    openapiFields.add("veteranUserThresholdMillis");
    openapiFields.add("displayedOnComments");
    openapiFields.add("receivedAt");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("badgeId");
    openapiRequiredFields.add("fromTenantId");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("threshold");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("displayLabel");
    openapiRequiredFields.add("veteranUserThresholdMillis");
    openapiRequiredFields.add("displayedOnComments");
    openapiRequiredFields.add("receivedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserBadge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserBadge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserBadge is not found in the empty JSON string", UserBadge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserBadge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserBadge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserBadge.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("badgeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badgeId").toString()));
      }
      if (!jsonObj.get("fromTenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromTenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromTenantId").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("displayLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayLabel").toString()));
      }
      if ((jsonObj.get("displaySrc") != null && !jsonObj.get("displaySrc").isJsonNull()) && !jsonObj.get("displaySrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displaySrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displaySrc").toString()));
      }
      if ((jsonObj.get("backgroundColor") != null && !jsonObj.get("backgroundColor").isJsonNull()) && !jsonObj.get("backgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundColor").toString()));
      }
      if ((jsonObj.get("borderColor") != null && !jsonObj.get("borderColor").isJsonNull()) && !jsonObj.get("borderColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `borderColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("borderColor").toString()));
      }
      if ((jsonObj.get("textColor") != null && !jsonObj.get("textColor").isJsonNull()) && !jsonObj.get("textColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textColor").toString()));
      }
      if ((jsonObj.get("cssClass") != null && !jsonObj.get("cssClass").isJsonNull()) && !jsonObj.get("cssClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cssClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cssClass").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserBadge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserBadge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserBadge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserBadge.class));

       return (TypeAdapter<T>) new TypeAdapter<UserBadge>() {
           @Override
           public void write(JsonWriter out, UserBadge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserBadge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserBadge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserBadge
   * @throws IOException if the JSON string is invalid with respect to UserBadge
   */
  public static UserBadge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserBadge.class);
  }

  /**
   * Convert an instance of UserBadge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


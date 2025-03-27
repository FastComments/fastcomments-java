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
 * CommentUserBadgeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T16:54:18.418110633-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class CommentUserBadgeInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private Double type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  @javax.annotation.Nullable
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

  public CommentUserBadgeInfo() {
  }

  public CommentUserBadgeInfo id(@javax.annotation.Nonnull String id) {
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


  public CommentUserBadgeInfo type(@javax.annotation.Nonnull Double type) {
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


  public CommentUserBadgeInfo description(@javax.annotation.Nonnull String description) {
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


  public CommentUserBadgeInfo displayLabel(@javax.annotation.Nullable String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
   */
  @javax.annotation.Nullable
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(@javax.annotation.Nullable String displayLabel) {
    this.displayLabel = displayLabel;
  }


  public CommentUserBadgeInfo displaySrc(@javax.annotation.Nullable String displaySrc) {
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


  public CommentUserBadgeInfo backgroundColor(@javax.annotation.Nullable String backgroundColor) {
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


  public CommentUserBadgeInfo borderColor(@javax.annotation.Nullable String borderColor) {
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


  public CommentUserBadgeInfo textColor(@javax.annotation.Nullable String textColor) {
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


  public CommentUserBadgeInfo cssClass(@javax.annotation.Nullable String cssClass) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentUserBadgeInfo commentUserBadgeInfo = (CommentUserBadgeInfo) o;
    return Objects.equals(this.id, commentUserBadgeInfo.id) &&
        Objects.equals(this.type, commentUserBadgeInfo.type) &&
        Objects.equals(this.description, commentUserBadgeInfo.description) &&
        Objects.equals(this.displayLabel, commentUserBadgeInfo.displayLabel) &&
        Objects.equals(this.displaySrc, commentUserBadgeInfo.displaySrc) &&
        Objects.equals(this.backgroundColor, commentUserBadgeInfo.backgroundColor) &&
        Objects.equals(this.borderColor, commentUserBadgeInfo.borderColor) &&
        Objects.equals(this.textColor, commentUserBadgeInfo.textColor) &&
        Objects.equals(this.cssClass, commentUserBadgeInfo.cssClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, description, displayLabel, displaySrc, backgroundColor, borderColor, textColor, cssClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentUserBadgeInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displaySrc: ").append(toIndentedString(displaySrc)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    cssClass: ").append(toIndentedString(cssClass)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("displayLabel");
    openapiFields.add("displaySrc");
    openapiFields.add("backgroundColor");
    openapiFields.add("borderColor");
    openapiFields.add("textColor");
    openapiFields.add("cssClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentUserBadgeInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentUserBadgeInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentUserBadgeInfo is not found in the empty JSON string", CommentUserBadgeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentUserBadgeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentUserBadgeInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommentUserBadgeInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("displayLabel") != null && !jsonObj.get("displayLabel").isJsonNull()) && !jsonObj.get("displayLabel").isJsonPrimitive()) {
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
       if (!CommentUserBadgeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentUserBadgeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentUserBadgeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentUserBadgeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentUserBadgeInfo>() {
           @Override
           public void write(JsonWriter out, CommentUserBadgeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentUserBadgeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentUserBadgeInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentUserBadgeInfo
   * @throws IOException if the JSON string is invalid with respect to CommentUserBadgeInfo
   */
  public static CommentUserBadgeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentUserBadgeInfo.class);
  }

  /**
   * Convert an instance of CommentUserBadgeInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


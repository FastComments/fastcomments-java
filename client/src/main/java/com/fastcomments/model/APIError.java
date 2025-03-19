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
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.ImportedAPIStatusFAILED;
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
 * APIError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T18:22:15.331392007-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class APIError {
  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  @javax.annotation.Nullable
  private Double statusCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusFAILED status;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nonnull
  private String reason;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nonnull
  private String code;

  public static final String SERIALIZED_NAME_SECONDARY_CODE = "secondaryCode";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CODE)
  @javax.annotation.Nullable
  private String secondaryCode;

  public static final String SERIALIZED_NAME_BANNED_UNTIL = "bannedUntil";
  @SerializedName(SERIALIZED_NAME_BANNED_UNTIL)
  @javax.annotation.Nullable
  private Double bannedUntil;

  public static final String SERIALIZED_NAME_MAX_CHARACTER_LENGTH = "maxCharacterLength";
  @SerializedName(SERIALIZED_NAME_MAX_CHARACTER_LENGTH)
  @javax.annotation.Nullable
  private Double maxCharacterLength;

  public static final String SERIALIZED_NAME_TRANSLATED_ERROR = "translatedError";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_ERROR)
  @javax.annotation.Nullable
  private String translatedError;

  public static final String SERIALIZED_NAME_CUSTOM_CONFIG = "customConfig";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CONFIG)
  @javax.annotation.Nullable
  private CustomConfigParameters customConfig;

  public APIError() {
  }

  public APIError statusCode(@javax.annotation.Nullable Double statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Double getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@javax.annotation.Nullable Double statusCode) {
    this.statusCode = statusCode;
  }


  public APIError status(@javax.annotation.Nonnull ImportedAPIStatusFAILED status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ImportedAPIStatusFAILED getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull ImportedAPIStatusFAILED status) {
    this.status = status;
  }


  public APIError reason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nonnull
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
  }


  public APIError code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public APIError secondaryCode(@javax.annotation.Nullable String secondaryCode) {
    this.secondaryCode = secondaryCode;
    return this;
  }

  /**
   * Get secondaryCode
   * @return secondaryCode
   */
  @javax.annotation.Nullable
  public String getSecondaryCode() {
    return secondaryCode;
  }

  public void setSecondaryCode(@javax.annotation.Nullable String secondaryCode) {
    this.secondaryCode = secondaryCode;
  }


  public APIError bannedUntil(@javax.annotation.Nullable Double bannedUntil) {
    this.bannedUntil = bannedUntil;
    return this;
  }

  /**
   * Get bannedUntil
   * @return bannedUntil
   */
  @javax.annotation.Nullable
  public Double getBannedUntil() {
    return bannedUntil;
  }

  public void setBannedUntil(@javax.annotation.Nullable Double bannedUntil) {
    this.bannedUntil = bannedUntil;
  }


  public APIError maxCharacterLength(@javax.annotation.Nullable Double maxCharacterLength) {
    this.maxCharacterLength = maxCharacterLength;
    return this;
  }

  /**
   * Get maxCharacterLength
   * @return maxCharacterLength
   */
  @javax.annotation.Nullable
  public Double getMaxCharacterLength() {
    return maxCharacterLength;
  }

  public void setMaxCharacterLength(@javax.annotation.Nullable Double maxCharacterLength) {
    this.maxCharacterLength = maxCharacterLength;
  }


  public APIError translatedError(@javax.annotation.Nullable String translatedError) {
    this.translatedError = translatedError;
    return this;
  }

  /**
   * Get translatedError
   * @return translatedError
   */
  @javax.annotation.Nullable
  public String getTranslatedError() {
    return translatedError;
  }

  public void setTranslatedError(@javax.annotation.Nullable String translatedError) {
    this.translatedError = translatedError;
  }


  public APIError customConfig(@javax.annotation.Nullable CustomConfigParameters customConfig) {
    this.customConfig = customConfig;
    return this;
  }

  /**
   * Get customConfig
   * @return customConfig
   */
  @javax.annotation.Nullable
  public CustomConfigParameters getCustomConfig() {
    return customConfig;
  }

  public void setCustomConfig(@javax.annotation.Nullable CustomConfigParameters customConfig) {
    this.customConfig = customConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIError apIError = (APIError) o;
    return Objects.equals(this.statusCode, apIError.statusCode) &&
        Objects.equals(this.status, apIError.status) &&
        Objects.equals(this.reason, apIError.reason) &&
        Objects.equals(this.code, apIError.code) &&
        Objects.equals(this.secondaryCode, apIError.secondaryCode) &&
        Objects.equals(this.bannedUntil, apIError.bannedUntil) &&
        Objects.equals(this.maxCharacterLength, apIError.maxCharacterLength) &&
        Objects.equals(this.translatedError, apIError.translatedError) &&
        Objects.equals(this.customConfig, apIError.customConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, status, reason, code, secondaryCode, bannedUntil, maxCharacterLength, translatedError, customConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    secondaryCode: ").append(toIndentedString(secondaryCode)).append("\n");
    sb.append("    bannedUntil: ").append(toIndentedString(bannedUntil)).append("\n");
    sb.append("    maxCharacterLength: ").append(toIndentedString(maxCharacterLength)).append("\n");
    sb.append("    translatedError: ").append(toIndentedString(translatedError)).append("\n");
    sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
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
    openapiFields.add("statusCode");
    openapiFields.add("status");
    openapiFields.add("reason");
    openapiFields.add("code");
    openapiFields.add("secondaryCode");
    openapiFields.add("bannedUntil");
    openapiFields.add("maxCharacterLength");
    openapiFields.add("translatedError");
    openapiFields.add("customConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("code");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to APIError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!APIError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIError is not found in the empty JSON string", APIError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!APIError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIError.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusFAILED.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("secondaryCode") != null && !jsonObj.get("secondaryCode").isJsonNull()) && !jsonObj.get("secondaryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryCode").toString()));
      }
      if ((jsonObj.get("translatedError") != null && !jsonObj.get("translatedError").isJsonNull()) && !jsonObj.get("translatedError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `translatedError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("translatedError").toString()));
      }
      // validate the optional field `customConfig`
      if (jsonObj.get("customConfig") != null && !jsonObj.get("customConfig").isJsonNull()) {
        CustomConfigParameters.validateJsonElement(jsonObj.get("customConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

       return (TypeAdapter<T>) new TypeAdapter<APIError>() {
           @Override
           public void write(JsonWriter out, APIError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of APIError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of APIError
   * @throws IOException if the JSON string is invalid with respect to APIError
   */
  public static APIError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIError.class);
  }

  /**
   * Convert an instance of APIError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


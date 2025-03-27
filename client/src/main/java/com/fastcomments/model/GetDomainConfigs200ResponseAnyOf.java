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
 * GetDomainConfigs200ResponseAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T17:06:48.661467821-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetDomainConfigs200ResponseAnyOf {
  public static final String SERIALIZED_NAME_CONFIGURATIONS = "configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  @javax.annotation.Nullable
  private Object configurations = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private Object status = null;

  public GetDomainConfigs200ResponseAnyOf() {
  }

  public GetDomainConfigs200ResponseAnyOf configurations(@javax.annotation.Nullable Object configurations) {
    this.configurations = configurations;
    return this;
  }

  /**
   * Get configurations
   * @return configurations
   */
  @javax.annotation.Nullable
  public Object getConfigurations() {
    return configurations;
  }

  public void setConfigurations(@javax.annotation.Nullable Object configurations) {
    this.configurations = configurations;
  }


  public GetDomainConfigs200ResponseAnyOf status(@javax.annotation.Nullable Object status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Object getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable Object status) {
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
    GetDomainConfigs200ResponseAnyOf getDomainConfigs200ResponseAnyOf = (GetDomainConfigs200ResponseAnyOf) o;
    return Objects.equals(this.configurations, getDomainConfigs200ResponseAnyOf.configurations) &&
        Objects.equals(this.status, getDomainConfigs200ResponseAnyOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDomainConfigs200ResponseAnyOf {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
    openapiFields.add("configurations");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurations");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDomainConfigs200ResponseAnyOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDomainConfigs200ResponseAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDomainConfigs200ResponseAnyOf is not found in the empty JSON string", GetDomainConfigs200ResponseAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDomainConfigs200ResponseAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDomainConfigs200ResponseAnyOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDomainConfigs200ResponseAnyOf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDomainConfigs200ResponseAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDomainConfigs200ResponseAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDomainConfigs200ResponseAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDomainConfigs200ResponseAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDomainConfigs200ResponseAnyOf>() {
           @Override
           public void write(JsonWriter out, GetDomainConfigs200ResponseAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDomainConfigs200ResponseAnyOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDomainConfigs200ResponseAnyOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDomainConfigs200ResponseAnyOf
   * @throws IOException if the JSON string is invalid with respect to GetDomainConfigs200ResponseAnyOf
   */
  public static GetDomainConfigs200ResponseAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDomainConfigs200ResponseAnyOf.class);
  }

  /**
   * Convert an instance of GetDomainConfigs200ResponseAnyOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


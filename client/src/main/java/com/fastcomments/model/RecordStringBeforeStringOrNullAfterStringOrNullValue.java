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
 * RecordStringBeforeStringOrNullAfterStringOrNullValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T09:09:23.339081741-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class RecordStringBeforeStringOrNullAfterStringOrNullValue {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  @javax.annotation.Nonnull
  private String after;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  @javax.annotation.Nonnull
  private String before;

  public RecordStringBeforeStringOrNullAfterStringOrNullValue() {
  }

  public RecordStringBeforeStringOrNullAfterStringOrNullValue after(@javax.annotation.Nonnull String after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   */
  @javax.annotation.Nonnull
  public String getAfter() {
    return after;
  }

  public void setAfter(@javax.annotation.Nonnull String after) {
    this.after = after;
  }


  public RecordStringBeforeStringOrNullAfterStringOrNullValue before(@javax.annotation.Nonnull String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
   */
  @javax.annotation.Nonnull
  public String getBefore() {
    return before;
  }

  public void setBefore(@javax.annotation.Nonnull String before) {
    this.before = before;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordStringBeforeStringOrNullAfterStringOrNullValue recordStringBeforeStringOrNullAfterStringOrNullValue = (RecordStringBeforeStringOrNullAfterStringOrNullValue) o;
    return Objects.equals(this.after, recordStringBeforeStringOrNullAfterStringOrNullValue.after) &&
        Objects.equals(this.before, recordStringBeforeStringOrNullAfterStringOrNullValue.before);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordStringBeforeStringOrNullAfterStringOrNullValue {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("before");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("before");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordStringBeforeStringOrNullAfterStringOrNullValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordStringBeforeStringOrNullAfterStringOrNullValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordStringBeforeStringOrNullAfterStringOrNullValue is not found in the empty JSON string", RecordStringBeforeStringOrNullAfterStringOrNullValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordStringBeforeStringOrNullAfterStringOrNullValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordStringBeforeStringOrNullAfterStringOrNullValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecordStringBeforeStringOrNullAfterStringOrNullValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      if (!jsonObj.get("before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordStringBeforeStringOrNullAfterStringOrNullValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordStringBeforeStringOrNullAfterStringOrNullValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordStringBeforeStringOrNullAfterStringOrNullValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordStringBeforeStringOrNullAfterStringOrNullValue.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordStringBeforeStringOrNullAfterStringOrNullValue>() {
           @Override
           public void write(JsonWriter out, RecordStringBeforeStringOrNullAfterStringOrNullValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordStringBeforeStringOrNullAfterStringOrNullValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordStringBeforeStringOrNullAfterStringOrNullValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordStringBeforeStringOrNullAfterStringOrNullValue
   * @throws IOException if the JSON string is invalid with respect to RecordStringBeforeStringOrNullAfterStringOrNullValue
   */
  public static RecordStringBeforeStringOrNullAfterStringOrNullValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordStringBeforeStringOrNullAfterStringOrNullValue.class);
  }

  /**
   * Convert an instance of RecordStringBeforeStringOrNullAfterStringOrNullValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


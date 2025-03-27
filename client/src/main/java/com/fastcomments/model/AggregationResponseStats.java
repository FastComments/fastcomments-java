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
 * AggregationResponseStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AggregationResponseStats {
  public static final String SERIALIZED_NAME_TIME_M_S = "timeMS";
  @SerializedName(SERIALIZED_NAME_TIME_M_S)
  @javax.annotation.Nonnull
  private Double timeMS;

  public static final String SERIALIZED_NAME_SCANNED = "scanned";
  @SerializedName(SERIALIZED_NAME_SCANNED)
  @javax.annotation.Nonnull
  private Double scanned;

  public AggregationResponseStats() {
  }

  public AggregationResponseStats timeMS(@javax.annotation.Nonnull Double timeMS) {
    this.timeMS = timeMS;
    return this;
  }

  /**
   * Get timeMS
   * @return timeMS
   */
  @javax.annotation.Nonnull
  public Double getTimeMS() {
    return timeMS;
  }

  public void setTimeMS(@javax.annotation.Nonnull Double timeMS) {
    this.timeMS = timeMS;
  }


  public AggregationResponseStats scanned(@javax.annotation.Nonnull Double scanned) {
    this.scanned = scanned;
    return this;
  }

  /**
   * Get scanned
   * @return scanned
   */
  @javax.annotation.Nonnull
  public Double getScanned() {
    return scanned;
  }

  public void setScanned(@javax.annotation.Nonnull Double scanned) {
    this.scanned = scanned;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationResponseStats aggregationResponseStats = (AggregationResponseStats) o;
    return Objects.equals(this.timeMS, aggregationResponseStats.timeMS) &&
        Objects.equals(this.scanned, aggregationResponseStats.scanned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMS, scanned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationResponseStats {\n");
    sb.append("    timeMS: ").append(toIndentedString(timeMS)).append("\n");
    sb.append("    scanned: ").append(toIndentedString(scanned)).append("\n");
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
    openapiFields.add("timeMS");
    openapiFields.add("scanned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timeMS");
    openapiRequiredFields.add("scanned");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregationResponseStats
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregationResponseStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregationResponseStats is not found in the empty JSON string", AggregationResponseStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregationResponseStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregationResponseStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AggregationResponseStats.openapiRequiredFields) {
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
       if (!AggregationResponseStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregationResponseStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregationResponseStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregationResponseStats.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregationResponseStats>() {
           @Override
           public void write(JsonWriter out, AggregationResponseStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregationResponseStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregationResponseStats given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregationResponseStats
   * @throws IOException if the JSON string is invalid with respect to AggregationResponseStats
   */
  public static AggregationResponseStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregationResponseStats.class);
  }

  /**
   * Convert an instance of AggregationResponseStats to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


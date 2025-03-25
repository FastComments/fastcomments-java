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
import java.util.HashMap;
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
 * AggregationValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T16:43:49.680707237-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AggregationValue {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @javax.annotation.Nullable
  private Map<String, String> groups = new HashMap<>();

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  @javax.annotation.Nullable
  private String stringValue;

  public static final String SERIALIZED_NAME_NUMERIC_VALUE = "numericValue";
  @SerializedName(SERIALIZED_NAME_NUMERIC_VALUE)
  @javax.annotation.Nullable
  private Double numericValue;

  public static final String SERIALIZED_NAME_DISTINCT_COUNT = "distinctCount";
  @SerializedName(SERIALIZED_NAME_DISTINCT_COUNT)
  @javax.annotation.Nullable
  private Double distinctCount;

  public static final String SERIALIZED_NAME_DISTINCT_COUNTS = "distinctCounts";
  @SerializedName(SERIALIZED_NAME_DISTINCT_COUNTS)
  @javax.annotation.Nullable
  private Map<String, Double> distinctCounts = new HashMap<>();

  public AggregationValue() {
  }

  public AggregationValue groups(@javax.annotation.Nullable Map<String, String> groups) {
    this.groups = groups;
    return this;
  }

  public AggregationValue putGroupsItem(String key, String groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return groups
   */
  @javax.annotation.Nullable
  public Map<String, String> getGroups() {
    return groups;
  }

  public void setGroups(@javax.annotation.Nullable Map<String, String> groups) {
    this.groups = groups;
  }


  public AggregationValue stringValue(@javax.annotation.Nullable String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Get stringValue
   * @return stringValue
   */
  @javax.annotation.Nullable
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(@javax.annotation.Nullable String stringValue) {
    this.stringValue = stringValue;
  }


  public AggregationValue numericValue(@javax.annotation.Nullable Double numericValue) {
    this.numericValue = numericValue;
    return this;
  }

  /**
   * Get numericValue
   * @return numericValue
   */
  @javax.annotation.Nullable
  public Double getNumericValue() {
    return numericValue;
  }

  public void setNumericValue(@javax.annotation.Nullable Double numericValue) {
    this.numericValue = numericValue;
  }


  public AggregationValue distinctCount(@javax.annotation.Nullable Double distinctCount) {
    this.distinctCount = distinctCount;
    return this;
  }

  /**
   * Get distinctCount
   * @return distinctCount
   */
  @javax.annotation.Nullable
  public Double getDistinctCount() {
    return distinctCount;
  }

  public void setDistinctCount(@javax.annotation.Nullable Double distinctCount) {
    this.distinctCount = distinctCount;
  }


  public AggregationValue distinctCounts(@javax.annotation.Nullable Map<String, Double> distinctCounts) {
    this.distinctCounts = distinctCounts;
    return this;
  }

  public AggregationValue putDistinctCountsItem(String key, Double distinctCountsItem) {
    if (this.distinctCounts == null) {
      this.distinctCounts = new HashMap<>();
    }
    this.distinctCounts.put(key, distinctCountsItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return distinctCounts
   */
  @javax.annotation.Nullable
  public Map<String, Double> getDistinctCounts() {
    return distinctCounts;
  }

  public void setDistinctCounts(@javax.annotation.Nullable Map<String, Double> distinctCounts) {
    this.distinctCounts = distinctCounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationValue aggregationValue = (AggregationValue) o;
    return Objects.equals(this.groups, aggregationValue.groups) &&
        Objects.equals(this.stringValue, aggregationValue.stringValue) &&
        Objects.equals(this.numericValue, aggregationValue.numericValue) &&
        Objects.equals(this.distinctCount, aggregationValue.distinctCount) &&
        Objects.equals(this.distinctCounts, aggregationValue.distinctCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, stringValue, numericValue, distinctCount, distinctCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationValue {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    numericValue: ").append(toIndentedString(numericValue)).append("\n");
    sb.append("    distinctCount: ").append(toIndentedString(distinctCount)).append("\n");
    sb.append("    distinctCounts: ").append(toIndentedString(distinctCounts)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("stringValue");
    openapiFields.add("numericValue");
    openapiFields.add("distinctCount");
    openapiFields.add("distinctCounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregationValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregationValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregationValue is not found in the empty JSON string", AggregationValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregationValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregationValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregationValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregationValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregationValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregationValue.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregationValue>() {
           @Override
           public void write(JsonWriter out, AggregationValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregationValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregationValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregationValue
   * @throws IOException if the JSON string is invalid with respect to AggregationValue
   */
  public static AggregationValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregationValue.class);
  }

  /**
   * Convert an instance of AggregationValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


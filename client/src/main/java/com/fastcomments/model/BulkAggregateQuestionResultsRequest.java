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
import com.fastcomments.model.BulkAggregateQuestionItem;
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
 * BulkAggregateQuestionResultsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class BulkAggregateQuestionResultsRequest {
  public static final String SERIALIZED_NAME_AGGREGATIONS = "aggregations";
  @SerializedName(SERIALIZED_NAME_AGGREGATIONS)
  @javax.annotation.Nonnull
  private List<BulkAggregateQuestionItem> aggregations = new ArrayList<>();

  public BulkAggregateQuestionResultsRequest() {
  }

  public BulkAggregateQuestionResultsRequest aggregations(@javax.annotation.Nonnull List<BulkAggregateQuestionItem> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public BulkAggregateQuestionResultsRequest addAggregationsItem(BulkAggregateQuestionItem aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

  /**
   * Get aggregations
   * @return aggregations
   */
  @javax.annotation.Nonnull
  public List<BulkAggregateQuestionItem> getAggregations() {
    return aggregations;
  }

  public void setAggregations(@javax.annotation.Nonnull List<BulkAggregateQuestionItem> aggregations) {
    this.aggregations = aggregations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkAggregateQuestionResultsRequest bulkAggregateQuestionResultsRequest = (BulkAggregateQuestionResultsRequest) o;
    return Objects.equals(this.aggregations, bulkAggregateQuestionResultsRequest.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAggregateQuestionResultsRequest {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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
    openapiFields.add("aggregations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aggregations");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BulkAggregateQuestionResultsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkAggregateQuestionResultsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkAggregateQuestionResultsRequest is not found in the empty JSON string", BulkAggregateQuestionResultsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkAggregateQuestionResultsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkAggregateQuestionResultsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkAggregateQuestionResultsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("aggregations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregations` to be an array in the JSON string but got `%s`", jsonObj.get("aggregations").toString()));
      }

      JsonArray jsonArrayaggregations = jsonObj.getAsJsonArray("aggregations");
      // validate the required field `aggregations` (array)
      for (int i = 0; i < jsonArrayaggregations.size(); i++) {
        BulkAggregateQuestionItem.validateJsonElement(jsonArrayaggregations.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkAggregateQuestionResultsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkAggregateQuestionResultsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkAggregateQuestionResultsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkAggregateQuestionResultsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkAggregateQuestionResultsRequest>() {
           @Override
           public void write(JsonWriter out, BulkAggregateQuestionResultsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkAggregateQuestionResultsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BulkAggregateQuestionResultsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BulkAggregateQuestionResultsRequest
   * @throws IOException if the JSON string is invalid with respect to BulkAggregateQuestionResultsRequest
   */
  public static BulkAggregateQuestionResultsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkAggregateQuestionResultsRequest.class);
  }

  /**
   * Convert an instance of BulkAggregateQuestionResultsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


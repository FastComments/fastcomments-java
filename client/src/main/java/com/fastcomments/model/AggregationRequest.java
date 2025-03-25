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
import com.fastcomments.model.AggregationOperation;
import com.fastcomments.model.AggregationRequestSort;
import com.fastcomments.model.QueryPredicate;
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
 * The aggregation request accepts a resource, optional grouping keys, an array of operations, and an optional sort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T10:12:49.770182242-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AggregationRequest {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nullable
  private List<QueryPredicate> query = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  @javax.annotation.Nonnull
  private String resourceName;

  public static final String SERIALIZED_NAME_GROUP_BY = "groupBy";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  @javax.annotation.Nullable
  private List<String> groupBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  @javax.annotation.Nonnull
  private List<AggregationOperation> operations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private AggregationRequestSort sort;

  public AggregationRequest() {
  }

  public AggregationRequest query(@javax.annotation.Nullable List<QueryPredicate> query) {
    this.query = query;
    return this;
  }

  public AggregationRequest addQueryItem(QueryPredicate queryItem) {
    if (this.query == null) {
      this.query = new ArrayList<>();
    }
    this.query.add(queryItem);
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public List<QueryPredicate> getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nullable List<QueryPredicate> query) {
    this.query = query;
  }


  public AggregationRequest resourceName(@javax.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   */
  @javax.annotation.Nonnull
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(@javax.annotation.Nonnull String resourceName) {
    this.resourceName = resourceName;
  }


  public AggregationRequest groupBy(@javax.annotation.Nullable List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public AggregationRequest addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Get groupBy
   * @return groupBy
   */
  @javax.annotation.Nullable
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(@javax.annotation.Nullable List<String> groupBy) {
    this.groupBy = groupBy;
  }


  public AggregationRequest operations(@javax.annotation.Nonnull List<AggregationOperation> operations) {
    this.operations = operations;
    return this;
  }

  public AggregationRequest addOperationsItem(AggregationOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
   */
  @javax.annotation.Nonnull
  public List<AggregationOperation> getOperations() {
    return operations;
  }

  public void setOperations(@javax.annotation.Nonnull List<AggregationOperation> operations) {
    this.operations = operations;
  }


  public AggregationRequest sort(@javax.annotation.Nullable AggregationRequestSort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @javax.annotation.Nullable
  public AggregationRequestSort getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nullable AggregationRequestSort sort) {
    this.sort = sort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationRequest aggregationRequest = (AggregationRequest) o;
    return Objects.equals(this.query, aggregationRequest.query) &&
        Objects.equals(this.resourceName, aggregationRequest.resourceName) &&
        Objects.equals(this.groupBy, aggregationRequest.groupBy) &&
        Objects.equals(this.operations, aggregationRequest.operations) &&
        Objects.equals(this.sort, aggregationRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, resourceName, groupBy, operations, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("resourceName");
    openapiFields.add("groupBy");
    openapiFields.add("operations");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceName");
    openapiRequiredFields.add("operations");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregationRequest is not found in the empty JSON string", AggregationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AggregationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        JsonArray jsonArrayquery = jsonObj.getAsJsonArray("query");
        if (jsonArrayquery != null) {
          // ensure the json data is an array
          if (!jsonObj.get("query").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `query` to be an array in the JSON string but got `%s`", jsonObj.get("query").toString()));
          }

          // validate the optional field `query` (array)
          for (int i = 0; i < jsonArrayquery.size(); i++) {
            QueryPredicate.validateJsonElement(jsonArrayquery.get(i));
          };
        }
      }
      if (!jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupBy") != null && !jsonObj.get("groupBy").isJsonNull() && !jsonObj.get("groupBy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupBy` to be an array in the JSON string but got `%s`", jsonObj.get("groupBy").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
      }

      JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
      // validate the required field `operations` (array)
      for (int i = 0; i < jsonArrayoperations.size(); i++) {
        AggregationOperation.validateJsonElement(jsonArrayoperations.get(i));
      };
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        AggregationRequestSort.validateJsonElement(jsonObj.get("sort"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregationRequest>() {
           @Override
           public void write(JsonWriter out, AggregationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregationRequest
   * @throws IOException if the JSON string is invalid with respect to AggregationRequest
   */
  public static AggregationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregationRequest.class);
  }

  /**
   * Convert an instance of AggregationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


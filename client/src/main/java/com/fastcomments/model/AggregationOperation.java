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
import com.fastcomments.model.AggregationOpType;
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
 * An operation that will be applied on a field
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-19T13:05:16.739095503-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AggregationOperation {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  @javax.annotation.Nonnull
  private String field;

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  @javax.annotation.Nonnull
  private AggregationOpType op;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  @javax.annotation.Nullable
  private String alias;

  public static final String SERIALIZED_NAME_EXPAND_ARRAY = "expandArray";
  @SerializedName(SERIALIZED_NAME_EXPAND_ARRAY)
  @javax.annotation.Nullable
  private Boolean expandArray;

  public AggregationOperation() {
  }

  public AggregationOperation field(@javax.annotation.Nonnull String field) {
    this.field = field;
    return this;
  }

  /**
   * The field to operate on
   * @return field
   */
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }

  public void setField(@javax.annotation.Nonnull String field) {
    this.field = field;
  }


  public AggregationOperation op(@javax.annotation.Nonnull AggregationOpType op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
   */
  @javax.annotation.Nonnull
  public AggregationOpType getOp() {
    return op;
  }

  public void setOp(@javax.annotation.Nonnull AggregationOpType op) {
    this.op = op;
  }


  public AggregationOperation alias(@javax.annotation.Nullable String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Optional alias for the output; if not provided, a default alias is computed
   * @return alias
   */
  @javax.annotation.Nullable
  public String getAlias() {
    return alias;
  }

  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = alias;
  }


  public AggregationOperation expandArray(@javax.annotation.Nullable Boolean expandArray) {
    this.expandArray = expandArray;
    return this;
  }

  /**
   * Get expandArray
   * @return expandArray
   */
  @javax.annotation.Nullable
  public Boolean getExpandArray() {
    return expandArray;
  }

  public void setExpandArray(@javax.annotation.Nullable Boolean expandArray) {
    this.expandArray = expandArray;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationOperation aggregationOperation = (AggregationOperation) o;
    return Objects.equals(this.field, aggregationOperation.field) &&
        Objects.equals(this.op, aggregationOperation.op) &&
        Objects.equals(this.alias, aggregationOperation.alias) &&
        Objects.equals(this.expandArray, aggregationOperation.expandArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, op, alias, expandArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationOperation {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    expandArray: ").append(toIndentedString(expandArray)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("op");
    openapiFields.add("alias");
    openapiFields.add("expandArray");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("op");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregationOperation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregationOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregationOperation is not found in the empty JSON string", AggregationOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregationOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregationOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AggregationOperation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      // validate the required field `op`
      AggregationOpType.validateJsonElement(jsonObj.get("op"));
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregationOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregationOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregationOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregationOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregationOperation>() {
           @Override
           public void write(JsonWriter out, AggregationOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregationOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregationOperation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregationOperation
   * @throws IOException if the JSON string is invalid with respect to AggregationOperation
   */
  public static AggregationOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregationOperation.class);
  }

  /**
   * Convert an instance of AggregationOperation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


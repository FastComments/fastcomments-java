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
 * AggregationRequestSort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T08:51:57.638293329-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AggregationRequestSort {
  /**
   * Gets or Sets dir
   */
  @JsonAdapter(DirEnum.Adapter.class)
  public enum DirEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DirEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirEnum fromValue(String value) {
      for (DirEnum b : DirEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DirEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DIR = "dir";
  @SerializedName(SERIALIZED_NAME_DIR)
  @javax.annotation.Nonnull
  private DirEnum dir;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  @javax.annotation.Nonnull
  private String field;

  public AggregationRequestSort() {
  }

  public AggregationRequestSort dir(@javax.annotation.Nonnull DirEnum dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Get dir
   * @return dir
   */
  @javax.annotation.Nonnull
  public DirEnum getDir() {
    return dir;
  }

  public void setDir(@javax.annotation.Nonnull DirEnum dir) {
    this.dir = dir;
  }


  public AggregationRequestSort field(@javax.annotation.Nonnull String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   */
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }

  public void setField(@javax.annotation.Nonnull String field) {
    this.field = field;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationRequestSort aggregationRequestSort = (AggregationRequestSort) o;
    return Objects.equals(this.dir, aggregationRequestSort.dir) &&
        Objects.equals(this.field, aggregationRequestSort.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dir, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationRequestSort {\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
    openapiFields.add("dir");
    openapiFields.add("field");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dir");
    openapiRequiredFields.add("field");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregationRequestSort
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregationRequestSort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregationRequestSort is not found in the empty JSON string", AggregationRequestSort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregationRequestSort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregationRequestSort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AggregationRequestSort.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dir").toString()));
      }
      // validate the required field `dir`
      DirEnum.validateJsonElement(jsonObj.get("dir"));
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregationRequestSort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregationRequestSort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregationRequestSort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregationRequestSort.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregationRequestSort>() {
           @Override
           public void write(JsonWriter out, AggregationRequestSort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregationRequestSort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregationRequestSort given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregationRequestSort
   * @throws IOException if the JSON string is invalid with respect to AggregationRequestSort
   */
  public static AggregationRequestSort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregationRequestSort.class);
  }

  /**
   * Convert an instance of AggregationRequestSort to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


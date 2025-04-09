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
 * ReactBodyParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ReactBodyParams {
  public static final String SERIALIZED_NAME_REACT_TYPE = "reactType";
  @SerializedName(SERIALIZED_NAME_REACT_TYPE)
  @javax.annotation.Nullable
  private String reactType;

  public ReactBodyParams() {
  }

  public ReactBodyParams reactType(@javax.annotation.Nullable String reactType) {
    this.reactType = reactType;
    return this;
  }

  /**
   * Get reactType
   * @return reactType
   */
  @javax.annotation.Nullable
  public String getReactType() {
    return reactType;
  }

  public void setReactType(@javax.annotation.Nullable String reactType) {
    this.reactType = reactType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactBodyParams reactBodyParams = (ReactBodyParams) o;
    return Objects.equals(this.reactType, reactBodyParams.reactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactBodyParams {\n");
    sb.append("    reactType: ").append(toIndentedString(reactType)).append("\n");
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
    openapiFields.add("reactType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReactBodyParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReactBodyParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReactBodyParams is not found in the empty JSON string", ReactBodyParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReactBodyParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReactBodyParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reactType") != null && !jsonObj.get("reactType").isJsonNull()) && !jsonObj.get("reactType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reactType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reactType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReactBodyParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReactBodyParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReactBodyParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReactBodyParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ReactBodyParams>() {
           @Override
           public void write(JsonWriter out, ReactBodyParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReactBodyParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReactBodyParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReactBodyParams
   * @throws IOException if the JSON string is invalid with respect to ReactBodyParams
   */
  public static ReactBodyParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReactBodyParams.class);
  }

  /**
   * Convert an instance of ReactBodyParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


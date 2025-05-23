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
 * FeedPostMediaItemAsset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class FeedPostMediaItemAsset {
  public static final String SERIALIZED_NAME_W = "w";
  @SerializedName(SERIALIZED_NAME_W)
  @javax.annotation.Nonnull
  private Integer w;

  public static final String SERIALIZED_NAME_H = "h";
  @SerializedName(SERIALIZED_NAME_H)
  @javax.annotation.Nonnull
  private Integer h;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  @javax.annotation.Nonnull
  private String src;

  public FeedPostMediaItemAsset() {
  }

  public FeedPostMediaItemAsset w(@javax.annotation.Nonnull Integer w) {
    this.w = w;
    return this;
  }

  /**
   * Get w
   * @return w
   */
  @javax.annotation.Nonnull
  public Integer getW() {
    return w;
  }

  public void setW(@javax.annotation.Nonnull Integer w) {
    this.w = w;
  }


  public FeedPostMediaItemAsset h(@javax.annotation.Nonnull Integer h) {
    this.h = h;
    return this;
  }

  /**
   * Get h
   * @return h
   */
  @javax.annotation.Nonnull
  public Integer getH() {
    return h;
  }

  public void setH(@javax.annotation.Nonnull Integer h) {
    this.h = h;
  }


  public FeedPostMediaItemAsset src(@javax.annotation.Nonnull String src) {
    this.src = src;
    return this;
  }

  /**
   * Get src
   * @return src
   */
  @javax.annotation.Nonnull
  public String getSrc() {
    return src;
  }

  public void setSrc(@javax.annotation.Nonnull String src) {
    this.src = src;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPostMediaItemAsset feedPostMediaItemAsset = (FeedPostMediaItemAsset) o;
    return Objects.equals(this.w, feedPostMediaItemAsset.w) &&
        Objects.equals(this.h, feedPostMediaItemAsset.h) &&
        Objects.equals(this.src, feedPostMediaItemAsset.src);
  }

  @Override
  public int hashCode() {
    return Objects.hash(w, h, src);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPostMediaItemAsset {\n");
    sb.append("    w: ").append(toIndentedString(w)).append("\n");
    sb.append("    h: ").append(toIndentedString(h)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
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
    openapiFields.add("w");
    openapiFields.add("h");
    openapiFields.add("src");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("w");
    openapiRequiredFields.add("h");
    openapiRequiredFields.add("src");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeedPostMediaItemAsset
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedPostMediaItemAsset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedPostMediaItemAsset is not found in the empty JSON string", FeedPostMediaItemAsset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedPostMediaItemAsset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedPostMediaItemAsset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeedPostMediaItemAsset.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("src").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `src` to be a primitive type in the JSON string but got `%s`", jsonObj.get("src").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedPostMediaItemAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedPostMediaItemAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedPostMediaItemAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedPostMediaItemAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedPostMediaItemAsset>() {
           @Override
           public void write(JsonWriter out, FeedPostMediaItemAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedPostMediaItemAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeedPostMediaItemAsset given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeedPostMediaItemAsset
   * @throws IOException if the JSON string is invalid with respect to FeedPostMediaItemAsset
   */
  public static FeedPostMediaItemAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedPostMediaItemAsset.class);
  }

  /**
   * Convert an instance of FeedPostMediaItemAsset to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


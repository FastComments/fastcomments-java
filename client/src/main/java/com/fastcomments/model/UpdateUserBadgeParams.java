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
 * UpdateUserBadgeParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateUserBadgeParams {
  public static final String SERIALIZED_NAME_DISPLAYED_ON_COMMENTS = "displayedOnComments";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_ON_COMMENTS)
  @javax.annotation.Nullable
  private Boolean displayedOnComments;

  public UpdateUserBadgeParams() {
  }

  public UpdateUserBadgeParams displayedOnComments(@javax.annotation.Nullable Boolean displayedOnComments) {
    this.displayedOnComments = displayedOnComments;
    return this;
  }

  /**
   * Get displayedOnComments
   * @return displayedOnComments
   */
  @javax.annotation.Nullable
  public Boolean getDisplayedOnComments() {
    return displayedOnComments;
  }

  public void setDisplayedOnComments(@javax.annotation.Nullable Boolean displayedOnComments) {
    this.displayedOnComments = displayedOnComments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserBadgeParams updateUserBadgeParams = (UpdateUserBadgeParams) o;
    return Objects.equals(this.displayedOnComments, updateUserBadgeParams.displayedOnComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayedOnComments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserBadgeParams {\n");
    sb.append("    displayedOnComments: ").append(toIndentedString(displayedOnComments)).append("\n");
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
    openapiFields.add("displayedOnComments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateUserBadgeParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateUserBadgeParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserBadgeParams is not found in the empty JSON string", UpdateUserBadgeParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateUserBadgeParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUserBadgeParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserBadgeParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserBadgeParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserBadgeParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserBadgeParams.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserBadgeParams>() {
           @Override
           public void write(JsonWriter out, UpdateUserBadgeParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserBadgeParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateUserBadgeParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateUserBadgeParams
   * @throws IOException if the JSON string is invalid with respect to UpdateUserBadgeParams
   */
  public static UpdateUserBadgeParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserBadgeParams.class);
  }

  /**
   * Convert an instance of UpdateUserBadgeParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


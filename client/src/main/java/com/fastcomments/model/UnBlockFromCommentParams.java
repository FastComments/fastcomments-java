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
 * UnBlockFromCommentParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T16:43:49.680707237-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class UnBlockFromCommentParams {
  public static final String SERIALIZED_NAME_COMMENT_IDS_TO_CHECK = "commentIdsToCheck";
  @SerializedName(SERIALIZED_NAME_COMMENT_IDS_TO_CHECK)
  @javax.annotation.Nullable
  private List<String> commentIdsToCheck = new ArrayList<>();

  public UnBlockFromCommentParams() {
  }

  public UnBlockFromCommentParams commentIdsToCheck(@javax.annotation.Nullable List<String> commentIdsToCheck) {
    this.commentIdsToCheck = commentIdsToCheck;
    return this;
  }

  public UnBlockFromCommentParams addCommentIdsToCheckItem(String commentIdsToCheckItem) {
    if (this.commentIdsToCheck == null) {
      this.commentIdsToCheck = new ArrayList<>();
    }
    this.commentIdsToCheck.add(commentIdsToCheckItem);
    return this;
  }

  /**
   * Get commentIdsToCheck
   * @return commentIdsToCheck
   */
  @javax.annotation.Nullable
  public List<String> getCommentIdsToCheck() {
    return commentIdsToCheck;
  }

  public void setCommentIdsToCheck(@javax.annotation.Nullable List<String> commentIdsToCheck) {
    this.commentIdsToCheck = commentIdsToCheck;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnBlockFromCommentParams unBlockFromCommentParams = (UnBlockFromCommentParams) o;
    return Objects.equals(this.commentIdsToCheck, unBlockFromCommentParams.commentIdsToCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentIdsToCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnBlockFromCommentParams {\n");
    sb.append("    commentIdsToCheck: ").append(toIndentedString(commentIdsToCheck)).append("\n");
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
    openapiFields.add("commentIdsToCheck");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UnBlockFromCommentParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnBlockFromCommentParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnBlockFromCommentParams is not found in the empty JSON string", UnBlockFromCommentParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnBlockFromCommentParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnBlockFromCommentParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("commentIdsToCheck") != null && !jsonObj.get("commentIdsToCheck").isJsonNull() && !jsonObj.get("commentIdsToCheck").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentIdsToCheck` to be an array in the JSON string but got `%s`", jsonObj.get("commentIdsToCheck").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnBlockFromCommentParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnBlockFromCommentParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnBlockFromCommentParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnBlockFromCommentParams.class));

       return (TypeAdapter<T>) new TypeAdapter<UnBlockFromCommentParams>() {
           @Override
           public void write(JsonWriter out, UnBlockFromCommentParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnBlockFromCommentParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UnBlockFromCommentParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnBlockFromCommentParams
   * @throws IOException if the JSON string is invalid with respect to UnBlockFromCommentParams
   */
  public static UnBlockFromCommentParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnBlockFromCommentParams.class);
  }

  /**
   * Convert an instance of UnBlockFromCommentParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


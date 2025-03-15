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
 * From T, pick a set of properties whose keys are in the union K
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T17:00:29.454973715-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class PickFCommentApprovedOrCommentHTML {
  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  @javax.annotation.Nonnull
  private Boolean approved;

  public static final String SERIALIZED_NAME_COMMENT_H_T_M_L = "commentHTML";
  @SerializedName(SERIALIZED_NAME_COMMENT_H_T_M_L)
  @javax.annotation.Nonnull
  private String commentHTML;

  public PickFCommentApprovedOrCommentHTML() {
  }

  public PickFCommentApprovedOrCommentHTML approved(@javax.annotation.Nonnull Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
   */
  @javax.annotation.Nonnull
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(@javax.annotation.Nonnull Boolean approved) {
    this.approved = approved;
  }


  public PickFCommentApprovedOrCommentHTML commentHTML(@javax.annotation.Nonnull String commentHTML) {
    this.commentHTML = commentHTML;
    return this;
  }

  /**
   * Get commentHTML
   * @return commentHTML
   */
  @javax.annotation.Nonnull
  public String getCommentHTML() {
    return commentHTML;
  }

  public void setCommentHTML(@javax.annotation.Nonnull String commentHTML) {
    this.commentHTML = commentHTML;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFCommentApprovedOrCommentHTML pickFCommentApprovedOrCommentHTML = (PickFCommentApprovedOrCommentHTML) o;
    return Objects.equals(this.approved, pickFCommentApprovedOrCommentHTML.approved) &&
        Objects.equals(this.commentHTML, pickFCommentApprovedOrCommentHTML.commentHTML);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approved, commentHTML);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFCommentApprovedOrCommentHTML {\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    commentHTML: ").append(toIndentedString(commentHTML)).append("\n");
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
    openapiFields.add("approved");
    openapiFields.add("commentHTML");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("approved");
    openapiRequiredFields.add("commentHTML");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PickFCommentApprovedOrCommentHTML
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PickFCommentApprovedOrCommentHTML.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickFCommentApprovedOrCommentHTML is not found in the empty JSON string", PickFCommentApprovedOrCommentHTML.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PickFCommentApprovedOrCommentHTML.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PickFCommentApprovedOrCommentHTML` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PickFCommentApprovedOrCommentHTML.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("commentHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentHTML").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PickFCommentApprovedOrCommentHTML.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickFCommentApprovedOrCommentHTML' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickFCommentApprovedOrCommentHTML> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickFCommentApprovedOrCommentHTML.class));

       return (TypeAdapter<T>) new TypeAdapter<PickFCommentApprovedOrCommentHTML>() {
           @Override
           public void write(JsonWriter out, PickFCommentApprovedOrCommentHTML value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PickFCommentApprovedOrCommentHTML read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PickFCommentApprovedOrCommentHTML given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PickFCommentApprovedOrCommentHTML
   * @throws IOException if the JSON string is invalid with respect to PickFCommentApprovedOrCommentHTML
   */
  public static PickFCommentApprovedOrCommentHTML fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickFCommentApprovedOrCommentHTML.class);
  }

  /**
   * Convert an instance of PickFCommentApprovedOrCommentHTML to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


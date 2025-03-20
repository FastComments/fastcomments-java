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
 * BlockFromCommentParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-20T08:57:28.309985161-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class BlockFromCommentParams {
  public static final String SERIALIZED_NAME_COMMENT_IDS = "commentIds";
  @SerializedName(SERIALIZED_NAME_COMMENT_IDS)
  @javax.annotation.Nullable
  private List<String> commentIds;

  public BlockFromCommentParams() {
  }

  public BlockFromCommentParams commentIds(@javax.annotation.Nullable List<String> commentIds) {
    this.commentIds = commentIds;
    return this;
  }

  public BlockFromCommentParams addCommentIdsItem(String commentIdsItem) {
    if (this.commentIds == null) {
      this.commentIds = new ArrayList<>();
    }
    this.commentIds.add(commentIdsItem);
    return this;
  }

  /**
   * A list of comment ids to check if are blocked after performing the update.
   * @return commentIds
   */
  @javax.annotation.Nullable
  public List<String> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(@javax.annotation.Nullable List<String> commentIds) {
    this.commentIds = commentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockFromCommentParams blockFromCommentParams = (BlockFromCommentParams) o;
    return Objects.equals(this.commentIds, blockFromCommentParams.commentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockFromCommentParams {\n");
    sb.append("    commentIds: ").append(toIndentedString(commentIds)).append("\n");
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
    openapiFields.add("commentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commentIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BlockFromCommentParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockFromCommentParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockFromCommentParams is not found in the empty JSON string", BlockFromCommentParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockFromCommentParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockFromCommentParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlockFromCommentParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("commentIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("commentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentIds` to be an array in the JSON string but got `%s`", jsonObj.get("commentIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockFromCommentParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockFromCommentParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockFromCommentParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockFromCommentParams.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockFromCommentParams>() {
           @Override
           public void write(JsonWriter out, BlockFromCommentParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockFromCommentParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BlockFromCommentParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BlockFromCommentParams
   * @throws IOException if the JSON string is invalid with respect to BlockFromCommentParams
   */
  public static BlockFromCommentParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockFromCommentParams.class);
  }

  /**
   * Convert an instance of BlockFromCommentParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


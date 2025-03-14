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
import com.fastcomments.model.CommentUserHashTagInfo;
import com.fastcomments.model.CommentUserMentionInfo;
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
 * CommentTextUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T16:35:28.973572523-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class CommentTextUpdateRequest {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nonnull
  private String comment;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  @javax.annotation.Nullable
  private List<CommentUserMentionInfo> mentions = new ArrayList<>();

  public static final String SERIALIZED_NAME_HASH_TAGS = "hashTags";
  @SerializedName(SERIALIZED_NAME_HASH_TAGS)
  @javax.annotation.Nullable
  private List<CommentUserHashTagInfo> hashTags = new ArrayList<>();

  public CommentTextUpdateRequest() {
  }

  public CommentTextUpdateRequest comment(@javax.annotation.Nonnull String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nonnull String comment) {
    this.comment = comment;
  }


  public CommentTextUpdateRequest mentions(@javax.annotation.Nullable List<CommentUserMentionInfo> mentions) {
    this.mentions = mentions;
    return this;
  }

  public CommentTextUpdateRequest addMentionsItem(CommentUserMentionInfo mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * Get mentions
   * @return mentions
   */
  @javax.annotation.Nullable
  public List<CommentUserMentionInfo> getMentions() {
    return mentions;
  }

  public void setMentions(@javax.annotation.Nullable List<CommentUserMentionInfo> mentions) {
    this.mentions = mentions;
  }


  public CommentTextUpdateRequest hashTags(@javax.annotation.Nullable List<CommentUserHashTagInfo> hashTags) {
    this.hashTags = hashTags;
    return this;
  }

  public CommentTextUpdateRequest addHashTagsItem(CommentUserHashTagInfo hashTagsItem) {
    if (this.hashTags == null) {
      this.hashTags = new ArrayList<>();
    }
    this.hashTags.add(hashTagsItem);
    return this;
  }

  /**
   * Get hashTags
   * @return hashTags
   */
  @javax.annotation.Nullable
  public List<CommentUserHashTagInfo> getHashTags() {
    return hashTags;
  }

  public void setHashTags(@javax.annotation.Nullable List<CommentUserHashTagInfo> hashTags) {
    this.hashTags = hashTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentTextUpdateRequest commentTextUpdateRequest = (CommentTextUpdateRequest) o;
    return Objects.equals(this.comment, commentTextUpdateRequest.comment) &&
        Objects.equals(this.mentions, commentTextUpdateRequest.mentions) &&
        Objects.equals(this.hashTags, commentTextUpdateRequest.hashTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, mentions, hashTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentTextUpdateRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    hashTags: ").append(toIndentedString(hashTags)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("mentions");
    openapiFields.add("hashTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comment");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentTextUpdateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentTextUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentTextUpdateRequest is not found in the empty JSON string", CommentTextUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentTextUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentTextUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommentTextUpdateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("mentions") != null && !jsonObj.get("mentions").isJsonNull()) {
        JsonArray jsonArraymentions = jsonObj.getAsJsonArray("mentions");
        if (jsonArraymentions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mentions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mentions` to be an array in the JSON string but got `%s`", jsonObj.get("mentions").toString()));
          }

          // validate the optional field `mentions` (array)
          for (int i = 0; i < jsonArraymentions.size(); i++) {
            CommentUserMentionInfo.validateJsonElement(jsonArraymentions.get(i));
          };
        }
      }
      if (jsonObj.get("hashTags") != null && !jsonObj.get("hashTags").isJsonNull()) {
        JsonArray jsonArrayhashTags = jsonObj.getAsJsonArray("hashTags");
        if (jsonArrayhashTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hashTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hashTags` to be an array in the JSON string but got `%s`", jsonObj.get("hashTags").toString()));
          }

          // validate the optional field `hashTags` (array)
          for (int i = 0; i < jsonArrayhashTags.size(); i++) {
            CommentUserHashTagInfo.validateJsonElement(jsonArrayhashTags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentTextUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentTextUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentTextUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentTextUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentTextUpdateRequest>() {
           @Override
           public void write(JsonWriter out, CommentTextUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentTextUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentTextUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentTextUpdateRequest
   * @throws IOException if the JSON string is invalid with respect to CommentTextUpdateRequest
   */
  public static CommentTextUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentTextUpdateRequest.class);
  }

  /**
   * Convert an instance of CommentTextUpdateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.fastcomments.model.APIStatus;
import com.fastcomments.model.FeedPost;
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
 * CreateFeedPostsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateFeedPostsResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private APIStatus status;

  public static final String SERIALIZED_NAME_FEED_POST = "feedPost";
  @SerializedName(SERIALIZED_NAME_FEED_POST)
  @javax.annotation.Nonnull
  private FeedPost feedPost;

  public CreateFeedPostsResponse() {
  }

  public CreateFeedPostsResponse status(@javax.annotation.Nonnull APIStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public APIStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull APIStatus status) {
    this.status = status;
  }


  public CreateFeedPostsResponse feedPost(@javax.annotation.Nonnull FeedPost feedPost) {
    this.feedPost = feedPost;
    return this;
  }

  /**
   * Get feedPost
   * @return feedPost
   */
  @javax.annotation.Nonnull
  public FeedPost getFeedPost() {
    return feedPost;
  }

  public void setFeedPost(@javax.annotation.Nonnull FeedPost feedPost) {
    this.feedPost = feedPost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeedPostsResponse createFeedPostsResponse = (CreateFeedPostsResponse) o;
    return Objects.equals(this.status, createFeedPostsResponse.status) &&
        Objects.equals(this.feedPost, createFeedPostsResponse.feedPost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, feedPost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeedPostsResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedPost: ").append(toIndentedString(feedPost)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("feedPost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("feedPost");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFeedPostsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFeedPostsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFeedPostsResponse is not found in the empty JSON string", CreateFeedPostsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFeedPostsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFeedPostsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFeedPostsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      APIStatus.validateJsonElement(jsonObj.get("status"));
      // validate the required field `feedPost`
      FeedPost.validateJsonElement(jsonObj.get("feedPost"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFeedPostsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFeedPostsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFeedPostsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFeedPostsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFeedPostsResponse>() {
           @Override
           public void write(JsonWriter out, CreateFeedPostsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFeedPostsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateFeedPostsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFeedPostsResponse
   * @throws IOException if the JSON string is invalid with respect to CreateFeedPostsResponse
   */
  public static CreateFeedPostsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFeedPostsResponse.class);
  }

  /**
   * Convert an instance of CreateFeedPostsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


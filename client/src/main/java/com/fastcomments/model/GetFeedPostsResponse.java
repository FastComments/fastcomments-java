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
 * GetFeedPostsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T16:54:18.418110633-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetFeedPostsResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private APIStatus status;

  public static final String SERIALIZED_NAME_FEED_POSTS = "feedPosts";
  @SerializedName(SERIALIZED_NAME_FEED_POSTS)
  @javax.annotation.Nonnull
  private List<FeedPost> feedPosts = new ArrayList<>();

  public GetFeedPostsResponse() {
  }

  public GetFeedPostsResponse status(@javax.annotation.Nonnull APIStatus status) {
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


  public GetFeedPostsResponse feedPosts(@javax.annotation.Nonnull List<FeedPost> feedPosts) {
    this.feedPosts = feedPosts;
    return this;
  }

  public GetFeedPostsResponse addFeedPostsItem(FeedPost feedPostsItem) {
    if (this.feedPosts == null) {
      this.feedPosts = new ArrayList<>();
    }
    this.feedPosts.add(feedPostsItem);
    return this;
  }

  /**
   * Get feedPosts
   * @return feedPosts
   */
  @javax.annotation.Nonnull
  public List<FeedPost> getFeedPosts() {
    return feedPosts;
  }

  public void setFeedPosts(@javax.annotation.Nonnull List<FeedPost> feedPosts) {
    this.feedPosts = feedPosts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedPostsResponse getFeedPostsResponse = (GetFeedPostsResponse) o;
    return Objects.equals(this.status, getFeedPostsResponse.status) &&
        Objects.equals(this.feedPosts, getFeedPostsResponse.feedPosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, feedPosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedPostsResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedPosts: ").append(toIndentedString(feedPosts)).append("\n");
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
    openapiFields.add("feedPosts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("feedPosts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFeedPostsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeedPostsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeedPostsResponse is not found in the empty JSON string", GetFeedPostsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeedPostsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeedPostsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetFeedPostsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      APIStatus.validateJsonElement(jsonObj.get("status"));
      // ensure the json data is an array
      if (!jsonObj.get("feedPosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedPosts` to be an array in the JSON string but got `%s`", jsonObj.get("feedPosts").toString()));
      }

      JsonArray jsonArrayfeedPosts = jsonObj.getAsJsonArray("feedPosts");
      // validate the required field `feedPosts` (array)
      for (int i = 0; i < jsonArrayfeedPosts.size(); i++) {
        FeedPost.validateJsonElement(jsonArrayfeedPosts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeedPostsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeedPostsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeedPostsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeedPostsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeedPostsResponse>() {
           @Override
           public void write(JsonWriter out, GetFeedPostsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeedPostsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFeedPostsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFeedPostsResponse
   * @throws IOException if the JSON string is invalid with respect to GetFeedPostsResponse
   */
  public static GetFeedPostsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeedPostsResponse.class);
  }

  /**
   * Convert an instance of GetFeedPostsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


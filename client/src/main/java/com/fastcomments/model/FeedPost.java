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
import com.fastcomments.model.FeedPostLink;
import com.fastcomments.model.FeedPostMediaItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * FeedPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T09:21:20.273818640-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class FeedPost {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_FROM_USER_ID = "fromUserId";
  @SerializedName(SERIALIZED_NAME_FROM_USER_ID)
  @javax.annotation.Nullable
  private String fromUserId;

  public static final String SERIALIZED_NAME_FROM_IP_HASH = "fromIpHash";
  @SerializedName(SERIALIZED_NAME_FROM_IP_HASH)
  @javax.annotation.Nullable
  private String fromIpHash;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  @javax.annotation.Nullable
  private Double weight;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nullable
  private Map<String, String> meta = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTENT_H_T_M_L = "contentHTML";
  @SerializedName(SERIALIZED_NAME_CONTENT_H_T_M_L)
  @javax.annotation.Nullable
  private String contentHTML;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  @javax.annotation.Nullable
  private List<FeedPostMediaItem> media = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  @javax.annotation.Nullable
  private List<FeedPostLink> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public FeedPost() {
  }

  public FeedPost id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public FeedPost fromUserId(@javax.annotation.Nullable String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

  /**
   * Get fromUserId
   * @return fromUserId
   */
  @javax.annotation.Nullable
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(@javax.annotation.Nullable String fromUserId) {
    this.fromUserId = fromUserId;
  }


  public FeedPost fromIpHash(@javax.annotation.Nullable String fromIpHash) {
    this.fromIpHash = fromIpHash;
    return this;
  }

  /**
   * Get fromIpHash
   * @return fromIpHash
   */
  @javax.annotation.Nullable
  public String getFromIpHash() {
    return fromIpHash;
  }

  public void setFromIpHash(@javax.annotation.Nullable String fromIpHash) {
    this.fromIpHash = fromIpHash;
  }


  public FeedPost tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FeedPost addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public FeedPost weight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  @javax.annotation.Nullable
  public Double getWeight() {
    return weight;
  }

  public void setWeight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
  }


  public FeedPost meta(@javax.annotation.Nullable Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public FeedPost putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return meta
   */
  @javax.annotation.Nullable
  public Map<String, String> getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nullable Map<String, String> meta) {
    this.meta = meta;
  }


  public FeedPost contentHTML(@javax.annotation.Nullable String contentHTML) {
    this.contentHTML = contentHTML;
    return this;
  }

  /**
   * Get contentHTML
   * @return contentHTML
   */
  @javax.annotation.Nullable
  public String getContentHTML() {
    return contentHTML;
  }

  public void setContentHTML(@javax.annotation.Nullable String contentHTML) {
    this.contentHTML = contentHTML;
  }


  public FeedPost media(@javax.annotation.Nullable List<FeedPostMediaItem> media) {
    this.media = media;
    return this;
  }

  public FeedPost addMediaItem(FeedPostMediaItem mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @javax.annotation.Nullable
  public List<FeedPostMediaItem> getMedia() {
    return media;
  }

  public void setMedia(@javax.annotation.Nullable List<FeedPostMediaItem> media) {
    this.media = media;
  }


  public FeedPost links(@javax.annotation.Nullable List<FeedPostLink> links) {
    this.links = links;
    return this;
  }

  public FeedPost addLinksItem(FeedPostLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public List<FeedPostLink> getLinks() {
    return links;
  }

  public void setLinks(@javax.annotation.Nullable List<FeedPostLink> links) {
    this.links = links;
  }


  public FeedPost createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPost feedPost = (FeedPost) o;
    return Objects.equals(this.id, feedPost.id) &&
        Objects.equals(this.fromUserId, feedPost.fromUserId) &&
        Objects.equals(this.fromIpHash, feedPost.fromIpHash) &&
        Objects.equals(this.tags, feedPost.tags) &&
        Objects.equals(this.weight, feedPost.weight) &&
        Objects.equals(this.meta, feedPost.meta) &&
        Objects.equals(this.contentHTML, feedPost.contentHTML) &&
        Objects.equals(this.media, feedPost.media) &&
        Objects.equals(this.links, feedPost.links) &&
        Objects.equals(this.createdAt, feedPost.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromUserId, fromIpHash, tags, weight, meta, contentHTML, media, links, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPost {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    fromIpHash: ").append(toIndentedString(fromIpHash)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    contentHTML: ").append(toIndentedString(contentHTML)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("_id");
    openapiFields.add("fromUserId");
    openapiFields.add("fromIpHash");
    openapiFields.add("tags");
    openapiFields.add("weight");
    openapiFields.add("meta");
    openapiFields.add("contentHTML");
    openapiFields.add("media");
    openapiFields.add("links");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("createdAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeedPost
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedPost.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedPost is not found in the empty JSON string", FeedPost.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedPost.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedPost` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeedPost.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("fromUserId") != null && !jsonObj.get("fromUserId").isJsonNull()) && !jsonObj.get("fromUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromUserId").toString()));
      }
      if ((jsonObj.get("fromIpHash") != null && !jsonObj.get("fromIpHash").isJsonNull()) && !jsonObj.get("fromIpHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromIpHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromIpHash").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("contentHTML") != null && !jsonObj.get("contentHTML").isJsonNull()) && !jsonObj.get("contentHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentHTML").toString()));
      }
      if (jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull()) {
        JsonArray jsonArraymedia = jsonObj.getAsJsonArray("media");
        if (jsonArraymedia != null) {
          // ensure the json data is an array
          if (!jsonObj.get("media").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `media` to be an array in the JSON string but got `%s`", jsonObj.get("media").toString()));
          }

          // validate the optional field `media` (array)
          for (int i = 0; i < jsonArraymedia.size(); i++) {
            FeedPostMediaItem.validateJsonElement(jsonArraymedia.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            FeedPostLink.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedPost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedPost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedPost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedPost.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedPost>() {
           @Override
           public void write(JsonWriter out, FeedPost value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedPost read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeedPost given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeedPost
   * @throws IOException if the JSON string is invalid with respect to FeedPost
   */
  public static FeedPost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedPost.class);
  }

  /**
   * Convert an instance of FeedPost to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


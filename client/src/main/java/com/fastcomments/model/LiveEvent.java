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
import com.fastcomments.model.CommentUserBadgeInfo;
import com.fastcomments.model.FeedPost;
import com.fastcomments.model.LiveEventExtraInfo;
import com.fastcomments.model.LiveEventType;
import com.fastcomments.model.PubSubComment;
import com.fastcomments.model.PubSubVote;
import com.fastcomments.model.UserNotification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * LiveEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class LiveEvent {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private LiveEventType type;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  @javax.annotation.Nullable
  private Long timestamp;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  @javax.annotation.Nullable
  private Long ts;

  public static final String SERIALIZED_NAME_BROADCAST_ID = "broadcastId";
  @SerializedName(SERIALIZED_NAME_BROADCAST_ID)
  @javax.annotation.Nullable
  private String broadcastId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  @javax.annotation.Nullable
  private List<CommentUserBadgeInfo> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  @javax.annotation.Nullable
  private UserNotification notification;

  public static final String SERIALIZED_NAME_VOTE = "vote";
  @SerializedName(SERIALIZED_NAME_VOTE)
  @javax.annotation.Nullable
  private PubSubVote vote;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private PubSubComment comment;

  public static final String SERIALIZED_NAME_FEED_POST = "feedPost";
  @SerializedName(SERIALIZED_NAME_FEED_POST)
  @javax.annotation.Nullable
  private FeedPost feedPost;

  public static final String SERIALIZED_NAME_EXTRA_INFO = "extraInfo";
  @SerializedName(SERIALIZED_NAME_EXTRA_INFO)
  @javax.annotation.Nullable
  private LiveEventExtraInfo extraInfo;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  @javax.annotation.Nullable
  private Object config;

  public static final String SERIALIZED_NAME_IS_CLOSED = "isClosed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  @javax.annotation.Nullable
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_UJ = "uj";
  @SerializedName(SERIALIZED_NAME_UJ)
  @javax.annotation.Nullable
  private List<String> uj = new ArrayList<>();

  public static final String SERIALIZED_NAME_UL = "ul";
  @SerializedName(SERIALIZED_NAME_UL)
  @javax.annotation.Nullable
  private List<String> ul = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  @javax.annotation.Nullable
  private Map<String, Double> changes = new HashMap<>();

  public LiveEvent() {
  }

  public LiveEvent type(@javax.annotation.Nonnull LiveEventType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public LiveEventType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull LiveEventType type) {
    this.type = type;
  }


  public LiveEvent timestamp(@javax.annotation.Nullable Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@javax.annotation.Nullable Long timestamp) {
    this.timestamp = timestamp;
  }


  public LiveEvent ts(@javax.annotation.Nullable Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
   */
  @javax.annotation.Nullable
  public Long getTs() {
    return ts;
  }

  public void setTs(@javax.annotation.Nullable Long ts) {
    this.ts = ts;
  }


  public LiveEvent broadcastId(@javax.annotation.Nullable String broadcastId) {
    this.broadcastId = broadcastId;
    return this;
  }

  /**
   * Get broadcastId
   * @return broadcastId
   */
  @javax.annotation.Nullable
  public String getBroadcastId() {
    return broadcastId;
  }

  public void setBroadcastId(@javax.annotation.Nullable String broadcastId) {
    this.broadcastId = broadcastId;
  }


  public LiveEvent userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public LiveEvent badges(@javax.annotation.Nullable List<CommentUserBadgeInfo> badges) {
    this.badges = badges;
    return this;
  }

  public LiveEvent addBadgesItem(CommentUserBadgeInfo badgesItem) {
    if (this.badges == null) {
      this.badges = new ArrayList<>();
    }
    this.badges.add(badgesItem);
    return this;
  }

  /**
   * Get badges
   * @return badges
   */
  @javax.annotation.Nullable
  public List<CommentUserBadgeInfo> getBadges() {
    return badges;
  }

  public void setBadges(@javax.annotation.Nullable List<CommentUserBadgeInfo> badges) {
    this.badges = badges;
  }


  public LiveEvent notification(@javax.annotation.Nullable UserNotification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification
   * @return notification
   */
  @javax.annotation.Nullable
  public UserNotification getNotification() {
    return notification;
  }

  public void setNotification(@javax.annotation.Nullable UserNotification notification) {
    this.notification = notification;
  }


  public LiveEvent vote(@javax.annotation.Nullable PubSubVote vote) {
    this.vote = vote;
    return this;
  }

  /**
   * Get vote
   * @return vote
   */
  @javax.annotation.Nullable
  public PubSubVote getVote() {
    return vote;
  }

  public void setVote(@javax.annotation.Nullable PubSubVote vote) {
    this.vote = vote;
  }


  public LiveEvent comment(@javax.annotation.Nullable PubSubComment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public PubSubComment getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable PubSubComment comment) {
    this.comment = comment;
  }


  public LiveEvent feedPost(@javax.annotation.Nullable FeedPost feedPost) {
    this.feedPost = feedPost;
    return this;
  }

  /**
   * Get feedPost
   * @return feedPost
   */
  @javax.annotation.Nullable
  public FeedPost getFeedPost() {
    return feedPost;
  }

  public void setFeedPost(@javax.annotation.Nullable FeedPost feedPost) {
    this.feedPost = feedPost;
  }


  public LiveEvent extraInfo(@javax.annotation.Nullable LiveEventExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  /**
   * Get extraInfo
   * @return extraInfo
   */
  @javax.annotation.Nullable
  public LiveEventExtraInfo getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(@javax.annotation.Nullable LiveEventExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }


  public LiveEvent config(@javax.annotation.Nullable Object config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  public Object getConfig() {
    return config;
  }

  public void setConfig(@javax.annotation.Nullable Object config) {
    this.config = config;
  }


  public LiveEvent isClosed(@javax.annotation.Nullable Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

  /**
   * Get isClosed
   * @return isClosed
   */
  @javax.annotation.Nullable
  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(@javax.annotation.Nullable Boolean isClosed) {
    this.isClosed = isClosed;
  }


  public LiveEvent uj(@javax.annotation.Nullable List<String> uj) {
    this.uj = uj;
    return this;
  }

  public LiveEvent addUjItem(String ujItem) {
    if (this.uj == null) {
      this.uj = new ArrayList<>();
    }
    this.uj.add(ujItem);
    return this;
  }

  /**
   * Get uj
   * @return uj
   */
  @javax.annotation.Nullable
  public List<String> getUj() {
    return uj;
  }

  public void setUj(@javax.annotation.Nullable List<String> uj) {
    this.uj = uj;
  }


  public LiveEvent ul(@javax.annotation.Nullable List<String> ul) {
    this.ul = ul;
    return this;
  }

  public LiveEvent addUlItem(String ulItem) {
    if (this.ul == null) {
      this.ul = new ArrayList<>();
    }
    this.ul.add(ulItem);
    return this;
  }

  /**
   * Get ul
   * @return ul
   */
  @javax.annotation.Nullable
  public List<String> getUl() {
    return ul;
  }

  public void setUl(@javax.annotation.Nullable List<String> ul) {
    this.ul = ul;
  }


  public LiveEvent changes(@javax.annotation.Nullable Map<String, Double> changes) {
    this.changes = changes;
    return this;
  }

  public LiveEvent putChangesItem(String key, Double changesItem) {
    if (this.changes == null) {
      this.changes = new HashMap<>();
    }
    this.changes.put(key, changesItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return changes
   */
  @javax.annotation.Nullable
  public Map<String, Double> getChanges() {
    return changes;
  }

  public void setChanges(@javax.annotation.Nullable Map<String, Double> changes) {
    this.changes = changes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEvent liveEvent = (LiveEvent) o;
    return Objects.equals(this.type, liveEvent.type) &&
        Objects.equals(this.timestamp, liveEvent.timestamp) &&
        Objects.equals(this.ts, liveEvent.ts) &&
        Objects.equals(this.broadcastId, liveEvent.broadcastId) &&
        Objects.equals(this.userId, liveEvent.userId) &&
        Objects.equals(this.badges, liveEvent.badges) &&
        Objects.equals(this.notification, liveEvent.notification) &&
        Objects.equals(this.vote, liveEvent.vote) &&
        Objects.equals(this.comment, liveEvent.comment) &&
        Objects.equals(this.feedPost, liveEvent.feedPost) &&
        Objects.equals(this.extraInfo, liveEvent.extraInfo) &&
        Objects.equals(this.config, liveEvent.config) &&
        Objects.equals(this.isClosed, liveEvent.isClosed) &&
        Objects.equals(this.uj, liveEvent.uj) &&
        Objects.equals(this.ul, liveEvent.ul) &&
        Objects.equals(this.changes, liveEvent.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timestamp, ts, broadcastId, userId, badges, notification, vote, comment, feedPost, extraInfo, config, isClosed, uj, ul, changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    broadcastId: ").append(toIndentedString(broadcastId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    feedPost: ").append(toIndentedString(feedPost)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    uj: ").append(toIndentedString(uj)).append("\n");
    sb.append("    ul: ").append(toIndentedString(ul)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("timestamp");
    openapiFields.add("ts");
    openapiFields.add("broadcastId");
    openapiFields.add("userId");
    openapiFields.add("badges");
    openapiFields.add("notification");
    openapiFields.add("vote");
    openapiFields.add("comment");
    openapiFields.add("feedPost");
    openapiFields.add("extraInfo");
    openapiFields.add("config");
    openapiFields.add("isClosed");
    openapiFields.add("uj");
    openapiFields.add("ul");
    openapiFields.add("changes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LiveEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiveEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveEvent is not found in the empty JSON string", LiveEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiveEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiveEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      LiveEventType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("broadcastId") != null && !jsonObj.get("broadcastId").isJsonNull()) && !jsonObj.get("broadcastId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `broadcastId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("broadcastId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (jsonObj.get("badges") != null && !jsonObj.get("badges").isJsonNull()) {
        JsonArray jsonArraybadges = jsonObj.getAsJsonArray("badges");
        if (jsonArraybadges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("badges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `badges` to be an array in the JSON string but got `%s`", jsonObj.get("badges").toString()));
          }

          // validate the optional field `badges` (array)
          for (int i = 0; i < jsonArraybadges.size(); i++) {
            CommentUserBadgeInfo.validateJsonElement(jsonArraybadges.get(i));
          };
        }
      }
      // validate the optional field `notification`
      if (jsonObj.get("notification") != null && !jsonObj.get("notification").isJsonNull()) {
        UserNotification.validateJsonElement(jsonObj.get("notification"));
      }
      // validate the optional field `vote`
      if (jsonObj.get("vote") != null && !jsonObj.get("vote").isJsonNull()) {
        PubSubVote.validateJsonElement(jsonObj.get("vote"));
      }
      // validate the optional field `comment`
      if (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) {
        PubSubComment.validateJsonElement(jsonObj.get("comment"));
      }
      // validate the optional field `feedPost`
      if (jsonObj.get("feedPost") != null && !jsonObj.get("feedPost").isJsonNull()) {
        FeedPost.validateJsonElement(jsonObj.get("feedPost"));
      }
      // validate the optional field `extraInfo`
      if (jsonObj.get("extraInfo") != null && !jsonObj.get("extraInfo").isJsonNull()) {
        LiveEventExtraInfo.validateJsonElement(jsonObj.get("extraInfo"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uj") != null && !jsonObj.get("uj").isJsonNull() && !jsonObj.get("uj").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uj` to be an array in the JSON string but got `%s`", jsonObj.get("uj").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ul") != null && !jsonObj.get("ul").isJsonNull() && !jsonObj.get("ul").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ul` to be an array in the JSON string but got `%s`", jsonObj.get("ul").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveEvent>() {
           @Override
           public void write(JsonWriter out, LiveEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiveEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LiveEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LiveEvent
   * @throws IOException if the JSON string is invalid with respect to LiveEvent
   */
  public static LiveEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveEvent.class);
  }

  /**
   * Convert an instance of LiveEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


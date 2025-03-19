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
import com.fastcomments.model.RecordStringStringOrNumberValue;
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
 * CommentData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-19T13:05:16.739095503-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class CommentData {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nonnull
  private Double date;

  public static final String SERIALIZED_NAME_LOCAL_DATE_STRING = "localDateString";
  @SerializedName(SERIALIZED_NAME_LOCAL_DATE_STRING)
  @javax.annotation.Nullable
  private String localDateString;

  public static final String SERIALIZED_NAME_LOCAL_DATE_HOURS = "localDateHours";
  @SerializedName(SERIALIZED_NAME_LOCAL_DATE_HOURS)
  @javax.annotation.Nullable
  private Double localDateHours;

  public static final String SERIALIZED_NAME_COMMENTER_NAME = "commenterName";
  @SerializedName(SERIALIZED_NAME_COMMENTER_NAME)
  @javax.annotation.Nonnull
  private String commenterName;

  public static final String SERIALIZED_NAME_COMMENTER_EMAIL = "commenterEmail";
  @SerializedName(SERIALIZED_NAME_COMMENTER_EMAIL)
  @javax.annotation.Nullable
  private String commenterEmail;

  public static final String SERIALIZED_NAME_COMMENTER_LINK = "commenterLink";
  @SerializedName(SERIALIZED_NAME_COMMENTER_LINK)
  @javax.annotation.Nullable
  private String commenterLink;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nonnull
  private String comment;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  @javax.annotation.Nullable
  private Double productId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_AVATAR_SRC = "avatarSrc";
  @SerializedName(SERIALIZED_NAME_AVATAR_SRC)
  @javax.annotation.Nullable
  private String avatarSrc;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  @javax.annotation.Nullable
  private String parentId;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  @javax.annotation.Nullable
  private List<CommentUserMentionInfo> mentions = new ArrayList<>();

  public static final String SERIALIZED_NAME_HASH_TAGS = "hashTags";
  @SerializedName(SERIALIZED_NAME_HASH_TAGS)
  @javax.annotation.Nullable
  private List<CommentUserHashTagInfo> hashTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_TITLE = "pageTitle";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  @javax.annotation.Nullable
  private String pageTitle;

  public static final String SERIALIZED_NAME_IS_FROM_MY_ACCOUNT_PAGE = "isFromMyAccountPage";
  @SerializedName(SERIALIZED_NAME_IS_FROM_MY_ACCOUNT_PAGE)
  @javax.annotation.Nullable
  private Boolean isFromMyAccountPage;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  @javax.annotation.Nonnull
  private String urlId;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nullable
  private Object meta;

  public static final String SERIALIZED_NAME_MODERATION_GROUP_IDS = "moderationGroupIds";
  @SerializedName(SERIALIZED_NAME_MODERATION_GROUP_IDS)
  @javax.annotation.Nullable
  private List<String> moderationGroupIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  @javax.annotation.Nullable
  private Double rating;

  public static final String SERIALIZED_NAME_FROM_OFFLINE_RESTORE = "fromOfflineRestore";
  @SerializedName(SERIALIZED_NAME_FROM_OFFLINE_RESTORE)
  @javax.annotation.Nullable
  private Boolean fromOfflineRestore;

  public static final String SERIALIZED_NAME_AUTOPLAY_DELAY_M_S = "autoplayDelayMS";
  @SerializedName(SERIALIZED_NAME_AUTOPLAY_DELAY_M_S)
  @javax.annotation.Nullable
  private Double autoplayDelayMS;

  public static final String SERIALIZED_NAME_FEEDBACK_IDS = "feedbackIds";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_IDS)
  @javax.annotation.Nullable
  private List<String> feedbackIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUESTION_VALUES = "questionValues";
  @SerializedName(SERIALIZED_NAME_QUESTION_VALUES)
  @javax.annotation.Nullable
  private Map<String, RecordStringStringOrNumberValue> questionValues = new HashMap<>();

  public CommentData() {
  }

  public CommentData date(@javax.annotation.Nonnull Double date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nonnull
  public Double getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nonnull Double date) {
    this.date = date;
  }


  public CommentData localDateString(@javax.annotation.Nullable String localDateString) {
    this.localDateString = localDateString;
    return this;
  }

  /**
   * Get localDateString
   * @return localDateString
   */
  @javax.annotation.Nullable
  public String getLocalDateString() {
    return localDateString;
  }

  public void setLocalDateString(@javax.annotation.Nullable String localDateString) {
    this.localDateString = localDateString;
  }


  public CommentData localDateHours(@javax.annotation.Nullable Double localDateHours) {
    this.localDateHours = localDateHours;
    return this;
  }

  /**
   * Get localDateHours
   * @return localDateHours
   */
  @javax.annotation.Nullable
  public Double getLocalDateHours() {
    return localDateHours;
  }

  public void setLocalDateHours(@javax.annotation.Nullable Double localDateHours) {
    this.localDateHours = localDateHours;
  }


  public CommentData commenterName(@javax.annotation.Nonnull String commenterName) {
    this.commenterName = commenterName;
    return this;
  }

  /**
   * Get commenterName
   * @return commenterName
   */
  @javax.annotation.Nonnull
  public String getCommenterName() {
    return commenterName;
  }

  public void setCommenterName(@javax.annotation.Nonnull String commenterName) {
    this.commenterName = commenterName;
  }


  public CommentData commenterEmail(@javax.annotation.Nullable String commenterEmail) {
    this.commenterEmail = commenterEmail;
    return this;
  }

  /**
   * Get commenterEmail
   * @return commenterEmail
   */
  @javax.annotation.Nullable
  public String getCommenterEmail() {
    return commenterEmail;
  }

  public void setCommenterEmail(@javax.annotation.Nullable String commenterEmail) {
    this.commenterEmail = commenterEmail;
  }


  public CommentData commenterLink(@javax.annotation.Nullable String commenterLink) {
    this.commenterLink = commenterLink;
    return this;
  }

  /**
   * Get commenterLink
   * @return commenterLink
   */
  @javax.annotation.Nullable
  public String getCommenterLink() {
    return commenterLink;
  }

  public void setCommenterLink(@javax.annotation.Nullable String commenterLink) {
    this.commenterLink = commenterLink;
  }


  public CommentData comment(@javax.annotation.Nonnull String comment) {
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


  public CommentData productId(@javax.annotation.Nullable Double productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @javax.annotation.Nullable
  public Double getProductId() {
    return productId;
  }

  public void setProductId(@javax.annotation.Nullable Double productId) {
    this.productId = productId;
  }


  public CommentData userId(@javax.annotation.Nullable String userId) {
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


  public CommentData avatarSrc(@javax.annotation.Nullable String avatarSrc) {
    this.avatarSrc = avatarSrc;
    return this;
  }

  /**
   * Get avatarSrc
   * @return avatarSrc
   */
  @javax.annotation.Nullable
  public String getAvatarSrc() {
    return avatarSrc;
  }

  public void setAvatarSrc(@javax.annotation.Nullable String avatarSrc) {
    this.avatarSrc = avatarSrc;
  }


  public CommentData parentId(@javax.annotation.Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  @javax.annotation.Nullable
  public String getParentId() {
    return parentId;
  }

  public void setParentId(@javax.annotation.Nullable String parentId) {
    this.parentId = parentId;
  }


  public CommentData mentions(@javax.annotation.Nullable List<CommentUserMentionInfo> mentions) {
    this.mentions = mentions;
    return this;
  }

  public CommentData addMentionsItem(CommentUserMentionInfo mentionsItem) {
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


  public CommentData hashTags(@javax.annotation.Nullable List<CommentUserHashTagInfo> hashTags) {
    this.hashTags = hashTags;
    return this;
  }

  public CommentData addHashTagsItem(CommentUserHashTagInfo hashTagsItem) {
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


  public CommentData pageTitle(@javax.annotation.Nullable String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Get pageTitle
   * @return pageTitle
   */
  @javax.annotation.Nullable
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(@javax.annotation.Nullable String pageTitle) {
    this.pageTitle = pageTitle;
  }


  public CommentData isFromMyAccountPage(@javax.annotation.Nullable Boolean isFromMyAccountPage) {
    this.isFromMyAccountPage = isFromMyAccountPage;
    return this;
  }

  /**
   * Get isFromMyAccountPage
   * @return isFromMyAccountPage
   */
  @javax.annotation.Nullable
  public Boolean getIsFromMyAccountPage() {
    return isFromMyAccountPage;
  }

  public void setIsFromMyAccountPage(@javax.annotation.Nullable Boolean isFromMyAccountPage) {
    this.isFromMyAccountPage = isFromMyAccountPage;
  }


  public CommentData url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public CommentData urlId(@javax.annotation.Nonnull String urlId) {
    this.urlId = urlId;
    return this;
  }

  /**
   * Get urlId
   * @return urlId
   */
  @javax.annotation.Nonnull
  public String getUrlId() {
    return urlId;
  }

  public void setUrlId(@javax.annotation.Nonnull String urlId) {
    this.urlId = urlId;
  }


  public CommentData meta(@javax.annotation.Nullable Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public Object getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nullable Object meta) {
    this.meta = meta;
  }


  public CommentData moderationGroupIds(@javax.annotation.Nullable List<String> moderationGroupIds) {
    this.moderationGroupIds = moderationGroupIds;
    return this;
  }

  public CommentData addModerationGroupIdsItem(String moderationGroupIdsItem) {
    if (this.moderationGroupIds == null) {
      this.moderationGroupIds = new ArrayList<>();
    }
    this.moderationGroupIds.add(moderationGroupIdsItem);
    return this;
  }

  /**
   * Get moderationGroupIds
   * @return moderationGroupIds
   */
  @javax.annotation.Nullable
  public List<String> getModerationGroupIds() {
    return moderationGroupIds;
  }

  public void setModerationGroupIds(@javax.annotation.Nullable List<String> moderationGroupIds) {
    this.moderationGroupIds = moderationGroupIds;
  }


  public CommentData rating(@javax.annotation.Nullable Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public Double getRating() {
    return rating;
  }

  public void setRating(@javax.annotation.Nullable Double rating) {
    this.rating = rating;
  }


  public CommentData fromOfflineRestore(@javax.annotation.Nullable Boolean fromOfflineRestore) {
    this.fromOfflineRestore = fromOfflineRestore;
    return this;
  }

  /**
   * Get fromOfflineRestore
   * @return fromOfflineRestore
   */
  @javax.annotation.Nullable
  public Boolean getFromOfflineRestore() {
    return fromOfflineRestore;
  }

  public void setFromOfflineRestore(@javax.annotation.Nullable Boolean fromOfflineRestore) {
    this.fromOfflineRestore = fromOfflineRestore;
  }


  public CommentData autoplayDelayMS(@javax.annotation.Nullable Double autoplayDelayMS) {
    this.autoplayDelayMS = autoplayDelayMS;
    return this;
  }

  /**
   * Get autoplayDelayMS
   * @return autoplayDelayMS
   */
  @javax.annotation.Nullable
  public Double getAutoplayDelayMS() {
    return autoplayDelayMS;
  }

  public void setAutoplayDelayMS(@javax.annotation.Nullable Double autoplayDelayMS) {
    this.autoplayDelayMS = autoplayDelayMS;
  }


  public CommentData feedbackIds(@javax.annotation.Nullable List<String> feedbackIds) {
    this.feedbackIds = feedbackIds;
    return this;
  }

  public CommentData addFeedbackIdsItem(String feedbackIdsItem) {
    if (this.feedbackIds == null) {
      this.feedbackIds = new ArrayList<>();
    }
    this.feedbackIds.add(feedbackIdsItem);
    return this;
  }

  /**
   * Get feedbackIds
   * @return feedbackIds
   */
  @javax.annotation.Nullable
  public List<String> getFeedbackIds() {
    return feedbackIds;
  }

  public void setFeedbackIds(@javax.annotation.Nullable List<String> feedbackIds) {
    this.feedbackIds = feedbackIds;
  }


  public CommentData questionValues(@javax.annotation.Nullable Map<String, RecordStringStringOrNumberValue> questionValues) {
    this.questionValues = questionValues;
    return this;
  }

  public CommentData putQuestionValuesItem(String key, RecordStringStringOrNumberValue questionValuesItem) {
    if (this.questionValues == null) {
      this.questionValues = new HashMap<>();
    }
    this.questionValues.put(key, questionValuesItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return questionValues
   */
  @javax.annotation.Nullable
  public Map<String, RecordStringStringOrNumberValue> getQuestionValues() {
    return questionValues;
  }

  public void setQuestionValues(@javax.annotation.Nullable Map<String, RecordStringStringOrNumberValue> questionValues) {
    this.questionValues = questionValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentData commentData = (CommentData) o;
    return Objects.equals(this.date, commentData.date) &&
        Objects.equals(this.localDateString, commentData.localDateString) &&
        Objects.equals(this.localDateHours, commentData.localDateHours) &&
        Objects.equals(this.commenterName, commentData.commenterName) &&
        Objects.equals(this.commenterEmail, commentData.commenterEmail) &&
        Objects.equals(this.commenterLink, commentData.commenterLink) &&
        Objects.equals(this.comment, commentData.comment) &&
        Objects.equals(this.productId, commentData.productId) &&
        Objects.equals(this.userId, commentData.userId) &&
        Objects.equals(this.avatarSrc, commentData.avatarSrc) &&
        Objects.equals(this.parentId, commentData.parentId) &&
        Objects.equals(this.mentions, commentData.mentions) &&
        Objects.equals(this.hashTags, commentData.hashTags) &&
        Objects.equals(this.pageTitle, commentData.pageTitle) &&
        Objects.equals(this.isFromMyAccountPage, commentData.isFromMyAccountPage) &&
        Objects.equals(this.url, commentData.url) &&
        Objects.equals(this.urlId, commentData.urlId) &&
        Objects.equals(this.meta, commentData.meta) &&
        Objects.equals(this.moderationGroupIds, commentData.moderationGroupIds) &&
        Objects.equals(this.rating, commentData.rating) &&
        Objects.equals(this.fromOfflineRestore, commentData.fromOfflineRestore) &&
        Objects.equals(this.autoplayDelayMS, commentData.autoplayDelayMS) &&
        Objects.equals(this.feedbackIds, commentData.feedbackIds) &&
        Objects.equals(this.questionValues, commentData.questionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, localDateString, localDateHours, commenterName, commenterEmail, commenterLink, comment, productId, userId, avatarSrc, parentId, mentions, hashTags, pageTitle, isFromMyAccountPage, url, urlId, meta, moderationGroupIds, rating, fromOfflineRestore, autoplayDelayMS, feedbackIds, questionValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentData {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    localDateString: ").append(toIndentedString(localDateString)).append("\n");
    sb.append("    localDateHours: ").append(toIndentedString(localDateHours)).append("\n");
    sb.append("    commenterName: ").append(toIndentedString(commenterName)).append("\n");
    sb.append("    commenterEmail: ").append(toIndentedString(commenterEmail)).append("\n");
    sb.append("    commenterLink: ").append(toIndentedString(commenterLink)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    avatarSrc: ").append(toIndentedString(avatarSrc)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    hashTags: ").append(toIndentedString(hashTags)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    isFromMyAccountPage: ").append(toIndentedString(isFromMyAccountPage)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    moderationGroupIds: ").append(toIndentedString(moderationGroupIds)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    fromOfflineRestore: ").append(toIndentedString(fromOfflineRestore)).append("\n");
    sb.append("    autoplayDelayMS: ").append(toIndentedString(autoplayDelayMS)).append("\n");
    sb.append("    feedbackIds: ").append(toIndentedString(feedbackIds)).append("\n");
    sb.append("    questionValues: ").append(toIndentedString(questionValues)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("localDateString");
    openapiFields.add("localDateHours");
    openapiFields.add("commenterName");
    openapiFields.add("commenterEmail");
    openapiFields.add("commenterLink");
    openapiFields.add("comment");
    openapiFields.add("productId");
    openapiFields.add("userId");
    openapiFields.add("avatarSrc");
    openapiFields.add("parentId");
    openapiFields.add("mentions");
    openapiFields.add("hashTags");
    openapiFields.add("pageTitle");
    openapiFields.add("isFromMyAccountPage");
    openapiFields.add("url");
    openapiFields.add("urlId");
    openapiFields.add("meta");
    openapiFields.add("moderationGroupIds");
    openapiFields.add("rating");
    openapiFields.add("fromOfflineRestore");
    openapiFields.add("autoplayDelayMS");
    openapiFields.add("feedbackIds");
    openapiFields.add("questionValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("commenterName");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommentData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommentData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentData is not found in the empty JSON string", CommentData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommentData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommentData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("localDateString") != null && !jsonObj.get("localDateString").isJsonNull()) && !jsonObj.get("localDateString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localDateString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localDateString").toString()));
      }
      if (!jsonObj.get("commenterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterName").toString()));
      }
      if ((jsonObj.get("commenterEmail") != null && !jsonObj.get("commenterEmail").isJsonNull()) && !jsonObj.get("commenterEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterEmail").toString()));
      }
      if ((jsonObj.get("commenterLink") != null && !jsonObj.get("commenterLink").isJsonNull()) && !jsonObj.get("commenterLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterLink").toString()));
      }
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("avatarSrc") != null && !jsonObj.get("avatarSrc").isJsonNull()) && !jsonObj.get("avatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarSrc").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
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
      if ((jsonObj.get("pageTitle") != null && !jsonObj.get("pageTitle").isJsonNull()) && !jsonObj.get("pageTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageTitle").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("urlId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("moderationGroupIds") != null && !jsonObj.get("moderationGroupIds").isJsonNull() && !jsonObj.get("moderationGroupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `moderationGroupIds` to be an array in the JSON string but got `%s`", jsonObj.get("moderationGroupIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("feedbackIds") != null && !jsonObj.get("feedbackIds").isJsonNull() && !jsonObj.get("feedbackIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackIds` to be an array in the JSON string but got `%s`", jsonObj.get("feedbackIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentData.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentData>() {
           @Override
           public void write(JsonWriter out, CommentData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommentData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommentData
   * @throws IOException if the JSON string is invalid with respect to CommentData
   */
  public static CommentData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentData.class);
  }

  /**
   * Convert an instance of CommentData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


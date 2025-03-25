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
import com.fastcomments.model.CommentUserBadgeInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * From T, pick a set of properties whose keys are in the union K
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T09:21:20.273818640-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class PickFCommentPublicCommentFieldsKeys {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_ANON_USER_ID = "anonUserId";
  @SerializedName(SERIALIZED_NAME_ANON_USER_ID)
  @javax.annotation.Nullable
  private String anonUserId;

  public static final String SERIALIZED_NAME_COMMENTER_NAME = "commenterName";
  @SerializedName(SERIALIZED_NAME_COMMENTER_NAME)
  @javax.annotation.Nonnull
  private String commenterName;

  public static final String SERIALIZED_NAME_COMMENTER_LINK = "commenterLink";
  @SerializedName(SERIALIZED_NAME_COMMENTER_LINK)
  @javax.annotation.Nullable
  private String commenterLink;

  public static final String SERIALIZED_NAME_COMMENT_H_T_M_L = "commentHTML";
  @SerializedName(SERIALIZED_NAME_COMMENT_H_T_M_L)
  @javax.annotation.Nonnull
  private String commentHTML;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  @javax.annotation.Nullable
  private String parentId;

  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  @javax.annotation.Nullable
  private Integer votes;

  public static final String SERIALIZED_NAME_VOTES_UP = "votesUp";
  @SerializedName(SERIALIZED_NAME_VOTES_UP)
  @javax.annotation.Nullable
  private Integer votesUp;

  public static final String SERIALIZED_NAME_VOTES_DOWN = "votesDown";
  @SerializedName(SERIALIZED_NAME_VOTES_DOWN)
  @javax.annotation.Nullable
  private Integer votesDown;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  @javax.annotation.Nonnull
  private Boolean verified;

  public static final String SERIALIZED_NAME_AVATAR_SRC = "avatarSrc";
  @SerializedName(SERIALIZED_NAME_AVATAR_SRC)
  @javax.annotation.Nullable
  private String avatarSrc;

  public static final String SERIALIZED_NAME_IS_SPAM = "isSpam";
  @SerializedName(SERIALIZED_NAME_IS_SPAM)
  @javax.annotation.Nullable
  private Boolean isSpam;

  public static final String SERIALIZED_NAME_HAS_IMAGES = "hasImages";
  @SerializedName(SERIALIZED_NAME_HAS_IMAGES)
  @javax.annotation.Nullable
  private Boolean hasImages;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  @javax.annotation.Nullable
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_IS_DELETED_USER = "isDeletedUser";
  @SerializedName(SERIALIZED_NAME_IS_DELETED_USER)
  @javax.annotation.Nullable
  private Boolean isDeletedUser;

  public static final String SERIALIZED_NAME_IS_BY_ADMIN = "isByAdmin";
  @SerializedName(SERIALIZED_NAME_IS_BY_ADMIN)
  @javax.annotation.Nullable
  private Boolean isByAdmin;

  public static final String SERIALIZED_NAME_IS_BY_MODERATOR = "isByModerator";
  @SerializedName(SERIALIZED_NAME_IS_BY_MODERATOR)
  @javax.annotation.Nullable
  private Boolean isByModerator;

  public static final String SERIALIZED_NAME_IS_PINNED = "isPinned";
  @SerializedName(SERIALIZED_NAME_IS_PINNED)
  @javax.annotation.Nullable
  private Boolean isPinned;

  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  @javax.annotation.Nullable
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  @javax.annotation.Nullable
  private Double rating;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  @javax.annotation.Nullable
  private String displayLabel;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  @javax.annotation.Nullable
  private List<CommentUserBadgeInfo> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEEDBACK_IDS = "feedbackIds";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_IDS)
  @javax.annotation.Nullable
  private List<String> feedbackIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VIEW_COUNT = "viewCount";
  @SerializedName(SERIALIZED_NAME_VIEW_COUNT)
  @javax.annotation.Nullable
  private Double viewCount;

  public PickFCommentPublicCommentFieldsKeys() {
  }

  public PickFCommentPublicCommentFieldsKeys id(@javax.annotation.Nonnull String id) {
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


  public PickFCommentPublicCommentFieldsKeys date(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
  }


  public PickFCommentPublicCommentFieldsKeys userId(@javax.annotation.Nullable String userId) {
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


  public PickFCommentPublicCommentFieldsKeys anonUserId(@javax.annotation.Nullable String anonUserId) {
    this.anonUserId = anonUserId;
    return this;
  }

  /**
   * Get anonUserId
   * @return anonUserId
   */
  @javax.annotation.Nullable
  public String getAnonUserId() {
    return anonUserId;
  }

  public void setAnonUserId(@javax.annotation.Nullable String anonUserId) {
    this.anonUserId = anonUserId;
  }


  public PickFCommentPublicCommentFieldsKeys commenterName(@javax.annotation.Nonnull String commenterName) {
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


  public PickFCommentPublicCommentFieldsKeys commenterLink(@javax.annotation.Nullable String commenterLink) {
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


  public PickFCommentPublicCommentFieldsKeys commentHTML(@javax.annotation.Nonnull String commentHTML) {
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


  public PickFCommentPublicCommentFieldsKeys parentId(@javax.annotation.Nullable String parentId) {
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


  public PickFCommentPublicCommentFieldsKeys votes(@javax.annotation.Nullable Integer votes) {
    this.votes = votes;
    return this;
  }

  /**
   * Get votes
   * @return votes
   */
  @javax.annotation.Nullable
  public Integer getVotes() {
    return votes;
  }

  public void setVotes(@javax.annotation.Nullable Integer votes) {
    this.votes = votes;
  }


  public PickFCommentPublicCommentFieldsKeys votesUp(@javax.annotation.Nullable Integer votesUp) {
    this.votesUp = votesUp;
    return this;
  }

  /**
   * Get votesUp
   * @return votesUp
   */
  @javax.annotation.Nullable
  public Integer getVotesUp() {
    return votesUp;
  }

  public void setVotesUp(@javax.annotation.Nullable Integer votesUp) {
    this.votesUp = votesUp;
  }


  public PickFCommentPublicCommentFieldsKeys votesDown(@javax.annotation.Nullable Integer votesDown) {
    this.votesDown = votesDown;
    return this;
  }

  /**
   * Get votesDown
   * @return votesDown
   */
  @javax.annotation.Nullable
  public Integer getVotesDown() {
    return votesDown;
  }

  public void setVotesDown(@javax.annotation.Nullable Integer votesDown) {
    this.votesDown = votesDown;
  }


  public PickFCommentPublicCommentFieldsKeys verified(@javax.annotation.Nonnull Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   * @return verified
   */
  @javax.annotation.Nonnull
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(@javax.annotation.Nonnull Boolean verified) {
    this.verified = verified;
  }


  public PickFCommentPublicCommentFieldsKeys avatarSrc(@javax.annotation.Nullable String avatarSrc) {
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


  public PickFCommentPublicCommentFieldsKeys isSpam(@javax.annotation.Nullable Boolean isSpam) {
    this.isSpam = isSpam;
    return this;
  }

  /**
   * Get isSpam
   * @return isSpam
   */
  @javax.annotation.Nullable
  public Boolean getIsSpam() {
    return isSpam;
  }

  public void setIsSpam(@javax.annotation.Nullable Boolean isSpam) {
    this.isSpam = isSpam;
  }


  public PickFCommentPublicCommentFieldsKeys hasImages(@javax.annotation.Nullable Boolean hasImages) {
    this.hasImages = hasImages;
    return this;
  }

  /**
   * Get hasImages
   * @return hasImages
   */
  @javax.annotation.Nullable
  public Boolean getHasImages() {
    return hasImages;
  }

  public void setHasImages(@javax.annotation.Nullable Boolean hasImages) {
    this.hasImages = hasImages;
  }


  public PickFCommentPublicCommentFieldsKeys isDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public PickFCommentPublicCommentFieldsKeys isDeletedUser(@javax.annotation.Nullable Boolean isDeletedUser) {
    this.isDeletedUser = isDeletedUser;
    return this;
  }

  /**
   * Get isDeletedUser
   * @return isDeletedUser
   */
  @javax.annotation.Nullable
  public Boolean getIsDeletedUser() {
    return isDeletedUser;
  }

  public void setIsDeletedUser(@javax.annotation.Nullable Boolean isDeletedUser) {
    this.isDeletedUser = isDeletedUser;
  }


  public PickFCommentPublicCommentFieldsKeys isByAdmin(@javax.annotation.Nullable Boolean isByAdmin) {
    this.isByAdmin = isByAdmin;
    return this;
  }

  /**
   * Get isByAdmin
   * @return isByAdmin
   */
  @javax.annotation.Nullable
  public Boolean getIsByAdmin() {
    return isByAdmin;
  }

  public void setIsByAdmin(@javax.annotation.Nullable Boolean isByAdmin) {
    this.isByAdmin = isByAdmin;
  }


  public PickFCommentPublicCommentFieldsKeys isByModerator(@javax.annotation.Nullable Boolean isByModerator) {
    this.isByModerator = isByModerator;
    return this;
  }

  /**
   * Get isByModerator
   * @return isByModerator
   */
  @javax.annotation.Nullable
  public Boolean getIsByModerator() {
    return isByModerator;
  }

  public void setIsByModerator(@javax.annotation.Nullable Boolean isByModerator) {
    this.isByModerator = isByModerator;
  }


  public PickFCommentPublicCommentFieldsKeys isPinned(@javax.annotation.Nullable Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * Get isPinned
   * @return isPinned
   */
  @javax.annotation.Nullable
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(@javax.annotation.Nullable Boolean isPinned) {
    this.isPinned = isPinned;
  }


  public PickFCommentPublicCommentFieldsKeys isLocked(@javax.annotation.Nullable Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
   */
  @javax.annotation.Nullable
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(@javax.annotation.Nullable Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public PickFCommentPublicCommentFieldsKeys rating(@javax.annotation.Nullable Double rating) {
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


  public PickFCommentPublicCommentFieldsKeys displayLabel(@javax.annotation.Nullable String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
   */
  @javax.annotation.Nullable
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(@javax.annotation.Nullable String displayLabel) {
    this.displayLabel = displayLabel;
  }


  public PickFCommentPublicCommentFieldsKeys badges(@javax.annotation.Nullable List<CommentUserBadgeInfo> badges) {
    this.badges = badges;
    return this;
  }

  public PickFCommentPublicCommentFieldsKeys addBadgesItem(CommentUserBadgeInfo badgesItem) {
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


  public PickFCommentPublicCommentFieldsKeys feedbackIds(@javax.annotation.Nullable List<String> feedbackIds) {
    this.feedbackIds = feedbackIds;
    return this;
  }

  public PickFCommentPublicCommentFieldsKeys addFeedbackIdsItem(String feedbackIdsItem) {
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


  public PickFCommentPublicCommentFieldsKeys viewCount(@javax.annotation.Nullable Double viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  /**
   * Get viewCount
   * @return viewCount
   */
  @javax.annotation.Nullable
  public Double getViewCount() {
    return viewCount;
  }

  public void setViewCount(@javax.annotation.Nullable Double viewCount) {
    this.viewCount = viewCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFCommentPublicCommentFieldsKeys pickFCommentPublicCommentFieldsKeys = (PickFCommentPublicCommentFieldsKeys) o;
    return Objects.equals(this.id, pickFCommentPublicCommentFieldsKeys.id) &&
        Objects.equals(this.date, pickFCommentPublicCommentFieldsKeys.date) &&
        Objects.equals(this.userId, pickFCommentPublicCommentFieldsKeys.userId) &&
        Objects.equals(this.anonUserId, pickFCommentPublicCommentFieldsKeys.anonUserId) &&
        Objects.equals(this.commenterName, pickFCommentPublicCommentFieldsKeys.commenterName) &&
        Objects.equals(this.commenterLink, pickFCommentPublicCommentFieldsKeys.commenterLink) &&
        Objects.equals(this.commentHTML, pickFCommentPublicCommentFieldsKeys.commentHTML) &&
        Objects.equals(this.parentId, pickFCommentPublicCommentFieldsKeys.parentId) &&
        Objects.equals(this.votes, pickFCommentPublicCommentFieldsKeys.votes) &&
        Objects.equals(this.votesUp, pickFCommentPublicCommentFieldsKeys.votesUp) &&
        Objects.equals(this.votesDown, pickFCommentPublicCommentFieldsKeys.votesDown) &&
        Objects.equals(this.verified, pickFCommentPublicCommentFieldsKeys.verified) &&
        Objects.equals(this.avatarSrc, pickFCommentPublicCommentFieldsKeys.avatarSrc) &&
        Objects.equals(this.isSpam, pickFCommentPublicCommentFieldsKeys.isSpam) &&
        Objects.equals(this.hasImages, pickFCommentPublicCommentFieldsKeys.hasImages) &&
        Objects.equals(this.isDeleted, pickFCommentPublicCommentFieldsKeys.isDeleted) &&
        Objects.equals(this.isDeletedUser, pickFCommentPublicCommentFieldsKeys.isDeletedUser) &&
        Objects.equals(this.isByAdmin, pickFCommentPublicCommentFieldsKeys.isByAdmin) &&
        Objects.equals(this.isByModerator, pickFCommentPublicCommentFieldsKeys.isByModerator) &&
        Objects.equals(this.isPinned, pickFCommentPublicCommentFieldsKeys.isPinned) &&
        Objects.equals(this.isLocked, pickFCommentPublicCommentFieldsKeys.isLocked) &&
        Objects.equals(this.rating, pickFCommentPublicCommentFieldsKeys.rating) &&
        Objects.equals(this.displayLabel, pickFCommentPublicCommentFieldsKeys.displayLabel) &&
        Objects.equals(this.badges, pickFCommentPublicCommentFieldsKeys.badges) &&
        Objects.equals(this.feedbackIds, pickFCommentPublicCommentFieldsKeys.feedbackIds) &&
        Objects.equals(this.viewCount, pickFCommentPublicCommentFieldsKeys.viewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, userId, anonUserId, commenterName, commenterLink, commentHTML, parentId, votes, votesUp, votesDown, verified, avatarSrc, isSpam, hasImages, isDeleted, isDeletedUser, isByAdmin, isByModerator, isPinned, isLocked, rating, displayLabel, badges, feedbackIds, viewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFCommentPublicCommentFieldsKeys {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    anonUserId: ").append(toIndentedString(anonUserId)).append("\n");
    sb.append("    commenterName: ").append(toIndentedString(commenterName)).append("\n");
    sb.append("    commenterLink: ").append(toIndentedString(commenterLink)).append("\n");
    sb.append("    commentHTML: ").append(toIndentedString(commentHTML)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    votesUp: ").append(toIndentedString(votesUp)).append("\n");
    sb.append("    votesDown: ").append(toIndentedString(votesDown)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    avatarSrc: ").append(toIndentedString(avatarSrc)).append("\n");
    sb.append("    isSpam: ").append(toIndentedString(isSpam)).append("\n");
    sb.append("    hasImages: ").append(toIndentedString(hasImages)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isDeletedUser: ").append(toIndentedString(isDeletedUser)).append("\n");
    sb.append("    isByAdmin: ").append(toIndentedString(isByAdmin)).append("\n");
    sb.append("    isByModerator: ").append(toIndentedString(isByModerator)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    feedbackIds: ").append(toIndentedString(feedbackIds)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("userId");
    openapiFields.add("anonUserId");
    openapiFields.add("commenterName");
    openapiFields.add("commenterLink");
    openapiFields.add("commentHTML");
    openapiFields.add("parentId");
    openapiFields.add("votes");
    openapiFields.add("votesUp");
    openapiFields.add("votesDown");
    openapiFields.add("verified");
    openapiFields.add("avatarSrc");
    openapiFields.add("isSpam");
    openapiFields.add("hasImages");
    openapiFields.add("isDeleted");
    openapiFields.add("isDeletedUser");
    openapiFields.add("isByAdmin");
    openapiFields.add("isByModerator");
    openapiFields.add("isPinned");
    openapiFields.add("isLocked");
    openapiFields.add("rating");
    openapiFields.add("displayLabel");
    openapiFields.add("badges");
    openapiFields.add("feedbackIds");
    openapiFields.add("viewCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_id");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("commenterName");
    openapiRequiredFields.add("commentHTML");
    openapiRequiredFields.add("verified");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PickFCommentPublicCommentFieldsKeys
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PickFCommentPublicCommentFieldsKeys.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickFCommentPublicCommentFieldsKeys is not found in the empty JSON string", PickFCommentPublicCommentFieldsKeys.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PickFCommentPublicCommentFieldsKeys.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PickFCommentPublicCommentFieldsKeys` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PickFCommentPublicCommentFieldsKeys.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("anonUserId") != null && !jsonObj.get("anonUserId").isJsonNull()) && !jsonObj.get("anonUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anonUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anonUserId").toString()));
      }
      if (!jsonObj.get("commenterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterName").toString()));
      }
      if ((jsonObj.get("commenterLink") != null && !jsonObj.get("commenterLink").isJsonNull()) && !jsonObj.get("commenterLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterLink").toString()));
      }
      if (!jsonObj.get("commentHTML").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentHTML` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentHTML").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if ((jsonObj.get("avatarSrc") != null && !jsonObj.get("avatarSrc").isJsonNull()) && !jsonObj.get("avatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarSrc").toString()));
      }
      if ((jsonObj.get("displayLabel") != null && !jsonObj.get("displayLabel").isJsonNull()) && !jsonObj.get("displayLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayLabel").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("feedbackIds") != null && !jsonObj.get("feedbackIds").isJsonNull() && !jsonObj.get("feedbackIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackIds` to be an array in the JSON string but got `%s`", jsonObj.get("feedbackIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PickFCommentPublicCommentFieldsKeys.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickFCommentPublicCommentFieldsKeys' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickFCommentPublicCommentFieldsKeys> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickFCommentPublicCommentFieldsKeys.class));

       return (TypeAdapter<T>) new TypeAdapter<PickFCommentPublicCommentFieldsKeys>() {
           @Override
           public void write(JsonWriter out, PickFCommentPublicCommentFieldsKeys value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PickFCommentPublicCommentFieldsKeys read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PickFCommentPublicCommentFieldsKeys given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PickFCommentPublicCommentFieldsKeys
   * @throws IOException if the JSON string is invalid with respect to PickFCommentPublicCommentFieldsKeys
   */
  public static PickFCommentPublicCommentFieldsKeys fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickFCommentPublicCommentFieldsKeys.class);
  }

  /**
   * Convert an instance of PickFCommentPublicCommentFieldsKeys to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


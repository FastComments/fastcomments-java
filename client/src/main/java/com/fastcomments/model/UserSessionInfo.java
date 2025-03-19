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
 * UserSessionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T18:29:38.833167458-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class UserSessionInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_AUTHORIZED = "authorized";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED)
  @javax.annotation.Nullable
  private Boolean authorized;

  public static final String SERIALIZED_NAME_AVATAR_SRC = "avatarSrc";
  @SerializedName(SERIALIZED_NAME_AVATAR_SRC)
  @javax.annotation.Nullable
  private String avatarSrc;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  @javax.annotation.Nullable
  private String displayLabel;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  @javax.annotation.Nullable
  private List<String> groupIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_BLOCKED_USERS = "hasBlockedUsers";
  @SerializedName(SERIALIZED_NAME_HAS_BLOCKED_USERS)
  @javax.annotation.Nullable
  private Boolean hasBlockedUsers;

  public static final String SERIALIZED_NAME_IS_ANON_SESSION = "isAnonSession";
  @SerializedName(SERIALIZED_NAME_IS_ANON_SESSION)
  @javax.annotation.Nullable
  private Boolean isAnonSession;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  @javax.annotation.Nullable
  private String sessionId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  @javax.annotation.Nullable
  private String websiteUrl;

  public UserSessionInfo() {
  }

  public UserSessionInfo id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public UserSessionInfo authorized(@javax.annotation.Nullable Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Get authorized
   * @return authorized
   */
  @javax.annotation.Nullable
  public Boolean getAuthorized() {
    return authorized;
  }

  public void setAuthorized(@javax.annotation.Nullable Boolean authorized) {
    this.authorized = authorized;
  }


  public UserSessionInfo avatarSrc(@javax.annotation.Nullable String avatarSrc) {
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


  public UserSessionInfo displayLabel(@javax.annotation.Nullable String displayLabel) {
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


  public UserSessionInfo displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public UserSessionInfo email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public UserSessionInfo groupIds(@javax.annotation.Nullable List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public UserSessionInfo addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * Get groupIds
   * @return groupIds
   */
  @javax.annotation.Nullable
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(@javax.annotation.Nullable List<String> groupIds) {
    this.groupIds = groupIds;
  }


  public UserSessionInfo hasBlockedUsers(@javax.annotation.Nullable Boolean hasBlockedUsers) {
    this.hasBlockedUsers = hasBlockedUsers;
    return this;
  }

  /**
   * Get hasBlockedUsers
   * @return hasBlockedUsers
   */
  @javax.annotation.Nullable
  public Boolean getHasBlockedUsers() {
    return hasBlockedUsers;
  }

  public void setHasBlockedUsers(@javax.annotation.Nullable Boolean hasBlockedUsers) {
    this.hasBlockedUsers = hasBlockedUsers;
  }


  public UserSessionInfo isAnonSession(@javax.annotation.Nullable Boolean isAnonSession) {
    this.isAnonSession = isAnonSession;
    return this;
  }

  /**
   * Get isAnonSession
   * @return isAnonSession
   */
  @javax.annotation.Nullable
  public Boolean getIsAnonSession() {
    return isAnonSession;
  }

  public void setIsAnonSession(@javax.annotation.Nullable Boolean isAnonSession) {
    this.isAnonSession = isAnonSession;
  }


  public UserSessionInfo sessionId(@javax.annotation.Nullable String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
   */
  @javax.annotation.Nullable
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(@javax.annotation.Nullable String sessionId) {
    this.sessionId = sessionId;
  }


  public UserSessionInfo username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public UserSessionInfo websiteUrl(@javax.annotation.Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Get websiteUrl
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(@javax.annotation.Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSessionInfo userSessionInfo = (UserSessionInfo) o;
    return Objects.equals(this.id, userSessionInfo.id) &&
        Objects.equals(this.authorized, userSessionInfo.authorized) &&
        Objects.equals(this.avatarSrc, userSessionInfo.avatarSrc) &&
        Objects.equals(this.displayLabel, userSessionInfo.displayLabel) &&
        Objects.equals(this.displayName, userSessionInfo.displayName) &&
        Objects.equals(this.email, userSessionInfo.email) &&
        Objects.equals(this.groupIds, userSessionInfo.groupIds) &&
        Objects.equals(this.hasBlockedUsers, userSessionInfo.hasBlockedUsers) &&
        Objects.equals(this.isAnonSession, userSessionInfo.isAnonSession) &&
        Objects.equals(this.sessionId, userSessionInfo.sessionId) &&
        Objects.equals(this.username, userSessionInfo.username) &&
        Objects.equals(this.websiteUrl, userSessionInfo.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authorized, avatarSrc, displayLabel, displayName, email, groupIds, hasBlockedUsers, isAnonSession, sessionId, username, websiteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSessionInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    avatarSrc: ").append(toIndentedString(avatarSrc)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    hasBlockedUsers: ").append(toIndentedString(hasBlockedUsers)).append("\n");
    sb.append("    isAnonSession: ").append(toIndentedString(isAnonSession)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("authorized");
    openapiFields.add("avatarSrc");
    openapiFields.add("displayLabel");
    openapiFields.add("displayName");
    openapiFields.add("email");
    openapiFields.add("groupIds");
    openapiFields.add("hasBlockedUsers");
    openapiFields.add("isAnonSession");
    openapiFields.add("sessionId");
    openapiFields.add("username");
    openapiFields.add("websiteUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserSessionInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserSessionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSessionInfo is not found in the empty JSON string", UserSessionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserSessionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSessionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("avatarSrc") != null && !jsonObj.get("avatarSrc").isJsonNull()) && !jsonObj.get("avatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarSrc").toString()));
      }
      if ((jsonObj.get("displayLabel") != null && !jsonObj.get("displayLabel").isJsonNull()) && !jsonObj.get("displayLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayLabel").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupIds") != null && !jsonObj.get("groupIds").isJsonNull() && !jsonObj.get("groupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIds` to be an array in the JSON string but got `%s`", jsonObj.get("groupIds").toString()));
      }
      if ((jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonNull()) && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSessionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSessionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSessionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSessionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSessionInfo>() {
           @Override
           public void write(JsonWriter out, UserSessionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSessionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserSessionInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserSessionInfo
   * @throws IOException if the JSON string is invalid with respect to UserSessionInfo
   */
  public static UserSessionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSessionInfo.class);
  }

  /**
   * Convert an instance of UserSessionInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * AuthenticatedUserDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-13T15:35:31.564388153-08:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AuthenticatedUserDetails {
  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  @javax.annotation.Nullable
  private String websiteUrl;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  @javax.annotation.Nullable
  private String sessionId;

  public static final String SERIALIZED_NAME_HAS_BLOCKED_USERS = "hasBlockedUsers";
  @SerializedName(SERIALIZED_NAME_HAS_BLOCKED_USERS)
  @javax.annotation.Nullable
  private Boolean hasBlockedUsers;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  @javax.annotation.Nullable
  private List<String> groupIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  @javax.annotation.Nullable
  private String displayName;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  @javax.annotation.Nullable
  private String displayLabel;

  public static final String SERIALIZED_NAME_AVATAR_SRC = "avatarSrc";
  @SerializedName(SERIALIZED_NAME_AVATAR_SRC)
  @javax.annotation.Nullable
  private String avatarSrc;

  public static final String SERIALIZED_NAME_AUTHORIZED = "authorized";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED)
  @javax.annotation.Nullable
  private Boolean authorized;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public AuthenticatedUserDetails() {
  }

  public AuthenticatedUserDetails websiteUrl(@javax.annotation.Nullable String websiteUrl) {
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


  public AuthenticatedUserDetails username(@javax.annotation.Nullable String username) {
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


  public AuthenticatedUserDetails sessionId(@javax.annotation.Nullable String sessionId) {
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


  public AuthenticatedUserDetails hasBlockedUsers(@javax.annotation.Nullable Boolean hasBlockedUsers) {
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


  public AuthenticatedUserDetails groupIds(@javax.annotation.Nullable List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public AuthenticatedUserDetails addGroupIdsItem(String groupIdsItem) {
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


  public AuthenticatedUserDetails email(@javax.annotation.Nullable String email) {
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


  public AuthenticatedUserDetails displayName(@javax.annotation.Nullable String displayName) {
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


  public AuthenticatedUserDetails displayLabel(@javax.annotation.Nullable String displayLabel) {
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


  public AuthenticatedUserDetails avatarSrc(@javax.annotation.Nullable String avatarSrc) {
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


  public AuthenticatedUserDetails authorized(@javax.annotation.Nullable Boolean authorized) {
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


  public AuthenticatedUserDetails id(@javax.annotation.Nullable String id) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedUserDetails authenticatedUserDetails = (AuthenticatedUserDetails) o;
    return Objects.equals(this.websiteUrl, authenticatedUserDetails.websiteUrl) &&
        Objects.equals(this.username, authenticatedUserDetails.username) &&
        Objects.equals(this.sessionId, authenticatedUserDetails.sessionId) &&
        Objects.equals(this.hasBlockedUsers, authenticatedUserDetails.hasBlockedUsers) &&
        Objects.equals(this.groupIds, authenticatedUserDetails.groupIds) &&
        Objects.equals(this.email, authenticatedUserDetails.email) &&
        Objects.equals(this.displayName, authenticatedUserDetails.displayName) &&
        Objects.equals(this.displayLabel, authenticatedUserDetails.displayLabel) &&
        Objects.equals(this.avatarSrc, authenticatedUserDetails.avatarSrc) &&
        Objects.equals(this.authorized, authenticatedUserDetails.authorized) &&
        Objects.equals(this.id, authenticatedUserDetails.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(websiteUrl, username, sessionId, hasBlockedUsers, groupIds, email, displayName, displayLabel, avatarSrc, authorized, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedUserDetails {\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    hasBlockedUsers: ").append(toIndentedString(hasBlockedUsers)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    avatarSrc: ").append(toIndentedString(avatarSrc)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("websiteUrl");
    openapiFields.add("username");
    openapiFields.add("sessionId");
    openapiFields.add("hasBlockedUsers");
    openapiFields.add("groupIds");
    openapiFields.add("email");
    openapiFields.add("displayName");
    openapiFields.add("displayLabel");
    openapiFields.add("avatarSrc");
    openapiFields.add("authorized");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatedUserDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatedUserDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatedUserDetails is not found in the empty JSON string", AuthenticatedUserDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatedUserDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatedUserDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonNull()) && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupIds") != null && !jsonObj.get("groupIds").isJsonNull() && !jsonObj.get("groupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIds` to be an array in the JSON string but got `%s`", jsonObj.get("groupIds").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("displayLabel") != null && !jsonObj.get("displayLabel").isJsonNull()) && !jsonObj.get("displayLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayLabel").toString()));
      }
      if ((jsonObj.get("avatarSrc") != null && !jsonObj.get("avatarSrc").isJsonNull()) && !jsonObj.get("avatarSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarSrc").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatedUserDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatedUserDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatedUserDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatedUserDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatedUserDetails>() {
           @Override
           public void write(JsonWriter out, AuthenticatedUserDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatedUserDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatedUserDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatedUserDetails
   * @throws IOException if the JSON string is invalid with respect to AuthenticatedUserDetails
   */
  public static AuthenticatedUserDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatedUserDetails.class);
  }

  /**
   * Convert an instance of AuthenticatedUserDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


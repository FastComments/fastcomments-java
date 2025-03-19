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
import com.fastcomments.model.VoteResponseStatus;
import com.fastcomments.model.VoteResponseUser;
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
 * VoteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T18:22:15.331392007-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class VoteResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private VoteResponseStatus status;

  public static final String SERIALIZED_NAME_VOTE_ID = "voteId";
  @SerializedName(SERIALIZED_NAME_VOTE_ID)
  @javax.annotation.Nullable
  private String voteId;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "isVerified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  @javax.annotation.Nullable
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nullable
  private VoteResponseUser user;

  public static final String SERIALIZED_NAME_EDIT_KEY = "editKey";
  @SerializedName(SERIALIZED_NAME_EDIT_KEY)
  @javax.annotation.Nullable
  private String editKey;

  public VoteResponse() {
  }

  public VoteResponse status(@javax.annotation.Nonnull VoteResponseStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public VoteResponseStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull VoteResponseStatus status) {
    this.status = status;
  }


  public VoteResponse voteId(@javax.annotation.Nullable String voteId) {
    this.voteId = voteId;
    return this;
  }

  /**
   * Get voteId
   * @return voteId
   */
  @javax.annotation.Nullable
  public String getVoteId() {
    return voteId;
  }

  public void setVoteId(@javax.annotation.Nullable String voteId) {
    this.voteId = voteId;
  }


  public VoteResponse isVerified(@javax.annotation.Nullable Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

  /**
   * Get isVerified
   * @return isVerified
   */
  @javax.annotation.Nullable
  public Boolean getIsVerified() {
    return isVerified;
  }

  public void setIsVerified(@javax.annotation.Nullable Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public VoteResponse user(@javax.annotation.Nullable VoteResponseUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public VoteResponseUser getUser() {
    return user;
  }

  public void setUser(@javax.annotation.Nullable VoteResponseUser user) {
    this.user = user;
  }


  public VoteResponse editKey(@javax.annotation.Nullable String editKey) {
    this.editKey = editKey;
    return this;
  }

  /**
   * Get editKey
   * @return editKey
   */
  @javax.annotation.Nullable
  public String getEditKey() {
    return editKey;
  }

  public void setEditKey(@javax.annotation.Nullable String editKey) {
    this.editKey = editKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteResponse voteResponse = (VoteResponse) o;
    return Objects.equals(this.status, voteResponse.status) &&
        Objects.equals(this.voteId, voteResponse.voteId) &&
        Objects.equals(this.isVerified, voteResponse.isVerified) &&
        Objects.equals(this.user, voteResponse.user) &&
        Objects.equals(this.editKey, voteResponse.editKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, voteId, isVerified, user, editKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voteId: ").append(toIndentedString(voteId)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    editKey: ").append(toIndentedString(editKey)).append("\n");
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
    openapiFields.add("voteId");
    openapiFields.add("isVerified");
    openapiFields.add("user");
    openapiFields.add("editKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VoteResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoteResponse is not found in the empty JSON string", VoteResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoteResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoteResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoteResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      VoteResponseStatus.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("voteId") != null && !jsonObj.get("voteId").isJsonNull()) && !jsonObj.get("voteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voteId").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        VoteResponseUser.validateJsonElement(jsonObj.get("user"));
      }
      if ((jsonObj.get("editKey") != null && !jsonObj.get("editKey").isJsonNull()) && !jsonObj.get("editKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VoteResponse>() {
           @Override
           public void write(JsonWriter out, VoteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoteResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VoteResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VoteResponse
   * @throws IOException if the JSON string is invalid with respect to VoteResponse
   */
  public static VoteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoteResponse.class);
  }

  /**
   * Convert an instance of VoteResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


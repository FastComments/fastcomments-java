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
import com.fastcomments.model.ImportedAPIStatusSUCCESS;
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
 * GetCommentVoteUserNamesSuccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-14T16:35:28.973572523-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetCommentVoteUserNamesSuccessResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ImportedAPIStatusSUCCESS status;

  public static final String SERIALIZED_NAME_VOTE_USER_NAMES = "voteUserNames";
  @SerializedName(SERIALIZED_NAME_VOTE_USER_NAMES)
  @javax.annotation.Nonnull
  private List<String> voteUserNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_MORE = "hasMore";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  @javax.annotation.Nonnull
  private Boolean hasMore;

  public GetCommentVoteUserNamesSuccessResponse() {
  }

  public GetCommentVoteUserNamesSuccessResponse status(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ImportedAPIStatusSUCCESS getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull ImportedAPIStatusSUCCESS status) {
    this.status = status;
  }


  public GetCommentVoteUserNamesSuccessResponse voteUserNames(@javax.annotation.Nonnull List<String> voteUserNames) {
    this.voteUserNames = voteUserNames;
    return this;
  }

  public GetCommentVoteUserNamesSuccessResponse addVoteUserNamesItem(String voteUserNamesItem) {
    if (this.voteUserNames == null) {
      this.voteUserNames = new ArrayList<>();
    }
    this.voteUserNames.add(voteUserNamesItem);
    return this;
  }

  /**
   * Get voteUserNames
   * @return voteUserNames
   */
  @javax.annotation.Nonnull
  public List<String> getVoteUserNames() {
    return voteUserNames;
  }

  public void setVoteUserNames(@javax.annotation.Nonnull List<String> voteUserNames) {
    this.voteUserNames = voteUserNames;
  }


  public GetCommentVoteUserNamesSuccessResponse hasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @javax.annotation.Nonnull
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCommentVoteUserNamesSuccessResponse getCommentVoteUserNamesSuccessResponse = (GetCommentVoteUserNamesSuccessResponse) o;
    return Objects.equals(this.status, getCommentVoteUserNamesSuccessResponse.status) &&
        Objects.equals(this.voteUserNames, getCommentVoteUserNamesSuccessResponse.voteUserNames) &&
        Objects.equals(this.hasMore, getCommentVoteUserNamesSuccessResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, voteUserNames, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommentVoteUserNamesSuccessResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voteUserNames: ").append(toIndentedString(voteUserNames)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
    openapiFields.add("voteUserNames");
    openapiFields.add("hasMore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("voteUserNames");
    openapiRequiredFields.add("hasMore");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCommentVoteUserNamesSuccessResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCommentVoteUserNamesSuccessResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCommentVoteUserNamesSuccessResponse is not found in the empty JSON string", GetCommentVoteUserNamesSuccessResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCommentVoteUserNamesSuccessResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCommentVoteUserNamesSuccessResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCommentVoteUserNamesSuccessResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      ImportedAPIStatusSUCCESS.validateJsonElement(jsonObj.get("status"));
      // ensure the required json array is present
      if (jsonObj.get("voteUserNames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("voteUserNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voteUserNames` to be an array in the JSON string but got `%s`", jsonObj.get("voteUserNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCommentVoteUserNamesSuccessResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCommentVoteUserNamesSuccessResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCommentVoteUserNamesSuccessResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCommentVoteUserNamesSuccessResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCommentVoteUserNamesSuccessResponse>() {
           @Override
           public void write(JsonWriter out, GetCommentVoteUserNamesSuccessResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCommentVoteUserNamesSuccessResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCommentVoteUserNamesSuccessResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCommentVoteUserNamesSuccessResponse
   * @throws IOException if the JSON string is invalid with respect to GetCommentVoteUserNamesSuccessResponse
   */
  public static GetCommentVoteUserNamesSuccessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCommentVoteUserNamesSuccessResponse.class);
  }

  /**
   * Convert an instance of GetCommentVoteUserNamesSuccessResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


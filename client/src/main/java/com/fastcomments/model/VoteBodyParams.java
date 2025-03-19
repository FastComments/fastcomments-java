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
 * VoteBodyParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T18:22:15.331392007-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class VoteBodyParams {
  public static final String SERIALIZED_NAME_COMMENTER_EMAIL = "commenterEmail";
  @SerializedName(SERIALIZED_NAME_COMMENTER_EMAIL)
  @javax.annotation.Nullable
  private String commenterEmail;

  public static final String SERIALIZED_NAME_COMMENTER_NAME = "commenterName";
  @SerializedName(SERIALIZED_NAME_COMMENTER_NAME)
  @javax.annotation.Nullable
  private String commenterName;

  /**
   * Gets or Sets voteDir
   */
  @JsonAdapter(VoteDirEnum.Adapter.class)
  public enum VoteDirEnum {
    UP("up"),
    
    DOWN("down");

    private String value;

    VoteDirEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoteDirEnum fromValue(String value) {
      for (VoteDirEnum b : VoteDirEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VoteDirEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoteDirEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoteDirEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VoteDirEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VoteDirEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VOTE_DIR = "voteDir";
  @SerializedName(SERIALIZED_NAME_VOTE_DIR)
  @javax.annotation.Nonnull
  private VoteDirEnum voteDir;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public VoteBodyParams() {
  }

  public VoteBodyParams commenterEmail(@javax.annotation.Nullable String commenterEmail) {
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


  public VoteBodyParams commenterName(@javax.annotation.Nullable String commenterName) {
    this.commenterName = commenterName;
    return this;
  }

  /**
   * Get commenterName
   * @return commenterName
   */
  @javax.annotation.Nullable
  public String getCommenterName() {
    return commenterName;
  }

  public void setCommenterName(@javax.annotation.Nullable String commenterName) {
    this.commenterName = commenterName;
  }


  public VoteBodyParams voteDir(@javax.annotation.Nonnull VoteDirEnum voteDir) {
    this.voteDir = voteDir;
    return this;
  }

  /**
   * Get voteDir
   * @return voteDir
   */
  @javax.annotation.Nonnull
  public VoteDirEnum getVoteDir() {
    return voteDir;
  }

  public void setVoteDir(@javax.annotation.Nonnull VoteDirEnum voteDir) {
    this.voteDir = voteDir;
  }


  public VoteBodyParams url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteBodyParams voteBodyParams = (VoteBodyParams) o;
    return Objects.equals(this.commenterEmail, voteBodyParams.commenterEmail) &&
        Objects.equals(this.commenterName, voteBodyParams.commenterName) &&
        Objects.equals(this.voteDir, voteBodyParams.voteDir) &&
        Objects.equals(this.url, voteBodyParams.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commenterEmail, commenterName, voteDir, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteBodyParams {\n");
    sb.append("    commenterEmail: ").append(toIndentedString(commenterEmail)).append("\n");
    sb.append("    commenterName: ").append(toIndentedString(commenterName)).append("\n");
    sb.append("    voteDir: ").append(toIndentedString(voteDir)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("commenterEmail");
    openapiFields.add("commenterName");
    openapiFields.add("voteDir");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commenterEmail");
    openapiRequiredFields.add("commenterName");
    openapiRequiredFields.add("voteDir");
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VoteBodyParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoteBodyParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoteBodyParams is not found in the empty JSON string", VoteBodyParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoteBodyParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoteBodyParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoteBodyParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("commenterEmail") != null && !jsonObj.get("commenterEmail").isJsonNull()) && !jsonObj.get("commenterEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterEmail").toString()));
      }
      if ((jsonObj.get("commenterName") != null && !jsonObj.get("commenterName").isJsonNull()) && !jsonObj.get("commenterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commenterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commenterName").toString()));
      }
      if (!jsonObj.get("voteDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voteDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voteDir").toString()));
      }
      // validate the required field `voteDir`
      VoteDirEnum.validateJsonElement(jsonObj.get("voteDir"));
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoteBodyParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoteBodyParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoteBodyParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoteBodyParams.class));

       return (TypeAdapter<T>) new TypeAdapter<VoteBodyParams>() {
           @Override
           public void write(JsonWriter out, VoteBodyParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoteBodyParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VoteBodyParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VoteBodyParams
   * @throws IOException if the JSON string is invalid with respect to VoteBodyParams
   */
  public static VoteBodyParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoteBodyParams.class);
  }

  /**
   * Convert an instance of VoteBodyParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * SpamRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T17:06:48.661467821-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class SpamRule {
  /**
   * Gets or Sets actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    SPAM("spam"),
    
    NOT_SPAM("not-spam"),
    
    IGNORE_REPEAT("ignore-repeat");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionsEnum fromValue(String value) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  @javax.annotation.Nonnull
  private List<ActionsEnum> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT_CONTAINS = "commentContains";
  @SerializedName(SERIALIZED_NAME_COMMENT_CONTAINS)
  @javax.annotation.Nullable
  private String commentContains;

  public SpamRule() {
  }

  public SpamRule actions(@javax.annotation.Nonnull List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public SpamRule addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   */
  @javax.annotation.Nonnull
  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(@javax.annotation.Nonnull List<ActionsEnum> actions) {
    this.actions = actions;
  }


  public SpamRule commentContains(@javax.annotation.Nullable String commentContains) {
    this.commentContains = commentContains;
    return this;
  }

  /**
   * Get commentContains
   * @return commentContains
   */
  @javax.annotation.Nullable
  public String getCommentContains() {
    return commentContains;
  }

  public void setCommentContains(@javax.annotation.Nullable String commentContains) {
    this.commentContains = commentContains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpamRule spamRule = (SpamRule) o;
    return Objects.equals(this.actions, spamRule.actions) &&
        Objects.equals(this.commentContains, spamRule.commentContains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, commentContains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpamRule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    commentContains: ").append(toIndentedString(commentContains)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("commentContains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("actions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SpamRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpamRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpamRule is not found in the empty JSON string", SpamRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpamRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpamRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SpamRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("actions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
      }
      if ((jsonObj.get("commentContains") != null && !jsonObj.get("commentContains").isJsonNull()) && !jsonObj.get("commentContains").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentContains` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentContains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpamRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpamRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpamRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpamRule.class));

       return (TypeAdapter<T>) new TypeAdapter<SpamRule>() {
           @Override
           public void write(JsonWriter out, SpamRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpamRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SpamRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SpamRule
   * @throws IOException if the JSON string is invalid with respect to SpamRule
   */
  public static SpamRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpamRule.class);
  }

  /**
   * Convert an instance of SpamRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


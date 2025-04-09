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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets LiveEventType
 */
@JsonAdapter(LiveEventType.Adapter.class)
public enum LiveEventType {
  
  UPDATE_BADGES("update-badges"),
  
  NOTIFICATION("notification"),
  
  P_U("p-u"),
  
  NEW_VOTE("new-vote"),
  
  DELETED_VOTE("deleted-vote"),
  
  NEW_COMMENT("new-comment"),
  
  UPDATED_COMMENT("updated-comment"),
  
  DELETED_COMMENT("deleted-comment"),
  
  CVC("cvc"),
  
  NEW_CONFIG("new-config"),
  
  THREAD_STATE_CHANGE("thread-state-change"),
  
  FR("fr"),
  
  DFR("dfr"),
  
  NEW_FEED_POST("new-feed-post");

  private String value;

  LiveEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveEventType fromValue(String value) {
    for (LiveEventType b : LiveEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LiveEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LiveEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LiveEventType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    LiveEventType.fromValue(value);
  }
}


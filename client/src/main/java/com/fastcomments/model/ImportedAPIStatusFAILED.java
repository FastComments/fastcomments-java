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
 * Gets or Sets ImportedAPIStatus.FAILED
 */
@JsonAdapter(ImportedAPIStatusFAILED.Adapter.class)
public enum ImportedAPIStatusFAILED {
  
  FAILED("failed");

  private String value;

  ImportedAPIStatusFAILED(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImportedAPIStatusFAILED fromValue(String value) {
    for (ImportedAPIStatusFAILED b : ImportedAPIStatusFAILED.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ImportedAPIStatusFAILED> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImportedAPIStatusFAILED enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImportedAPIStatusFAILED read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImportedAPIStatusFAILED.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ImportedAPIStatusFAILED.fromValue(value);
  }
}


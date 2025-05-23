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
import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets QuestionRenderingType
 */
@JsonAdapter(QuestionRenderingType.Adapter.class)
public enum QuestionRenderingType {
  
  NUMBER_0(new BigDecimal("0")),
  
  NUMBER_1(new BigDecimal("1"));

  private BigDecimal value;

  QuestionRenderingType(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QuestionRenderingType fromValue(BigDecimal value) {
    for (QuestionRenderingType b : QuestionRenderingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QuestionRenderingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QuestionRenderingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QuestionRenderingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QuestionRenderingType.fromValue(new BigDecimal(value));
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    QuestionRenderingType.fromValue(new BigDecimal(value));
  }
}


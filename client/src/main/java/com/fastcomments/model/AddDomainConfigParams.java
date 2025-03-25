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
import java.util.HashMap;
import java.util.Map;

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
 * AddDomainConfigParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T10:12:49.770182242-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class AddDomainConfigParams {
  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  @javax.annotation.Nonnull
  private String domain;

  public static final String SERIALIZED_NAME_EMAIL_FROM_NAME = "emailFromName";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_NAME)
  @javax.annotation.Nullable
  private String emailFromName;

  public static final String SERIALIZED_NAME_EMAIL_FROM_EMAIL = "emailFromEmail";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM_EMAIL)
  @javax.annotation.Nullable
  private String emailFromEmail;

  public static final String SERIALIZED_NAME_LOGO_SRC = "logoSrc";
  @SerializedName(SERIALIZED_NAME_LOGO_SRC)
  @javax.annotation.Nullable
  private String logoSrc;

  public static final String SERIALIZED_NAME_LOGO_SRC100PX = "logoSrc100px";
  @SerializedName(SERIALIZED_NAME_LOGO_SRC100PX)
  @javax.annotation.Nullable
  private String logoSrc100px;

  public static final String SERIALIZED_NAME_FOOTER_UNSUBSCRIBE_U_R_L = "footerUnsubscribeURL";
  @SerializedName(SERIALIZED_NAME_FOOTER_UNSUBSCRIBE_U_R_L)
  @javax.annotation.Nullable
  private String footerUnsubscribeURL;

  public static final String SERIALIZED_NAME_EMAIL_HEADERS = "emailHeaders";
  @SerializedName(SERIALIZED_NAME_EMAIL_HEADERS)
  @javax.annotation.Nullable
  private Map<String, String> emailHeaders = new HashMap<>();

  public AddDomainConfigParams() {
  }

  public AddDomainConfigParams domain(@javax.annotation.Nonnull String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
   */
  @javax.annotation.Nonnull
  public String getDomain() {
    return domain;
  }

  public void setDomain(@javax.annotation.Nonnull String domain) {
    this.domain = domain;
  }


  public AddDomainConfigParams emailFromName(@javax.annotation.Nullable String emailFromName) {
    this.emailFromName = emailFromName;
    return this;
  }

  /**
   * Get emailFromName
   * @return emailFromName
   */
  @javax.annotation.Nullable
  public String getEmailFromName() {
    return emailFromName;
  }

  public void setEmailFromName(@javax.annotation.Nullable String emailFromName) {
    this.emailFromName = emailFromName;
  }


  public AddDomainConfigParams emailFromEmail(@javax.annotation.Nullable String emailFromEmail) {
    this.emailFromEmail = emailFromEmail;
    return this;
  }

  /**
   * Get emailFromEmail
   * @return emailFromEmail
   */
  @javax.annotation.Nullable
  public String getEmailFromEmail() {
    return emailFromEmail;
  }

  public void setEmailFromEmail(@javax.annotation.Nullable String emailFromEmail) {
    this.emailFromEmail = emailFromEmail;
  }


  public AddDomainConfigParams logoSrc(@javax.annotation.Nullable String logoSrc) {
    this.logoSrc = logoSrc;
    return this;
  }

  /**
   * Get logoSrc
   * @return logoSrc
   */
  @javax.annotation.Nullable
  public String getLogoSrc() {
    return logoSrc;
  }

  public void setLogoSrc(@javax.annotation.Nullable String logoSrc) {
    this.logoSrc = logoSrc;
  }


  public AddDomainConfigParams logoSrc100px(@javax.annotation.Nullable String logoSrc100px) {
    this.logoSrc100px = logoSrc100px;
    return this;
  }

  /**
   * Get logoSrc100px
   * @return logoSrc100px
   */
  @javax.annotation.Nullable
  public String getLogoSrc100px() {
    return logoSrc100px;
  }

  public void setLogoSrc100px(@javax.annotation.Nullable String logoSrc100px) {
    this.logoSrc100px = logoSrc100px;
  }


  public AddDomainConfigParams footerUnsubscribeURL(@javax.annotation.Nullable String footerUnsubscribeURL) {
    this.footerUnsubscribeURL = footerUnsubscribeURL;
    return this;
  }

  /**
   * Get footerUnsubscribeURL
   * @return footerUnsubscribeURL
   */
  @javax.annotation.Nullable
  public String getFooterUnsubscribeURL() {
    return footerUnsubscribeURL;
  }

  public void setFooterUnsubscribeURL(@javax.annotation.Nullable String footerUnsubscribeURL) {
    this.footerUnsubscribeURL = footerUnsubscribeURL;
  }


  public AddDomainConfigParams emailHeaders(@javax.annotation.Nullable Map<String, String> emailHeaders) {
    this.emailHeaders = emailHeaders;
    return this;
  }

  public AddDomainConfigParams putEmailHeadersItem(String key, String emailHeadersItem) {
    if (this.emailHeaders == null) {
      this.emailHeaders = new HashMap<>();
    }
    this.emailHeaders.put(key, emailHeadersItem);
    return this;
  }

  /**
   * Construct a type with a set of properties K of type T
   * @return emailHeaders
   */
  @javax.annotation.Nullable
  public Map<String, String> getEmailHeaders() {
    return emailHeaders;
  }

  public void setEmailHeaders(@javax.annotation.Nullable Map<String, String> emailHeaders) {
    this.emailHeaders = emailHeaders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDomainConfigParams addDomainConfigParams = (AddDomainConfigParams) o;
    return Objects.equals(this.domain, addDomainConfigParams.domain) &&
        Objects.equals(this.emailFromName, addDomainConfigParams.emailFromName) &&
        Objects.equals(this.emailFromEmail, addDomainConfigParams.emailFromEmail) &&
        Objects.equals(this.logoSrc, addDomainConfigParams.logoSrc) &&
        Objects.equals(this.logoSrc100px, addDomainConfigParams.logoSrc100px) &&
        Objects.equals(this.footerUnsubscribeURL, addDomainConfigParams.footerUnsubscribeURL) &&
        Objects.equals(this.emailHeaders, addDomainConfigParams.emailHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, emailFromName, emailFromEmail, logoSrc, logoSrc100px, footerUnsubscribeURL, emailHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDomainConfigParams {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    emailFromName: ").append(toIndentedString(emailFromName)).append("\n");
    sb.append("    emailFromEmail: ").append(toIndentedString(emailFromEmail)).append("\n");
    sb.append("    logoSrc: ").append(toIndentedString(logoSrc)).append("\n");
    sb.append("    logoSrc100px: ").append(toIndentedString(logoSrc100px)).append("\n");
    sb.append("    footerUnsubscribeURL: ").append(toIndentedString(footerUnsubscribeURL)).append("\n");
    sb.append("    emailHeaders: ").append(toIndentedString(emailHeaders)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("emailFromName");
    openapiFields.add("emailFromEmail");
    openapiFields.add("logoSrc");
    openapiFields.add("logoSrc100px");
    openapiFields.add("footerUnsubscribeURL");
    openapiFields.add("emailHeaders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddDomainConfigParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddDomainConfigParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddDomainConfigParams is not found in the empty JSON string", AddDomainConfigParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddDomainConfigParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddDomainConfigParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddDomainConfigParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("emailFromName") != null && !jsonObj.get("emailFromName").isJsonNull()) && !jsonObj.get("emailFromName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailFromName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailFromName").toString()));
      }
      if ((jsonObj.get("emailFromEmail") != null && !jsonObj.get("emailFromEmail").isJsonNull()) && !jsonObj.get("emailFromEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailFromEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailFromEmail").toString()));
      }
      if ((jsonObj.get("logoSrc") != null && !jsonObj.get("logoSrc").isJsonNull()) && !jsonObj.get("logoSrc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoSrc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoSrc").toString()));
      }
      if ((jsonObj.get("logoSrc100px") != null && !jsonObj.get("logoSrc100px").isJsonNull()) && !jsonObj.get("logoSrc100px").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoSrc100px` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoSrc100px").toString()));
      }
      if ((jsonObj.get("footerUnsubscribeURL") != null && !jsonObj.get("footerUnsubscribeURL").isJsonNull()) && !jsonObj.get("footerUnsubscribeURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footerUnsubscribeURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footerUnsubscribeURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddDomainConfigParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddDomainConfigParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddDomainConfigParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddDomainConfigParams.class));

       return (TypeAdapter<T>) new TypeAdapter<AddDomainConfigParams>() {
           @Override
           public void write(JsonWriter out, AddDomainConfigParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddDomainConfigParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddDomainConfigParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddDomainConfigParams
   * @throws IOException if the JSON string is invalid with respect to AddDomainConfigParams
   */
  public static AddDomainConfigParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddDomainConfigParams.class);
  }

  /**
   * Convert an instance of AddDomainConfigParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


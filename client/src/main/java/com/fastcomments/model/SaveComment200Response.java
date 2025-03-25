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
import com.fastcomments.model.APIStatusFAILED;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.FComment;
import com.fastcomments.model.PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode;
import com.fastcomments.model.SaveCommentResponse;
import com.fastcomments.model.UserSessionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.fastcomments.invoker.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T23:58:52.285256603-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class SaveComment200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SaveComment200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SaveComment200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SaveComment200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SaveCommentResponse> adapterSaveCommentResponse = gson.getDelegateAdapter(this, TypeToken.get(SaveCommentResponse.class));
            final TypeAdapter<PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode> adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode = gson.getDelegateAdapter(this, TypeToken.get(PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.class));

            return (TypeAdapter<T>) new TypeAdapter<SaveComment200Response>() {
                @Override
                public void write(JsonWriter out, SaveComment200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SaveCommentResponse`
                    if (value.getActualInstance() instanceof SaveCommentResponse) {
                        JsonElement element = adapterSaveCommentResponse.toJsonTree((SaveCommentResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`
                    if (value.getActualInstance() instanceof PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode) {
                        JsonElement element = adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.toJsonTree((PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse");
                }

                @Override
                public SaveComment200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SaveCommentResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SaveCommentResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterSaveCommentResponse;
                        SaveComment200Response ret = new SaveComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SaveCommentResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SaveCommentResponse'", e);
                    }
                    // deserialize PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.validateJsonElement(jsonElement);
                        actualAdapter = adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode;
                        SaveComment200Response ret = new SaveComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for SaveComment200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SaveComment200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public SaveComment200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SaveCommentResponse", SaveCommentResponse.class);
        schemas.put("PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode", PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SaveComment200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SaveCommentResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse
     *
     * @return The actual instance (PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SaveCommentResponse`. If the actual instance is not `SaveCommentResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SaveCommentResponse`
     * @throws ClassCastException if the instance is not `SaveCommentResponse`
     */
    public SaveCommentResponse getSaveCommentResponse() throws ClassCastException {
        return (SaveCommentResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`. If the actual instance is not `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`
     * @throws ClassCastException if the instance is not `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`
     */
    public PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode getPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode() throws ClassCastException {
        return (PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SaveComment200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with SaveCommentResponse
        try {
            SaveCommentResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SaveCommentResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode
        try {
            PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for SaveComment200Response with anyOf schemas: PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode, SaveCommentResponse. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of SaveComment200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SaveComment200Response
     * @throws IOException if the JSON string is invalid with respect to SaveComment200Response
     */
    public static SaveComment200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SaveComment200Response.class);
    }

    /**
     * Convert an instance of SaveComment200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


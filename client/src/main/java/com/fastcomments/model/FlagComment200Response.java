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
import com.fastcomments.model.FlagCommentResponse;
import com.fastcomments.model.PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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
public class FlagComment200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FlagComment200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FlagComment200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FlagComment200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FlagCommentResponse> adapterFlagCommentResponse = gson.getDelegateAdapter(this, TypeToken.get(FlagCommentResponse.class));
            final TypeAdapter<PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode> adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode = gson.getDelegateAdapter(this, TypeToken.get(PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.class));

            return (TypeAdapter<T>) new TypeAdapter<FlagComment200Response>() {
                @Override
                public void write(JsonWriter out, FlagComment200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FlagCommentResponse`
                    if (value.getActualInstance() instanceof FlagCommentResponse) {
                        JsonElement element = adapterFlagCommentResponse.toJsonTree((FlagCommentResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode`
                    if (value.getActualInstance() instanceof PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode) {
                        JsonElement element = adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.toJsonTree((PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode");
                }

                @Override
                public FlagComment200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FlagCommentResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FlagCommentResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterFlagCommentResponse;
                        FlagComment200Response ret = new FlagComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FlagCommentResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FlagCommentResponse'", e);
                    }
                    // deserialize PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.validateJsonElement(jsonElement);
                        actualAdapter = adapterPickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode;
                        FlagComment200Response ret = new FlagComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for FlagComment200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FlagComment200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public FlagComment200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FlagCommentResponse", FlagCommentResponse.class);
        schemas.put("PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode", PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FlagComment200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FlagCommentResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode");
    }

    /**
     * Get the actual instance, which can be the following:
     * FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode
     *
     * @return The actual instance (FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FlagCommentResponse`. If the actual instance is not `FlagCommentResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FlagCommentResponse`
     * @throws ClassCastException if the instance is not `FlagCommentResponse`
     */
    public FlagCommentResponse getFlagCommentResponse() throws ClassCastException {
        return (FlagCommentResponse)super.getActualInstance();
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
     * @throws IOException if the JSON Element is invalid with respect to FlagComment200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FlagCommentResponse
        try {
            FlagCommentResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FlagCommentResponse failed with `%s`.", e.getMessage()));
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
        throw new IOException(String.format("The JSON string is invalid for FlagComment200Response with anyOf schemas: FlagCommentResponse, PickAPIErrorInternalExcludeKeyofAPIErrorInternalStatusCode. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of FlagComment200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FlagComment200Response
     * @throws IOException if the JSON string is invalid with respect to FlagComment200Response
     */
    public static FlagComment200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FlagComment200Response.class);
    }

    /**
     * Convert an instance of FlagComment200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


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
import com.fastcomments.model.APIError;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.IgnoredResponse;
import com.fastcomments.model.ImportedAPIStatusFAILED;
import com.fastcomments.model.UserNotificationWriteResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T21:53:04.228145884-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class UpdateUserNotificationStatus200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateUserNotificationStatus200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateUserNotificationStatus200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateUserNotificationStatus200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserNotificationWriteResponse> adapterUserNotificationWriteResponse = gson.getDelegateAdapter(this, TypeToken.get(UserNotificationWriteResponse.class));
            final TypeAdapter<IgnoredResponse> adapterIgnoredResponse = gson.getDelegateAdapter(this, TypeToken.get(IgnoredResponse.class));
            final TypeAdapter<APIError> adapterAPIError = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateUserNotificationStatus200Response>() {
                @Override
                public void write(JsonWriter out, UpdateUserNotificationStatus200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UserNotificationWriteResponse`
                    if (value.getActualInstance() instanceof UserNotificationWriteResponse) {
                        JsonElement element = adapterUserNotificationWriteResponse.toJsonTree((UserNotificationWriteResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IgnoredResponse`
                    if (value.getActualInstance() instanceof IgnoredResponse) {
                        JsonElement element = adapterIgnoredResponse.toJsonTree((IgnoredResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `APIError`
                    if (value.getActualInstance() instanceof APIError) {
                        JsonElement element = adapterAPIError.toJsonTree((APIError)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: APIError, IgnoredResponse, UserNotificationWriteResponse");
                }

                @Override
                public UpdateUserNotificationStatus200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UserNotificationWriteResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserNotificationWriteResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterUserNotificationWriteResponse;
                        UpdateUserNotificationStatus200Response ret = new UpdateUserNotificationStatus200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserNotificationWriteResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserNotificationWriteResponse'", e);
                    }
                    // deserialize IgnoredResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IgnoredResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterIgnoredResponse;
                        UpdateUserNotificationStatus200Response ret = new UpdateUserNotificationStatus200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IgnoredResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IgnoredResponse'", e);
                    }
                    // deserialize APIError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        APIError.validateJsonElement(jsonElement);
                        actualAdapter = adapterAPIError;
                        UpdateUserNotificationStatus200Response ret = new UpdateUserNotificationStatus200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for APIError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'APIError'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateUserNotificationStatus200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateUserNotificationStatus200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public UpdateUserNotificationStatus200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UserNotificationWriteResponse", UserNotificationWriteResponse.class);
        schemas.put("IgnoredResponse", IgnoredResponse.class);
        schemas.put("APIError", APIError.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateUserNotificationStatus200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * APIError, IgnoredResponse, UserNotificationWriteResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UserNotificationWriteResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IgnoredResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof APIError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be APIError, IgnoredResponse, UserNotificationWriteResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * APIError, IgnoredResponse, UserNotificationWriteResponse
     *
     * @return The actual instance (APIError, IgnoredResponse, UserNotificationWriteResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserNotificationWriteResponse`. If the actual instance is not `UserNotificationWriteResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserNotificationWriteResponse`
     * @throws ClassCastException if the instance is not `UserNotificationWriteResponse`
     */
    public UserNotificationWriteResponse getUserNotificationWriteResponse() throws ClassCastException {
        return (UserNotificationWriteResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IgnoredResponse`. If the actual instance is not `IgnoredResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IgnoredResponse`
     * @throws ClassCastException if the instance is not `IgnoredResponse`
     */
    public IgnoredResponse getIgnoredResponse() throws ClassCastException {
        return (IgnoredResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `APIError`. If the actual instance is not `APIError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `APIError`
     * @throws ClassCastException if the instance is not `APIError`
     */
    public APIError getAPIError() throws ClassCastException {
        return (APIError)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateUserNotificationStatus200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UserNotificationWriteResponse
        try {
            UserNotificationWriteResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UserNotificationWriteResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IgnoredResponse
        try {
            IgnoredResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IgnoredResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with APIError
        try {
            APIError.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for APIError failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for UpdateUserNotificationStatus200Response with anyOf schemas: APIError, IgnoredResponse, UserNotificationWriteResponse. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of UpdateUserNotificationStatus200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateUserNotificationStatus200Response
     * @throws IOException if the JSON string is invalid with respect to UpdateUserNotificationStatus200Response
     */
    public static UpdateUserNotificationStatus200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateUserNotificationStatus200Response.class);
    }

    /**
     * Convert an instance of UpdateUserNotificationStatus200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


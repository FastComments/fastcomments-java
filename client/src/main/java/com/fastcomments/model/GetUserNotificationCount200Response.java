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
import com.fastcomments.model.GetUserNotificationCountResponse;
import com.fastcomments.model.ImportedAPIStatusFAILED;
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
public class GetUserNotificationCount200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetUserNotificationCount200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetUserNotificationCount200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetUserNotificationCount200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetUserNotificationCountResponse> adapterGetUserNotificationCountResponse = gson.getDelegateAdapter(this, TypeToken.get(GetUserNotificationCountResponse.class));
            final TypeAdapter<APIError> adapterAPIError = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

            return (TypeAdapter<T>) new TypeAdapter<GetUserNotificationCount200Response>() {
                @Override
                public void write(JsonWriter out, GetUserNotificationCount200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetUserNotificationCountResponse`
                    if (value.getActualInstance() instanceof GetUserNotificationCountResponse) {
                        JsonElement element = adapterGetUserNotificationCountResponse.toJsonTree((GetUserNotificationCountResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `APIError`
                    if (value.getActualInstance() instanceof APIError) {
                        JsonElement element = adapterAPIError.toJsonTree((APIError)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: APIError, GetUserNotificationCountResponse");
                }

                @Override
                public GetUserNotificationCount200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetUserNotificationCountResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetUserNotificationCountResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetUserNotificationCountResponse;
                        GetUserNotificationCount200Response ret = new GetUserNotificationCount200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetUserNotificationCountResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetUserNotificationCountResponse'", e);
                    }
                    // deserialize APIError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        APIError.validateJsonElement(jsonElement);
                        actualAdapter = adapterAPIError;
                        GetUserNotificationCount200Response ret = new GetUserNotificationCount200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for APIError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'APIError'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for GetUserNotificationCount200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetUserNotificationCount200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public GetUserNotificationCount200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetUserNotificationCountResponse", GetUserNotificationCountResponse.class);
        schemas.put("APIError", APIError.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetUserNotificationCount200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * APIError, GetUserNotificationCountResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetUserNotificationCountResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof APIError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be APIError, GetUserNotificationCountResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * APIError, GetUserNotificationCountResponse
     *
     * @return The actual instance (APIError, GetUserNotificationCountResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetUserNotificationCountResponse`. If the actual instance is not `GetUserNotificationCountResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetUserNotificationCountResponse`
     * @throws ClassCastException if the instance is not `GetUserNotificationCountResponse`
     */
    public GetUserNotificationCountResponse getGetUserNotificationCountResponse() throws ClassCastException {
        return (GetUserNotificationCountResponse)super.getActualInstance();
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
     * @throws IOException if the JSON Element is invalid with respect to GetUserNotificationCount200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with GetUserNotificationCountResponse
        try {
            GetUserNotificationCountResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetUserNotificationCountResponse failed with `%s`.", e.getMessage()));
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
        throw new IOException(String.format("The JSON string is invalid for GetUserNotificationCount200Response with anyOf schemas: APIError, GetUserNotificationCountResponse. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of GetUserNotificationCount200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetUserNotificationCount200Response
     * @throws IOException if the JSON string is invalid with respect to GetUserNotificationCount200Response
     */
    public static GetUserNotificationCount200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetUserNotificationCount200Response.class);
    }

    /**
     * Convert an instance of GetUserNotificationCount200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


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
import com.fastcomments.model.APIError;
import com.fastcomments.model.APIGetCommentResponse;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.ImportedAPIStatusFAILED;
import com.fastcomments.model.PickFCommentAPICommentFieldsKeys;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T13:48:29.746754041-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class GetComment200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetComment200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetComment200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetComment200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<APIGetCommentResponse> adapterAPIGetCommentResponse = gson.getDelegateAdapter(this, TypeToken.get(APIGetCommentResponse.class));
            final TypeAdapter<APIError> adapterAPIError = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

            return (TypeAdapter<T>) new TypeAdapter<GetComment200Response>() {
                @Override
                public void write(JsonWriter out, GetComment200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `APIGetCommentResponse`
                    if (value.getActualInstance() instanceof APIGetCommentResponse) {
                        JsonElement element = adapterAPIGetCommentResponse.toJsonTree((APIGetCommentResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `APIError`
                    if (value.getActualInstance() instanceof APIError) {
                        JsonElement element = adapterAPIError.toJsonTree((APIError)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: APIError, APIGetCommentResponse");
                }

                @Override
                public GetComment200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize APIGetCommentResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        APIGetCommentResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterAPIGetCommentResponse;
                        GetComment200Response ret = new GetComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for APIGetCommentResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'APIGetCommentResponse'", e);
                    }
                    // deserialize APIError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        APIError.validateJsonElement(jsonElement);
                        actualAdapter = adapterAPIError;
                        GetComment200Response ret = new GetComment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for APIError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'APIError'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for GetComment200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetComment200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public GetComment200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("APIGetCommentResponse", APIGetCommentResponse.class);
        schemas.put("APIError", APIError.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetComment200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * APIError, APIGetCommentResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof APIGetCommentResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof APIError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be APIError, APIGetCommentResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * APIError, APIGetCommentResponse
     *
     * @return The actual instance (APIError, APIGetCommentResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `APIGetCommentResponse`. If the actual instance is not `APIGetCommentResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `APIGetCommentResponse`
     * @throws ClassCastException if the instance is not `APIGetCommentResponse`
     */
    public APIGetCommentResponse getAPIGetCommentResponse() throws ClassCastException {
        return (APIGetCommentResponse)super.getActualInstance();
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
     * @throws IOException if the JSON Element is invalid with respect to GetComment200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with APIGetCommentResponse
        try {
            APIGetCommentResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for APIGetCommentResponse failed with `%s`.", e.getMessage()));
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
        throw new IOException(String.format("The JSON string is invalid for GetComment200Response with anyOf schemas: APIError, APIGetCommentResponse. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of GetComment200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetComment200Response
     * @throws IOException if the JSON string is invalid with respect to GetComment200Response
     */
    public static GetComment200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetComment200Response.class);
    }

    /**
     * Convert an instance of GetComment200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


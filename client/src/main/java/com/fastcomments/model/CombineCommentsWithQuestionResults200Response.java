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
import com.fastcomments.model.CombineQuestionResultsWithCommentsResponse;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.FindCommentsByRangeResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CombineCommentsWithQuestionResults200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CombineCommentsWithQuestionResults200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CombineCommentsWithQuestionResults200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CombineCommentsWithQuestionResults200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CombineQuestionResultsWithCommentsResponse> adapterCombineQuestionResultsWithCommentsResponse = gson.getDelegateAdapter(this, TypeToken.get(CombineQuestionResultsWithCommentsResponse.class));
            final TypeAdapter<APIError> adapterAPIError = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

            return (TypeAdapter<T>) new TypeAdapter<CombineCommentsWithQuestionResults200Response>() {
                @Override
                public void write(JsonWriter out, CombineCommentsWithQuestionResults200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CombineQuestionResultsWithCommentsResponse`
                    if (value.getActualInstance() instanceof CombineQuestionResultsWithCommentsResponse) {
                        JsonElement element = adapterCombineQuestionResultsWithCommentsResponse.toJsonTree((CombineQuestionResultsWithCommentsResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `APIError`
                    if (value.getActualInstance() instanceof APIError) {
                        JsonElement element = adapterAPIError.toJsonTree((APIError)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: APIError, CombineQuestionResultsWithCommentsResponse");
                }

                @Override
                public CombineCommentsWithQuestionResults200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CombineQuestionResultsWithCommentsResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CombineQuestionResultsWithCommentsResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterCombineQuestionResultsWithCommentsResponse;
                        CombineCommentsWithQuestionResults200Response ret = new CombineCommentsWithQuestionResults200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CombineQuestionResultsWithCommentsResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CombineQuestionResultsWithCommentsResponse'", e);
                    }
                    // deserialize APIError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        APIError.validateJsonElement(jsonElement);
                        actualAdapter = adapterAPIError;
                        CombineCommentsWithQuestionResults200Response ret = new CombineCommentsWithQuestionResults200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for APIError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'APIError'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CombineCommentsWithQuestionResults200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CombineCommentsWithQuestionResults200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public CombineCommentsWithQuestionResults200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CombineQuestionResultsWithCommentsResponse", CombineQuestionResultsWithCommentsResponse.class);
        schemas.put("APIError", APIError.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CombineCommentsWithQuestionResults200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * APIError, CombineQuestionResultsWithCommentsResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CombineQuestionResultsWithCommentsResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof APIError) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be APIError, CombineQuestionResultsWithCommentsResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * APIError, CombineQuestionResultsWithCommentsResponse
     *
     * @return The actual instance (APIError, CombineQuestionResultsWithCommentsResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CombineQuestionResultsWithCommentsResponse`. If the actual instance is not `CombineQuestionResultsWithCommentsResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CombineQuestionResultsWithCommentsResponse`
     * @throws ClassCastException if the instance is not `CombineQuestionResultsWithCommentsResponse`
     */
    public CombineQuestionResultsWithCommentsResponse getCombineQuestionResultsWithCommentsResponse() throws ClassCastException {
        return (CombineQuestionResultsWithCommentsResponse)super.getActualInstance();
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
     * @throws IOException if the JSON Element is invalid with respect to CombineCommentsWithQuestionResults200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CombineQuestionResultsWithCommentsResponse
        try {
            CombineQuestionResultsWithCommentsResponse.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CombineQuestionResultsWithCommentsResponse failed with `%s`.", e.getMessage()));
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
        throw new IOException(String.format("The JSON string is invalid for CombineCommentsWithQuestionResults200Response with anyOf schemas: APIError, CombineQuestionResultsWithCommentsResponse. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CombineCommentsWithQuestionResults200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CombineCommentsWithQuestionResults200Response
     * @throws IOException if the JSON string is invalid with respect to CombineCommentsWithQuestionResults200Response
     */
    public static CombineCommentsWithQuestionResults200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CombineCommentsWithQuestionResults200Response.class);
    }

    /**
     * Convert an instance of CombineCommentsWithQuestionResults200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


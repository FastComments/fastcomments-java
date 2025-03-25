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
import com.fastcomments.model.ImportedAPIStatusFAILED;
import com.fastcomments.model.ImportedAPIStatusSUCCESS;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-25T10:12:49.770182242-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class VoteResponseStatus extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(VoteResponseStatus.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VoteResponseStatus.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VoteResponseStatus' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportedAPIStatusSUCCESS> adapterImportedAPIStatusSUCCESS = gson.getDelegateAdapter(this, TypeToken.get(ImportedAPIStatusSUCCESS.class));
            final TypeAdapter<ImportedAPIStatusFAILED> adapterImportedAPIStatusFAILED = gson.getDelegateAdapter(this, TypeToken.get(ImportedAPIStatusFAILED.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<VoteResponseStatus>() {
                @Override
                public void write(JsonWriter out, VoteResponseStatus value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ImportedAPIStatusSUCCESS`
                    if (value.getActualInstance() instanceof ImportedAPIStatusSUCCESS) {
                        JsonElement element = adapterImportedAPIStatusSUCCESS.toJsonTree((ImportedAPIStatusSUCCESS)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ImportedAPIStatusFAILED`
                    if (value.getActualInstance() instanceof ImportedAPIStatusFAILED) {
                        JsonElement element = adapterImportedAPIStatusFAILED.toJsonTree((ImportedAPIStatusFAILED)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String");
                }

                @Override
                public VoteResponseStatus read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ImportedAPIStatusSUCCESS
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ImportedAPIStatusSUCCESS.validateJsonElement(jsonElement);
                        actualAdapter = adapterImportedAPIStatusSUCCESS;
                        VoteResponseStatus ret = new VoteResponseStatus();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ImportedAPIStatusSUCCESS failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ImportedAPIStatusSUCCESS'", e);
                    }
                    // deserialize ImportedAPIStatusFAILED
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ImportedAPIStatusFAILED.validateJsonElement(jsonElement);
                        actualAdapter = adapterImportedAPIStatusFAILED;
                        VoteResponseStatus ret = new VoteResponseStatus();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ImportedAPIStatusFAILED failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ImportedAPIStatusFAILED'", e);
                    }
                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isString()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterString;
                        VoteResponseStatus ret = new VoteResponseStatus();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for VoteResponseStatus: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public VoteResponseStatus() {
        super("anyOf", Boolean.FALSE);
    }

    public VoteResponseStatus(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ImportedAPIStatusSUCCESS", ImportedAPIStatusSUCCESS.class);
        schemas.put("ImportedAPIStatusFAILED", ImportedAPIStatusFAILED.class);
        schemas.put("String", String.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return VoteResponseStatus.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ImportedAPIStatusSUCCESS) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ImportedAPIStatusFAILED) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String
     *
     * @return The actual instance (ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ImportedAPIStatusSUCCESS`. If the actual instance is not `ImportedAPIStatusSUCCESS`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ImportedAPIStatusSUCCESS`
     * @throws ClassCastException if the instance is not `ImportedAPIStatusSUCCESS`
     */
    public ImportedAPIStatusSUCCESS getImportedAPIStatusSUCCESS() throws ClassCastException {
        return (ImportedAPIStatusSUCCESS)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ImportedAPIStatusFAILED`. If the actual instance is not `ImportedAPIStatusFAILED`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ImportedAPIStatusFAILED`
     * @throws ClassCastException if the instance is not `ImportedAPIStatusFAILED`
     */
    public ImportedAPIStatusFAILED getImportedAPIStatusFAILED() throws ClassCastException {
        return (ImportedAPIStatusFAILED)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to VoteResponseStatus
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ImportedAPIStatusSUCCESS
        try {
            ImportedAPIStatusSUCCESS.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ImportedAPIStatusSUCCESS failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ImportedAPIStatusFAILED
        try {
            ImportedAPIStatusFAILED.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ImportedAPIStatusFAILED failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with String
        try {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for VoteResponseStatus with anyOf schemas: ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS, String. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of VoteResponseStatus given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VoteResponseStatus
     * @throws IOException if the JSON string is invalid with respect to VoteResponseStatus
     */
    public static VoteResponseStatus fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VoteResponseStatus.class);
    }

    /**
     * Convert an instance of VoteResponseStatus to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


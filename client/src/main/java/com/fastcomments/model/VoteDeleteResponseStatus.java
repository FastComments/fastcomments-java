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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T09:02:23.231864030-07:00[America/Los_Angeles]", comments = "Generator version: 7.11.0")
public class VoteDeleteResponseStatus extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(VoteDeleteResponseStatus.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VoteDeleteResponseStatus.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VoteDeleteResponseStatus' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportedAPIStatusSUCCESS> adapterImportedAPIStatusSUCCESS = gson.getDelegateAdapter(this, TypeToken.get(ImportedAPIStatusSUCCESS.class));
            final TypeAdapter<ImportedAPIStatusFAILED> adapterImportedAPIStatusFAILED = gson.getDelegateAdapter(this, TypeToken.get(ImportedAPIStatusFAILED.class));

            return (TypeAdapter<T>) new TypeAdapter<VoteDeleteResponseStatus>() {
                @Override
                public void write(JsonWriter out, VoteDeleteResponseStatus value) throws IOException {
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
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS");
                }

                @Override
                public VoteDeleteResponseStatus read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ImportedAPIStatusSUCCESS
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ImportedAPIStatusSUCCESS.validateJsonElement(jsonElement);
                        actualAdapter = adapterImportedAPIStatusSUCCESS;
                        VoteDeleteResponseStatus ret = new VoteDeleteResponseStatus();
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
                        VoteDeleteResponseStatus ret = new VoteDeleteResponseStatus();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ImportedAPIStatusFAILED failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ImportedAPIStatusFAILED'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for VoteDeleteResponseStatus: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public VoteDeleteResponseStatus() {
        super("anyOf", Boolean.FALSE);
    }

    public VoteDeleteResponseStatus(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ImportedAPIStatusSUCCESS", ImportedAPIStatusSUCCESS.class);
        schemas.put("ImportedAPIStatusFAILED", ImportedAPIStatusFAILED.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return VoteDeleteResponseStatus.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS
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

        throw new RuntimeException("Invalid instance type. Must be ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS");
    }

    /**
     * Get the actual instance, which can be the following:
     * ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS
     *
     * @return The actual instance (ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS)
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
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to VoteDeleteResponseStatus
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
        throw new IOException(String.format("The JSON string is invalid for VoteDeleteResponseStatus with anyOf schemas: ImportedAPIStatusFAILED, ImportedAPIStatusSUCCESS. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of VoteDeleteResponseStatus given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VoteDeleteResponseStatus
     * @throws IOException if the JSON string is invalid with respect to VoteDeleteResponseStatus
     */
    public static VoteDeleteResponseStatus fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VoteDeleteResponseStatus.class);
    }

    /**
     * Convert an instance of VoteDeleteResponseStatus to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


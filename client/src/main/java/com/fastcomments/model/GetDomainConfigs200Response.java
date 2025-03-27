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
import com.fastcomments.model.GetDomainConfigs200ResponseAnyOf;
import com.fastcomments.model.GetDomainConfigs200ResponseAnyOf1;
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
public class GetDomainConfigs200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetDomainConfigs200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetDomainConfigs200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetDomainConfigs200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetDomainConfigs200ResponseAnyOf> adapterGetDomainConfigs200ResponseAnyOf = gson.getDelegateAdapter(this, TypeToken.get(GetDomainConfigs200ResponseAnyOf.class));
            final TypeAdapter<GetDomainConfigs200ResponseAnyOf1> adapterGetDomainConfigs200ResponseAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(GetDomainConfigs200ResponseAnyOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<GetDomainConfigs200Response>() {
                @Override
                public void write(JsonWriter out, GetDomainConfigs200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetDomainConfigs200ResponseAnyOf`
                    if (value.getActualInstance() instanceof GetDomainConfigs200ResponseAnyOf) {
                        JsonElement element = adapterGetDomainConfigs200ResponseAnyOf.toJsonTree((GetDomainConfigs200ResponseAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `GetDomainConfigs200ResponseAnyOf1`
                    if (value.getActualInstance() instanceof GetDomainConfigs200ResponseAnyOf1) {
                        JsonElement element = adapterGetDomainConfigs200ResponseAnyOf1.toJsonTree((GetDomainConfigs200ResponseAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1");
                }

                @Override
                public GetDomainConfigs200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetDomainConfigs200ResponseAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetDomainConfigs200ResponseAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetDomainConfigs200ResponseAnyOf;
                        GetDomainConfigs200Response ret = new GetDomainConfigs200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetDomainConfigs200ResponseAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetDomainConfigs200ResponseAnyOf'", e);
                    }
                    // deserialize GetDomainConfigs200ResponseAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetDomainConfigs200ResponseAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterGetDomainConfigs200ResponseAnyOf1;
                        GetDomainConfigs200Response ret = new GetDomainConfigs200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetDomainConfigs200ResponseAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetDomainConfigs200ResponseAnyOf1'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for GetDomainConfigs200Response: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetDomainConfigs200Response() {
        super("anyOf", Boolean.FALSE);
    }

    public GetDomainConfigs200Response(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetDomainConfigs200ResponseAnyOf", GetDomainConfigs200ResponseAnyOf.class);
        schemas.put("GetDomainConfigs200ResponseAnyOf1", GetDomainConfigs200ResponseAnyOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetDomainConfigs200Response.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetDomainConfigs200ResponseAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetDomainConfigs200ResponseAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1
     *
     * @return The actual instance (GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetDomainConfigs200ResponseAnyOf`. If the actual instance is not `GetDomainConfigs200ResponseAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetDomainConfigs200ResponseAnyOf`
     * @throws ClassCastException if the instance is not `GetDomainConfigs200ResponseAnyOf`
     */
    public GetDomainConfigs200ResponseAnyOf getGetDomainConfigs200ResponseAnyOf() throws ClassCastException {
        return (GetDomainConfigs200ResponseAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetDomainConfigs200ResponseAnyOf1`. If the actual instance is not `GetDomainConfigs200ResponseAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetDomainConfigs200ResponseAnyOf1`
     * @throws ClassCastException if the instance is not `GetDomainConfigs200ResponseAnyOf1`
     */
    public GetDomainConfigs200ResponseAnyOf1 getGetDomainConfigs200ResponseAnyOf1() throws ClassCastException {
        return (GetDomainConfigs200ResponseAnyOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetDomainConfigs200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with GetDomainConfigs200ResponseAnyOf
        try {
            GetDomainConfigs200ResponseAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetDomainConfigs200ResponseAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with GetDomainConfigs200ResponseAnyOf1
        try {
            GetDomainConfigs200ResponseAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for GetDomainConfigs200ResponseAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for GetDomainConfigs200Response with anyOf schemas: GetDomainConfigs200ResponseAnyOf, GetDomainConfigs200ResponseAnyOf1. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of GetDomainConfigs200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetDomainConfigs200Response
     * @throws IOException if the JSON string is invalid with respect to GetDomainConfigs200Response
     */
    public static GetDomainConfigs200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetDomainConfigs200Response.class);
    }

    /**
     * Convert an instance of GetDomainConfigs200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


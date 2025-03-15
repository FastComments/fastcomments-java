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


package com.fastcomments.api;

import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.AggregationRequest;
import com.fastcomments.model.AggregationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Aggregates documents by grouping them (if groupBy is provided) and applying multiple operations. Different operations (e.g. sum, countDistinct, avg, etc.) are supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void aggregateTest() throws ApiException {
        String tenantId = null;
        AggregationRequest aggregationRequest = null;
        String parentTenantId = null;
        Boolean includeStats = null;
        AggregationResponse response = api.aggregate(tenantId, aggregationRequest)
                .parentTenantId(parentTenantId)
                .includeStats(includeStats)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commentsOptionsTest() throws ApiException {
        String tenantId = null;
        String response = api.commentsOptions(tenantId)
                .execute();
        // TODO: test validations
    }

}

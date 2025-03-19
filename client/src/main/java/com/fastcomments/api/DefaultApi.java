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

import com.fastcomments.invoker.ApiCallback;
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.invoker.ApiResponse;
import com.fastcomments.invoker.Configuration;
import com.fastcomments.invoker.Pair;
import com.fastcomments.invoker.ProgressRequestBody;
import com.fastcomments.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.fastcomments.model.AggregationRequest;
import com.fastcomments.model.AggregationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call aggregateCall(String tenantId, AggregationRequest aggregationRequest, String parentTenantId, Boolean includeStats, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = aggregationRequest;

        // create path and map variables
        String localVarPath = "/api/v1/aggregate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
        }

        if (parentTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("parentTenantId", parentTenantId));
        }

        if (includeStats != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeStats", includeStats));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call aggregateValidateBeforeCall(String tenantId, AggregationRequest aggregationRequest, String parentTenantId, Boolean includeStats, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling aggregate(Async)");
        }

        // verify the required parameter 'aggregationRequest' is set
        if (aggregationRequest == null) {
            throw new ApiException("Missing the required parameter 'aggregationRequest' when calling aggregate(Async)");
        }

        return aggregateCall(tenantId, aggregationRequest, parentTenantId, includeStats, _callback);

    }


    private ApiResponse<AggregationResponse> aggregateWithHttpInfo(String tenantId, AggregationRequest aggregationRequest, String parentTenantId, Boolean includeStats) throws ApiException {
        okhttp3.Call localVarCall = aggregateValidateBeforeCall(tenantId, aggregationRequest, parentTenantId, includeStats, null);
        Type localVarReturnType = new TypeToken<AggregationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call aggregateAsync(String tenantId, AggregationRequest aggregationRequest, String parentTenantId, Boolean includeStats, final ApiCallback<AggregationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = aggregateValidateBeforeCall(tenantId, aggregationRequest, parentTenantId, includeStats, _callback);
        Type localVarReturnType = new TypeToken<AggregationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIaggregateRequest {
        private final String tenantId;
        private final AggregationRequest aggregationRequest;
        private String parentTenantId;
        private Boolean includeStats;

        private APIaggregateRequest(String tenantId, AggregationRequest aggregationRequest) {
            this.tenantId = tenantId;
            this.aggregationRequest = aggregationRequest;
        }

        /**
         * Set parentTenantId
         * @param parentTenantId  (optional)
         * @return APIaggregateRequest
         */
        public APIaggregateRequest parentTenantId(String parentTenantId) {
            this.parentTenantId = parentTenantId;
            return this;
        }

        /**
         * Set includeStats
         * @param includeStats  (optional)
         * @return APIaggregateRequest
         */
        public APIaggregateRequest includeStats(Boolean includeStats) {
            this.includeStats = includeStats;
            return this;
        }

        /**
         * Build call for aggregate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return aggregateCall(tenantId, aggregationRequest, parentTenantId, includeStats, _callback);
        }

        /**
         * Execute aggregate request
         * @return AggregationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public AggregationResponse execute() throws ApiException {
            ApiResponse<AggregationResponse> localVarResp = aggregateWithHttpInfo(tenantId, aggregationRequest, parentTenantId, includeStats);
            return localVarResp.getData();
        }

        /**
         * Execute aggregate request with HTTP info returned
         * @return ApiResponse&lt;AggregationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AggregationResponse> executeWithHttpInfo() throws ApiException {
            return aggregateWithHttpInfo(tenantId, aggregationRequest, parentTenantId, includeStats);
        }

        /**
         * Execute aggregate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AggregationResponse> _callback) throws ApiException {
            return aggregateAsync(tenantId, aggregationRequest, parentTenantId, includeStats, _callback);
        }
    }

    /**
     * 
     * Aggregates documents by grouping them (if groupBy is provided) and applying multiple operations. Different operations (e.g. sum, countDistinct, avg, etc.) are supported.
     * @param tenantId  (required)
     * @param aggregationRequest  (required)
     * @return APIaggregateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public APIaggregateRequest aggregate(String tenantId, AggregationRequest aggregationRequest) {
        return new APIaggregateRequest(tenantId, aggregationRequest);
    }
}

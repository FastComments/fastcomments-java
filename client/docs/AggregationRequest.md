

# AggregationRequest

The aggregation request accepts a resource, optional grouping keys, an array of operations, and an optional sort

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | [**List&lt;QueryPredicate&gt;**](QueryPredicate.md) |  |  [optional] |
|**resourceName** | **String** |  |  |
|**groupBy** | **List&lt;String&gt;** |  |  [optional] |
|**operations** | [**List&lt;AggregationOperation&gt;**](AggregationOperation.md) |  |  |
|**sort** | [**AggregationRequestSort**](AggregationRequestSort.md) |  |  [optional] |




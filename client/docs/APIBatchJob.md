

# APIBatchJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageMigrationUndoResult** | [**PageMigrationUndoCounts**](PageMigrationUndoCounts.md) |  |  [optional] |
|**undoId** | **String** | migrate-pages: set once the job has finished. Pass to POST /api/v1/pages/migrations/{undoId}/undo within 90 days. undo-page-migration: the migration being undone. |  [optional] |
|**pageMigrationResults** | [**List&lt;APIBatchJobPageMigrationResultsInner&gt;**](APIBatchJobPageMigrationResultsInner.md) | migrate-pages: one entry per finished migration, in request order. |  [optional] |
|**totalCount** | **Integer** | Total work, when known up front. |  [optional] |
|**processedCount** | **Integer** | Work done so far. The unit depends on the type: migrations finished for migrate-pages, records restored for undo-page-migration, rows for imports and exports. |  |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**status** | **String** | requested, running, success or failed. |  |
|**type** | **String** | For example migrate-pages, undo-page-migration, export, import. |  |
|**id** | **String** |  |  |




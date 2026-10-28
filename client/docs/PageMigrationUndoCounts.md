

# PageMigrationUndoCounts


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**restored** | **Integer** | Records put back to their pre-migration values. |  |
|**skipped** | **Integer** | Records left alone because they changed after the migration, or no longer exist. |  |
|**notRestorable** | **Integer** | Records a page merge or duplicate cleanup deleted during the migration. These cannot be brought back. |  |




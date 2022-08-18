package com.tritondigital.measurement.druid.types

case class DimensionSpec(dimensions: List[Dimension] = List.empty, dimensionExclusions: List[String] = List.empty,
                         spatialDimensions: List[String] = List.empty, includeAllDimensions: Option[Boolean])

// if dimensions and spatialDimensions are both null or empty arrays, Druid will treat all non-timestamp,
// non-metric columns that do not appear in dimensionExclusions as String-typed dimension columns.
// See inclusions and exclusions below for details.If this and spatialDimensions are both null or empty arrays,
// Druid will treat all non-timestamp, non-metric columns that do not appear in dimensionExclusions as String-typed dimension columns.


// dimensionExclusion is only used if the dimensions and spatialDimensions lists are both null or empty arrays; otherwise it is ignored.


// You can set includeAllDimensions to true to ingest both explicit dimensions in the dimensions field and other dimensions that the ingestion task discovers from input data.
// In this case, the explicit dimensions will appear first in order that you specify them and the dimensions dynamically discovered will come after.
// This flag can be useful especially with auto schema discovery using flattenSpec.
// If this is not set and the dimensions field is not empty, Druid will ingest only explicit dimensions.
// If this is not set and the dimensions field is empty, all discovered dimensions will be ingested.

//def rule() = {}
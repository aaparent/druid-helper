package com.tritondigital.measurement.druid.types

case class DataSchema(dataSource: String, flattenSpec: Option[FlattenSpec], timestampSpec: TimestampSpec, transformSpec: TransformSpec, dimensionSpec: DimensionSpec, metricsSpec: MetricsSpec, granularitySpec: GranularitySpec)

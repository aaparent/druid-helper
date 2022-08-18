package com.tritondigital.measurement.druid.types

case class IndexSpec(bitmap: String, dimensionCompression: String, metricCompression: String, longEncoding: String)
//https://github.com/apache/druid/blob/master/docs/ingestion/ingestion-spec.md#indexspec
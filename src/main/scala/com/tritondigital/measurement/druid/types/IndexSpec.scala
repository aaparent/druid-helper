package com.tritondigital.measurement.druid.types

case class IndexSpec(bitmap: String, dimensionCompression, metricCompression, longEncoding)
//https://github.com/apache/druid/blob/master/docs/ingestion/ingestion-spec.md#indexspec
package com.tritondigital.measurement.druid.types

case class IngestionSpec(dataSchema: DataSchema, ioConfig: IoConfig, tuningConfig: TuningConfig)

object IngestionSpec

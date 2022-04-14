package com.tritondigital.measurement.druid.types

case class TimestampSpec(column: String = "timestamp", format: String = "auto", missingValue: String = "none")

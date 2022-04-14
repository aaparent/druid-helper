package com.tritondigital.measurement.druid.types


case class IoConfig(`type`: IoConfig, maxRowsInMemory: Long = 1000000, maxBytesInMemory: Long, skipBytesInMemoryOverheadCheck: Boolean = false, indexSpec: IndexSpec, otherProperties: String)


object IoConfig extends Enumeration {
  type IoConfig = String
  val index = "index"
  val hadoop = "hadoop"
  val kafka = "kafka"
  val kinesis = "kinesis"
}
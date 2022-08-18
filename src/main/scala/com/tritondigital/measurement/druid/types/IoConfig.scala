package com.tritondigital.measurement.druid.types


case class IoConfig(`type`: IoConfig, maxRowsInMemory: Long = 1000000, maxBytesInMemory: Long, skipBytesInMemoryOverheadCheck: Boolean = false, indexSpec: IndexSpec, otherProperties: String)

case class IoConfigType(name: String)

object IoConfigType {
  val index = AggregatorType("index")
  val hadoop = AggregatorType("hadoop")
  val kafka = AggregatorType("kafka")
  val kinesis = AggregatorType("kinesis")
}
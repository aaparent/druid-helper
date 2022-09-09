package com.tritondigital.measurement.druid.types

case class Aggregators(`type`: Aggregator, name: String, fieldName: Option[String], timeColumn: Option[String], maxStringBytes: Option[Int], fnAggregate: Option[String], fnCombine: Option[String], fnReset: Option[String]) extends DruidJson {

  def toJson: String = super.toJson(this)

  def repr: String = super.repr(this)

//    s"""
//       |val `type` = ${reprEnum(`type`, `type`.underlying)}
//       |val name = \"$name\"
//       |val fieldName = ${reprOptional(fieldName)}
//       |""".stripMargin
}
private[types] class Aggregator(val underlying: String) extends AnyVal
object Aggregator {
  val count = new Aggregator("count")
  val longSum = new Aggregator("longSum")
  val doubleSum = new Aggregator("doubleSum")
  val FloatSum = new Aggregator("floatSum")
  val doubleMin = new Aggregator("doubleMin")
  val doubleMax = new Aggregator("doubleMax")
  val floatMin = new Aggregator("floatMin")
  val floatMax = new Aggregator("floatMax")
  val longMin = new Aggregator("longMin")
  val longMax = new Aggregator("longMax")
  val doubleMean = new Aggregator("doubleMean")
  val doubleFirst = new Aggregator("doubleFirst")
  val doubleLast = new Aggregator("doubleLast")
  val floatFirst = new Aggregator("floatFirst")
  val floatLast = new Aggregator("floatLast")
  val longFirst = new Aggregator("longFirst")
  val longLast = new Aggregator("longLast")
  val stringFirst = new Aggregator("stringFirst")
  val stringLast = new Aggregator("stringLast")
  val doubleAny = new Aggregator("doubleAny")
  val floatAny = new Aggregator("floatAny")
  val longAny = new Aggregator("longAny")
  val stringAny = new Aggregator("stringAny")
  val javascript = new Aggregator("javascript")
}

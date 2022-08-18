package com.tritondigital.measurement.druid.types
import org.json4s.jackson.JsonMethods.{pretty, render}
import org.json4s.JsonDSL._



case class Aggregators(`type`: AggregatorType, name: String, fieldName: Option[String], timeColumn: Option[String], maxStringBytes: Option[Int], fnAggregate: Option[String], fnCombine: Option[String], fnReset: Option[String]) extends DruidJson {
//   def toJson: String = pretty(render(super.toJson(
//    "type" -> `type`.name,
//    "name" -> name,
//    "fieldName" -> fieldName.getOrElse(null)
//  )))

  def toJson: String = pretty(render(
    ("type" -> `type`.name) ~
      ("name" -> name) ~
      ("fieldName" -> fieldName.map(_.toString))
  ))


  override def repr: String =
    s"""
      |val `type` = AggregatorType.${`type`.name}
      |val name = $name
      |val fieldName = ${fieldName.map("\"" + _.toString + "\"").orElse(None)}
      |""".stripMargin
}

case class AggregatorType(name: String)

object AggregatorType {
  val count = AggregatorType("count")
  val longSum = AggregatorType("longSum")
  val doubleSum = AggregatorType("doubleSum")
  val FloatSum = AggregatorType("floatSum")
  val doubleMin = AggregatorType("doubleMin")
  val doubleMax = AggregatorType("doubleMax")
  val floatMin = AggregatorType("floatMin")
  val floatMax = AggregatorType("floatMax")
  val longMin = AggregatorType("longMin")
  val longMax = AggregatorType("longMax")
  val doubleMean = AggregatorType("doubleMean")
  val doubleFirst = AggregatorType("doubleFirst")
  val doubleLast = AggregatorType("doubleLast")
  val floatFirst = AggregatorType("floatFirst")
  val floatLast = AggregatorType("floatLast")
  val longFirst = AggregatorType("longFirst")
  val longLast = AggregatorType("longLast")
  val stringFirst = AggregatorType("stringFirst")
  val stringLast = AggregatorType("stringLast")
  val doubleAny = AggregatorType("doubleAny")
  val floatAny = AggregatorType("floatAny")
  val longAny = AggregatorType("longAny")
  val stringAny = AggregatorType("stringAny")
  val javascript = AggregatorType("javascript")
}
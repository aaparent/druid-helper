package com.tritondigital.measurement.druid.types

case class Aggregators(`type`: String, name: String, fieldName: Option[String], timeColumn: Option[String], maxStringBytes: Option[Int], fnAggregate: Option[String], fnCombine: Option[String], fnReset: Option[String])

//the types :
//count, longSum, doubleSum, floatSum, doubleMin, doubleMax, floatMin, floatMax, longMin, longMax, doubleMean, doubleFirst, doubleLast, floatFirst, floatLast, longFirst, longLast, stringFirst, stringLast,
//doubleAny, floatAny, longAny, stringAny, javascript
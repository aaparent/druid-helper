package com.tritondigital.measurement.druid.types

import java.sql.Date

case class Interval(start: Date, end:Date) {
  val value = s"""${start.toLocalDate}/${end.toLocalDate}"""
}

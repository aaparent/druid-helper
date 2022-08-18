package com.tritondigital.measurement.druid.types

import org.json4s.{JDecimal, JDouble, JField, JInt, JObject, JString, JValue}


trait DruidJson {
  def toJson(nameValues: (String, String)*): JValue = {
    JObject(nameValues.toList.foldLeft(List[JField]())(
      (list, z) => {
        toJField(z._1, z._2) :: list
      })
    )
  }

  def repr: String
  def toJField(name: String, value: String) = JField(name, JString(value))
  def toJField(name: String, value: Int) = JField(name, JInt(value))
  def toJField(name: String, value: Double) = JField(name, JDouble(value))
  def toJField(name: String, value: BigDecimal) = JField(name, JDecimal(value))
  def toJField(name: String, value: JValue) = JField(name, value)

}

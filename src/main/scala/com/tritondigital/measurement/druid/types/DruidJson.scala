package com.tritondigital.measurement.druid.types

import org.json4s.NoTypeHints
import org.json4s.jackson.Serialization

trait DruidJson {
  implicit val formats = Serialization.formats(NoTypeHints)

  def toJson(impl: AnyRef): String = {
    Serialization.write(impl)
  }

  def repr(impl: AnyRef): String = {
    impl.getClass.getDeclaredFields.map(f => {
      s"""${f.getName}: ${f.getType.getSimpleName}"""
    }).mkString("\n")
  }

  def reprOptional[T](field: Option[T]): String = {
    s"""${field.map("\"" + _.toString + "\"").orElse(None)}"""
  }

  def reprEnum[T](_type: T, _value: T): String = {
    s"""${_type.getClass.getSimpleName}.${_value}"""
  }
}
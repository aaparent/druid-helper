package com.tritondigital.measurement.druid.types

case class Dimension(`type`: DimensionType, name: String = null, createBitmapIndex: Boolean = true, multiValueHandling: MultiValueHandlingType)

case class DimensionType(name: String)

object DimensionType {

}

case class MultiValueHandlingType(name: String)

object MultiValueHandlingType {

}
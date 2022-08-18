package com.tritondigital.measurement.druid.types


case class GranularitySpec(`type`: String = "uniform", segmentGranularity: Granularity, queryGranularity: Granularity, rollup: Boolean = true, intervals: Interval = null)
//type is uniform or arbitrary

//segmentGranularity is ignored if type is arbitrary

case class Granularity(name: String)

object Granularity {

}
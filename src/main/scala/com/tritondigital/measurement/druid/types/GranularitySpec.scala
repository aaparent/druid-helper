package com.tritondigital.measurement.druid.types

import com.tritondigital.measurement.druid.types.Granularity.Granularity

//case class GranularitySpec(`type`: String = "uniform", segmentGranularity: Granularity.day, queryGranularity: Granularity = Granularity.none, rollup: Boolean = true, intervals: Interval = null)
//type is uniform or arbitrary

//segmentGranularity is ignored if type is arbitrary
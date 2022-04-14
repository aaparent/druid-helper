package com.tritondigital.measurement.druid.http.scalaj

import scalaj.http.{Http, HttpOptions, HttpResponse}

//object DruidHttpHelper {
//
//  def getStatus() = {}
//
//  def synchronousPost(payload: DruidPayload, druidOverlordUrl: String, waitTimeout: Int) = {}
//
//  def asynchronousPost(payload: DruidPayload, druidOverlordUrl: String) = {
//    val connectionTimeout: Int = 20.seconds.toMillis.toInt
//    val response: HttpResponse[String] = Http(druidOverlordUrl)
//      .option(HttpOptions.followRedirects(true))
//      .timeout(connectionTimeout, connectionTimeout)
//      .postData(payload.toString).header("content-type", "application/json").asString
//
//    val code = response.code
//    if (code != 200) {
//      throw new IllegalStateException(s"Error when posting job to druid : $response")
//    }
//  }
//}

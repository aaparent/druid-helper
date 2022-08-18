name := "druid-helper"
scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.2" % "provided", // or compile ?
  "org.json4s" %% "json4s-jackson" % "4.0.5",

  "org.scalatest" %% "scalatest" % "3.2.12" % Test

)
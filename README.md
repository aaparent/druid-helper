# Druid Helper
This tiny project is meant to be a DSL for druid payload (mainly ingestion payloads).

More to come / lot to do !


MVP = ingestion, no constraints on optional/mandatory values, build 1 jar with scalaj-http embedded

List of features :
 - Can create druid payload in scala or Java
 - Constraints on mandatory values
 - Should only generate valid payload (coupling with druid project ? Ways to check a payload ?)
 - Can send the payload, with different strategies (retries, timeout, wait until ingestion is done, or wait until ingestion is triggered, or doesn't wait at all)
 - 2 builds, one without scala-http and only meant to create payload (http lib agnostic), second with everything

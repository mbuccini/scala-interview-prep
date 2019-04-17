name := "scala-interview-prep"

scalaVersion := "2.12.8"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.softwaremill.sttp" %% "akka-http-backend" % "1.5.12",
  "com.typesafe.akka" %% "akka-stream" % "2.5.19",
  "com.softwaremill.sttp" %% "json4s" % "1.5.12",
  "org.json4s" %% "json4s-native" % "3.6.0",

  "junit" % "junit" % "4.10" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.5" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

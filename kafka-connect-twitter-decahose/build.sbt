import sbt.Resolver

name := "kafka.connect.twitter.decahose"

version := "1.0"

organization := "com.landoop"

scalaVersion := "2.11.8"

val kafkaVersion = "0.10.0.0"
val guavaVersion = "19.0"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "connect-api" % kafkaVersion, // provided
  "org.apache.avro" % "avro" % "1.8.0",
  "com.google.guava" % "guava" % guavaVersion,
  "org.json4s" %% "json4s-native" % "3.4.0",
  "ch.qos.logback" % "logback-classic" % "1.0.1", // by using logback, we are actually using SLF4J
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

resolvers += Resolver.mavenLocal

// Errors creating spark contexts otherwise
parallelExecution in Test := false
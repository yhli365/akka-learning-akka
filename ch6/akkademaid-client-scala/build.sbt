name := """akkademaid-client-scala"""

version := "1.0"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-cluster" % "2.3.9",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.9"
)

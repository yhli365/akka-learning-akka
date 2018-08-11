name := "akkademaid-scala"

organization := "com.akkademy-db"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-cluster" % "2.3.9",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.9",
  "com.syncthemall" % "boilerpipe" % "1.2.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)

mappings in (Compile, packageBin) ~= { _.filterNot { case (_, name) =>
  Seq("application.conf").contains(name)
}}


name := "sqsfork"

version := "1.0.2"

scalaVersion := "2.12.1"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.12" % "2.4.14"

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.64"

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature")
name := """loja"""
organization := "com.feijao.padua"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.3.7.Final",
  "org.postgresql" % "postgresql" % "42.2.5",

)
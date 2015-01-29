name := """play-rjs-coffee-hbs"""

version := "2.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" % "requirejs" % "2.1.15"
)

// JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

// Apply RequireJS optimization, digest calculation and gzip compression to assets
pipelineStages := Seq(rjs, digest, gzip)

HbsKeys.amd := true

// HbsKeys.min := false

// HbsKeys.knownOnly := true


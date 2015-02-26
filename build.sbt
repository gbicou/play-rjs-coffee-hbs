name := """play-rjs-coffee-hbs"""

version := "2.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "requirejs" % "2.1.15",
  "org.webjars" % "handlebars" % "3.0.0-1"
)

// JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

// Apply RequireJS optimization, digest calculation and gzip compression to assets
pipelineStages := Seq(rjs, digest, gzip)

HbsKeys.amd := true

// HbsKeys.knownOnly := true

HbsKeys.root := "templates/" // path relative to assets (stripped from path for templates names)


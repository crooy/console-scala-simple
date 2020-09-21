Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / turbo := true
ThisBuild / scalaVersion := "2.12.11"

lazy val root = project
  .in(file("."))
  .settings(
    name := "console-scala-simple",
    publish / skip := true
  )
  .aggregate(example)

lazy val example = project
  .in(file("example"))
  .settings(commonSettings)
  .settings(
    name := "example",
    Compile / mainClass := Some("org.eclipse.che.examples.HelloWorld"),
    libraryDependencies ++= List(
      Dependencies.zio,
      Dependencies.scalaTest % Test
    )
  )

lazy val commonSettings: List[Def.Setting[_]] = List(
  organization := "org.eclipse.che.examples",
  homepage := Some(url("https://github.com/sideeffffect/console-scala-simple")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "Ronald Crooy",
      "Ronald Crooy",
      "r.a.crooy@gmail.com",
      url("https://www.crooy.com")
    )
  )
)

//addCommandAlias("ci", "; check; publishLocal")
addCommandAlias("ci", "; publishLocal")

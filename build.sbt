scalaVersion in ThisBuild := "2.11.12"

lazy val commonSettings = Seq(
  name := "Scalaculator",
  organization := "com.github",
  version := "1.0"
)

lazy val app = (project in file(".")).settings(commonSettings: _*).
  settings(
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:implicitConversions"
  ),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

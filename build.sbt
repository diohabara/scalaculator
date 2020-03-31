lazy val root = (project in file(".")).settings(
  name := "Scalaculator",
  organization := "com.github",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.11",
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:implicitConversion"
  ),
  libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.3.0",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

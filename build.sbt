lazy val root = (project in file(".")).settings(
  name := "Scalaculator",
  version := "1.0",
  scalaVersion := "2.13.3",
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:implicitConversions"
  ),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

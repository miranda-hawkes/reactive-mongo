lazy val root = (project in file(".")).enablePlugins(PlayScala)
    .settings(
        name := "reactive-mongo",
        version := "0.1",
        scalaVersion := "2.12.5"
    )

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += guice //guice support module - configure application loader
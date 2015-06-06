name := """inception"""

version := "1.0-SNAPSHOT"
scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaCore,
  javaWs % "test",
  cache,
  "com.h2database" % "h2" % "1.4.181",
  "org.springframework" % "spring-context" % "4.1.6.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.1.6.RELEASE"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

routesGenerator := InjectedRoutesGenerator
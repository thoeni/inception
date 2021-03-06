name := """inception"""

version := "1.0-SNAPSHOT"
scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  javaCore,
  javaWs % "test",
  "com.h2database" % "h2" % "1.4.181",
  "org.springframework" % "spring-context" % "4.1.6.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.1.6.RELEASE",
  "org.springframework" % "spring-tx" % "4.1.6.RELEASE",
  "org.springframework" % "spring-expression" % "4.1.6.RELEASE",
  "org.springframework" % "spring-aop" % "4.1.6.RELEASE",
  "org.springframework" % "spring-test" % "4.1.6.RELEASE" % "test"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

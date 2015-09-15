scalaVersion := "2.11.7"

organization := "com.twitter.finagle"

name := "finagle-consul"

version := "0.1-SNAPSHOT"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

resolvers += "twttr" at "http://maven.twttr.com/"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.twitter"    %% "finagle-core"    % "6.28.0",
  "com.twitter"    %% "finagle-httpx"   % "6.28.0",
  "org.json4s"     %% "json4s-jackson"  % "3.2.11",
  "org.scalatest"  %% "scalatest"       % "2.2.4"   % "test"
)

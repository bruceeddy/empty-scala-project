name := "Empty Scala Project"

version := "1.0"

organization := "com.example"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
 "org.pircbotx" % "pircbotx" % "1.7", 
 "io.netty" % "netty" % "3.5.1.Final",
 "commons-lang" % "commons-lang" % "2.6",
 "org.apache.httpcomponents" % "httpclient" % "4.2.1"
 )
 
 libraryDependencies ++= Seq(
 "org.specs2" %% "specs2" % "1.9" % "test",
 "junit" % "junit" % "4.5" % "test",
 "org.scalatest" %% "scalatest" % "1.8" % "test",
 "org.mockito" % "mockito-core" % "1.9.0" % "test"
 )
 
seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)


 


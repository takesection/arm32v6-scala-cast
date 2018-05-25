import sbt._

object Dependencies {
  lazy val akkaVersion = "2.5.11"

  lazy val cast              = "su.litvak.chromecast" % "api-v2" % "0.10.2"
  lazy val akkaActor         = "com.typesafe.akka" %% "akka-actor"  % akkaVersion
  lazy val akkaStream        = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  lazy val akkaStreamTestKit = "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test

  lazy val mp3spi = "com.googlecode.soundlibs" % "mp3spi" % "1.9.5.4"

  lazy val awsSdkVersion = "1.11.271"
  lazy val awsPolly = "com.amazonaws" % "aws-java-sdk-polly" % awsSdkVersion

}
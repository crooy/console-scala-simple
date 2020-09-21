import sbt._

object Dependencies {

  object Versions {
    
    val scalaTest = "3.2.2"
    val zioVersion = "1.0.1"

  }

  val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest
  val zio = "dev.zio" %% "zio" % Versions.zioVersion
}

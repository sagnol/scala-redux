lazy val catsVersion = "1.0.1"
lazy val shapelessVersion = "2.3.3"
lazy val scalaTestVersion = "3.0.3"
lazy val akkaVersion = "2.5.11"
lazy val root = (project in file("."))
  .settings(
    name := "scala-redux",
    version := "0.1",
    scalaVersion := "2.12.4",
    autoCompilerPlugins := true,
    resolvers ++= Seq(
      Resolver.sonatypeRepo("releases"),
      Resolver.sonatypeRepo("snapshots")
    ),
    libraryDependencies := Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "cats-free" % catsVersion,
      "com.chuusai" %% "shapeless" % shapelessVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
      "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
    )
  )

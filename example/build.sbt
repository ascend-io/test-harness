resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.ascend" %% "test-harness" % "2.4.5-SNAPSHOT"

mainClass in (Compile, run) := Some("org.apache.spark.deploy.SparkSubmit")

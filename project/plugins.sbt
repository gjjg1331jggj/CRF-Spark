addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.3")

resolvers += Classpaths.sbtPluginReleases

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"
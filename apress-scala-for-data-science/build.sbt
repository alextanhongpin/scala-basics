name:="data-science"

libraryDependencies  ++= Seq(
  // Last stable release
  "org.scalanlp" %% "breeze" % "0.13",
  
  // Native libraries are not included by default. add this if you want them (as of 0.7)
  // Native libraries greatly improve performance, but increase jar sizes. 
  // It also packages various blas implementations, which have licenses that may or may not
  // be compatible with the Apache License. No GPL code, as best I know.
  "org.scalanlp" %% "breeze-natives" % "0.13",
  
  // The visualization library is distributed separately as well.
  // It depends on LGPL code
  "org.scalanlp" %% "breeze-viz" % "0.13"
)


val json4sNative = "org.json4s" %% "json4s-native" % "3.5.1"

// val json4sJackson = "org.json4s" %% "json4s-jackson" % "3.5.1"

libraryDependencies += json4sNative

// libraryDependencies += json4sJackson


resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
import com.vanniktech.maven.publish.SonatypeHost

plugins {
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

if(System.getenv("CI") == "true") {
  @Suppress("UnstableApiUsage")
  mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01)

    signAllPublications()
  }
}
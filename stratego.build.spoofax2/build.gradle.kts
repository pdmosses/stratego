plugins {
  id("org.metaborg.gradle.config.java-library")
  id("org.metaborg.gradle.config.junit-testing")
}

dependencies {
  api(platform("org.metaborg:parent:$version"))
  api(project(":stratego.build"))
  api("org.metaborg:pie.taskdefs.guice")
  api("org.metaborg:org.metaborg.core:$version")
  api("org.metaborg:org.metaborg.spoofax.core:$version")
  compileOnly("com.google.code.findbugs:jsr305")
}

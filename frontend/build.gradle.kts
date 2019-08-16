plugins {
    id("com.github.node-gradle.node") version "2.0.0"
}

node {
    version = "12.7.0"
    yarnVersion = "1.17.3"
}

val yarn_test by tasks.getting  {
    dependsOn("yarn_test")
}

val yarn_bundle by tasks.getting  {
    dependsOn("yarn_install")
}

val build by tasks.getting  {
    dependsOn("yarn_build")
}

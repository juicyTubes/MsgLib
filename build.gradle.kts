// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    `maven-publish`
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
}
//publishing {
//    publications {
//        register<MavenPublication>("release") {
//            groupId = "com.example"
//            artifactId = "library"
//            version = "1.8"
//
//            afterEvaluate {
//                from(components.findByName(name))
//            }
//        }
//    }
//    repositories {
//        maven {
//            name = "myrepo"
//            url = uri(layout.buildDirectory.dir("repo"))
//        }
//    }
//}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    `maven-publish`
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.example.mylibrary"
            artifactId = "mylibrary"
            version = "v1.0"

//            from(components["java"])
        }
    }
}
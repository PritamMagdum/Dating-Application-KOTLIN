// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()  // Google's Maven repository
        //mavenCentral()  // Maven Central repository
    }

    dependencies {
        classpath ("com.google.gms:google-services:4.3.15")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}
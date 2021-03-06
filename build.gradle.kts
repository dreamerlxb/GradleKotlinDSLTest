// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.2.1")
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"

        classpath(kotlin("gradle-plugin", version = "1.3.11"))

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register(name = "clean", type = Delete::class) {
    delete(rootProject.buildDir)
}

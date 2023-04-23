plugins {
    kotlin("multiplatform") version "1.7.20"
    id("maven-publish")
}

group = "xqt-platform"
version = "0.1"

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().download =
        System.getProperty("nodejs.download") != "false"
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = System.getProperty("jvm.target") ?: "11"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform() // JUnit 5
        }
    }

    js(BOTH) {
        browser {
            testTask {
                useKarma {
                    when (BuildConfiguration.jsBrowser(project)) {
                        JsBrowser.Chrome -> useChromeHeadless()
                        JsBrowser.ChromeCanary -> useChromeCanaryHeadless()
                        JsBrowser.Chromium -> useChromiumHeadless()
                        JsBrowser.Firefox -> useFirefoxHeadless()
                        JsBrowser.FirefoxAurora -> useFirefoxAuroraHeadless()
                        JsBrowser.FirefoxDeveloper -> useFirefoxDeveloperHeadless()
                        JsBrowser.FirefoxNightly -> useFirefoxNightlyHeadless()
                        JsBrowser.PhantomJs -> usePhantomJS()
                        JsBrowser.Safari -> useSafari()
                    }
                }
            }
        }

        nodejs {
        }
    }

    val hostOs = System.getProperty("os.name")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        hostOs.startsWith("Windows") -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("commonMain")
            dependencies {
                implementation(project(":src:xqt-platform-xml"))
                implementation(project(":src:xqt-platform-xpath"))
            }
        }
        val commonTest by getting {
            kotlin.srcDir("commonTest")
            dependencies {
                implementation(kotlin("test"))
                implementation(project(":src:xqt-kotlinx-test"))
            }
        }

        val jvmMain by getting {
            kotlin.srcDir("jvmMain")
        }
        val jvmTest by getting {
            kotlin.srcDir("jvmTest")
        }

        val jsMain by getting {
            kotlin.srcDir("jsMain")
        }
        val jsTest by getting {
            kotlin.srcDir("jsTest")
        }

        val nativeMain by getting {
            kotlin.srcDir("nativeMain")
        }
        val nativeTest by getting {
            kotlin.srcDir("nativeTest")
        }
    }
}

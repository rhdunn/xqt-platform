import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    kotlin("multiplatform") version "1.7.20"
    id("maven-publish")
}

group = "xqt-platform"
version = "0.1"

rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.the<NodeJsRootExtension>().download = BuildConfiguration.nodeJsDownload(project)
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = BuildConfiguration.jvmTarget(project)
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
                    when (BuildConfiguration.karmaBrowserTarget(project)) {
                        KarmaBrowserTarget.Chrome -> useChrome()
                        KarmaBrowserTarget.ChromeHeadless -> useChromeHeadless()
                        KarmaBrowserTarget.ChromeCanary -> useChromeCanary()
                        KarmaBrowserTarget.ChromeCanaryHeadless -> useChromeCanaryHeadless()
                        KarmaBrowserTarget.Chromium -> useChromium()
                        KarmaBrowserTarget.ChromiumHeadless -> useChromiumHeadless()
                        KarmaBrowserTarget.Firefox -> useFirefox()
                        KarmaBrowserTarget.FirefoxHeadless -> useFirefoxHeadless()
                        KarmaBrowserTarget.FirefoxAurora -> useFirefoxAurora()
                        KarmaBrowserTarget.FirefoxAuroraHeadless -> useFirefoxAuroraHeadless()
                        KarmaBrowserTarget.FirefoxDeveloper -> useFirefoxDeveloper()
                        KarmaBrowserTarget.FirefoxDeveloperHeadless -> useFirefoxDeveloperHeadless()
                        KarmaBrowserTarget.FirefoxNightly -> useFirefoxNightly()
                        KarmaBrowserTarget.FirefoxNightlyHeadless -> useFirefoxNightlyHeadless()
                        KarmaBrowserTarget.PhantomJs -> usePhantomJS()
                        KarmaBrowserTarget.Safari -> useSafari()
                        KarmaBrowserTarget.Opera -> useOpera()
                        KarmaBrowserTarget.Ie -> useIe()
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
        commonMain.kotlin.srcDir("commonMain")
        commonTest.kotlin.srcDir("commonTest")

        commonMain.dependencies {
            implementation(project(":src:xqt-platform-xml"))
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation(project(":src:xqt-kotlinx-test"))
        }

        jvmMain.kotlin.srcDir("jvmMain")
        jvmTest.kotlin.srcDir("jvmTest")

        jsMain.kotlin.srcDir("jsMain")
        jsTest.kotlin.srcDir("jsTest")

        nativeMain.kotlin.srcDir("nativeMain")
        nativeTest.kotlin.srcDir("nativeTest")
    }
}

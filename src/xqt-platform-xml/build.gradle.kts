import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.konan.target.HostManager
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
    kotlin("multiplatform") version "1.7.20"
    id("maven-publish")
}

group = ProjectMetadata.GitHub.GroupId
version = ProjectMetadata.Build.Version

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

    @Suppress("KDocMissingDocumentation")
    val nativeTarget = when (HostManager.host) {
        KonanTarget.MACOS_ARM64 -> kotlin.macosArm64("native")
        KonanTarget.MACOS_X64 -> kotlin.macosX64("native")
        KonanTarget.LINUX_X64 -> kotlin.linuxX64("native")
        KonanTarget.MINGW_X64 -> kotlin.mingwX64("native")
        else -> throw GradleException("Kotlin/Native build target '${HostManager.host.name}' is not supported.")
    }

    sourceSets {
        commonMain.kotlin.srcDir("commonMain")
        commonTest.kotlin.srcDir("commonTest")

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

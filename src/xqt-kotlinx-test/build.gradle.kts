import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.konan.target.HostManager
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
    kotlin("multiplatform") version "1.7.20"
}

rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.the<NodeJsRootExtension>().download = BuildConfiguration.nodeJsDownload(project)
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = BuildConfiguration.jvmTarget(project)
        }
        withJava()
    }

    js(BOTH) {
        browser {
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
        jvmMain.kotlin.srcDir("jvmMain")
        jsMain.kotlin.srcDir("jsMain")
        nativeMain.kotlin.srcDir("nativeMain")

        jvmMain.dependencies {
            implementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        }
    }
}

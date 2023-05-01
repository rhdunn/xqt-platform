// Copyright (C) 2023 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.net.URI

buildscript {
    dependencies {
        classpath(Dependency.DokkaBase)
    }
}

plugins {
    kotlin("multiplatform") version Version.Plugin.KotlinMultiplatform
    id("org.jetbrains.dokka") version Version.Plugin.Dokka
    id("maven-publish")
    id("signing")
}

group = ProjectMetadata.GitHub.GroupId
version = ProjectMetadata.Build.Version

// region Kotlin Multiplatform (Common)

kotlin.sourceSets {
    commonMain.kotlin.srcDir("commonMain")
    commonTest.kotlin.srcDir("commonTest")

    commonMain.dependencies {
        implementation(project(":src:xqt-platform-xml"))
    }

    commonTest.dependencies {
        implementation(kotlin("test"))
        implementation(project(":src:xqt-kotlinx-test"))
    }
}

// endregion
// region Kotlin JS

rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.the<NodeJsRootExtension>().download = BuildConfiguration.nodeJsDownload(project)
}

kotlin.js(KotlinJsCompilerType.BOTH).browser {
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

kotlin.js(KotlinJsCompilerType.BOTH).nodejs {
}

kotlin.sourceSets {
    jsMain.kotlin.srcDir("jsMain")
    jsTest.kotlin.srcDir("jsTest")
}

// endregion
// region Kotlin JVM

kotlin.jvm {
    compilations.all {
        kotlinOptions.jvmTarget = BuildConfiguration.jvmTarget(project)
    }

    withJava()

    testRuns["test"].executionTask.configure {
        useJUnitPlatform() // JUnit 5
    }
}

kotlin.sourceSets {
    jvmMain.kotlin.srcDir("jvmMain")
    jvmTest.kotlin.srcDir("jvmTest")
}

// endregion
// region Kotlin Native

// https://kotlinlang.org/docs/native-target-support.html
@Suppress("KDocMissingDocumentation")
val nativeTarget = when (BuildConfiguration.konanTarget(project)) {
    KonanTarget.ANDROID_ARM32 -> kotlin.androidNativeArm32("native") // Tier 3
    KonanTarget.ANDROID_ARM64 -> kotlin.androidNativeArm64("native") // Tier 3
    KonanTarget.ANDROID_X64 -> kotlin.androidNativeX64("native") // Tier 3
    KonanTarget.ANDROID_X86 -> kotlin.androidNativeX86("native") // Tier 3
    KonanTarget.IOS_ARM32 -> kotlin.iosArm32("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.IOS_ARM64 -> kotlin.iosArm64("native") // Tier 2
    KonanTarget.IOS_SIMULATOR_ARM64 -> kotlin.iosSimulatorArm64("native") // Tier 1
    KonanTarget.IOS_X64 -> kotlin.iosX64("native") // Tier 1
    KonanTarget.LINUX_ARM32_HFP -> kotlin.linuxArm32Hfp("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.LINUX_ARM64 -> kotlin.linuxArm64("native") // Tier 2
    KonanTarget.LINUX_MIPS32 -> kotlin.linuxMips32("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.LINUX_MIPSEL32 -> kotlin.linuxMipsel32("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.LINUX_X64 -> kotlin.linuxX64("native") // Tier 1 ; native host
    KonanTarget.MACOS_ARM64 -> kotlin.macosArm64("native") // Tier 1 ; native host
    KonanTarget.MACOS_X64 -> kotlin.macosX64("native") // Tier 1 ; native host
    KonanTarget.MINGW_X64 -> kotlin.mingwX64("native") // Tier 3 ; native host
    KonanTarget.MINGW_X86 -> kotlin.mingwX86("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.TVOS_ARM64 -> kotlin.tvosArm64("native") // Tier 2
    KonanTarget.TVOS_SIMULATOR_ARM64 -> kotlin.tvosSimulatorArm64("native") // Tier 2
    KonanTarget.TVOS_X64 -> kotlin.tvosX64("native") // Tier 2
    KonanTarget.WASM32 -> kotlin.wasm32("native") // Deprecated, to be removed in 1.9.20
    KonanTarget.WATCHOS_ARM32 -> kotlin.watchosArm32("native") // Tier 2
    KonanTarget.WATCHOS_ARM64 -> kotlin.watchosArm64("native") // Tier 2
    KonanTarget.WATCHOS_SIMULATOR_ARM64 -> kotlin.watchosSimulatorArm64("native") // Tier 2
    KonanTarget.WATCHOS_X64 -> kotlin.watchosX64("native") // Tier 2
    KonanTarget.WATCHOS_X86 -> kotlin.watchosX86("native") // Deprecated, to be removed in 1.9.20
    is KonanTarget.ZEPHYR -> throw GradleException("Kotlin/Native build target 'zephyr' is not supported.")
}

publishing.publications.getByName("native", MavenPublication::class) {
    artifactId = project.nativeArtifactId(nativeTarget.konanTarget)
}

kotlin.sourceSets {
    nativeMain.kotlin.srcDir("nativeMain")
    nativeTest.kotlin.srcDir("nativeTest")
}

// endregion
// region Dokka

tasks.withType<DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach {
        includes.from(file("README.md"))
    }

    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        footerMessage = "Copyright © ${ProjectMetadata.Copyright.Year} ${ProjectMetadata.Copyright.Owner}"
    }
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {
        includes.from(file("README.md"))
    }

    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        footerMessage = "Copyright © ${ProjectMetadata.Copyright.Year} ${ProjectMetadata.Copyright.Owner}"
    }
}

@Suppress("KDocMissingDocumentation")
val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing.publications.withType<MavenPublication> {
    artifact(javadocJar)
}

// endregion
// region Maven POM Metadata

publishing.publications.withType<MavenPublication> {
    pom {
        name.set("$groupId:$artifactId")
        description.set(ProjectMetadata.Description)
        url.set(ProjectMetadata.GitHub.ProjectUrl)

        licenses {
            license {
                name.set(ProjectMetadata.License.Name)
                url.set(ProjectMetadata.License.Url)
                distribution.set("repo")
            }
        }

        developers {
            developer {
                name.set(ProjectMetadata.GitHub.AccountName)
                email.set(ProjectMetadata.GitHub.AccountEmail)
                organization.set(ProjectMetadata.GitHub.AccountId)
                organizationUrl.set(ProjectMetadata.GitHub.AccountUrl)
            }
        }

        scm {
            connection.set("scm:git:${ProjectMetadata.GitHub.CloneSshUrl}")
            developerConnection.set("scm:git:${ProjectMetadata.GitHub.CloneSshUrl}")
            url.set(ProjectMetadata.GitHub.ProjectUrl)

            if (ProjectMetadata.Build.Type == BuildType.Release) {
                tag.set(ProjectMetadata.Build.VersionTag)
            }
        }

        issueManagement {
            url.set(ProjectMetadata.GitHub.IssuesUrl)
        }
    }
}

// endregion
// region Publish to Maven

publishing.repositories {
    maven {
        name = "MavenCentral"

        url = if (ProjectMetadata.Build.Type == BuildType.Release) {
            URI("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
        } else {
            URI("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }

        credentials {
            username = BuildConfiguration.ossrhUsername(project)
            password = BuildConfiguration.ossrhPassword(project)
        }
    }
}

// endregion
// region Signing Artifacts

signing {
    isRequired = BuildConfiguration.mavenSignArtifacts(project)

    useGpgCmd()
}

publishing.publications.configureEach {
    if (signing.isRequired) {
        signing.sign(this)
    }
}

// See https://youtrack.jetbrains.com/issue/KT-46466
// ... Note: This is due to the javadocJar task being shared across all the publications.
@Suppress("KDocMissingDocumentation")
val signingTasks = tasks.withType<Sign>()
tasks.withType<AbstractPublishToMaven>().configureEach {
    dependsOn(signingTasks)
}

// endregion

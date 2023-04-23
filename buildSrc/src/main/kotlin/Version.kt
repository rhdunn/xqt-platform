// Copyright (C) 2023 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0

/**
 * Versions of the various plugins and libraries used by the project.
 */
@Suppress("KDocMissingDocumentation")
object Version {
    /**
     * The version of the Kotlin compiler and runtime.
     */
    const val Kotlin = "1.7.20"

    /**
     * Versions of the various plugins used by the project.
     */
    object Plugin {
        /**
         * The version of the `kotlin("multiplatform")` plugin.
         */
        const val KotlinMultiplatform = Kotlin
    }

    object Dependency {
        const val JUnit = "5.6.0"
    }
}

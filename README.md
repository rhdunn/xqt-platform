# xqt-platform
[![Maven Central](https://img.shields.io/maven-central/v/io.github.rhdunn/xqt-platform)](https://central.sonatype.com/artifact/io.github.rhdunn/xqt-platfom)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
> Kotlin multiplatform XPath, XQuery, and XSLT library

The `xqt-platform` library is an open-source implementation of the XPath,
XQuery, and XSLT languages. The goal of this project is to provide an API
capable of supporting code analysis and IDE tools.

-----

1. [Features](#features)
   1. [Languages](#languages)
   2. [W3C Extensions](#w3c-extensions)
   3. [Vendor Extensions](#vendor-extensions)
   4. [Core APIs](#core-apis)
2. [Adding the Library as a Maven Dependency](#adding-the-library-as-a-maven-dependency)
3. [Supported Kotlin/Native Targets](#supported-kotlinnative-targets)
4. [Documentation](#documentation)
   1. [Building the Project with Gradle](#building-the-project-with-gradle)
   2. [Design Documentation](#design-documentation)
5. [License](#license)

## Features
### Languages
The XQT platform provides the following libraries that implement support for XML
related languages:
1. [xqt-platform-xpath](src/xqt-platform-xpath/README.md) &ndash; Support for
   the XML Path (XPath) language.
2. [xqt-platform-xslt](src/xqt-platform-xslt/README.md) &ndash; Support for
   the XSL Transformations (XSLT) language.

### W3C Extensions
1. [xqt-platform-ft](src/xqt-platform-ft/README.md) &ndash; Support for
   the XPath and XQuery Full Text extensions.

### Vendor Extensions
1. [xqt-platform-marklogic](src/xqt-platform-marklogic/README.md) &ndash; Support for
   the MarkLogic XPath and XQuery vendor extensions.
2. [xqt-platform-saxon](src/xqt-platform-saxon/README.md) &ndash; Support for
   the saxon XPath and XQuery vendor extensions.

### Core APIs
The XQT platform provides the following libraries that provide a common framework
for implementing the languages:
1. [xqt-platform-xml](src/xqt-platform-xml/README.md) &ndash; A common set of
   XML types and lexer primitives.

## Adding the Library as a Maven Dependency
The `xqt-platform` binaries are available on
[Maven Central](https://central.sonatype.com/artifact/io.github.rhdunn/xqt-platform).

Maven:

    <dependency>
        <groupId>io.github.rhdunn</groupId>
        <artifactId>xqt-platform</artifactId>
        <version>0.2.0</version>
    </dependency>

Gradle (Groovy DSL):

    implementation 'io.github.rhdunn:xqt-platform:0.2.0'

Gradle (Kotlin DSL):

    implementation("io.github.rhdunn:xqt-platform:0.2.0")

## Supported Kotlin/Native Targets
| Target [1]                | Family       | Tier [1]       | Status         |
|---------------------------|--------------|----------------|----------------|
| `android_arm32`           | Android      | 3              | Build Only [3] |
| `android_arm64`           | Android      | 3              | Build Only [3] |
| `android_x64`             | Android      | 3              | Build Only [3] |
| `android_x86`             | Android      | 3              | Build Only [3] |
| `ios_arm32`               | Mac iOS      | Deprecated [2] | Build Only [3] |
| `ios_arm64`               | Mac iOS      | 2              | Build Only [3] |
| `ios_simulator_arm64`     | Mac iOS      | 1              | Build and Test |
| `ios_x64`                 | Mac iOS      | 1              | Build and Test |
| `linux_arm32_hfp`         | Linux        | Deprecated [2] | Build Only [3] |
| `linux_arm64`             | Linux        | 2              | Build Only [3] |
| `linux_mips32`            | Linux        | Deprecated [2] | Build Only [3] |
| `linux_mipsel32`          | Linux        | Deprecated [2] | Build Only [3] |
| `linux_x64`               | Linux        | 1 (Host)       | Build and Test |
| `macos_arm64`             | Mac OSX      | 1 (Host)       | Build and Test |
| `macos_x64`               | Mac OSX      | 1 (Host)       | Build and Test |
| `mingw_x64`               | MinGW        | 3 (Host)       | Build and Test |
| `mingw_x86`               | MinGW        | Deprecated [2] | Build Only [3] |
| `tvos_arm64`              | Mac TV OS    | 2              | Build Only [3] |
| `tvos_simulator_arm64`    | Mac TV OS    | 2              | Build and Test |
| `tvos_x64`                | Mac TV OS    | 2              | Build and Test |
| `wasm32`                  | WASM         | Deprecated [2] | Build Only [3] |
| `watchos_arm32`           | Mac Watch OS | 2              | Build Only [3] |
| `watchos_arm64`           | Mac Watch OS | 2              | Build Only [3] |
| `watchos_simulator_arm64` | Mac Watch OS | 2              | Build and Test |
| `watchos_x64`             | Mac Watch OS | 2              | Build Only [4] |
| `watchos_x86`             | Mac Watch OS | Deprecated [2] | Build and Test |

[1] See https://kotlinlang.org/docs/native-target-support.html for the list of
Kotlin/Native targets. The `target` column specifies the name used in the
`KonanTarget` instances. The `tier` column is the level of support provided by
JetBrains for the Kotlin/Native target.

[2] The deprecated targets are scheduled to be removed in Kotlin 1.9.20.

[3] The tests for these targets are not supported by Kotlin/Native. A gradle
`nativeTest` task is not available for this configuration.

[4] The tests fail with Kotlin 1.7.20. There is a fix for this in the Kotlin
1.8.0 release. See [KT-54814](https://youtrack.jetbrains.com/issue/KT-54814).

## Documentation
1. [API Documentation](https://rhdunn.github.io/xqt-platform/)

### Building the Project with Gradle
1. [Build Properties](docs/build/Build%20Properties.md)
2. [Environment Variables](docs/build/Envvironment%20Variables.md)
3. [Signing Artifacts](docs/build/Signing%20Artifacts.md)

### Design Documentation
1. [Lexer](docs/design/lexer.md)

## License
Copyright (C) 2022-2023 Reece H. Dunn

`SPDX-License-Identifier:` [Apache-2.0](LICENSE)

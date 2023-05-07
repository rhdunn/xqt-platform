# xqt-platform
> Kotlin multiplatform XPath, XQuery, and XSLT library

The `xqt-platform` library is an open-source implementation of the XPath,
XQuery, and XSLT languages. The goal of this project is to provide an API
capable of supporting code analysis and IDE tools.

The documentation is available at https://rhdunn.github.io/xqt-platform/.

## Languages
The XQT platform provides the following libraries that implement support for XML
related languages:
1. [xqt-platform-xpath](src/xqt-platform-xpath/README.md) &ndash; Support for
   the XML Path (XPath) language.
2. [xqt-platform-xslt](src/xqt-platform-xslt/README.md) &ndash; Support for
   the XSL Transformations (XSLT) language.

## W3C Extensions
1. [xqt-platform-ft](src/xqt-platform-ft/README.md) &ndash; Support for
   the XPath and XQuery Full Text extensions.

## Vendor Extensions
1. [xqt-platform-marklogic](src/xqt-platform-marklogic/README.md) &ndash; Support for
   the MarkLogic XPath and XQuery vendor extensions.
2. [xqt-platform-saxon](src/xqt-platform-saxon/README.md) &ndash; Support for
   the saxon XPath and XQuery vendor extensions.

## Core APIs
The XQT platform provides the following libraries that provide a common framework
for implementing the languages:
1. [xqt-platform-xml](src/xqt-platform-xml/README.md) &ndash; A common set of
   XML types and lexer primitives.

## Design Documentation
1. [Lexer](docs/design/lexer.md)

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

## Build Configuration
The following configuration properties and environment variables are available
to configure the build:

### jvm.target
The `jvm.target` build property configures the version of the Java VM to target
by the Kotlin compiler. This is used by the GitHub Actions to build against the
LTS releases of JVM, 11 and 17.

### karma.browser
The `karma.browser` build property configures the name of the browser to use in
the Kotlin/JS tests when run on the browser.

### karma.browser.channel
The `karma.browser.channel` build property configures the name of the
development/release channel of the browser used to run the Kotlin/JS tests.

### karma.browser.headless
The `karma.browser.headless` build property determines whether the web browser
runs in headless mode, or with a visible graphical interface.

### konan.target
The `konan.target` build property configures the Kotlin/Native build target.
This is used by the GitHub Actions in the native build's matrix configuration.

### maven.sign
The `maven.sign` build property configures whether the `publish` actions should
sign the artifacts using the configured signing key. This is required when
publishing artifacts to Maven Central.

This can be one of the following values:
1. `env` -- Use the `maven.sign.key.*` build properties or `SIGNING_KEY_*`
   environment variables to sign the artifacts. If the private key is not
   present then the artifacts will not be signed.
2. `gpg`, `true` -- Use the GPG command to sign the artifacts. This will prompt
   the user for the key password.
3. `none`, `false` -- Don't sign the artifacts.

### maven.sign.key.id (SIGNING_KEY_ID)
The `maven.sign.key.id` build property and `SIGNING_KEY_ID` environment
variable specify the key id to use when using a subkey to sign the artifacts.
If a subkey is not used, this should be blank, or not set. The build property
takes precedence over the environment variable.

### maven.sign.key.private (SIGNING_KEY_PRIVATE)
The `maven.sign.key.private` build property and `SIGNING_KEY_PRIVATE`
environment variable specify the ascii-armoured PGP private key to sign the
artifacts with. The build property takes precedence over the environment
variable.

Newlines are represented as `\n`.

If this is not set, the `gpg` command will be used to determine this and the
password.

### maven.sign.key.password (SIGNING_KEY_PASSWORD)
The `maven.sign.key.password` build property and `SIGNING_KEY_PASSWORD`
environment variable specify the password or passphrase associated with the
private key. The build property takes precedence over the environment
variable.

### nodejs.download
The `nodejs.download` build property configures whether the build should
download node when building and running the Kotlin/JS targets. If this is false
the build will use the system's node installation. This is used by the GitHub
Actions to prevent node being downloaded during the build.

### ossrh.username (OSSRH_USERNAME)
The `ossrh.username` build property and `OSSRH_USERNAME` environment variable
specify the Open Source Software Repository Hosting (OSSRH) username to use
when publishing artifacts to Maven Central. The build property takes precedence
over the environment variable.

### ossrh.password (OSSRH_PASSWORD)
The `ossrh.password` build property and `OSSRH_PASSWORD` environment variable
specify the Open Source Software Repository Hosting (OSSRH) username to use
when publishing artifacts to Maven Central.The build property takes precedence
over the environment variable.

## License
Copyright (C) 2022-2023 Reece H. Dunn

`SPDX-License-Identifier:` [Apache-2.0](LICENSE)

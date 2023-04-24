# xqt-platform
> Kotlin multiplatform XPath, XQuery, and XSLT library

The `xqt-platform` library is an open-source implementation of the XPath,
XQuery, and XSLT languages. The goal of this project is to provide an API
capable of supporting code analysis and IDE tools.

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

## Configuration Properties
The following configuration properties are available to configure the build:

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

### nodejs.download
The `nodejs.download` build property configures whether the build should
download node when building and running the Kotlin/JS targets. If this is false
the build will use the system's node installation. This is used by the GitHub
Actions to prevent node being downloaded during the build.

### ossrh.username
The Open Source Software Repository Hosting (OSSRH) username to use when
publishing artifacts to Maven Central. This takes precedence over the
`OSSRH_USERNAME` environment variable.

### ossrh.password
The Open Source Software Repository Hosting (OSSRH) password to use when
publishing artifacts to Maven Central. This takes precedence over the
`OSSRH_PASSWORD` environment variable.

## Environment Variables
The following environment variables are available to configure the build:

### ossrh.username
The Open Source Software Repository Hosting (OSSRH) username to use when
publishing artifacts to Maven Central. This takes precedence over the
`OSSRH_USERNAME` environment variable.

### ossrh.password
The Open Source Software Repository Hosting (OSSRH) password to use when
publishing artifacts to Maven Central. This takes precedence over the
`OSSRH_PASSWORD` environment variable.

## License
Copyright (C) 2022-2023 Reece H. Dunn

SPDX-License-Identifier: [Apache-2.0](LICENSE)

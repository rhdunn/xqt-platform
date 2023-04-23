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

## License
Copyright (C) 2022-2023 Reece H. Dunn

SPDX-License-Identifier: [Apache-2.0](LICENSE)

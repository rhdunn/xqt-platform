# XQT (XML Query/Transform) Platform
The XQT platform is an open-source implementation of the XPath, XQuery, and XSLT
languages. The goal of this project is to provide an API capable of supporting
code analysis and IDE tools.

## Languages
The XQT platform provides the following libraries that implement support for XML
related languages:
1. [xqt-platform-xpath](src/xqt-platform-xpath/README.md) &ndash; Support for
   the XML Path (XPath) language.

## W3C Extensions
1. [xqt-platform-ft](src/xqt-platform-ft/README.md) &ndash; Support for
   the XPath and XQuery Full Text extensions.

## Core APIs
The XQT platform provides the following libraries that provide a common framework
for implementing the languages:
1. [xqt-platform-xml](src/xqt-platform-xml/README.md) &ndash; A common set of
   XML types and lexer primitives.

## Design Documentation
1. [Lexer](docs/design/lexer.md)

## License
Copyright (C) 2022 Reece H. Dunn

SPDX-License-Identifier: [Apache-2.0](LICENSE)

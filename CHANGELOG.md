# Change Log
> Release notes for `xqt-platform`.

This format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Fixed

- Improve the build infrastructure to support automated deployment.
- Include all the supported JVM target variants in the `kotlinMultiplatform` module metadata.

### Changed

- Use the `io.github.rhdunn` group ID for deployment to Maven Central.

## [0.1] - 2023-03-29

> NOTE: This release is not available on Maven Central due to it having the
> wrong group ID. It has to be built from source and published to Maven Local.

1. `XmlChar` definition.
2. `XmlCharReader` to read the characters in a `CharSequence`.
3. Lexer character classes and codepoint constants.
4. Token type interface hierarchy.

### Token Provider Interfaces
1. XPath 1.0 - 4.0 (Editor's Draft)
2. XSLT Pattern 1.0 - 4.0 (Editor's Draft)
3. XPath Full Text 1.0 - 3.0 W3C Extensions
4. MarkLogic 6.0 - 9.0 Vendor Extensions
5. Saxon 9.8 - 11.0 Vendor Extensions

[Unreleased]: https://github.com/rhdunn/xqt-platform/compare/0.1...HEAD
[0.1]: https://github.com/rhdunn/xqt-platform/releases/tag/0.1

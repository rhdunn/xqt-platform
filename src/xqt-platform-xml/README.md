# XQT Platform XML
The XQT platform XML library provides a common set of XML types.

The following specifications are supported:
1. [Extensible Markup Language (XML) 1.0 (Fifth Edition)](https://www.w3.org/TR/2008/REC-xml-20081126/)
2. [Namespaces in XML 1.0 (Third Edition)](https://www.w3.org/TR/2009/REC-xml-names-20091208/)

The following XML lexical constructs are supported:
1. `Char` is modelled as an [XmlChar](commonMain/xqt/platform/xml/model/XmlChar.kt) class.
2. `S` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).
3. `NameStartChar` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).
4. `NameChar` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).

The following lexical constructs are also supported:
1. `Digit := [0-9]` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).
2. `HexDigit := [0-9] | [A-F] | [a-f]` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).
3. `AlphaNumeric := [0-9] | [A-Z] | [a-z]` [character class](commonMain/xqt/platform/xml/lexer/CharacterClass.kt).

The following classes are designed to help implement lexers and tokenizers that
use XML constructs as their base:
1. [CharacterClass](commonMain/xqt/platform/xml/lexer/CharacterClass.kt) &ndash;
   An interface for testing if an `XmlChar` is in a given character class, i.e.
   the character is in a set of codepoints.

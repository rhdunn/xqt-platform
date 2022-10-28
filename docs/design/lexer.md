# Lexer Design
This document details the high-level design of the lexer.

## Char
The core of the lexer is the `XmlChar` class. This is a UTF-32 codepoint value
class modelling the XML [Char](https://www.w3.org/TR/REC-xml/#NT-Char) symbol.

The `XmlCharReader` is a `CharSequence` to UTF-32 reader from a given start and
end offset that keeps track of the current offset.

## Character Classes and Constants
The `CharacterClass` interface matches a single `Char` in a given collection of
values. This is designed to model regular expression character classes. This
allows `c in NameChar` style code checks for these character classes and for them
to be used in Kotlin `when` statements.

A set of ASCII character constants are also defined (`Colon`, `EqualsSign`,
`LeftSquareBracket`, etc.) to make it easier to refer to those codepoints in
the codebase.

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.lexer

/**
 * An ASCII digit.
 *
 *     Digit := [0-9]
 */
object Digit : CharacterClass {
    private val range = '0'.code..'9'.code

    override fun contains(c: Int): Boolean = c in range
}

/**
 * A hexadecimal digit.
 *
 *     HexDigit := [0-9] | [A-F] | [a-f]
 */
object HexDigit : CharacterClass {
    private val digit = '0'.code..'9'.code
    private val lower = 'a'.code..'f'.code
    private val upper = 'A'.code..'F'.code

    override fun contains(c: Int): Boolean = c in digit || c in lower || c in upper
}

/**
 * An XML name start character.
 *
 *     NameStartChar ::= ":" | [A-Z] | "_" | [a-z]
 *                     | [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x2FF]
 *                     | [#x370-#x37D] | [#x37F-#x1FFF]
 *                     | [#x200C-#x200D] | [#x2070-#x218F] | [#x2C00-#x2FEF]
 *                     | [#x3001-#xD7FF] | [#xF900-#xFDCF] | [#xFDF0-#xFFFD]
 *                     | [#x10000-#xEFFFF]
 *
 * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameStartChar">https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameStartChar</a>
 */
object NameStartChar : CharacterClass {
    private val ascii_lower = 'a'.code .. 'z'.code
    private val ascii_upper = 'A'.code .. 'Z'.code

    private val nsc_200c_200d = 0x200C .. 0x200D
    private val nsc_2070_218f = 0x2070 .. 0x218F
    private val nsc_3001_d7ff = 0x3001 .. 0xD7FF
    private val nsc_f900_fdcf = 0xF900 .. 0xFDCF

    override fun contains(c: Int): Boolean = when {
        c <= 0x7F -> c == ':'.code || c in ascii_upper || c == '_'.code || c in ascii_lower
        c <= 0x2FF -> c >= 0xC0 && c != 0xD7 && c != 0xF7
        c <= 0x1FFF -> c >= 0x370 && c != 0x37E
        c <= 0x2FEF -> c in nsc_200c_200d || c in nsc_2070_218f || c >= 0x2C00
        c <= 0xFFFD -> c in nsc_3001_d7ff || c in nsc_f900_fdcf || c >= 0xFDF0
        c <= 0xEFFFF -> c >= 0x10000
        else -> false
    }
}

/**
 * An XML name start character.
 *
 *     NameChar ::= NameStartChar
 *                | "-" | "." | [0-9] | #xB7 | [#x0300-#x036F] | [#x203F-#x2040]
 *
 *     NameStartChar ::= ":" | [A-Z] | "_" | [a-z]
 *                     | [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x2FF]
 *                     | [#x370-#x37D] | [#x37F-#x1FFF]
 *                     | [#x200C-#x200D] | [#x2070-#x218F] | [#x2C00-#x2FEF]
 *                     | [#x3001-#xD7FF] | [#xF900-#xFDCF] | [#xFDF0-#xFFFD]
 *                     | [#x10000-#xEFFFF]
 *
 * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameChar">https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameChar</a>
 * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameStartChar">https://www.w3.org/TR/2008/REC-xml-20081126/#NT-NameStartChar</a>
 */
object NameChar : CharacterClass {
    private val symbols = setOf('-'.code, '.'.code, ':'.code, '_'.code)
    private val ascii_lower = 'a'.code .. 'z'.code
    private val ascii_upper = 'A'.code .. 'Z'.code

    private val nsc_200c_200d = 0x200C .. 0x200D
    private val nsc_203f_2040 = 0x203F .. 0x2040
    private val nsc_2070_218f = 0x2070 .. 0x218F
    private val nsc_3001_d7ff = 0x3001 .. 0xD7FF
    private val nsc_f900_fdcf = 0xF900 .. 0xFCDF

    override fun contains(c: Int): Boolean = when {
        c <= 0x7F -> c in symbols || c in ascii_upper || c in ascii_lower || c in Digit
        c <= 0xBF -> c == 0xB7
        c <= 0x1FFF -> c != 0xD7 && c != 0xF7 && c != 0x37E
        c <= 0x2FEF -> c in nsc_200c_200d || c in nsc_203f_2040 || c in nsc_2070_218f || c >= 0x2C00
        c <= 0xFFFD -> c in nsc_3001_d7ff || c in nsc_f900_fdcf || c >= 0xFDF0
        c <= 0xEFFFF -> c >= 0x10000
        else -> false
    }
}

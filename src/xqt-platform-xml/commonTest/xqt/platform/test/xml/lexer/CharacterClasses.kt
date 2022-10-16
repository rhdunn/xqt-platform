// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.test.xml.lexer

import kotlinx.test.DisplayName
import xqt.platform.xml.lexer.Digit
import xqt.platform.xml.lexer.NameChar
import xqt.platform.xml.lexer.NameStartChar
import xqt.platform.xml.model.XmlChar
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@DisplayName("Character classes support testing if an XmlChar belongs to")
class CharacterClassesSupportTestingIfAnXmlCharBelongsTo {
    @Test
    @DisplayName("the Digit character class")
    fun the_digit_character_class() {
        assertTrue(XmlChar('0') in Digit)
        assertTrue(XmlChar('5') in Digit)
        assertTrue(XmlChar('9') in Digit)

        assertFalse(XmlChar('a') in Digit)
        assertFalse(XmlChar('A') in Digit)
        assertFalse(XmlChar('=') in Digit)
    }

    @Test
    @DisplayName("the NameStartChar character class")
    fun the_name_start_char_character_class() {
        assertTrue(XmlChar(':') in NameStartChar)
        assertTrue(XmlChar('_') in NameStartChar)

        assertFalse(XmlChar('-') in NameStartChar)
        assertFalse(XmlChar('.') in NameStartChar)
        assertFalse(XmlChar('+') in NameStartChar)

        assertFalse(XmlChar('0') in NameStartChar)
        assertFalse(XmlChar('5') in NameStartChar)
        assertFalse(XmlChar('9') in NameStartChar)

        assertTrue(XmlChar('A') in NameStartChar)
        assertTrue(XmlChar('M') in NameStartChar)
        assertTrue(XmlChar('Z') in NameStartChar)

        assertTrue(XmlChar('a') in NameStartChar)
        assertTrue(XmlChar('m') in NameStartChar)
        assertTrue(XmlChar('z') in NameStartChar)

        assertFalse(XmlChar(0xB7) in NameStartChar)

        // [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x2FF]
        assertTrue(XmlChar(0xC0) in NameStartChar)
        assertTrue(XmlChar(0xC8) in NameStartChar)
        assertTrue(XmlChar(0xD6) in NameStartChar)
        assertFalse(XmlChar(0xD7) in NameStartChar)
        assertTrue(XmlChar(0xD8) in NameStartChar)
        assertTrue(XmlChar(0xF2) in NameStartChar)
        assertTrue(XmlChar(0xF6) in NameStartChar)
        assertFalse(XmlChar(0xF7) in NameStartChar)
        assertTrue(XmlChar(0xF8) in NameStartChar)
        assertTrue(XmlChar(0x179) in NameStartChar)
        assertTrue(XmlChar(0x2FF) in NameStartChar)

        assertFalse(XmlChar(0x300) in NameStartChar)
        assertFalse(XmlChar(0x36F) in NameStartChar)

        // [#x370-#x37D] | [#x37F-#x1FFF]
        assertTrue(XmlChar(0x370) in NameStartChar)
        assertTrue(XmlChar(0x379) in NameStartChar)
        assertTrue(XmlChar(0x37D) in NameStartChar)
        assertFalse(XmlChar(0x37E) in NameStartChar)
        assertTrue(XmlChar(0x37F) in NameStartChar)
        assertTrue(XmlChar(0x596) in NameStartChar)
        assertTrue(XmlChar(0x1FFF) in NameStartChar)

        // [#x200C-#x200D]
        assertTrue(XmlChar(0x200C) in NameStartChar)
        assertTrue(XmlChar(0x200D) in NameStartChar)

        assertFalse(XmlChar(0x203F) in NameStartChar)
        assertFalse(XmlChar(0x2040) in NameStartChar)

        // [#x2070-#x218F]
        assertTrue(XmlChar(0x2070) in NameStartChar)
        assertTrue(XmlChar(0x209C) in NameStartChar)
        assertTrue(XmlChar(0x218F) in NameStartChar)

        // [#x2C00-#x2FEF]
        assertTrue(XmlChar(0x2C00) in NameStartChar)
        assertTrue(XmlChar(0x2DD8) in NameStartChar)
        assertTrue(XmlChar(0x2FEF) in NameStartChar)

        // [#x3001-#xD7FF]
        assertTrue(XmlChar(0x3001) in NameStartChar)
        assertTrue(XmlChar(0x8864) in NameStartChar)
        assertTrue(XmlChar(0xD7FF) in NameStartChar)

        // [#xF900-#xFDCF]
        assertTrue(XmlChar(0xF900) in NameStartChar)
        assertTrue(XmlChar(0xFB05) in NameStartChar)
        assertTrue(XmlChar(0xFDCF) in NameStartChar)

        // [#xFDF0-#xFFFD]
        assertTrue(XmlChar(0xFDF0) in NameStartChar)
        assertTrue(XmlChar(0xFE09) in NameStartChar)
        assertTrue(XmlChar(0xFFFD) in NameStartChar)

        // [#x10000-#xEFFFF]
        assertTrue(XmlChar(0x10000) in NameStartChar)
        assertTrue(XmlChar(0x3B955) in NameStartChar)
        assertTrue(XmlChar(0xEFFFF) in NameStartChar)
    }

    @Test
    @DisplayName("the NameChar character class")
    fun the_name_char_character_class() {
        assertTrue(XmlChar(':') in NameChar)
        assertTrue(XmlChar('_') in NameChar)

        assertTrue(XmlChar('-') in NameChar)
        assertTrue(XmlChar('.') in NameChar)

        assertFalse(XmlChar('+') in NameChar)

        assertTrue(XmlChar('0') in NameChar)
        assertTrue(XmlChar('5') in NameChar)
        assertTrue(XmlChar('9') in NameChar)

        assertTrue(XmlChar('A') in NameChar)
        assertTrue(XmlChar('M') in NameChar)
        assertTrue(XmlChar('Z') in NameChar)

        assertTrue(XmlChar('a') in NameChar)
        assertTrue(XmlChar('m') in NameChar)
        assertTrue(XmlChar('z') in NameChar)

        assertTrue(XmlChar(0xB7) in NameChar)

        // [#xC0-#xD6] | [#xD8-#xF6] | [#xF8-#x37D] | [#x37F-#x1FFF]
        assertTrue(XmlChar(0xC0) in NameChar)
        assertTrue(XmlChar(0xC8) in NameChar)
        assertTrue(XmlChar(0xD6) in NameChar)
        assertFalse(XmlChar(0xD7) in NameChar)
        assertTrue(XmlChar(0xD8) in NameChar)
        assertTrue(XmlChar(0xF2) in NameChar)
        assertTrue(XmlChar(0xF6) in NameChar)
        assertFalse(XmlChar(0xF7) in NameChar)
        assertTrue(XmlChar(0xF8) in NameChar)
        assertTrue(XmlChar(0x179) in NameChar)
        assertTrue(XmlChar(0x2FF) in NameChar)
        assertTrue(XmlChar(0x300) in NameChar)
        assertTrue(XmlChar(0x36F) in NameChar)
        assertTrue(XmlChar(0x370) in NameChar)
        assertTrue(XmlChar(0x379) in NameChar)
        assertTrue(XmlChar(0x37D) in NameChar)
        assertFalse(XmlChar(0x37E) in NameChar)
        assertTrue(XmlChar(0x37F) in NameChar)
        assertTrue(XmlChar(0x596) in NameChar)
        assertTrue(XmlChar(0x1FFF) in NameChar)

        // [#x200C-#x200D]
        assertTrue(XmlChar(0x200C) in NameChar)
        assertTrue(XmlChar(0x200D) in NameChar)

        // [#x203F-#x2040]
        assertTrue(XmlChar(0x203F) in NameChar)
        assertTrue(XmlChar(0x2040) in NameChar)

        // [#x2070-#x218F]
        assertTrue(XmlChar(0x2070) in NameChar)
        assertTrue(XmlChar(0x209C) in NameChar)
        assertTrue(XmlChar(0x218F) in NameChar)

        // [#x2C00-#x2FEF]
        assertTrue(XmlChar(0x2C00) in NameChar)
        assertTrue(XmlChar(0x2DD8) in NameChar)
        assertTrue(XmlChar(0x2FEF) in NameChar)

        // [#x3001-#xD7FF]
        assertTrue(XmlChar(0x3001) in NameChar)
        assertTrue(XmlChar(0x8864) in NameChar)
        assertTrue(XmlChar(0xD7FF) in NameChar)

        // [#xF900-#xFDCF]
        assertTrue(XmlChar(0xF900) in NameChar)
        assertTrue(XmlChar(0xFB05) in NameChar)
        assertTrue(XmlChar(0xFCDF) in NameChar)

        // [#xFDF0-#xFFFD]
        assertTrue(XmlChar(0xFDF0) in NameChar)
        assertTrue(XmlChar(0xFE09) in NameChar)
        assertTrue(XmlChar(0xFFFD) in NameChar)

        // [#x10000-#xEFFFF]
        assertTrue(XmlChar(0x10000) in NameChar)
        assertTrue(XmlChar(0x3B955) in NameChar)
        assertTrue(XmlChar(0xEFFFF) in NameChar)
    }
}

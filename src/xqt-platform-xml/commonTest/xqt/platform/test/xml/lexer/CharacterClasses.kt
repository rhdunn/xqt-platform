// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.test.xml.lexer

import kotlinx.test.DisplayName
import xqt.platform.xml.lexer.Digit
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
}

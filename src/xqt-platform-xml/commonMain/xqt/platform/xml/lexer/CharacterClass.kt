// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.lexer

import xqt.platform.xml.model.XmlChar

/**
 * A lexical character class, i.e. a set of codepoints.
 */
interface CharacterClass {
    /**
     * Returns true if the XML character is in this character class.
     */
    operator fun contains(c: XmlChar): Boolean = contains(c.codepoint)

    /**
     * Returns true if the unicode codepoint is in this character class.
     */
    operator fun contains(c: Int): Boolean
}

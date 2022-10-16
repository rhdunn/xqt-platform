// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.model

import kotlin.jvm.JvmInline

/**
 * Represents an XML character.
 *
 * @param codepoint The unicode codepoint for this XML character.
 *
 * @see <a href="http://www.w3.org/TR/REC-xml/#NT-Char">http://www.w3.org/TR/REC-xml/#NT-Char</a>
 */
@JvmInline
value class XmlChar(val codepoint: Int) {
    /**
     * Creates an XML character from a Kotlin character.
     */
    constructor(c: Char) : this(c.code)

    /**
     * Returns the UTF-16 representation of the XML character.
     */
    override fun toString(): String = when {
        codepoint <= 0xFFFF -> codepoint.toChar().toString()
        else -> {
            // Surrogate Pair
            val base = codepoint - 0x10000
            val hi = 0xD800 + base.floorDiv(0x400)
            val lo = 0xDC00 + base % 0x400
            hi.toChar().toString() + lo.toChar().toString()
        }
    }
}

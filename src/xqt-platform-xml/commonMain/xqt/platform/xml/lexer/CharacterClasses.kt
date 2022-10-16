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

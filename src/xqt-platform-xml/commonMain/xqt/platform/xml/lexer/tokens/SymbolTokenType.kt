// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.lexer.tokens

/**
 * A symbol token in an XQT language.
 */
interface SymbolTokenType : TokenType {
    /**
     * The character representation of the token.
     */
    val symbol: String
}

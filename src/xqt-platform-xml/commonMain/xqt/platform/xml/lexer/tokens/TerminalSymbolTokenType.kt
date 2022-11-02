// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.lexer.tokens

/**
 * A terminal symbol token in an XQT language.
 */
interface TerminalSymbolTokenType : TokenType {
    /**
     * The name of the terminal symbol in the grammar.
     */
    val symbol: String
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v3_1.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3.lexer.tokens.XPath30TokenProvider

/**
 * The tokens present in the XPath 3.1 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#id-grammar">XPath 3.1 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#terminal-symbols">XPath 3.1 (REC) Terminal Symbols</a>
 */
@Suppress("PropertyName")
interface XPath31TokenProvider : XPath30TokenProvider {
    /**
     * The thick arrow token ("`=>`").
     *
     *     ThickArrowToken ::= "=>"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-ArrowExpr">XPath 3.1 (REC) ArrowExpr</a>
     */
    val ThickArrow: SymbolTokenType

    /**
     * The `array` keyword token.
     *
     *     KArrayToken ::= "array"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-CurlyArrayConstructor">XPath 3.1 (REC) CurlyArrayConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">XPath 3.1 (REC) AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">XPath 3.1 (REC) TypedArrayTest</a>
     */
    val KArray: KeywordTokenType

    /**
     * The `map` keyword token.
     *
     *     KMapToken ::= "map"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">XPath 3.1 (REC) MapConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">XPath 3.1 (REC) AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">XPath 3.1 (REC) TypedMapTest</a>
     */
    val KMap: KeywordTokenType
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v3_1.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3.lexer.tokens.XPath30TokenProvider

/**
 * The tokens present in the XPath 3.1 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#id-grammar">REC-xpath-31-20170321/#id-grammar</a>
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#terminal-symbols">REC-xpath-31-20170321/#terminal-symbols</a>
 */
@Suppress("PropertyName")
interface XPath31TokenProvider : XPath30TokenProvider {
    /**
     * The thick arrow token ("`=>`").
     *
     *     ThickArrowToken ::= "=>"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-ArrowExpr">REC-xpath-31-20170321/#doc-xpath31-ArrowExpr</a>
     */
    val ThickArrow: SymbolTokenType

    /**
     * The `array` keyword token.
     *
     *     KArrayToken ::= "array"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-CurlyArrayConstructor">REC-xpath-31-20170321/#doc-xpath31-CurlyArrayConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest</a>
     */
    val KArray: KeywordTokenType

    /**
     * The `map` keyword token.
     *
     *     KMapToken ::= "map"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">REC-xpath-31-20170321/#doc-xpath31-MapConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">REC-xpath-31-20170321/#doc-xpath31-AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">REC-xpath-31-20170321/#doc-xpath31-TypedMapTest</a>
     */
    val KMap: KeywordTokenType
}

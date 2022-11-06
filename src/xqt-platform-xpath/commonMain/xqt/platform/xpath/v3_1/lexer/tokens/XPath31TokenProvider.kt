// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v3_1.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3.lexer.tokens.XPath30TokenProvider

/**
 * The tokens present in the XPath 3.1 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#id-grammar">XPath 3.1 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#terminal-symbols">XPath 3.1 (REC) Terminal Symbols</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XPath31TokenProvider : XPath30TokenProvider {
    /**
     * The colon token ("`:`").
     *
     *     ColonToken ::= ":"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">XPath 3.1 (REC) MapConstructor</a>
     */
    override val Colon: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">XPath 3.1 (REC) MapConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">XPath 3.1 (REC) SquareArrayConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">XPath 3.1 (REC) TypedMapTest</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The curly bracket close token ("`}`").
     *
     *     CurlyBracketCloseToken ::= "}"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">XPath 3.1 (REC) MapConstructor</a>
     */
    override val CurlyBracketClose: SymbolTokenType

    /**
     * The curly bracket open token ("`{`").
     *
     *     CurlyBracketOpenToken ::= "{"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">XPath 3.1 (REC) MapConstructor</a>
     */
    override val CurlyBracketOpen: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">XPath 3.1 (REC) AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">XPath 3.1 (REC) TypedMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">XPath 3.1 (REC) AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">XPath 3.1 (REC) TypedArrayTest</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">XPath 3.1 (REC) AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">XPath 3.1 (REC) TypedMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">XPath 3.1 (REC) AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">XPath 3.1 (REC) TypedArrayTest</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-Lookup">XPath 3.1 (REC) Lookup</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-UnaryLookup">XPath 3.1 (REC) UnaryLookup</a>
     */
    override val QuestionMark: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">XPath 3.1 (REC) SquareArrayConstructor</a>
     */
    override val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">XPath 3.1 (REC) SquareArrayConstructor</a>
     */
    override val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-KeySpecifier">XPath 3.1 (REC) KeySpecifier</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">XPath 3.1 (REC) AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">XPath 3.1 (REC) AnyArrayTest</a>
     */
    override val Star: SymbolTokenType

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

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xslt.v1.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v1.lexer.tokens.XPath10TokenProvider

/**
 * The tokens present in the XSLT Patterns 1.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#patterns">XSLT 1.0 (REC) Patterns</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XsltPattern10TokenProvider : XPath10TokenProvider {
    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-LocationPathPattern">XSLT 1.0 (REC) LocationPathPattern</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-RelativePathPattern">XSLT 1.0 (REC) RelativePathPattern</a>
     */
    override val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-ChildOrAttributeAxisSpecifier">XSLT 1.0 (REC) ChildOrAttributeAxisSpecifier</a>
     */
    override val AxisSeparator: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-IdKeyPattern">XSLT 1.0 (REC) IdKeyPattern</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-IdKeyPattern">XSLT 1.0 (REC) IdKeyPattern</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-IdKeyPattern">XSLT 1.0 (REC) IdKeyPattern</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-LocationPathPattern">XSLT 1.0 (REC) LocationPathPattern</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-RelativePathPattern">XSLT 1.0 (REC) RelativePathPattern</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The union token ("`|`").
     *
     *     UnionToken ::= "|"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-Pattern">XSLT 1.0 (REC) Pattern</a>
     */
    override val Union: SymbolTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-ChildOrAttributeAxisSpecifier">XSLT 1.0 (REC) ChildOrAttributeAxisSpecifier</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-ChildOrAttributeAxisSpecifier">XSLT 1.0 (REC) ChildOrAttributeAxisSpecifier</a>
     */
    override val KChild: KeywordTokenType

    /**
     * The `id` keyword token.
     *
     *     KIdToken ::= "id"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-IdKeyPattern">XSLT 1.0 (REC) IdKeyPattern</a>
     */
    val KId: KeywordTokenType

    /**
     * The `key` keyword token.
     *
     *     KKeyToken ::= "key"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xslt-19991116#NT-IdKeyPattern">XSLT 1.0 (REC) IdKeyPattern</a>
     */
    val KKey: KeywordTokenType
}

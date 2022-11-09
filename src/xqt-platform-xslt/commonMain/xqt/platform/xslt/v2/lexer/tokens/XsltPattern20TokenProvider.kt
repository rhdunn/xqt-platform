// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xslt.v2.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider
import xqt.platform.xslt.v1.lexer.tokens.XsltPattern10TokenProvider

/**
 * The tokens present in the XSLT Patterns 2.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#patterns">XSLT 2.0 (REC) Patterns</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XsltPattern20TokenProvider : XsltPattern10TokenProvider, XPath20TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PatternAxis">XSLT 2.0 (REC) PatternAxis</a>
     */
    override val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PathPattern">XSLT 2.0 (REC) PathPattern</a>
     */
    override val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PatternAxis">XSLT 2.0 (REC) PatternAxis</a>
     */
    override val AxisSeparator: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PathPattern">XSLT 2.0 (REC) PathPattern</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PatternAxis">XSLT 2.0 (REC) PatternAxis</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/2021/REC-xslt20-20210330/#NT-PatternAxis">XSLT 2.0 (REC) PatternAxis</a>
     */
    override val KChild: KeywordTokenType
}

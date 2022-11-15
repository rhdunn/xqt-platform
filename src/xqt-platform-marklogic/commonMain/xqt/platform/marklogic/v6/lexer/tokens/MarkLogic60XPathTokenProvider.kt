// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v6.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider

/**
 * The tokens present in the XPath 2.0 vendor extensions for MarkLogic 6.0.
 *
 * The following vendor extensions are supported when the `xdmp:dialect="1.0-ml"`
 * attribute is present on the top level element of an XSLT stylesheet:
 * 1. `binary()` kind test;
 * 2. `property::` forward axis.
 *
 * @see <a href="https://docs.marklogic.com/guide/xquery/enhanced#id_17425">Binary Node Constructor and Node Test</a>
 * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_39877">XPath Axes and Syntax</a>
 */
@Suppress("PropertyName")
interface MarkLogic60XPathTokenProvider : XPath20TokenProvider {
    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_39877">XPath Axes and Syntax</a>
     */
    override val AxisSeparator: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/enhanced#id_17425">Binary Node Constructor and Node Test</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/enhanced#id_17425">Binary Node Constructor and Node Test</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The `binary` keyword token.
     *
     *     KBinaryToken ::= "binary"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/enhanced#id_17425">Binary Node Constructor and Node Test</a>
     */
    val KBinary: KeywordTokenType

    /**
     * The `property` keyword token.
     *
     *     KPropertyToken ::= "property"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_39877">XPath Axes and Syntax</a>
     */
    val KProperty: KeywordTokenType
}

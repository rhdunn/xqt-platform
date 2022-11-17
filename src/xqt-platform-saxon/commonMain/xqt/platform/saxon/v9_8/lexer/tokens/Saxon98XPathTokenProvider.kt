// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.saxon.v9_8.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3_1.lexer.tokens.XPath31TokenProvider

/**
 * The tokens present in the XPath 3.1 vendor extensions for Saxon 9.8.
 *
 * The following vendor extensions are supported:
 * 1. union types;
 * 2. tuple types (record test experimental syntax);
 * 3. type aliases.
 *
 * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/union-types">Union types</a>
 * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
 * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
 */
@Suppress("PropertyName")
interface Saxon98XPathTokenProvider : XPath31TokenProvider {
    /**
     * The colon token ("`:`").
     *
     *     ColonToken ::= ":"
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val Colon: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/union-types">Union types</a>
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/union-types">Union types</a>
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/union-types">Union types</a>
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The type alias token ("`~`").
     *
     *     TypeAliasToken ::= "~"
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
     */
    val TypeAlias: SymbolTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/union-types">Union types</a>
     */
    override val KUnion: KeywordTokenType

    /**
     * The `tuple` keyword token.
     *
     *     KTupleToken ::= "tuple"
     *
     * @see <a href="https://saxonica.com/documentation9.8/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    val KTuple: KeywordTokenType
}

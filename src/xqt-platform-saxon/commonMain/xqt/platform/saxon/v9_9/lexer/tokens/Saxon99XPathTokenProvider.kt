// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.saxon.v9_9.lexer.tokens

import xqt.platform.saxon.v9_8.lexer.tokens.Saxon98XPathTokenProvider
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType

/**
 * The tokens present in the XPath 3.1 vendor extensions for Saxon 9.9.
 *
 * The following vendor extensions are supported:
 * 1. tuple types (record test experimental syntax);
 * 2. simple inline functions;
 * 3. short-circuit boolean operators.
 *
 * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
 * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
 * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/short-circuit">Short-circuit boolean operators</a>
 */
@Suppress("PropertyName")
interface Saxon99XPathTokenProvider : Saxon98XPathTokenProvider {
    /**
     * The colon token ("`:`").
     *
     *     ColonToken ::= ":"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val Colon: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The curly bracket close token ("`}`").
     *
     *     CurlyBracketCloseToken ::= "}"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    override val CurlyBracketClose: SymbolTokenType

    /**
     * The curly bracket open token ("`{`").
     *
     *     CurlyBracketOpenToken ::= "{"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    override val CurlyBracketOpen: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val QuestionMark: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val Star: SymbolTokenType

    /**
     * The `andAlso` keyword token.
     *
     *     KAndAlsoToken ::= "andAlso"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/short-circuit">Short-circuit boolean operators</a>
     */
    val KAndAlso: KeywordTokenType

    /**
     * The `fn` keyword token.
     *
     *     KFnToken ::= "fn"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    val KFn: KeywordTokenType

    /**
     * The `orElse` keyword token.
     *
     *     KOrElseToken ::= "orElse"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/short-circuit">Short-circuit boolean operators</a>
     */
    val KOrElse: KeywordTokenType

    /**
     * The `tuple` keyword token.
     *
     *     KTupleToken ::= "tuple"
     *
     * @see <a href="https://saxonica.com/documentation9.9/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val KTuple: KeywordTokenType
}

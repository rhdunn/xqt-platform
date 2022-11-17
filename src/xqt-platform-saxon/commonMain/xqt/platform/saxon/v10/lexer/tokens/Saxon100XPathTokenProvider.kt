// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.saxon.v10.lexer.tokens

import xqt.platform.saxon.v9_9.lexer.tokens.Saxon99XPathTokenProvider
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType

/**
 * The tokens present in the XPath 3.1 vendor extensions for Saxon 10.
 *
 * The following vendor extensions are supported:
 * 1. tuple types (record test experimental syntax);
 * 2. type aliases;
 * 3. simple inline functions;
 * 4. otherwise operator;
 * 5. kind tests;
 * 6. for-member expressions.
 *
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/otherwise">Otherwise operator</a>
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/kindtests">KindTests</a>
 * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/for-member-expression">For-Member expressions</a>
 */
@Suppress("PropertyName")
interface Saxon100XPathTokenProvider : Saxon99XPathTokenProvider {
    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/for-member-expression">For-Member expressions</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The context function open token ("`.{`").
     *
     *     ContextFunctionOpenToken ::= ".{"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    val ContextFunctionOpen: SymbolTokenType

    /**
     * The curly bracket close token ("`}`").
     *
     *     CurlyBracketCloseToken ::= "}"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    override val CurlyBracketClose: SymbolTokenType

    /**
     * The lambda function open token ("`_{`").
     *
     *     LambdaFunctionOpenToken ::= "_{"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/simple-inline-functions">Simple inline functions</a>
     */
    val LambdaFunctionOpen: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/kindtests">KindTests</a>
     */
    override val Star: SymbolTokenType

    /**
     * The `as` keyword token.
     *
     *     KAsToken ::= "as"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val KAs: KeywordTokenType

    /**
     * The `for` keyword token.
     *
     *     KForToken ::= "for"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/for-member-expression">For-Member expressions</a>
     */
    override val KFor: KeywordTokenType

    /**
     * The `member` keyword token.
     *
     *     KMemberToken ::= "member"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/for-member-expression">For-Member expressions</a>
     */
    val KMember: KeywordTokenType

    /**
     * The `otherwise` keyword token.
     *
     *     KOtherwiseToken ::= "otherwise"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/otherwise">Otherwise operator</a>
     */
    val KOtherwise: KeywordTokenType

    /**
     * The `return` keyword token.
     *
     *     KReturnToken ::= "return"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/for-member-expression">For-Member expressions</a>
     */
    override val KReturn: KeywordTokenType

    /**
     * The `tuple` keyword token.
     *
     *     KTupleToken ::= "tuple"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/tuple-types">Tuple types</a>
     */
    override val KTuple: KeywordTokenType

    /**
     * The `type` keyword token.
     *
     *     KTypeToken ::= "type"
     *
     * @see <a href="https://saxonica.com/documentation10/index.html#!extensions/syntax-extensions/type-aliases">Type aliases</a>
     */
    val KType: KeywordTokenType
}

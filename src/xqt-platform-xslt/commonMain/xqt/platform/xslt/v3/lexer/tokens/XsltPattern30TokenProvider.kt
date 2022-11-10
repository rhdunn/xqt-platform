// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xslt.v3.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3.lexer.tokens.XPath30TokenProvider
import xqt.platform.xslt.v2.lexer.tokens.XsltPattern20TokenProvider

/**
 * The tokens present in the XSLT Patterns 3.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#pattern-syntax">XSLT 3.0 (REC) Patterns</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XsltPattern30TokenProvider : XsltPattern20TokenProvider, XPath30TokenProvider {
    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-PathExprP">XSLT 3.0 (REC) PathExprP</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-RootedPath">XSLT 3.0 (REC) RootedPath</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-RelativePathExprP">XSLT 3.0 (REC) RelativePathExprP</a>
     */
    override val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val AxisSeparator: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ArgumentListP">XSLT 3.0 (REC) ArgumentListP</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-PredicatePattern">XSLT 3.0 (REC) PredicatePattern</a>
     */
    override val ContextItem: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ArgumentListP">XSLT 3.0 (REC) ArgumentListP</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ParenthesizedExprP">XSLT 3.0 (REC) ParenthesizedExprP</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ArgumentListP">XSLT 3.0 (REC) ArgumentListP</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ParenthesizedExprP">XSLT 3.0 (REC) ParenthesizedExprP</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-PathExprP">XSLT 3.0 (REC) PathExprP</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-RootedPath">XSLT 3.0 (REC) RootedPath</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-RelativePathExprP">XSLT 3.0 (REC) RelativePathExprP</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The union token ("`|`").
     *
     *     UnionToken ::= "|"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-UnionExprP">XSLT 3.0 (REC) UnionExprP</a>
     */
    override val Union: SymbolTokenType

    /**
     * The `doc` keyword token.
     *
     *     KDocToken ::= "doc"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-OuterFunctionName">XSLT 3.0 (REC) OuterFunctionName</a>
     */
    val KDoc: KeywordTokenType

    /**
     * The `element-with-id` keyword token.
     *
     *     KElementWithIdToken ::= "element-with-id"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-OuterFunctionName">XSLT 3.0 (REC) OuterFunctionName</a>
     */
    val KElementWithId: KeywordTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KChild: KeywordTokenType

    /**
     * The `descendant` keyword token.
     *
     *     KDescendantToken ::= "descendant"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KDescendant: KeywordTokenType

    /**
     * The `descendant-or-self` keyword token.
     *
     *     KDescendantOrSelfToken ::= "descendant-or-self"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KDescendantOrSelf: KeywordTokenType

    /**
     * The `except` keyword token.
     *
     *     KExceptToken ::= "except"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-IntersectExceptExprP">XSLT 3.0 (REC) IntersectExceptExprP</a>
     */
    override val KExcept: KeywordTokenType

    /**
     * The `id` keyword token.
     *
     *     KIdToken ::= "id"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-OuterFunctionName">XSLT 3.0 (REC) OuterFunctionName</a>
     */
    override val KId: KeywordTokenType

    /**
     * The `intersect` keyword token.
     *
     *     KIntersectToken ::= "intersect"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-IntersectExceptExprP">XSLT 3.0 (REC) IntersectExceptExprP</a>
     */
    override val KIntersect: KeywordTokenType

    /**
     * The `key` keyword token.
     *
     *     KKeyToken ::= "key"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-OuterFunctionName">XSLT 3.0 (REC) OuterFunctionName</a>
     */
    override val KKey: KeywordTokenType

    /**
     * The `namespace` keyword token.
     *
     *     KNamespaceToken ::= "namespace"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KNamespace: KeywordTokenType

    /**
     * The `root` keyword token.
     *
     *     KRootToken ::= "root"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-OuterFunctionName">XSLT 3.0 (REC) OuterFunctionName</a>
     */
    val KRoot: KeywordTokenType

    /**
     * The `self` keyword token.
     *
     *     KSelfToken ::= "self"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-ForwardAxisP">XSLT 3.0 (REC) ForwardAxisP</a>
     */
    override val KSelf: KeywordTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#doc-xslt30-patterns-UnionExprP">XSLT 3.0 (REC) UnionExprP</a>
     */
    override val KUnion: KeywordTokenType
}

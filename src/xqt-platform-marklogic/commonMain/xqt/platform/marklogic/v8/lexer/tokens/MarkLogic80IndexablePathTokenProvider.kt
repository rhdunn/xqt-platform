// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v8.lexer.tokens

import xqt.platform.marklogic.v6.lexer.tokens.MarkLogic60IndexablePathTokenProvider
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType

/**
 * The tokens present in the Indexable Path Expression grammar for MarkLogic 8.0.
 *
 * MarkLogic 8.0 adds JSON support.
 *
 * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression</a>
 */
@Suppress("PropertyName")
interface MarkLogic80IndexablePathTokenProvider : MarkLogic60IndexablePathTokenProvider {
    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The string literal apostrophe token ("`'`").
     *
     *     StringLiteralAposToken ::= "'"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: QuotedNCName</a>
     */
    override val StringLiteralApos: SymbolTokenType

    /**
     * The string literal quotation mark token ('`"`').
     *
     *     StringLiteralQuotToken ::= '"'
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: QuotedNCName</a>
     */
    override val StringLiteralQuot: SymbolTokenType

    /**
     * The `array-node` keyword token.
     *
     *     KArrayNodeToken ::= "array-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    val KArrayNode: KeywordTokenType

    /**
     * The `boolean-node` keyword token.
     *
     *     KBooleanNodeToken ::= "boolean-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    val KBooleanNode: KeywordTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KNode: KeywordTokenType

    /**
     * The `null-node` keyword token.
     *
     *     KNullNodeToken ::= "null-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    val KNullNode: KeywordTokenType

    /**
     * The `number-node` keyword token.
     *
     *     KNumberNodeToken ::= "number-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    val KNumberNode: KeywordTokenType

    /**
     * The `object-node` keyword token.
     *
     *     KObjectNodeToken ::= "object-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    val KObjectNode: KeywordTokenType
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v6.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider

/**
 * The tokens present in the Indexable Path Expression grammar for MarkLogic 6.0.
 *
 * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression</a>
 */
@Suppress("PropertyName")
interface MarkLogic60IndexablePathTokenProvider : XPath20TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: AbbreviatedFwdStep</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: LeafStep</a>
     */
    override val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: IndexablePathExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: GeneralStepExpr</a>
     */
    override val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: AbbreviatedFwdStep</a>
     */
    override val ContextItem: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: IndexablePathExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: GeneralStepExpr</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: LeafExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: LeafExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: Predicate</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: PredicateExpr</a>
     */
    override val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: Predicate</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: PredicateExpr</a>
     */
    override val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: QNameOrWildcard</a>
     */
    override val Star: SymbolTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `element` keyword token.
     *
     *     KElementToken ::= "element"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KElement: KeywordTokenType

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
     * The `processing-instruction` keyword token.
     *
     *     KProcessingInstructionToken ::= "processing-instruction"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KProcessingInstruction: KeywordTokenType

    /**
     * The `schema-attribute` keyword token.
     *
     *     KSchemaAttributeToken ::= "schema-attribute"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KSchemaAttribute: KeywordTokenType

    /**
     * The `schema-element` keyword token.
     *
     *     KSchemaElementToken ::= "schema-element"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: KindTest</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_17642">Indexable Path Expression :: NamedKindTest</a>
     */
    override val KSchemaElement: KeywordTokenType
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v9.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider

/**
 * The tokens present in the Indexable Path Expression grammar for MarkLogic 6.0.
 *
 * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression</a>
 */
@Suppress("PropertyName")
interface MarkLogic90ExtractPathTokenProvider : XPath20TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: AbbreviatedFwdStep</a>
     */
    override val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: ExtractPathExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: GeneralStepExpr</a>
     */
    override val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: AbbreviatedFwdStep</a>
     */
    override val ContextItem: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: RelativePathExpr</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: RelativePathExpr</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: ExtractPathExpr</a>
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: GeneralStepExpr</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: PredicateExpr</a>
     */
    override val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: PredicateExpr</a>
     */
    override val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: QNameOrWildcard</a>
     */
    override val Star: SymbolTokenType

    /**
     * The string literal apostrophe token ("`'`").
     *
     *     StringLiteralAposToken ::= "'"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: QuotedNCName</a>
     */
    override val StringLiteralApos: SymbolTokenType

    /**
     * The string literal quotation mark token ('`"`').
     *
     *     StringLiteralQuotToken ::= '"'
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: QuotedNCName</a>
     */
    override val StringLiteralQuot: SymbolTokenType

    /**
     * The `array-node` keyword token.
     *
     *     KArrayNodeToken ::= "array-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: ArrayNodeTest</a>
     */
    val KArrayNode: KeywordTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: AttributeTest</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `boolean-node` keyword token.
     *
     *     KBooleanNodeToken ::= "boolean-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: BooleanNodeTest</a>
     */
    val KBooleanNode: KeywordTokenType

    /**
     * The `element` keyword token.
     *
     *     KElementToken ::= "element"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: ElementTest</a>
     */
    override val KElement: KeywordTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: AnyKindTest</a>
     */
    override val KNode: KeywordTokenType

    /**
     * The `null-node` keyword token.
     *
     *     KNullNodeToken ::= "null-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: NullNodeTest</a>
     */
    val KNullNode: KeywordTokenType

    /**
     * The `number-node` keyword token.
     *
     *     KNumberNodeToken ::= "number-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: NumberNodeTest</a>
     */
    val KNumberNode: KeywordTokenType

    /**
     * The `object-node` keyword token.
     *
     *     KObjectNodeToken ::= "object-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: ObjectNodeTest</a>
     */
    val KObjectNode: KeywordTokenType

    /**
     * The `schema-attribute` keyword token.
     *
     *     KSchemaAttributeToken ::= "schema-attribute"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: SchemaAttrTest</a>
     */
    override val KSchemaAttribute: KeywordTokenType

    /**
     * The `schema-element` keyword token.
     *
     *     KSchemaElementToken ::= "schema-element"
     *
     * @see <a href="https://docs.marklogic.com/guide/xquery/xpath#id_98286">Patch and Extract Path Expression :: SchemaElemTest</a>
     */
    override val KSchemaElement: KeywordTokenType
}

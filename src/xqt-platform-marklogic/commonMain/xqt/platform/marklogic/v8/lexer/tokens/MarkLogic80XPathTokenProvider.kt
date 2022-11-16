// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v8.lexer.tokens

import xqt.platform.marklogic.v7.lexer.tokens.MarkLogic70XPathTokenProvider
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType

/**
 * The tokens present in the XPath 2.0 vendor extensions for MarkLogic 8.0.
 *
 * The following vendor extensions are supported when the `xdmp:dialect="1.0-ml"`
 * attribute is present on the top level element of an XSLT stylesheet:
 * 1. `schema-facet()`, `schema-facet(*)`, `schema-facet(elem-name)` schema kind test;
 * 2. `array-node()`, `array-node("key-name")` json kind test;
 * 3. `boolean-node()`, `boolean-node("key-name")` json kind test;
 * 4. `document-node(array-node())`, `document-node(object-node())` json kind test;
 * 5. `node("key-name")` json kind test;
 * 6. `null-node()`, `null-node("key-name")` json kind test;
 * 7. `number-node()`, `number-node("key-name")` json kind test;
 * 8. `object-node()`, `object-node("key-name")` json kind test;
 * 9. `text()`, `text("key-name")` json kind test.
 *
 * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
 * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
 */
@Suppress("PropertyName")
interface MarkLogic80XPathTokenProvider : MarkLogic70XPathTokenProvider {
    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val Star: SymbolTokenType

    /**
     * The `array-node` keyword token.
     *
     *     KArrayNodeToken ::= "array-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    val KArrayNode: KeywordTokenType

    /**
     * The `boolean-node` keyword token.
     *
     *     KBooleanNodeToken ::= "boolean-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    val KBooleanNode: KeywordTokenType

    /**
     * The `document-node` keyword token.
     *
     *     KDocumentNodeToken ::= "document-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val KDocumentNode: KeywordTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val KNode: KeywordTokenType

    /**
     * The `null-node` keyword token.
     *
     *     KNullNodeToken ::= "null-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    val KNullNode: KeywordTokenType

    /**
     * The `number-node` keyword token.
     *
     *     KNumberNodeToken ::= "number-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    val KNumberNode: KeywordTokenType

    /**
     * The `object-node` keyword token.
     *
     *     KObjectNodeToken ::= "object-node"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    val KObjectNode: KeywordTokenType

    /**
     * The `schema-facet` keyword token.
     *
     *     KSchemaFacetToken ::= "schema-facet"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaFacet: KeywordTokenType

    /**
     * The `text` keyword token.
     *
     *     KTextToken ::= "text"
     *
     * @see <a href="https://docs.marklogic.com/guide/app-dev/json">Working With JSON</a>
     */
    override val KText: KeywordTokenType
}

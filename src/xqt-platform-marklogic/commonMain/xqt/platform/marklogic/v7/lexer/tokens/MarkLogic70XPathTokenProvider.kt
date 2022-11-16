// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.marklogic.v7.lexer.tokens

import xqt.platform.marklogic.v6.lexer.tokens.MarkLogic60XPathTokenProvider
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType

/**
 * The tokens present in the XPath 2.0 vendor extensions for MarkLogic 7.0.
 *
 * The following vendor extensions are supported when the `xdmp:dialect="1.0-ml"`
 * attribute is present on the top level element of an XSLT stylesheet:
 * 1. schema kind tests.
 *
 * Schema kind tests are supported on `ItemType` but not on `NodeTest`. The
 * following schema kind tests are supported:
 * 1. `attribute-decl()`, `attribute-decl(*)`, `attribute-decl(attr-name)`;
 * 2. `complex-type()`, `complex-type(*)`, `complex-type(type-name)`;
 * 3. `element-decl()`, `element-decl(*)`, `element-decl(elem-name)`;
 * 4. `model-group()`, `model-group(*)`, `model-group(elem-name)`;
 * 5. `schema-component()`;
 * 6. `schema-particle()`, `schema-particle(*)`, `schema-particle(elem-name)`;
 * 7. `schema-root()`;
 * 8. `schema-type()`, `schema-type(*)`, `schema-type(type-name)`;
 * 9. `schema-wildcard()`;
 * 10. `simple-type()`, `simple-type(*)`, `simple-type(type-name)`.
 *
 * NOTE: When a schema kind test is used in a `NodeTest` MarkLogic reports an
 * "Unexpected token" error instead of an "Undefined function" error. As such,
 * the schema kind test keywords are reserved function names.
 *
 * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
 */
@Suppress("PropertyName")
interface MarkLogic70XPathTokenProvider : MarkLogic60XPathTokenProvider {
    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    override val Star: SymbolTokenType

    /**
     * The `attribute-decl` keyword token.
     *
     *     KAttributeDeclToken ::= "attribute-decl"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KAttributeDecl: KeywordTokenType

    /**
     * The `complex-type` keyword token.
     *
     *     KComplexTypeToken ::= "complex-type"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KComplexType: KeywordTokenType

    /**
     * The `element-decl` keyword token.
     *
     *     KElementDeclToken ::= "element-decl"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KElementDecl: KeywordTokenType

    /**
     * The `model-group` keyword token.
     *
     *     KModelGroupToken ::= "model-group"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KModelGroup: KeywordTokenType

    /**
     * The `schema-component` keyword token.
     *
     *     KSchemaComponentToken ::= "schema-component"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaComponent: KeywordTokenType

    /**
     * The `schema-particle` keyword token.
     *
     *     KSchemaParticleToken ::= "schema-particle"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaParticle: KeywordTokenType

    /**
     * The `schema-root` keyword token.
     *
     *     KSchemaRootToken ::= "schema-root"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaRoot: KeywordTokenType

    /**
     * The `schema-type` keyword token.
     *
     *     KSchemaTypeToken ::= "schema-type"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaType: KeywordTokenType

    /**
     * The `schema-wildcard` keyword token.
     *
     *     KSchemaWildcardToken ::= "schema-wildcard"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSchemaWildcard: KeywordTokenType

    /**
     * The `simple-type` keyword token.
     *
     *     KSimpleTypeToken ::= "simple-type"
     *
     * @see <a href="https://docs.marklogic.com/sc">The schema components (sc) built-in functions</a>
     */
    val KSimpleType: KeywordTokenType
}

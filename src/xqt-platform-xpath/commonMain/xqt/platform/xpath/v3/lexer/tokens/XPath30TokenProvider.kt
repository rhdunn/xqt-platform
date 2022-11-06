// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v3.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider

/**
 * The tokens present in the XPath 3.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#id-grammar">XPath 3.0 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#terminal-symbols">XPath 3.0 (REC) Terminal Symbols</a>
 */
@Suppress("PropertyName")
interface XPath30TokenProvider : XPath20TokenProvider {
    /**
     * The assign equals token ("`:=`").
     *
     *     AssignEqualsToken ::= ":="
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause">XPath 3.0 (REC) SimpleLetClause</a>
     */
    val AssignEquals: SymbolTokenType

    /**
     * The concatenation token ("`||`").
     *
     *     ConcatenationToken ::= "||"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-StringConcatExpr">XPath 3.0 (REC) StringConcatExpr</a>
     */
    val Concatenation: SymbolTokenType

    /**
     * The curly bracket close token ("`}`").
     *
     *     CurlyBracketCloseToken ::= "}"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-EnclosedExpr">XPath 3.0 (REC) EnclosedExpr</a>
     */
    val CurlyBracketClose: SymbolTokenType

    /**
     * The curly bracket open token ("`{`").
     *
     *     CurlyBracketOpenToken ::= "{"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-EnclosedExpr">XPath 3.0 (REC) EnclosedExpr</a>
     */
    val CurlyBracketOpen: SymbolTokenType

    /**
     * The function reference token ("`#`").
     *
     *     FunctionRefToken ::= "!"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamedFunctionRef">XPath 3.0 (REC) NamedFunctionRef</a>
     */
    val FunctionRef: SymbolTokenType

    /**
     * The map operator token ("`!`").
     *
     *     MapOperatorToken ::= "!"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleMapExpr">XPath 3.0 (REC) SimpleMapExpr</a>
     */
    val MapOperator: SymbolTokenType

    /**
     * The braced URI literal token.
     *
     *     BracedURILiteral ::= "Q" "{" [^{}]* "}"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-BracedURILiteral">XPath 3.0 (REC) BracedURILiteral</a>
     */
    val BracedURILiteral: TerminalSymbolTokenType

    /**
     * The `function` keyword token.
     *
     *     KFunctionToken ::= "function"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     */
    val KFunction: KeywordTokenType

    /**
     * The `let` keyword token.
     *
     *     KLetToken ::= "let"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause">XPath 3.0 (REC) SimpleLetClause</a>
     */
    val KLet: KeywordTokenType

    /**
     * The `namespace-node` keyword token.
     *
     *     KNamespaceNodeToken ::= "namespace-node"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaecNodeTest">XPath 3.0 (REC) NamespaceNodeTest</a>
     */
    val KNamespaceNode: KeywordTokenType
}

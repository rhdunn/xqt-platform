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
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-ParamList">XPath 3.0 (REC) ParamList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause">XPath 3.0 (REC) SimpleLetClause</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     */
    override val Comma: SymbolTokenType

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
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">XPath 3.0 (REC) NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">XPath 3.0 (REC) ParenthesizedItemType</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">XPath 3.0 (REC) NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">XPath 3.0 (REC) ParenthesizedItemType</a>
     */
     override val ParenthesisOpen: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentPlaceholder">XPath 3.0 (REC) ArgumentPlaceholder</a>
     */
    override val QuestionMark: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     */
    override val Star: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-Param">XPath 3.0 (REC) Param</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">XPath 3.0 (REC) SimpleForBinding</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetBinding">XPath 3.0 (REC) SimpleLetBinding</a>
     */
    override val VariableIndicator: SymbolTokenType

    /**
     * The braced URI literal token.
     *
     *     BracedURILiteral ::= "Q" "{" [^{}]* "}"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-BracedURILiteral">XPath 3.0 (REC) BracedURILiteral</a>
     */
    val BracedURILiteral: TerminalSymbolTokenType

    /**
     * The `as` keyword token.
     *
     *     KAsToken ::= "as"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypeDeclaration">XPath 3.0 (REC) TypeDeclaration</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     */
    override val KAs: KeywordTokenType

    /**
     * The `function` keyword token.
     *
     *     KFunctionToken ::= "function"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     */
    val KFunction: KeywordTokenType

    /**
     * The `in` keyword token.
     *
     *     KInToken ::= "in"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">XPath 3.0 (REC) SimpleForBinding</a>
     */
    override val KIn: KeywordTokenType

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

    /**
     * The `return` keyword token.
     *
     *     KReturnToken ::= "return"
     *
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-LetExpr">XPath 3.0 (REC) LetExpr</a>
     */
    override val KReturn: KeywordTokenType
}

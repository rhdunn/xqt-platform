// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v1.lexer.tokens

import xqt.platform.xml.lexer.tokens.NCNameTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType

/**
 * The tokens present in the XPath 1.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116">https://www.w3.org/TR/1999/REC-xpath-19991116</a>
 */
@Suppress("PropertyName")
interface XPath10TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAxisSpecifier">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAbsoluteLocationPath">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedRelativeLocationPath">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedRelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The abbreviated `parent::node()` selector token ("`..`").
     *
     *     AbbrevParentToken ::= ".."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val AbbrevParent: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisSpecifier">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val AxisSeparator: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val Comma: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val ContextItem: SymbolTokenType

    /**
     * The equals token ("`=`").
     *
     *     EqualsToken ::= "="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val Equals: SymbolTokenType

    /**
     * The greater than token ("`>`").
     *
     *     GreaterThanToken ::= ">"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val GreaterThan: SymbolTokenType

    /**
     * The greater than or equals token ("`>=`").
     *
     *     GreaterThanOrEqualsToken ::= ">="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val GreaterThanOrEquals: SymbolTokenType

    /**
     * The less than token ("`<`").
     *
     *     LessThanToken ::= "<"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val LessThan: SymbolTokenType

    /**
     * The less than or equals token ("`<=`").
     *
     *     LessThanOrEqualsToken ::= "<="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val LessThanOrEquals: SymbolTokenType

    /**
     * The minus token ("`-`").
     *
     *     MinusToken ::= "-"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val Minus: SymbolTokenType

    /**
     * The not equals token ("`!=`").
     *
     *     NotEqualsToken ::= "!="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val NotEquals: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParethesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbsoluteLocationPath">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelativeLocationPath">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val PathOperator: SymbolTokenType

    /**
     * The plus token ("`+`").
     *
     *     PlusToken ::= "+"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val Plus: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken</a>
     */
    val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplyOperator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplyOperator</a>
     */
    val Star: SymbolTokenType

    /**
     * The union token ("`|`").
     *
     *     UnionToken ::= "|"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnionExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnionExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator</a>
     */
    val Union: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-VariableReference">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-VariableReference</a>
     */
    val VariableIndicator: SymbolTokenType

    /**
     * The string literal token (`Literal`).
     *
     *     Literal ::= '"' [^"]* '"'
     *               | "'" [^']* "'"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Literal">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Literal</a>
     */
    val Literal: TerminalSymbolTokenType

    /**
     * The unqualified name token (`NCName`).
     *
     *     Name   ::= NameStartChar NameChar*
     *     NCName ::= Name - (Char* ':' Char*)
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-NCName">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-NCName</a>
     */
    val NCName: NCNameTokenType

    /**
     * The number token (`Number`).
     *
     *     Number ::= Digits ("." Digits?)?
     *              | "." Digits
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Number">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Number</a>
     */
    val Number: TerminalSymbolTokenType

    /**
     * The qualified name token (`QName`).
     *
     *     QName          ::= PrefixedName
     *                      | UnprefixedName
     *     PrefixedName   ::= Prefix ":" LocalPart
     *     UnprefixedName ::= LocalPart
     *     Prefix         ::= NCName
     *     LocalPart      ::= NCName
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-UnprefixedName">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-UnprefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-Prefix">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-Prefix</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart">https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart</a>
     */
    val QName: TerminalSymbolTokenType

    /**
     * The whitespace token (`S`).
     *
     *     S ::= (#x20 | #x9 | #xD | #xA)+
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprWhitespace">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprWhitespace</a>
     * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-S">https://www.w3.org/TR/2008/REC-xml-20081126/#NT-S</a>
     */
    val S: TerminalSymbolTokenType

    /**
     * The `ancestor` keyword token.
     *
     *     KAncestorToken ::= "ancestor"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KAncestor: TerminalSymbolTokenType

    /**
     * The `ancestor-or-self` keyword token.
     *
     *     KAncestorOrSelfToken ::= "ancestor-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KAncestorOrSelf: TerminalSymbolTokenType

    /**
     * The `and` keyword token.
     *
     *     KAndToken ::= "and"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AndExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AndExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KAnd: TerminalSymbolTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KAttribute: TerminalSymbolTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KChild: TerminalSymbolTokenType

    /**
     * The `comment` keyword token.
     *
     *     KCommentToken ::= "comment"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType</a>
     */
    val KComment: TerminalSymbolTokenType

    /**
     * The `descendant` keyword token.
     *
     *     KDescendantToken ::= "descendant"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KDescendant: TerminalSymbolTokenType

    /**
     * The `descendant-or-self` keyword token.
     *
     *     KDescendantOrSelfToken ::= "descendant-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KDescendantOrSelf: TerminalSymbolTokenType

    /**
     * The `div` keyword token.
     *
     *     KDivToken ::= "div"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KDiv: TerminalSymbolTokenType

    /**
     * The `following` keyword token.
     *
     *     KFollowingToken ::= "following"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KFollowing: TerminalSymbolTokenType

    /**
     * The `following-sibling` keyword token.
     *
     *     KFollowingSiblingToken ::= "following-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KFollowingSibling: TerminalSymbolTokenType

    /**
     * The `mod` keyword token.
     *
     *     KModToken ::= "mod"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KMod: TerminalSymbolTokenType

    /**
     * The `namespace` keyword token.
     *
     *     KNamespaceToken ::= "namespace"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KNamespace: TerminalSymbolTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType</a>
     */
    val KNode: TerminalSymbolTokenType

    /**
     * The `or` keyword token.
     *
     *     KOrToken ::= "or"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OrExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OrExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KOr: TerminalSymbolTokenType

    /**
     * The `parent` keyword token.
     *
     *     KParentToken ::= "parent"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KParent: TerminalSymbolTokenType

    /**
     * The `preceding` keyword token.
     *
     *     KPrecedingToken ::= "preceding"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KPreceding: TerminalSymbolTokenType

    /**
     * The `preceding-sibling` keyword token.
     *
     *     KPrecedingSiblingToken ::= "preceding-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KPrecedingSibling: TerminalSymbolTokenType

    /**
     * The `processing-instruction` keyword token.
     *
     *     KProcessingInstructionToken ::= "processing-instruction"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType</a>
     */
    val KProcessingInstruction: TerminalSymbolTokenType

    /**
     * The `self` keyword token.
     *
     *     KSelfToken ::= "self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName</a>
     */
    val KSelf: TerminalSymbolTokenType

    /**
     * The `text` keyword token.
     *
     *     KTextToken ::= "text"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType</a>
     */
    val KText: TerminalSymbolTokenType
}

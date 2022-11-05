// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v1.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.NCNameTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType

/**
 * The tokens present in the XPath 1.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116">REC-xpath-19991116</a>
 */
@Suppress("PropertyName")
interface XPath10TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAxisSpecifier">REC-xpath-19991116/#NT-AbbreviatedAxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AbbrevForwardStep">REC-xpath20-20101214/#doc-xpath-AbbrevForwardStep</a>
     */
    val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAbsoluteLocationPath">REC-xpath-19991116/#NT-AbbreviatedAbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedRelativeLocationPath">REC-xpath-19991116/#NT-AbbreviatedRelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">REC-xpath-19991116/#NT-PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RelativePathExpr">REC-xpath20-20101214/#doc-xpath-RelativePathExpr</a>
     */
    val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The abbreviated `parent::node()` selector token ("`..`").
     *
     *     AbbrevParentToken ::= ".."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">REC-xpath-19991116/#NT-AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AbbrevReverseStep">REC-xpath20-20101214/#doc-xpath-AbbrevReverseStep</a>
     */
    val AbbrevParent: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisSpecifier">REC-xpath-19991116/#NT-AxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val AxisSeparator: SymbolTokenType

    /**
     * The colon token ("`:`").
     *
     *     ColonToken ::= ":"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName">REC-xml-names-20091208/#NT-PrefixedName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Wildcard">REC-xpath20-20101214/#doc-xpath-Wildcard</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">REC-xpath-31-20170321/#doc-xpath31-MapConstructor</a>
     */
    val Colon: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Expr">REC-xpath20-20101214/#doc-xpath-Expr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">REC-xpath20-20101214/#doc-xpath-SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">REC-xpath20-20101214/#doc-xpath-AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">REC-xpath20-20101214/#doc-xpath-ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-ParamList">REC-xpath-30-20140408/#prod-xpath30-ParamList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause">REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">REC-xpath-30-20140408/#doc-xpath30-ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-MapConstructor">REC-xpath-31-20170321/#doc-xpath31-MapConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">REC-xpath-31-20170321/#doc-xpath31-TypedMapTest</a>
     */
    val Comma: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">REC-xpath-19991116/#NT-AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ContextItemExpr">REC-xpath20-20101214/#doc-xpath-ContextItemExpr</a>
     */
    val ContextItem: SymbolTokenType

    /**
     * The equals token ("`=`").
     *
     *     EqualsToken ::= "="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">REC-xpath-19991116/#NT-EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val Equals: SymbolTokenType

    /**
     * The greater than token ("`>`").
     *
     *     GreaterThanToken ::= ">"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val GreaterThan: SymbolTokenType

    /**
     * The greater than or equals token ("`>=`").
     *
     *     GreaterThanOrEqualsToken ::= ">="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val GreaterThanOrEquals: SymbolTokenType

    /**
     * The less than token ("`<`").
     *
     *     LessThanToken ::= "<"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val LessThan: SymbolTokenType

    /**
     * The less than or equals token ("`<=`").
     *
     *     LessThanOrEqualsToken ::= "<="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">REC-xpath-19991116/#NT-RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val LessThanOrEquals: SymbolTokenType

    /**
     * The minus token ("`-`").
     *
     *     MinusToken ::= "-"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">REC-xpath-19991116/#NT-AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnaryExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnaryExpr</a>
     */
    val Minus: SymbolTokenType

    /**
     * The not equals token ("`!=`").
     *
     *     NotEqualsToken ::= "!="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">REC-xpath-19991116/#NT-EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">REC-xpath20-20101214/#doc-xpath-GeneralComp</a>
     */
    val NotEquals: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">REC-xpath-19991116/#NT-PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">REC-xpath20-20101214/#doc-xpath-IfExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr">REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">REC-xpath20-20101214/#doc-xpath-SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">REC-xpath20-20101214/#doc-xpath-ItemType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">REC-xpath20-20101214/#doc-xpath-AnyKindTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">REC-xpath20-20101214/#doc-xpath-DocumentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">REC-xpath20-20101214/#doc-xpath-TextTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">REC-xpath20-20101214/#doc-xpath-CommentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">REC-xpath20-20101214/#doc-xpath-PITest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">REC-xpath20-20101214/#doc-xpath-AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">REC-xpath20-20101214/#doc-xpath-ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">REC-xpath20-20101214/#doc-xpath-SchemaElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">REC-xpath-30-20140408/#doc-xpath30-ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">REC-xpath-31-20170321/#doc-xpath31-AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">REC-xpath-31-20170321/#doc-xpath31-TypedMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest</a>
     */
    val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">REC-xpath-19991116/#NT-PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">REC-xpath-19991116/#NT-FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">REC-xpath20-20101214/#doc-xpath-IfExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr">REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">REC-xpath20-20101214/#doc-xpath-SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">REC-xpath20-20101214/#doc-xpath-ItemType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">REC-xpath20-20101214/#doc-xpath-AnyKindTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">REC-xpath20-20101214/#doc-xpath-DocumentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">REC-xpath20-20101214/#doc-xpath-TextTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">REC-xpath20-20101214/#doc-xpath-CommentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">REC-xpath20-20101214/#doc-xpath-PITest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">REC-xpath20-20101214/#doc-xpath-AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">REC-xpath20-20101214/#doc-xpath-ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">REC-xpath20-20101214/#doc-xpath-SchemaElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">REC-xpath-30-20140408/#doc-xpath30-ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">REC-xpath-31-20170321/#doc-xpath31-AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedMapTest">REC-xpath-31-20170321/#doc-xpath31-TypedMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest">REC-xpath-31-20170321/#doc-xpath31-TypedArrayTest</a>
     */
    val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbsoluteLocationPath">REC-xpath-19991116/#NT-AbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelativeLocationPath">REC-xpath-19991116/#NT-RelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">REC-xpath-19991116/#NT-PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RelativePathExpr">REC-xpath20-20101214/#doc-xpath-RelativePathExpr</a>
     */
    val PathOperator: SymbolTokenType

    /**
     * The plus token ("`+`").
     *
     *     PlusToken ::= "+"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">REC-xpath-19991116/#NT-AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-UnaryExpr">REC-xpath20-20101214/#doc-xpath-UnaryExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator</a>
     */
    val Plus: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">REC-xpath-19991116/#NT-Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor</a>
     */
    val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">REC-xpath-19991116/#NT-Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">REC-xpath-19991116/#NT-ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor">REC-xpath-31-20170321/#doc-xpath31-SquareArrayConstructor</a>
     */
    val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplyOperator">REC-xpath-19991116/#NT-MultiplyOperator</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr">REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Wildcard">REC-xpath20-20101214/#doc-xpath-Wildcard</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttribNameOrWildcard">REC-xpath20-20101214/#doc-xpath-AttribNameOrWildcard</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementNameOrWildcard">REC-xpath20-20101214/#doc-xpath-ElementNameOrWildcard</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-KeySpecifier">REC-xpath-31-20170321/#doc-xpath31-KeySpecifier</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyMapTest">REC-xpath-31-20170321/#doc-xpath31-AnyMapTest</a>
     * @see <a href="https://www.w3.org/TR/2017/REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest">REC-xpath-31-20170321/#doc-xpath31-AnyArrayTest</a>
     */
    val Star: SymbolTokenType

    /**
     * The union token ("`|`").
     *
     *     UnionToken ::= "|"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnionExpr">REC-xpath-19991116/#NT-UnionExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">REC-xpath-19991116/#NT-Operator</a>
     */
    val Union: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-VariableReference">REC-xpath-19991116/#NT-VariableReference</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">REC-xpath20-20101214/#doc-xpath-SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-VarRef">REC-xpath20-20101214/#doc-xpath-VarRef</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-Param">REC-xpath-30-20140408/#prod-xpath30-Param</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetBinding">REC-xpath-30-20140408/#doc-xpath30-SimpleLetBinding</a>
     */
    val VariableIndicator: SymbolTokenType

    /**
     * The string literal token (`Literal`).
     *
     *     Literal ::= '"' [^"]* '"'
     *               | "'" [^']* "'"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Literal">REC-xpath-19991116/#NT-Literal</a>
     */
    val Literal: TerminalSymbolTokenType

    /**
     * The unqualified name token (`NCName`).
     *
     *     Name   ::= NameStartChar NameChar*
     *     NCName ::= Name - (Char* ':' Char*)
     *
     * __Note:__ This matches the `UnprefixedName` variant of `QName` values:
     *
     *     UnprefixedName ::= LocalPart
     *     LocalPart      ::= NCName
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-NCName">REC-xml-names-20091208/#NT-NCName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName">REC-xml-names-20091208/#NT-QName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-UnprefixedName">REC-xml-names-20091208/#NT-UnprefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart">REC-xml-names-20091208/#NT-LocalPart</a>
     */
    val NCName: NCNameTokenType

    /**
     * The number token (`Number`).
     *
     *     Number ::= Digits ("." Digits?)?
     *              | "." Digits
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Number">REC-xpath-19991116/#NT-Number</a>
     */
    val Number: TerminalSymbolTokenType

    /**
     * A prefixed name token (`PrefixedName`).
     *
     *     PrefixedName   ::= Prefix ":" LocalPart
     *     Prefix         ::= NCName
     *     LocalPart      ::= NCName
     *
     * __Note:__ This matches the `PrefixedName` variant of `QName` values.
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">REC-xpath-19991116/#NT-NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName">REC-xml-names-20091208/#NT-QName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName">REC-xml-names-20091208/#NT-PrefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-Prefix">REC-xml-names-20091208/#NT-Prefix</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart">REC-xml-names-20091208/#NT-LocalPart</a>
     */
    val PrefixedName: TerminalSymbolTokenType

    /**
     * The whitespace token (`S`).
     *
     *     S ::= (#x20 | #x9 | #xD | #xA)+
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprWhitespace">REC-xpath-19991116/#NT-ExprWhitespace</a>
     * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-S">REC-xml-20081126/#NT-S</a>
     */
    val S: TerminalSymbolTokenType

    /**
     * The `ancestor` keyword token.
     *
     *     KAncestorToken ::= "ancestor"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val KAncestor: KeywordTokenType

    /**
     * The `ancestor-or-self` keyword token.
     *
     *     KAncestorOrSelfToken ::= "ancestor-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val KAncestorOrSelf: KeywordTokenType

    /**
     * The `and` keyword token.
     *
     *     KAndToken ::= "and"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AndExpr">REC-xpath-19991116/#NT-AndExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KAnd: KeywordTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">REC-xpath20-20101214/#doc-xpath-AttributeTest</a>
     */
    val KAttribute: KeywordTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KChild: KeywordTokenType

    /**
     * The `comment` keyword token.
     *
     *     KCommentToken ::= "comment"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">REC-xpath-19991116/#NT-NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">REC-xpath20-20101214/#doc-xpath-CommentTest</a>
     */
    val KComment: KeywordTokenType

    /**
     * The `descendant` keyword token.
     *
     *     KDescendantToken ::= "descendant"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KDescendant: KeywordTokenType

    /**
     * The `descendant-or-self` keyword token.
     *
     *     KDescendantOrSelfToken ::= "descendant-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KDescendantOrSelf: KeywordTokenType

    /**
     * The `div` keyword token.
     *
     *     KDivToken ::= "div"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">REC-xpath-19991116/#NT-MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KDiv: KeywordTokenType

    /**
     * The `following` keyword token.
     *
     *     KFollowingToken ::= "following"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KFollowing: KeywordTokenType

    /**
     * The `following-sibling` keyword token.
     *
     *     KFollowingSiblingToken ::= "following-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KFollowingSibling: KeywordTokenType

    /**
     * The `mod` keyword token.
     *
     *     KModToken ::= "mod"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">REC-xpath-19991116/#NT-MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KMod: KeywordTokenType

    /**
     * The `namespace` keyword token.
     *
     *     KNamespaceToken ::= "namespace"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KNamespace: KeywordTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">REC-xpath-19991116/#NT-NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">REC-xpath20-20101214/#doc-xpath-AnyKindTest</a>
     */
    val KNode: KeywordTokenType

    /**
     * The `or` keyword token.
     *
     *     KOrToken ::= "or"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OrExpr">REC-xpath-19991116/#NT-OrExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">REC-xpath-19991116/#NT-OperatorName</a>
     */
    val KOr: KeywordTokenType

    /**
     * The `parent` keyword token.
     *
     *     KParentToken ::= "parent"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val KParent: KeywordTokenType

    /**
     * The `preceding` keyword token.
     *
     *     KPrecedingToken ::= "preceding"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val KPreceding: KeywordTokenType

    /**
     * The `preceding-sibling` keyword token.
     *
     *     KPrecedingSiblingToken ::= "preceding-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">REC-xpath20-20101214/#doc-xpath-ReverseAxis</a>
     */
    val KPrecedingSibling: KeywordTokenType

    /**
     * The `processing-instruction` keyword token.
     *
     *     KProcessingInstructionToken ::= "processing-instruction"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">REC-xpath-19991116/#NT-NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">REC-xpath-19991116/#NT-NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">REC-xpath20-20101214/#doc-xpath-PITest</a>
     */
    val KProcessingInstruction: KeywordTokenType

    /**
     * The `self` keyword token.
     *
     *     KSelfToken ::= "self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">REC-xpath-19991116/#NT-AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">REC-xpath20-20101214/#doc-xpath-ForwardAxis</a>
     */
    val KSelf: KeywordTokenType

    /**
     * The `text` keyword token.
     *
     *     KTextToken ::= "text"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">REC-xpath-19991116/#NT-NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">REC-xpath20-20101214/#doc-xpath-TextTest</a>
     */
    val KText: KeywordTokenType
}

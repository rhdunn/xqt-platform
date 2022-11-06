// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v1.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.NCNameTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType

/**
 * The tokens present in the XPath 1.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116">XPath 1.0 (REC)</a>
 */
@Suppress("PropertyName")
interface XPath10TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAxisSpecifier">XPath 1.0 (REC) AbbreviatedAxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AbbrevForwardStep">XPath 2.0 (REC) AbbrevForwardStep</a>
     */
    val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `descendant-or-self::node()` selector token ("`//`").
     *
     *     AbbrevDescendantOrSelfToken ::= "//"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedAbsoluteLocationPath">XPath 1.0 (REC) AbbreviatedAbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedRelativeLocationPath">XPath 1.0 (REC) AbbreviatedRelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">XPath 1.0 (REC) PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RelativePathExpr">XPath 2.0 (REC) RelativePathExpr</a>
     */
    val AbbrevDescendantOrSelf: SymbolTokenType

    /**
     * The abbreviated `parent::node()` selector token ("`..`").
     *
     *     AbbrevParentToken ::= ".."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">XPath 1.0 (REC) AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AbbrevReverseStep">XPath 2.0 (REC) AbbrevReverseStep</a>
     */
    val AbbrevParent: SymbolTokenType

    /**
     * The axis separator token ("`::`").
     *
     *     AxisSeparatorToken ::= "::"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisSpecifier">XPath 1.0 (REC) AxisSpecifier</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val AxisSeparator: SymbolTokenType

    /**
     * The colon token ("`:`").
     *
     *     ColonToken ::= ":"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">XPath 1.0 (REC) NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName">Namespaces in XML 1.0 (REC) PrefixedName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Wildcard">XPath 2.0 (REC) Wildcard</a>
     */
    val Colon: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">XPath 1.0 (REC) FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Expr">XPath 2.0 (REC) Expr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">XPath 2.0 (REC) SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">XPath 2.0 (REC) AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">XPath 2.0 (REC) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-ParamList">XPath 3.0 (REC) ParamList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetClause">XPath 3.0 (REC) SimpleLetClause</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     */
    val Comma: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbbreviatedStep">XPath 1.0 (REC) AbbreviatedStep</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ContextItemExpr">XPath 2.0 (REC) ContextItemExpr</a>
     */
    val ContextItem: SymbolTokenType

    /**
     * The equals token ("`=`").
     *
     *     EqualsToken ::= "="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">XPath 1.0 (REC) EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val Equals: SymbolTokenType

    /**
     * The greater than token ("`>`").
     *
     *     GreaterThanToken ::= ">"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">XPath 1.0 (REC) RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val GreaterThan: SymbolTokenType

    /**
     * The greater than or equals token ("`>=`").
     *
     *     GreaterThanOrEqualsToken ::= ">="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">XPath 1.0 (REC) RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val GreaterThanOrEquals: SymbolTokenType

    /**
     * The less than token ("`<`").
     *
     *     LessThanToken ::= "<"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">XPath 1.0 (REC) RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val LessThan: SymbolTokenType

    /**
     * The less than or equals token ("`<=`").
     *
     *     LessThanOrEqualsToken ::= "<="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelationalExpr">XPath 1.0 (REC) RelationalExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val LessThanOrEquals: SymbolTokenType

    /**
     * The minus token ("`-`").
     *
     *     MinusToken ::= "-"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">XPath 1.0 (REC) AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnaryExpr">https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnaryExpr</a>
     */
    val Minus: SymbolTokenType

    /**
     * The not equals token ("`!=`").
     *
     *     NotEqualsToken ::= "!="
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-EqualityExpr">XPath 1.0 (REC) EqualityExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-GeneralComp">XPath 2.0 (REC) GeneralComp</a>
     */
    val NotEquals: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">XPath 1.0 (REC) NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">XPath 1.0 (REC) PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">XPath 1.0 (REC) FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">XPath 2.0 (REC) IfExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr">XPath 2.0 (REC) ParenthesizedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">XPath 2.0 (REC) SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">XPath 2.0 (REC) ItemType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">XPath 2.0 (REC) AnyKindTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">XPath 2.0 (REC) DocumentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">XPath 2.0 (REC) TextTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">XPath 2.0 (REC) CommentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">XPath 2.0 (REC) PITest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">XPath 2.0 (REC) AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">XPath 2.0 (REC) SchemaAttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">XPath 2.0 (REC) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">XPath 2.0 (REC) SchemaElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">XPath 3.0 (REC) NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">XPath 3.0 (REC) ParenthesizedItemType</a>
     */
    val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">XPath 1.0 (REC) NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PrimaryExpr">XPath 1.0 (REC) PrimaryExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-FunctionCall">XPath 1.0 (REC) FunctionCall</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">XPath 2.0 (REC) IfExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ParenthesizedExpr">XPath 2.0 (REC) ParenthesizedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">XPath 2.0 (REC) SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">XPath 2.0 (REC) ItemType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">XPath 2.0 (REC) AnyKindTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">XPath 2.0 (REC) DocumentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">XPath 2.0 (REC) TextTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">XPath 2.0 (REC) CommentTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">XPath 2.0 (REC) PITest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">XPath 2.0 (REC) AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">XPath 2.0 (REC) SchemaAttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">XPath 2.0 (REC) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">XPath 2.0 (REC) SchemaElementTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentList">XPath 3.0 (REC) ArgumentList</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-NamespaceNodeTest">XPath 3.0 (REC) NamespaceNodeTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ParenthesizedItemType">XPath 3.0 (REC) ParenthesizedItemType</a>
     */
    val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AbsoluteLocationPath">XPath 1.0 (REC) AbsoluteLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-RelativeLocationPath">XPath 1.0 (REC) RelativeLocationPath</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-PathExpr">XPath 1.0 (REC) PathExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RelativePathExpr">XPath 2.0 (REC) RelativePathExpr</a>
     */
    val PathOperator: SymbolTokenType

    /**
     * The plus token ("`+`").
     *
     *     PlusToken ::= "+"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AdditiveExpr">XPath 1.0 (REC) AdditiveExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-UnaryExpr">XPath 2.0 (REC) UnaryExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">XPath 2.0 (REC) OccurrenceIndicator</a>
     */
    val Plus: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">XPath 1.0 (REC) Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     */
    val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Predicate">XPath 1.0 (REC) Predicate</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprToken">XPath 1.0 (REC) ExprToken</a>
     */
    val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplyOperator">XPath 1.0 (REC) MultiplyOperator</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">XPath 1.0 (REC) NameTest</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr">XPath 2.0 (REC) MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Wildcard">XPath 2.0 (REC) Wildcard</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">XPath 2.0 (REC) OccurrenceIndicator</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttribNameOrWildcard">XPath 2.0 (REC) AttribNameOrWildcard</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementNameOrWildcard">XPath 2.0 (REC) ElementNameOrWildcard</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-AnyFunctionTest">XPath 3.0 (REC) AnyFunctionTest</a>
     */
    val Star: SymbolTokenType

    /**
     * The union token ("`|`").
     *
     *     UnionToken ::= "|"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-UnionExpr">XPath 1.0 (REC) UnionExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Operator">XPath 1.0 (REC) Operator</a>
     */
    val Union: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-VariableReference">XPath 1.0 (REC) VariableReference</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">XPath 2.0 (REC) SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-VarRef">XPath 2.0 (REC) VarRef</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#prod-xpath30-Param">XPath 3.0 (REC) Param</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">XPath 3.0 (REC) SimpleForBinding</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleLetBinding">XPath 3.0 (REC) SimpleLetBinding</a>
     */
    val VariableIndicator: SymbolTokenType

    /**
     * The string literal token (`Literal`).
     *
     *     Literal ::= '"' [^"]* '"'
     *               | "'" [^']* "'"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Literal">XPath 1.0 (REC) Literal</a>
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
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">XPath 1.0 (REC) NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-NCName">Namespaces in XML 1.0 (REC) NCName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName">Namespaces in XML 1.0 (REC) QName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-UnprefixedName">Namespaces in XML 1.0 (REC) UnprefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart">Namespaces in XML 1.0 (REC) LocalPart</a>
     */
    val NCName: NCNameTokenType

    /**
     * The number token (`Number`).
     *
     *     Number ::= Digits ("." Digits?)?
     *              | "." Digits
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-Number">XPath 1.0 (REC) Number</a>
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
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NameTest">XPath 1.0 (REC) NameTest</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-QName">Namespaces in XML 1.0 (REC) QName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-PrefixedName">Namespaces in XML 1.0 (REC) PrefixedName</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-Prefix">Namespaces in XML 1.0 (REC) Prefix</a>
     * @see <a href="https://www.w3.org/TR/2009/REC-xml-names-20091208/#NT-LocalPart">Namespaces in XML 1.0 (REC) LocalPart</a>
     */
    val PrefixedName: TerminalSymbolTokenType

    /**
     * The whitespace token (`S`).
     *
     *     S ::= (#x20 | #x9 | #xD | #xA)+
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-ExprWhitespace">XPath 1.0 (REC) ExprWhitespace</a>
     * @see <a href="https://www.w3.org/TR/2008/REC-xml-20081126/#NT-S">XML 1.0 (REC) S</a>
     */
    val S: TerminalSymbolTokenType

    /**
     * The `ancestor` keyword token.
     *
     *     KAncestorToken ::= "ancestor"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val KAncestor: KeywordTokenType

    /**
     * The `ancestor-or-self` keyword token.
     *
     *     KAncestorOrSelfToken ::= "ancestor-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val KAncestorOrSelf: KeywordTokenType

    /**
     * The `and` keyword token.
     *
     *     KAndToken ::= "and"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AndExpr">XPath 1.0 (REC) AndExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">XPath 1.0 (REC) OperatorName</a>
     */
    val KAnd: KeywordTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AttributeTest">XPath 2.0 (REC) AttributeTest</a>
     */
    val KAttribute: KeywordTokenType

    /**
     * The `child` keyword token.
     *
     *     KChildToken ::= "child"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KChild: KeywordTokenType

    /**
     * The `comment` keyword token.
     *
     *     KCommentToken ::= "comment"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">XPath 1.0 (REC) NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentTest">XPath 2.0 (REC) CommentTest</a>
     */
    val KComment: KeywordTokenType

    /**
     * The `descendant` keyword token.
     *
     *     KDescendantToken ::= "descendant"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KDescendant: KeywordTokenType

    /**
     * The `descendant-or-self` keyword token.
     *
     *     KDescendantOrSelfToken ::= "descendant-or-self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KDescendantOrSelf: KeywordTokenType

    /**
     * The `div` keyword token.
     *
     *     KDivToken ::= "div"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">XPath 1.0 (REC) MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">XPath 1.0 (REC) OperatorName</a>
     */
    val KDiv: KeywordTokenType

    /**
     * The `following` keyword token.
     *
     *     KFollowingToken ::= "following"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KFollowing: KeywordTokenType

    /**
     * The `following-sibling` keyword token.
     *
     *     KFollowingSiblingToken ::= "following-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KFollowingSibling: KeywordTokenType

    /**
     * The `mod` keyword token.
     *
     *     KModToken ::= "mod"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-MultiplicativeExpr">XPath 1.0 (REC) MultiplicativeExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">XPath 1.0 (REC) OperatorName</a>
     */
    val KMod: KeywordTokenType

    /**
     * The `namespace` keyword token.
     *
     *     KNamespaceToken ::= "namespace"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KNamespace: KeywordTokenType

    /**
     * The `node` keyword token.
     *
     *     KNodeToken ::= "node"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">XPath 1.0 (REC) NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-AnyKindTest">XPath 2.0 (REC) AnyKindTest</a>
     */
    val KNode: KeywordTokenType

    /**
     * The `or` keyword token.
     *
     *     KOrToken ::= "or"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OrExpr">XPath 1.0 (REC) OrExpr</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-OperatorName">XPath 1.0 (REC) OperatorName</a>
     */
    val KOr: KeywordTokenType

    /**
     * The `parent` keyword token.
     *
     *     KParentToken ::= "parent"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val KParent: KeywordTokenType

    /**
     * The `preceding` keyword token.
     *
     *     KPrecedingToken ::= "preceding"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val KPreceding: KeywordTokenType

    /**
     * The `preceding-sibling` keyword token.
     *
     *     KPrecedingSiblingToken ::= "preceding-sibling"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ReverseAxis">XPath 2.0 (REC) ReverseAxis</a>
     */
    val KPrecedingSibling: KeywordTokenType

    /**
     * The `processing-instruction` keyword token.
     *
     *     KProcessingInstructionToken ::= "processing-instruction"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeTest">XPath 1.0 (REC) NodeTest</a>
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">XPath 1.0 (REC) NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-PITest">XPath 2.0 (REC) PITest</a>
     */
    val KProcessingInstruction: KeywordTokenType

    /**
     * The `self` keyword token.
     *
     *     KSelfToken ::= "self"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-AxisName">XPath 1.0 (REC) AxisName</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForwardAxis">XPath 2.0 (REC) ForwardAxis</a>
     */
    val KSelf: KeywordTokenType

    /**
     * The `text` keyword token.
     *
     *     KTextToken ::= "text"
     *
     * @see <a href="https://www.w3.org/TR/1999/REC-xpath-19991116/#NT-NodeType">XPath 1.0 (REC) NodeType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TextTest">XPath 2.0 (REC) TextTest</a>
     */
    val KText: KeywordTokenType
}

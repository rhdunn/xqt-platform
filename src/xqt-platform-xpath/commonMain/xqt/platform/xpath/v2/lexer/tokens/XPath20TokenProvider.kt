// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v2.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType
import xqt.platform.xpath.v1.lexer.tokens.XPath10TokenProvider

/**
 * The tokens present in the XPath 2.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#id-grammar">XPath 2.0 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#terminal-symbols">XPath 2.0 (REC) Terminal Symbols</a>
 */
@Suppress("PropertyName")
interface XPath20TokenProvider : XPath10TokenProvider {
    /**
     * The comment close token ("`:)`").
     *
     *     CommentCloseToken ::= ":)"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Comment">XPath 2.0 (REC) Comment</a>
     */
    val CommentClose: SymbolTokenType

    /**
     * The comment open token ("`(:`").
     *
     *     CommentOpenToken ::= "(:"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Comment">XPath 2.0 (REC) Comment</a>
     */
    val CommentOpen: SymbolTokenType

    /**
     * The escaped apostrophe token ("`''`").
     *
     *     EscapeAposToken ::= "''"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-EscapeApos">XPath 2.0 (REC) EscapeApos</a>
     */
    val EscapeApos: SymbolTokenType

    /**
     * The escaped quotation mark token ('`""`').
     *
     *     EscapeQuotToken ::= '""'
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-EscapeQuot">XPath 2.0 (REC) EscapeQuot</a>
     */
    val EscapeQuot: SymbolTokenType

    /**
     * The node follows token ("`>>`").
     *
     *     NodeFollowsToken ::= ">>"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">XPath 2.0 (REC) NodeComp</a>
     */
    val NodeFollows: SymbolTokenType

    /**
     * The node precedes token ("`<<`").
     *
     *     NodePrecedesToken ::= "<<"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">XPath 2.0 (REC) NodeComp</a>
     */
    val NodePrecedes: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SingleType">XPath 2.0 (REC) SingleType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">XPath 2.0 (REC) OccurrenceIndicator</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentPlaceholder">XPath 3.0 (REC) ArgumentPlaceholder</a>
     */
    val QuestionMark: SymbolTokenType

    /**
     * The string literal apostrophe token ("`'`").
     *
     *     StringLiteralAposToken ::= "'"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">XPath 2.0 (REC) StringLiteral</a>
     */
    val StringLiteralApos: SymbolTokenType

    /**
     * The string literal quotation mark token ('`"`').
     *
     *     StringLiteralQuotToken ::= '"'
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">XPath 2.0 (REC) StringLiteral</a>
     */
    val StringLiteralQuot: SymbolTokenType

    /**
     * The integer literal token (`IntegerLiteral`).
     *
     *     IntegerLiteral ::= Digits
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntegerLiteral">XPath 2.0 (REC) IntegerLiteral</a>
     */
    val IntegerLiteral: TerminalSymbolTokenType

    /**
     * The decimal literal token (`DecimalLiteral`).
     *
     *     DecimalLiteral ::= ("." Digits)
     *                      | (Digits "." Digits?)
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DecimalLiteral">XPath 2.0 (REC) DecimalLiteral</a>
     */
    val DecimalLiteral: TerminalSymbolTokenType

    /**
     * The double literal token (`DoubleLiteral`).
     *
     *     DoubleLiteral ::= (Digits [eE] [+-]? Digits)
     *                     | ("." Digits [eE] [+-]? Digits)
     *                     | (Digits "." Digits? [eE] [+-]? Digits)
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DoubleLiteral">XPath 2.0 (REC) DoubleLiteral</a>
     */
    val DoubleLiteral: TerminalSymbolTokenType

    /**
     * The string literal apostrophe contents token.
     *
     *     StringLiteralAposContents ::= (Char - "'")*
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">XPath 2.0 (REC) StringLiteral</a>
     */
    val StringLiteralAposContents: TerminalSymbolTokenType

    /**
     * The string literal quotation mark contents token.
     *
     *     StringLiteralQuotContents ::= (Char - '"')*
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">XPath 2.0 (REC) StringLiteral</a>
     */
    val StringLiteralQuotContents: TerminalSymbolTokenType

    /**
     * The comment contents token (`CommentContents`).
     *
     *     CommentContents ::= (Char+ - (Char* ('(:' | ':)') Char*))
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentContents">XPath 2.0 (REC) CommentContents</a>
     */
    val CommentContents: TerminalSymbolTokenType

    /**
     * The `as` keyword token.
     *
     *     KAsToken ::= "as"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TreatExpr">XPath 2.0 (REC) TreatExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastableExpr">XPath 2.0 (REC) CastableExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastExpr">XPath 2.0 (REC) CastExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">XPath 3.0 (REC) InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypeDeclaration">XPath 3.0 (REC) TypeDeclaration</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">XPath 3.0 (REC) TypedFunctionTest</a>
     */
    val KAs: KeywordTokenType

    /**
     * The `cast` keyword token.
     *
     *     KCastToken ::= "cast"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastExpr">XPath 2.0 (REC) CastExpr</a>
     */
    val KCast: KeywordTokenType

    /**
     * The `castable` keyword token.
     *
     *     KCastableToken ::= "castable"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastableExpr">XPath 2.0 (REC) CastableExpr</a>
     */
    val KCastable: KeywordTokenType

    /**
     * The `document-node` keyword token.
     *
     *     KDocumentNodeToken ::= "document-node"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">XPath 2.0 (REC) DocumentTest</a>
     */
    val KDocumentNode: KeywordTokenType

    /**
     * The `element` keyword token.
     *
     *     KElementToken ::= "element"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">XPath 2.0 (REC) ElementTest</a>
     */
    val KElement: KeywordTokenType

    /**
     * The `else` keyword token.
     *
     *     KElseToken ::= "else"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">XPath 2.0 (REC) IfExpr</a>
     */
    val KElse: KeywordTokenType

    /**
     * The `empty-sequence` keyword token.
     *
     *     KEmptySequenceToken ::= "empty-sequence"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">XPath 2.0 (REC) SequenceType</a>
     */
    val KEmptySequence: KeywordTokenType

    /**
     * The `eq` keyword token.
     *
     *     KEqToken ::= "eq"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KEq: KeywordTokenType

    /**
     * The `every` keyword token.
     *
     *     KEveryToken ::= "every"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     */
    val KEvery: KeywordTokenType

    /**
     * The `except` keyword token.
     *
     *     KExceptToken ::= "except"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr">XPath 2.0 (REC) IntersectExceptExpr</a>
     */
    val KExcept: KeywordTokenType

    /**
     * The `for` keyword token.
     *
     *     KForToken ::= "for"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">XPath 2.0 (REC) SimpleForClause</a>
     */
    val KFor: KeywordTokenType

    /**
     * The `ge` keyword token.
     *
     *     KGeToken ::= "ge"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KGe: KeywordTokenType

    /**
     * The `gt` keyword token.
     *
     *     KGtToken ::= "gt"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KGt: KeywordTokenType

    /**
     * The `idiv` keyword token.
     *
     *     KIDivToken ::= "idiv"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr">XPath 2.0 (REC) MultiplicativeExpr</a>
     */
    val KIDiv: KeywordTokenType

    /**
     * The `if` keyword token.
     *
     *     KIfToken ::= "if"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">XPath 2.0 (REC) IfExpr</a>
     */
    val KIf: KeywordTokenType

    /**
     * The `in` keyword token.
     *
     *     KInToken ::= "in"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">XPath 2.0 (REC) SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">XPath 3.0 (REC) SimpleForBinding</a>
     */
    val KIn: KeywordTokenType

    /**
     * The `instance` keyword token.
     *
     *     KInstanceToken ::= "instance"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-InstanceofExpr">XPath 2.0 (REC) InstanceofExpr</a>
     */
    val KInstance: KeywordTokenType

    /**
     * The `intersect` keyword token.
     *
     *     KIntersectToken ::= "intersect"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr">XPath 2.0 (REC) IntersectExceptExpr</a>
     */
    val KIntersect: KeywordTokenType

    /**
     * The `is` keyword token.
     *
     *     KIsToken ::= "is"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">XPath 2.0 (REC) NodeComp</a>
     */
    val KIs: KeywordTokenType

    /**
     * The `item` keyword token.
     *
     *     KItemToken ::= "item"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">XPath 2.0 (REC) ItemType</a>
     */
    val KItem: KeywordTokenType

    /**
     * The `le` keyword token.
     *
     *     KLeToken ::= "le"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KLe: KeywordTokenType

    /**
     * The `lt` keyword token.
     *
     *     KLtToken ::= "lt"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KLt: KeywordTokenType

    /**
     * The `ne` keyword token.
     *
     *     KNeToken ::= "ne"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">XPath 2.0 (REC) ValueComp</a>
     */
    val KNe: KeywordTokenType

    /**
     * The `of` keyword token.
     *
     *     KOfToken ::= "of"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-InstanceofExpr">XPath 2.0 (REC) InstanceofExpr</a>
     */
    val KOf: KeywordTokenType

    /**
     * The `return` keyword token.
     *
     *     KReturnToken ::= "return"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForExpr">XPath 2.0 (REC) ForExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-LetExpr">XPath 3.0 (REC) LetExpr</a>
     */
    val KReturn: KeywordTokenType

    /**
     * The `satisfies` keyword token.
     *
     *     KSatisfiesToken ::= "satisfies"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     */
    val KSatisfies: KeywordTokenType

    /**
     * The `schema-attribute` keyword token.
     *
     *     KSchemaAttributeToken ::= "schema-attribute"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">XPath 2.0 (REC) SchemaAttributeTest</a>
     */
    val KSchemaAttribute: KeywordTokenType

    /**
     * The `schema-element` keyword token.
     *
     *     KSchemaElementToken ::= "schema-element"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">XPath 2.0 (REC) SchemaElementTest</a>
     */
    val KSchemaElement: KeywordTokenType

    /**
     * The `some` keyword token.
     *
     *     KSomeToken ::= "some"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">XPath 2.0 (REC) QuantifiedExpr</a>
     */
    val KSome: KeywordTokenType

    /**
     * The `then` keyword token.
     *
     *     KThenToken ::= "then"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">XPath 2.0 (REC) IfExpr</a>
     */
    val KThen: KeywordTokenType

    /**
     * The `to` keyword token.
     *
     *     KToToken ::= "to"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RangeExpr">XPath 2.0 (REC) RangeExpr</a>
     */
    val KTo: KeywordTokenType

    /**
     * The `treat` keyword token.
     *
     *     KTreatToken ::= "treat"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TreatExpr">XPath 2.0 (REC) TreatExpr</a>
     */
    val KTreat: KeywordTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-UnionExpr">XPath 2.0 (REC) UnionExpr</a>
     */
    val KUnion: KeywordTokenType
}

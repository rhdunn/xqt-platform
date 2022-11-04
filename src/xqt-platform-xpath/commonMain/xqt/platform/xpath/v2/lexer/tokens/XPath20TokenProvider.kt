// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v2.lexer.tokens

import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType
import xqt.platform.xpath.v1.lexer.tokens.XPath10TokenProvider

/**
 * The tokens present in the XPath 2.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#id-grammar">REC-xpath20-20101214/#id-grammar</a>
 * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#terminal-symbols">REC-xpath20-20101214/#terminal-symbols</a>
 */
@Suppress("PropertyName")
interface XPath20TokenProvider : XPath10TokenProvider {
    /**
     * The comment close token ("`:)`").
     *
     *     CommentCloseToken ::= ":)"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Comment">REC-xpath20-20101214/#doc-xpath-Comment</a>
     */
    val CommentClose: SymbolTokenType

    /**
     * The comment open token ("`(:`").
     *
     *     CommentOpenToken ::= "(:"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-Comment">REC-xpath20-20101214/#doc-xpath-Comment</a>
     */
    val CommentOpen: SymbolTokenType

    /**
     * The escaped apostrophe token ("`''`").
     *
     *     EscapeAposToken ::= "''"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-EscapeApos">REC-xpath20-20101214/#doc-xpath-EscapeApos</a>
     */
    val EscapeApos: SymbolTokenType

    /**
     * The escaped quotation mark token ('`""`').
     *
     *     EscapeQuotToken ::= '""'
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-EscapeQuot">REC-xpath20-20101214/#doc-xpath-EscapeQuot</a>
     */
    val EscapeQuot: SymbolTokenType

    /**
     * The node follows token ("`>>`").
     *
     *     NodeFollowsToken ::= ">>"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">REC-xpath20-20101214/#doc-xpath-NodeComp</a>
     */
    val NodeFollows: SymbolTokenType

    /**
     * The node precedes token ("`<<`").
     *
     *     NodePrecedesToken ::= "<<"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">REC-xpath20-20101214/#doc-xpath-NodeComp</a>
     */
    val NodePrecedes: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SingleType">REC-xpath20-20101214/#doc-xpath-SingleType</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator">REC-xpath20-20101214/#doc-xpath-OccurrenceIndicator</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-ArgumentPlaceholder">REC-xpath-30-20140408/#doc-xpath30-ArgumentPlaceholder</a>
     */
    val QuestionMark: SymbolTokenType

    /**
     * The string literal apostrophe token ("`'`").
     *
     *     StringLiteralAposToken ::= "'"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">REC-xpath20-20101214/#doc-xpath-StringLiteral</a>
     */
    val StringLiteralApos: SymbolTokenType

    /**
     * The string literal quotation mark token ('`"`').
     *
     *     StringLiteralQuotToken ::= '"'
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">REC-xpath20-20101214/#doc-xpath-StringLiteral</a>
     */
    val StringLiteralQuot: SymbolTokenType

    /**
     * The integer literal token (`IntegerLiteral`).
     *
     *     IntegerLiteral ::= Digits
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntegerLiteral">REC-xpath20-20101214/#doc-xpath-IntegerLiteral</a>
     */
    val IntegerLiteral: TerminalSymbolTokenType

    /**
     * The decimal literal token (`DecimalLiteral`).
     *
     *     DecimalLiteral ::= ("." Digits)
     *                      | (Digits "." Digits?)
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DecimalLiteral">REC-xpath20-20101214/#doc-xpath-DecimalLiteral</a>
     */
    val DecimalLiteral: TerminalSymbolTokenType

    /**
     * The double literal token (`DoubleLiteral`).
     *
     *     DoubleLiteral ::= (Digits [eE] [+-]? Digits)
     *                     | ("." Digits [eE] [+-]? Digits)
     *                     | (Digits "." Digits? [eE] [+-]? Digits)
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DoubleLiteral">REC-xpath20-20101214/#doc-xpath-DoubleLiteral</a>
     */
    val DoubleLiteral: TerminalSymbolTokenType

    /**
     * The string literal apostrophe contents token.
     *
     *     StringLiteralAposContents ::= (Char - "'")*
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">REC-xpath20-20101214/#doc-xpath-StringLiteral</a>
     */
    val StringLiteralAposContents: TerminalSymbolTokenType

    /**
     * The string literal quotation mark contents token.
     *
     *     StringLiteralQuotContents ::= (Char - '"')*
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-StringLiteral">REC-xpath20-20101214/#doc-xpath-StringLiteral</a>
     */
    val StringLiteralQuotContents: TerminalSymbolTokenType

    /**
     * The comment contents token (`CommentContents`).
     *
     *     CommentContents ::= (Char+ - (Char* ('(:' | ':)') Char*))
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CommentContents">REC-xpath20-20101214/#doc-xpath-CommentContents</a>
     */
    val CommentContents: TerminalSymbolTokenType

    /**
     * The `as` keyword token.
     *
     *     KAsToken ::= "as"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TreatExpr">REC-xpath20-20101214/#doc-xpath-TreatExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastableExpr">REC-xpath20-20101214/#doc-xpath-CastableExpr</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastExpr">REC-xpath20-20101214/#doc-xpath-CastExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr">REC-xpath-30-20140408/#doc-xpath30-InlineFunctionExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypeDeclaration">REC-xpath-30-20140408/#doc-xpath30-TypeDeclaration</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest">REC-xpath-30-20140408/#doc-xpath30-TypedFunctionTest</a>
     */
    val KAs: KeywordTokenType

    /**
     * The `cast` keyword token.
     *
     *     KCastToken ::= "cast"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastExpr">REC-xpath20-20101214/#doc-xpath-CastExpr</a>
     */
    val KCast: KeywordTokenType

    /**
     * The `castable` keyword token.
     *
     *     KCastableToken ::= "castable"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-CastableExpr">REC-xpath20-20101214/#doc-xpath-CastableExpr</a>
     */
    val KCastable: KeywordTokenType

    /**
     * The `document-node` keyword token.
     *
     *     KDocumentNodeToken ::= "document-node"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-DocumentTest">REC-xpath20-20101214/#doc-xpath-DocumentTest</a>
     */
    val KDocumentNode: KeywordTokenType

    /**
     * The `element` keyword token.
     *
     *     KElementToken ::= "element"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ElementTest">REC-xpath20-20101214/#doc-xpath-ElementTest</a>
     */
    val KElement: KeywordTokenType

    /**
     * The `else` keyword token.
     *
     *     KElseToken ::= "else"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">REC-xpath20-20101214/#doc-xpath-IfExpr</a>
     */
    val KElse: KeywordTokenType

    /**
     * The `empty-sequence` keyword token.
     *
     *     KEmptySequenceToken ::= "empty-sequence"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SequenceType">REC-xpath20-20101214/#doc-xpath-SequenceType</a>
     */
    val KEmptySequence: KeywordTokenType

    /**
     * The `eq` keyword token.
     *
     *     KEqToken ::= "eq"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KEq: KeywordTokenType

    /**
     * The `every` keyword token.
     *
     *     KEveryToken ::= "every"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     */
    val KEvery: KeywordTokenType

    /**
     * The `except` keyword token.
     *
     *     KExceptToken ::= "except"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr">REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr</a>
     */
    val KExcept: KeywordTokenType

    /**
     * The `for` keyword token.
     *
     *     KForToken ::= "for"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">REC-xpath20-20101214/#doc-xpath-SimpleForClause</a>
     */
    val KFor: KeywordTokenType

    /**
     * The `ge` keyword token.
     *
     *     KGeToken ::= "ge"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KGe: KeywordTokenType

    /**
     * The `gt` keyword token.
     *
     *     KGtToken ::= "gt"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KGt: KeywordTokenType

    /**
     * The `idiv` keyword token.
     *
     *     KIDivToken ::= "idiv"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr">REC-xpath20-20101214/#doc-xpath-MultiplicativeExpr</a>
     */
    val KIDiv: KeywordTokenType

    /**
     * The `if` keyword token.
     *
     *     KIfToken ::= "if"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">REC-xpath20-20101214/#doc-xpath-IfExpr</a>
     */
    val KIf: KeywordTokenType

    /**
     * The `in` keyword token.
     *
     *     KInToken ::= "in"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SimpleForClause">REC-xpath20-20101214/#doc-xpath-SimpleForClause</a>
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding">REC-xpath-30-20140408/#doc-xpath30-SimpleForBinding</a>
     */
    val KIn: KeywordTokenType

    /**
     * The `instance` keyword token.
     *
     *     KInstanceToken ::= "instance"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-InstanceofExpr">REC-xpath20-20101214/#doc-xpath-InstanceofExpr</a>
     */
    val KInstance: KeywordTokenType

    /**
     * The `intersect` keyword token.
     *
     *     KIntersectToken ::= "intersect"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr">REC-xpath20-20101214/#doc-xpath-IntersectExceptExpr</a>
     */
    val KIntersect: KeywordTokenType

    /**
     * The `is` keyword token.
     *
     *     KIsToken ::= "is"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-NodeComp">REC-xpath20-20101214/#doc-xpath-NodeComp</a>
     */
    val KIs: KeywordTokenType

    /**
     * The `item` keyword token.
     *
     *     KItemToken ::= "item"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ItemType">REC-xpath20-20101214/#doc-xpath-ItemType</a>
     */
    val KItem: KeywordTokenType

    /**
     * The `le` keyword token.
     *
     *     KLeToken ::= "le"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KLe: KeywordTokenType

    /**
     * The `lt` keyword token.
     *
     *     KLtToken ::= "lt"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KLt: KeywordTokenType

    /**
     * The `ne` keyword token.
     *
     *     KNeToken ::= "ne"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ValueComp">REC-xpath20-20101214/#doc-xpath-ValueComp</a>
     */
    val KNe: KeywordTokenType

    /**
     * The `of` keyword token.
     *
     *     KOfToken ::= "of"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-InstanceofExpr">REC-xpath20-20101214/#doc-xpath-InstanceofExpr</a>
     */
    val KOf: KeywordTokenType

    /**
     * The `return` keyword token.
     *
     *     KReturnToken ::= "return"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-ForExpr">REC-xpath20-20101214/#doc-xpath-ForExpr</a>
     * @see <a href="https://www.w3.org/TR/2014/REC-xpath-30-20140408/#doc-xpath30-LetExpr">REC-xpath-30-20140408/#doc-xpath30-LetExpr</a>
     */
    val KReturn: KeywordTokenType

    /**
     * The `satisfies` keyword token.
     *
     *     KSatisfiesToken ::= "satisfies"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     */
    val KSatisfies: KeywordTokenType

    /**
     * The `schema-attribute` keyword token.
     *
     *     KSchemaAttributeToken ::= "schema-attribute"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest">REC-xpath20-20101214/#doc-xpath-SchemaAttributeTest</a>
     */
    val KSchemaAttribute: KeywordTokenType

    /**
     * The `schema-element` keyword token.
     *
     *     KSchemaElementToken ::= "schema-element"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-SchemaElementTest">REC-xpath20-20101214/#doc-xpath-SchemaElementTest</a>
     */
    val KSchemaElement: KeywordTokenType

    /**
     * The `some` keyword token.
     *
     *     KSomeToken ::= "some"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-QuantifiedExpr">REC-xpath20-20101214/#doc-xpath-QuantifiedExpr</a>
     */
    val KSome: KeywordTokenType

    /**
     * The `then` keyword token.
     *
     *     KThenToken ::= "then"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-IfExpr">REC-xpath20-20101214/#doc-xpath-IfExpr</a>
     */
    val KThen: KeywordTokenType

    /**
     * The `to` keyword token.
     *
     *     KToToken ::= "to"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-RangeExpr">REC-xpath20-20101214/#doc-xpath-RangeExpr</a>
     */
    val KTo: KeywordTokenType

    /**
     * The `treat` keyword token.
     *
     *     KTreatToken ::= "treat"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-TreatExpr">REC-xpath20-20101214/#doc-xpath-TreatExpr</a>
     */
    val KTreat: KeywordTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://www.w3.org/TR/2010/REC-xpath20-20101214/#doc-xpath-UnionExpr">REC-xpath20-20101214/#doc-xpath-UnionExpr</a>
     */
    val KUnion: KeywordTokenType
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v2.lexer.tokens

import xqt.platform.xml.W3CWorkingDraft
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType

/**
 * The tokens present in the XPath 2.0 (Working Draft 2003) grammar.
 *
 * The XPath 2.0 (Working Draft 2003) grammar is defined here as a variant of
 * the XPath 2.0 (REC) grammar not the other way around, as the REC grammar
 * is the official version.
 *
 * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#id-grammar">XPath 2.0 (Working Draft 2003) EBNF</a>
 */
@W3CWorkingDraft
@Suppress("PropertyName")
interface XPathWD2003TokenProvider : XPath20TokenProvider {
    /**
     * The abbreviated `attribute::` selector token ("`@`").
     *
     *     AbbrevAttributeToken ::= "@"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AbbreviatedForwardStep">XPath 2.0 (Working Draft 2003) AbbreviatedForwardStep</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AttributeTest">XPath 2.0 (Working Draft 2003) AttributeTest</a>
     */
    override val AbbrevAttribute: SymbolTokenType

    /**
     * The abbreviated `parent::node()` selector token ("`..`").
     *
     *     AbbrevParentToken ::= ".."
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AbbreviatedReverseStep">XPath 2.0 (Working Draft 2003) AbbreviatedReverseStep</a>
     */
    override val AbbrevParent: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ElementTest">XPath 2.0 (Working Draft 2003) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AttributeTest">XPath 2.0 (Working Draft 2003) AttributeTest</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The comment close token ("`:)`").
     *
     *     CommentCloseToken ::= ":)"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ExprComment">XPath 2.0 (Working Draft 2003) ExprComment</a>
     */
    override val CommentClose: SymbolTokenType

    /**
     * The comment open token ("`(:`").
     *
     *     CommentOpenToken ::= "(:"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ExprComment">XPath 2.0 (Working Draft 2003) ExprComment</a>
     */
    override val CommentOpen: SymbolTokenType

    /**
     * The context item token ("`.`").
     *
     *     ContextItemToken ::= "."
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AbbreviatedForwardStep">XPath 2.0 (Working Draft 2003) AbbreviatedForwardStep</a>
     */
    override val ContextItem: SymbolTokenType

    /**
     * The node follows token ("`>>`").
     *
     *     NodeFollowsToken ::= ">>"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-OrderComp">XPath 2.0 (Working Draft 2003) OrderComp</a>
     */
    override val NodeFollows: SymbolTokenType

    /**
     * The node precedes token ("`<<`").
     *
     *     NodePrecedesToken ::= "<<"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-OrderComp">XPath 2.0 (Working Draft 2003) OrderComp</a>
     */
    override val NodePrecedes: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SchemaGlobalTypeName">XPath 2.0 (Working Draft 2003) SchemaGlobalTypeName</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SequenceType">XPath 2.0 (Working Draft 2003) SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ElementTest">XPath 2.0 (Working Draft 2003) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AttributeTest">XPath 2.0 (Working Draft 2003) AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ProcessingInstructionTest">XPath 2.0 (Working Draft 2003) ProcessingInstructionTest</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SchemaGlobalTypeName">XPath 2.0 (Working Draft 2003) SchemaGlobalTypeName</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SequenceType">XPath 2.0 (Working Draft 2003) SequenceType</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ElementTest">XPath 2.0 (Working Draft 2003) ElementTest</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AttributeTest">XPath 2.0 (Working Draft 2003) AttributeTest</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ProcessingInstructionTest">XPath 2.0 (Working Draft 2003) ProcessingInstructionTest</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The path operator token ("`/`").
     *
     *     PathOperatorToken ::= "/"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SchemaContextPath">XPath 2.0 (Working Draft 2003) SchemaContextPath</a>
     */
    override val PathOperator: SymbolTokenType

    /**
     * The square bracket close token ("`]`").
     *
     *     SquareBracketCloseToken ::= "]"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-Predicates">XPath 2.0 (Working Draft 2003) Predicates</a>
     */
    override val SquareBracketClose: SymbolTokenType

    /**
     * The square bracket open token ("`[`").
     *
     *     SquareBracketOpenToken ::= "["
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-Predicates">XPath 2.0 (Working Draft 2003) Predicates</a>
     */
    override val SquareBracketOpen: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-NodeName">XPath 2.0 (Working Draft 2003) NodeName</a>
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-TypeName">XPath 2.0 (Working Draft 2003) TypeName</a>
     */
    override val Star: SymbolTokenType

    /**
     * The comment contents token (`CommentContents`).
     *
     *     CommentContents ::= (Char+ - (Char* ('(:' | ':)') Char*))
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ExprCommentContent">XPath 2.0 (Working Draft 2003) ExprCommentContent</a>
     */
    override val CommentContents: TerminalSymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-PrimaryExpr">XPath 2.0 (Working Draft 2003) PrimaryExpr</a>
     */
    override val VariableIndicator: SymbolTokenType

    /**
     * The `attribute` keyword token.
     *
     *     KAttributeToken ::= "attribute"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-AttributeTest">XPath 2.0 (Working Draft 2003) AttributeTest</a>
     */
    override val KAttribute: KeywordTokenType

    /**
     * The `element` keyword token.
     *
     *     KElementToken ::= "element"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ElementTest">XPath 2.0 (Working Draft 2003) ElementTest</a>
     */
    override val KElement: KeywordTokenType

    /**
     * The `empty` keyword token.
     *
     *     KEmptyToken ::= "empty"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SequenceType">XPath 2.0 (Working Draft 2003) SequenceType</a>
     */
    val KEmpty: KeywordTokenType

    /**
     * The `isnot` keyword token.
     *
     *     KIsNotToken ::= "isnot"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-NodeComp">XPath 2.0 (Working Draft 2003) NodeComp</a>
     */
    val KIsNot: KeywordTokenType

    /**
     * The `nillable` keyword token.
     *
     *     KNillableToken ::= "nillable"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ElementTest">XPath 2.0 (Working Draft 2003) ElementTest</a>
     */
    val KNillable: KeywordTokenType

    /**
     * The `processing-instruction` keyword token.
     *
     *     KProcessingInstructionToken ::= "processing-instruction"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-ProcessingInstructionTest">XPath 2.0 (Working Draft 2003) ProcessingInstructionTest</a>
     */
    override val KProcessingInstruction: KeywordTokenType

    /**
     * The `type` keyword token.
     *
     *     KTypeToken ::= "type"
     *
     * @see <a href="https://www.w3.org/TR/2003/WD-xpath20-20030502/#doc-SchemaGlobalTypeName">XPath 2.0 (Working Draft 2003) SchemaGlobalTypeName</a>
     */
    val KType: KeywordTokenType
}

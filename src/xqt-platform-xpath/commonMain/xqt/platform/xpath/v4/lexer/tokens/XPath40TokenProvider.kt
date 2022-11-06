// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xpath.v4.lexer.tokens

import xqt.platform.xml.W3CEditorsDraft
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v3_1.lexer.tokens.XPath31TokenProvider

/**
 * The tokens present in the XPath 4.0 (W3C Editor's Draft 31 October 2022) grammar.
 *
 * Note that these may change as the specification evolves.
 *
 * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#id-grammar">XPath 4.0 (Editor's Draft) EBNF</a>
 * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#terminal-symbols">XPath 4.0 (Editor's Draft) Terminal Symbols</a>
 */
@W3CEditorsDraft
@Suppress("PropertyName")
interface XPath40TokenProvider : XPath31TokenProvider {
    /**
     * The abbreviated `parent::node()` selector token ("`..`").
     *
     *     AbbrevParentToken ::= ".."
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-SelfReference">XPath 4.0 (Editor's Draft) SelfReference</a>
     */
    override val AbbrevParent: SymbolTokenType

    /**
     * The assign equals token ("`:=`").
     *
     *     AssignEqualsToken ::= ":="
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-KeywordArgument">XPath 4.0 (Editor's Draft) KeywordArgument</a>
     */
    override val AssignEquals: SymbolTokenType

    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-WithExpr">XPath 4.0 (Editor's Draft) WithExpr</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-PositionalArguments">XPath 4.0 (Editor's Draft) PositionalArguments</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-KeywordArguments">XPath 4.0 (Editor's Draft) KeywordArguments</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-RecordTest">XPath 4.0 (Editor's Draft) RecordTest</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-ExtensibleFlag">XPath 4.0 (Editor's Draft) ExtensibleFlag</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-LocalUnionType">XPath 4.0 (Editor's Draft) LocalUnionType</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-EnumerationType">XPath 4.0 (Editor's Draft) EnumerationType</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The equals token ("`=`").
     *
     *     EqualsToken ::= "="
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-WithExpr">XPath 4.0 (Editor's Draft) WithExpr</a>
     */
    override val Equals: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-PositionalArgumentList">XPath 4.0 (Editor's Draft) PositionalArgumentList</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-AnyItemTest">XPath 4.0 (Editor's Draft) AnyItemTest</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-RecordTest">XPath 4.0 (Editor's Draft) RecordTest</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-LocalUnionType">XPath 4.0 (Editor's Draft) LocalUnionType</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-EnumerationType">XPath 4.0 (Editor's Draft) EnumerationType</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-PositionalArgumentList">XPath 4.0 (Editor's Draft) PositionalArgumentList</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-AnyItemTest">XPath 4.0 (Editor's Draft) AnyItemTest</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-RecordTest">XPath 4.0 (Editor's Draft) RecordTest</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-LocalUnionType">XPath 4.0 (Editor's Draft) LocalUnionType</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-EnumerationType">XPath 4.0 (Editor's Draft) EnumerationType</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The question mark token ("`?`").
     *
     *     QuestionMarkToken ::= "?"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-FieldDeclaration">XPath 4.0 (Editor's Draft) FieldDeclaration</a>
     */
    override val QuestionMark: SymbolTokenType

    /**
     * The star token ("`*`").
     *
     *     StarToken ::= "*"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-ExtensibleFlag">XPath 4.0 (Editor's Draft) ExtensibleFlag</a>
     */
    override val Star: SymbolTokenType

    /**
     * The ternary else token ("`!!`").
     *
     *     TernaryElseToken ::= "!!"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-TernaryConditionalExpr">XPath 4.0 (Editor's Draft) TernaryConditionalExpr</a>
     */
    val TernaryElse: SymbolTokenType

    /**
     * The ternary if-then token ("`??`").
     *
     *     TernaryIfThenToken ::= "??"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-TernaryConditionalExpr">XPath 4.0 (Editor's Draft) TernaryConditionalExpr</a>
     */
    val TernaryIfThen: SymbolTokenType

    /**
     * The thick arrow token ("`=>`").
     *
     *     ThickArrowToken ::= "=>"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-FatArrowTarget">XPath 4.0 (Editor's Draft) FatArrowTarget</a>
     */
    override val ThickArrow: SymbolTokenType

    /**
     * The thin arrow token ("`->`").
     *
     *     ThinArrowToken ::= "->"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-ThinArrowTarget">XPath 4.0 (Editor's Draft) ThinArrowTarget</a>
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-InlineFunctionExpr">XPath 4.0 (Editor's Draft) InlineFunctionExpr</a>
     */
    val ThinArrow: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-QuantifierBinding">XPath 4.0 (Editor's Draft) QuantifierBinding</a>
     */
    override val VariableIndicator: SymbolTokenType

    /**
     * The `as` keyword token.
     *
     *     KAsToken ::= "as"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-FieldDeclaration">XPath 4.0 (Editor's Draft) FieldDeclaration</a>
     */
    override val KAs: KeywordTokenType

    /**
     * The `enum` keyword token.
     *
     *     KEnumToken ::= "enum"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-EnumerationType">XPath 4.0 (Editor's Draft) EnumerationType</a>
     */
    val KEnum: KeywordTokenType

    /**
     * The `in` keyword token.
     *
     *     KInToken ::= "in"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-QuantifierBinding">XPath 4.0 (Editor's Draft) QuantifierBinding</a>
     */
    override val KIn: KeywordTokenType

    /**
     * The `item` keyword token.
     *
     *     KItemToken ::= "item"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#prod-xpath40-AnyItemTest">XPath 4.0 (Editor's Draft) AnyItemTest</a>
     */
    override val KItem: KeywordTokenType

    /**
     * The `member` keyword token.
     *
     *     KMemberToken ::= "member"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-SimpleForClause">XPath 4.0 (Editor's Draft) SimpleForClause</a>
     */
    val KMember: KeywordTokenType

    /**
     * The `otherwise` keyword token.
     *
     *     KOtherwiseToken ::= "otherwise"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-OtherwiseExpr">XPath 4.0 (Editor's Draft) OtherwiseExpr</a>
     */
    val KOtherwise: KeywordTokenType

    /**
     * The `record` keyword token.
     *
     *     KRecordToken ::= "record"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-RecordTest">XPath 4.0 (Editor's Draft) RecordTest</a>
     */
    val KRecord: KeywordTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-LocalUnionType">XPath 4.0 (Editor's Draft) LocalUnionType</a>
     */
    override val KUnion: KeywordTokenType

    /**
     * The `with` keyword token.
     *
     *     KWithToken ::= "with"
     *
     * @see <a href="https://qt4cg.org/specifications/xquery-40/xpath-40.html#doc-xpath40-WithExpr">XPath 4.0 (Editor's Draft) WithExpr</a>
     */
    val KWith: KeywordTokenType
}

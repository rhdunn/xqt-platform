// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xslt.v4.lexer.tokens

import xqt.platform.xml.W3CEditorsDraft
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xpath.v4.lexer.tokens.XPath40TokenProvider
import xqt.platform.xslt.v3.lexer.tokens.XsltPattern31TokenProvider

/**
 * The tokens present in the XSLT Patterns 4.0 grammar.
 *
 * @see <a href="httpshttps://qt4cg.org/specifications/xslt-40/Overview.html#pattern-syntax">XSLT 4.0 (Editor's Draft) Patterns</a>
 */
@W3CEditorsDraft
@Suppress("PropertyName")
interface XsltPattern40TokenProvider : XsltPattern31TokenProvider, XPath40TokenProvider {
    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://qt4cg.org/specifications/xslt-40/Overview.html#doc-xslt40-patterns-WrappedItemTest">XSLT 4.0 (Editor's Draft) WrappedItemTest</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://qt4cg.org/specifications/xslt-40/Overview.html#doc-xslt40-patterns-WrappedItemTest">XSLT 4.0 (Editor's Draft) WrappedItemTest</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The `type` keyword token.
     *
     *     KTypeToken ::= "type"
     *
     * @see <a href="https://qt4cg.org/specifications/xslt-40/Overview.html#doc-xslt40-patterns-WrappedItemTest">XSLT 4.0 (Editor's Draft) WrappedItemTest</a>
     */
    val KType: KeywordTokenType
}

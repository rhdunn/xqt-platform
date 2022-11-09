// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.ft.v3.lexer.tokens

import xqt.platform.ft.v1.lexer.tokens.XPath20FT10TokenProvider
import xqt.platform.xml.W3CRecommendation
import xqt.platform.xpath.v3.lexer.tokens.XPath30TokenProvider

/**
 * The tokens present in the XPath 3.0 with Full Text 1.0 grammar.
 *
 * Note that no new full text features have been added in this version. It is
 * primarily supporting Full Text 1.0 in the context of the XPath 3.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2015/REC-xpath-full-text-30-20151124/#id-xpath-grammar">XPath Full Text 3.0 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2015/REC-xpath-full-text-30-20151124/#xpath-grammar-terminals">XPath Full Text 3.0 (REC) Terminal Symbols</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XPath30FT10TokenProvider : XPath20FT10TokenProvider, XPath30TokenProvider

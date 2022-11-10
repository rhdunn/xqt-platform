// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xslt.v3.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xpath.v3_1.lexer.tokens.XPath31TokenProvider

/**
 * The tokens present in the XSLT Patterns 3.1 grammar.
 *
 * This is the same as the XSLT Patterns 3.0 grammar, but with the XPath 3.1
 * feature enabled. As such, the patterns grammar extends the XPath 3.1
 * grammar.
 *
 * @see <a href="https://www.w3.org/TR/2017/REC-xslt-30-20170608/#pattern-syntax">XSLT 3.0 (REC) Patterns</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XsltPattern31TokenProvider : XsltPattern30TokenProvider, XPath31TokenProvider

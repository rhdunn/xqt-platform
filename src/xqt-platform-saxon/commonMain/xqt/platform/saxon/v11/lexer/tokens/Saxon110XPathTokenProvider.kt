// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.saxon.v11.lexer.tokens

import xqt.platform.saxon.v10.lexer.tokens.Saxon100XPathTokenProvider
import xqt.platform.xml.W3CEditorsDraft
import xqt.platform.xpath.v4.lexer.tokens.XPath40TokenProvider

/**
 * The tokens present in the XPath 3.1 vendor extensions for Saxon 11.
 *
 * This includes support for several XPath 4.0 Editor's Draft features.
 */
@Suppress("PropertyName")
@OptIn(W3CEditorsDraft::class)
interface Saxon110XPathTokenProvider : Saxon100XPathTokenProvider, XPath40TokenProvider

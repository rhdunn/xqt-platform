// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.lexer.tokens

/**
 * A keyword in an XQT language.
 */
interface KeywordTokenType : NCNameTokenType {
    /**
     * The name of the keyword.
     */
    val keyword: String
}

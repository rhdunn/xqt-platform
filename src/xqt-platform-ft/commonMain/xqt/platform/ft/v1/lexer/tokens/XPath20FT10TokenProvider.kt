// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.ft.v1.lexer.tokens

import xqt.platform.xml.W3CRecommendation
import xqt.platform.xml.lexer.tokens.KeywordTokenType
import xqt.platform.xml.lexer.tokens.SymbolTokenType
import xqt.platform.xml.lexer.tokens.TerminalSymbolTokenType
import xqt.platform.xpath.v2.lexer.tokens.XPath20TokenProvider

/**
 * The tokens present in the XPath 2.0 with Full Text 1.0 grammar.
 *
 * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#id-xpath-grammar">XPath Full Text 1.0 (REC) EBNF</a>
 * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#xpath-grammar-terminals">XPath Full Text 1.0 (REC) Terminal Symbols</a>
 */
@W3CRecommendation
@Suppress("PropertyName")
interface XPath20FT10TokenProvider : XPath20TokenProvider {
    /**
     * The comma token ("`,`").
     *
     *     CommaToken ::= ","
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWords">XPath Full Text 1.0 (REC) FTStopWords</a>
     */
    override val Comma: SymbolTokenType

    /**
     * The curly bracket close token ("`}`").
     *
     *     CurlyBracketCloseToken ::= "}"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWeight">XPath Full Text 1.0 (REC) FTWeight</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWordsValue">XPath Full Text 1.0 (REC) FTWordsValue</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTExtensionSelection">XPath Full Text 1.0 (REC) FTExtensionSelection</a>
     */
    val CurlyBracketClose: SymbolTokenType

    /**
     * The curly bracket open token ("`{`").
     *
     *     CurlyBracketOpenToken ::= "{"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWeight">XPath Full Text 1.0 (REC) FTWeight</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWordsValue">XPath Full Text 1.0 (REC) FTWordsValue</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTExtensionSelection">XPath Full Text 1.0 (REC) FTExtensionSelection</a>
     */
    val CurlyBracketOpen: SymbolTokenType

    /**
     * The parenthesis close token ("`)`").
     *
     *     ParenthesisCloseToken ::= ")"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTPrimary">XPath Full Text 1.0 (REC) FTPrimary</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWords">XPath Full Text 1.0 (REC) FTStopWords</a>
     */
    override val ParenthesisClose: SymbolTokenType

    /**
     * The parenthesis open token ("`(`").
     *
     *     ParenthesisOpenToken ::= "("
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTPrimary">XPath Full Text 1.0 (REC) FTPrimary</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWords">XPath Full Text 1.0 (REC) FTStopWords</a>
     */
    override val ParenthesisOpen: SymbolTokenType

    /**
     * The pragma close token ("`#)`").
     *
     *     PragmaCloseToken ::= "#)"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-Pragma">XPath Full Text 1.0 (REC) Pragma</a>
     */
    val PragmaClose: SymbolTokenType

    /**
     * The pragma open token ("`(#`").
     *
     *     PragmaCloseToken ::= "(#"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-Pragma">XPath Full Text 1.0 (REC) Pragma</a>
     */
    val PragmaOpen: SymbolTokenType

    /**
     * The variable indicator token ("`$`").
     *
     *     VariableIndicatorToken ::= "$"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTScoreVar">XPath Full Text 1.0 (REC) FTScoreVar</a>
     */
    override val VariableIndicator: SymbolTokenType

    /**
     * The pragma contents token (`PragmaContents`).
     *
     *     PragmaContents ::= (Char* - (Char* '#)' Char*))
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-PragmaContents">XPath Full Text 1.0 (REC) PragmaContents</a>
     */
    val PragmaContents: TerminalSymbolTokenType

    /**
     * The `all` keyword token.
     *
     *     KAllToken ::= "all"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnyallOption">XPath Full Text 1.0 (REC) FTAnyallOption</a>
     */
    val KAll: KeywordTokenType

    /**
     * The `any` keyword token.
     *
     *     KAnyToken ::= "any"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnyallOption">XPath Full Text 1.0 (REC) FTAnyallOption</a>
     */
    val KAny: KeywordTokenType

    /**
     * The `at` keyword token.
     *
     *     KAtToken ::= "at"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContent">XPath Full Text 1.0 (REC) FTContent</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusID">XPath Full Text 1.0 (REC) FTThesaurusID</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWords">XPath Full Text 1.0 (REC) FTStopWords</a>
     */
    val KAt: KeywordTokenType

    /**
     * The `case` keyword token.
     *
     *     KCaseToken ::= "case"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTCaseOption">XPath Full Text 1.0 (REC) FTCaseOption</a>
     */
    val KCase: KeywordTokenType

    /**
     * The `contains` keyword token.
     *
     *     KContainsToken ::= "contains"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContainsExpr">XPath Full Text 1.0 (REC) FTContainsExpr</a>
     */
    val KContains: KeywordTokenType

    /**
     * The `content` keyword token.
     *
     *     KContentToken ::= "content"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContent">XPath Full Text 1.0 (REC) FTContent</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTIgnoreOption">XPath Full Text 1.0 (REC) FTIgnoreOption</a>
     */
    val KContent: KeywordTokenType

    /**
     * The `default` keyword token.
     *
     *     KDefaultToken ::= "default"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordOption">XPath Full Text 1.0 (REC) FTStopWordOption</a>
     */
    val KDefault: KeywordTokenType

    /**
     * The `diacritics` keyword token.
     *
     *     KDiacriticsToken ::= "diacritics"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTDiacritics">XPath Full Text 1.0 (REC) FTDiacritics</a>
     */
    val KDiacritics: KeywordTokenType

    /**
     * The `different` keyword token.
     *
     *     KDifferentToken ::= "different"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTScope">XPath Full Text 1.0 (REC) FTScope</a>
     */
    val KDifferent: KeywordTokenType

    /**
     * The `distance` keyword token.
     *
     *     KDistanceToken ::= "distance"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTDistance">XPath Full Text 1.0 (REC) FTDistance</a>
     */
    val KDistance: KeywordTokenType

    /**
     * The `end` keyword token.
     *
     *     KEndToken ::= "end"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContent">XPath Full Text 1.0 (REC) FTContent</a>
     */
    val KEnd: KeywordTokenType

    /**
     * The `entire` keyword token.
     *
     *     KEntireToken ::= "entire"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContent">XPath Full Text 1.0 (REC) FTContent</a>
     */
    val KEntire: KeywordTokenType

    /**
     * The `exactly` keyword token.
     *
     *     KExactlyToken ::= "exactly"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     */
    val KExactly: KeywordTokenType

    /**
     * The `except` keyword token.
     *
     *     KExceptToken ::= "except"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordsInclExcl">XPath Full Text 1.0 (REC) FTStopWordsInclExcl</a>
     */
    override val KExcept: KeywordTokenType

    /**
     * The `from` keyword token.
     *
     *     KFromToken ::= "from"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     */
    val KFrom: KeywordTokenType

    /**
     * The `ftand` keyword token.
     *
     *     KFtAndToken ::= "ftand"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnd">XPath Full Text 1.0 (REC) FTAnd</a>
     */
    val KFtAnd: KeywordTokenType

    /**
     * The `ftnot` keyword token.
     *
     *     KFtNotToken ::= "ftnot"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTUnaryNot">XPath Full Text 1.0 (REC) FTUnaryNot</a>
     */
    val KFtNot: KeywordTokenType

    /**
     * The `ftor` keyword token.
     *
     *     KFtOrToken ::= "ftor"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTOr">XPath Full Text 1.0 (REC) FTOr</a>
     */
    val KFtOr: KeywordTokenType

    /**
     * The `in` keyword token.
     *
     *     KInToken ::= "in"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTMildNot">XPath Full Text 1.0 (REC) FTMildNot</a>
     */
    override val KIn: KeywordTokenType

    /**
     * The `insensitive` keyword token.
     *
     *     KInsensitiveToken ::= "insensitive"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTCaseOption">XPath Full Text 1.0 (REC) FTCaseOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTDiacritics">XPath Full Text 1.0 (REC) FTDiacritics</a>
     */
    val KInsensitive: KeywordTokenType

    /**
     * The `language` keyword token.
     *
     *     KLanguageToken ::= "language"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLanguageOption">XPath Full Text 1.0 (REC) FTLanguageOption</a>
     */
    val KLanguage: KeywordTokenType

    /**
     * The `least` keyword token.
     *
     *     KLeastToken ::= "least"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     */
    val KLeast: KeywordTokenType

    /**
     * The `levels` keyword token.
     *
     *     KLevelsToken ::= "levels"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusID">XPath Full Text 1.0 (REC) FTThesaurusID</a>
     */
    val KLevels: KeywordTokenType

    /**
     * The `lowercase` keyword token.
     *
     *     KLowerCaseToken ::= "lowercase"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTCaseOption">XPath Full Text 1.0 (REC) FTCaseOption</a>
     */
    val KLowerCase: KeywordTokenType

    /**
     * The `most` keyword token.
     *
     *     KMostToken ::= "most"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     */
    val KMost: KeywordTokenType

    /**
     * The `no` keyword token.
     *
     *     KNoToken ::= "no"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStemOption">XPath Full Text 1.0 (REC) FTStemOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordOption">XPath Full Text 1.0 (REC) FTStopWordOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWildCardOption">XPath Full Text 1.0 (REC) FTWildCardOption</a>
     */
    val KNo: KeywordTokenType

    /**
     * The `not` keyword token.
     *
     *     KNotToken ::= "not"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTMildNot">XPath Full Text 1.0 (REC) FTMildNot</a>
     */
    val KNot: KeywordTokenType

    /**
     * The `occurs` keyword token.
     *
     *     KOccursToken ::= "occurs"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTTimes">XPath Full Text 1.0 (REC) FTTimes</a>
     */
    val KOccurs: KeywordTokenType

    /**
     * The `option` keyword token.
     *
     *     KOptionToken ::= "option"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTExtensionOption">XPath Full Text 1.0 (REC) FTExtensionOption</a>
     */
    val KOption: KeywordTokenType

    /**
     * The `ordered` keyword token.
     *
     *     KOrderedToken ::= "ordered"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTOrder">XPath Full Text 1.0 (REC) FTOrder</a>
     */
    val KOrdered: KeywordTokenType

    /**
     * The `paragraph` keyword token.
     *
     *     KParagraphToken ::= "paragraph"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTBigUnit">XPath Full Text 1.0 (REC) FTBigUnit</a>
     */
    val KParagraph: KeywordTokenType

    /**
     * The `paragraphs` keyword token.
     *
     *     KParagraphsToken ::= "paragraphs"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTUnit">XPath Full Text 1.0 (REC) FTUnit</a>
     */
    val KParagraphs: KeywordTokenType

    /**
     * The `phrase` keyword token.
     *
     *     KPhraseToken ::= "phrase"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnyallOption">XPath Full Text 1.0 (REC) FTAnyallOption</a>
     */
    val KPhrase: KeywordTokenType

    /**
     * The `relationship` keyword token.
     *
     *     KRelationshipToken ::= "relationship"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusID">XPath Full Text 1.0 (REC) FTThesaurusID</a>
     */
    val KRelationship: KeywordTokenType

    /**
     * The `same` keyword token.
     *
     *     KSameToken ::= "same"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTScope">XPath Full Text 1.0 (REC) FTScope</a>
     */
    val KSame: KeywordTokenType

    /**
     * The `sensitive` keyword token.
     *
     *     KSensitiveToken ::= "sensitive"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTCaseOption">XPath Full Text 1.0 (REC) FTCaseOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTDiacritics">XPath Full Text 1.0 (REC) FTDiacritics</a>
     */
    val KSensitive: KeywordTokenType

    /**
     * The `sentence` keyword token.
     *
     *     KSentenceToken ::= "sentence"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTBigUnit">XPath Full Text 1.0 (REC) FTBigUnit</a>
     */
    val KSentence: KeywordTokenType

    /**
     * The `sentences` keyword token.
     *
     *     KSentencesToken ::= "sentences"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTUnit">XPath Full Text 1.0 (REC) FTUnit</a>
     */
    val KSentences: KeywordTokenType

    /**
     * The `score` keyword token.
     *
     *     KScoreToken ::= "score"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTScoreVar">XPath Full Text 1.0 (REC) FTScoreVar</a>
     */
    val KScore: KeywordTokenType

    /**
     * The `start` keyword token.
     *
     *     KStartToken ::= "start"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContent">XPath Full Text 1.0 (REC) FTContent</a>
     */
    val KStart: KeywordTokenType

    /**
     * The `stemming` keyword token.
     *
     *     KStemmingToken ::= "stemming"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStemOption">XPath Full Text 1.0 (REC) FTStemOption</a>
     */
    val KStemming: KeywordTokenType

    /**
     * The `stop` keyword token.
     *
     *     KStopToken ::= "stop"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordOption">XPath Full Text 1.0 (REC) FTStopWordOption</a>
     */
    val KStop: KeywordTokenType

    /**
     * The `text` keyword token.
     *
     *     KTextToken ::= "text"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTContainsExpr">XPath Full Text 1.0 (REC) FTContainsExpr</a>
     */
    override val KText: KeywordTokenType

    /**
     * The `thesaurus` keyword token.
     *
     *     KThesaurusToken ::= "thesaurus"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTThesaurusOption">XPath Full Text 1.0 (REC) FTThesaurusOption</a>
     */
    val KThesaurus: KeywordTokenType

    /**
     * The `times` keyword token.
     *
     *     KTimesToken ::= "times"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTTimes">XPath Full Text 1.0 (REC) FTTimes</a>
     */
    val KTimes: KeywordTokenType

    /**
     * The `to` keyword token.
     *
     *     KToToken ::= "to"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTRange">XPath Full Text 1.0 (REC) FTRange</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTLiteralRange">XPath Full Text 1.0 (REC) FTLiteralRange</a>
     */
    override val KTo: KeywordTokenType

    /**
     * The `union` keyword token.
     *
     *     KUnionToken ::= "union"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordsInclExcl">XPath Full Text 1.0 (REC) FTStopWordsInclExcl</a>
     */
    override val KUnion: KeywordTokenType

    /**
     * The `uppercase` keyword token.
     *
     *     KUpperCaseToken ::= "uppercase"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTCaseOption">XPath Full Text 1.0 (REC) FTCaseOption</a>
     */
    val KUpperCase: KeywordTokenType

    /**
     * The `using` keyword token.
     *
     *     KUsingToken ::= "using"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTMatchOptions">XPath Full Text 1.0 (REC) FTMatchOptions</a>
     */
    val KUsing: KeywordTokenType

    /**
     * The `weight` keyword token.
     *
     *     KWeightToken ::= "weight"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWeight">XPath Full Text 1.0 (REC) FTWeight</a>
     */
    val KWeight: KeywordTokenType

    /**
     * The `wildcards` keyword token.
     *
     *     KWildcardsToken ::= "wildcards"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWildCardOption">XPath Full Text 1.0 (REC) FTWildCardOption</a>
     */
    val KWildcards: KeywordTokenType

    /**
     * The `window` keyword token.
     *
     *     KWindowToken ::= "window"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTWindow">XPath Full Text 1.0 (REC) FTWindow</a>
     */
    val KWindow: KeywordTokenType

    /**
     * The `without` keyword token.
     *
     *     KWithoutToken ::= "without"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTIgnoreOption">XPath Full Text 1.0 (REC) FTIgnoreOption</a>
     */
    val KWithout: KeywordTokenType

    /**
     * The `word` keyword token.
     *
     *     KWordToken ::= "word"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnyallOption">XPath Full Text 1.0 (REC) FTAnyallOption</a>
     */
    val KWord: KeywordTokenType

    /**
     * The `words` keyword token.
     *
     *     KWordsToken ::= "words"
     *
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTAnyallOption">XPath Full Text 1.0 (REC) FTAnyallOption</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTUnit">XPath Full Text 1.0 (REC) FTUnit</a>
     * @see <a href="https://www.w3.org/TR/2011/REC-xpath-full-text-10-20110317/#prod-xpath20-FTStopWordOption">XPath Full Text 1.0 (REC) FTStopWordOption</a>
     */
    val KWords: KeywordTokenType
}

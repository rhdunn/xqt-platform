// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.test.xml.model

import kotlinx.test.DisplayName
import xqt.platform.xml.lexer.Digit
import xqt.platform.xml.model.XmlChar
import xqt.platform.xml.model.XmlCharReader
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("An XmlCharReader can be initialized")
class AnXmlCharReaderCanBeInitialized {
    @Test
    @DisplayName("from the default constructor")
    fun from_the_default_constructor() {
        val reader = XmlCharReader()

        assertEquals("", reader.buffer)
        assertEquals(0, reader.currentOffset)
        assertEquals(0, reader.bufferEndOffset)
    }

    @Test
    @DisplayName("from reset with a buffer")
    fun from_reset_with_a_buffer() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum dolor")

        assertEquals("lorem ipsum dolor", reader.buffer)
        assertEquals(0, reader.currentOffset)
        assertEquals(17, reader.bufferEndOffset)
    }

    @Test
    @DisplayName("from reset with a buffer and start offset")
    fun from_reset_with_a_buffer_and_start_offset() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum dolor", 6)

        assertEquals("lorem ipsum dolor", reader.buffer)
        assertEquals(6, reader.currentOffset)
        assertEquals(17, reader.bufferEndOffset)
    }

    @Test
    @DisplayName("from reset with a buffer, an end offset, and start offset")
    fun from_reset_with_a_buffer_an_end_offset_and_start_offset() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum dolor", 6, 11)

        assertEquals("lorem ipsum dolor", reader.buffer)
        assertEquals(6, reader.currentOffset)
        assertEquals(11, reader.bufferEndOffset)
    }
}

@DisplayName("An XmlCharReader can read XmlChar values")
class AnXmlCharReaderCanReadXmlCharValues {
    @Test
    @DisplayName("from an empty buffer")
    fun from_an_empty_buffer() {
        val reader = XmlCharReader()
        reader.reset("")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(0, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a sequence of ASCII characters")
    fun from_a_sequence_of_ascii_characters() {
        val reader = XmlCharReader()
        reader.reset("lorem")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar('l'), reader.currentChar)

        reader.advance()
        assertEquals(1, reader.currentOffset)
        assertEquals(XmlChar('o'), reader.currentChar)

        reader.advance()
        assertEquals(2, reader.currentOffset)
        assertEquals(XmlChar('r'), reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlChar('e'), reader.currentChar)

        reader.advance()
        assertEquals(4, reader.currentOffset)
        assertEquals(XmlChar('m'), reader.currentChar)

        reader.advance()
        assertEquals(5, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(5, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a sequence of Basic Multilingual Plane characters")
    fun from_a_sequence_of_basic_multilingual_plane_characters() {
        val reader = XmlCharReader()
        reader.reset("\u0301\u0303\u0304")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar(0x0301), reader.currentChar)

        reader.advance()
        assertEquals(1, reader.currentOffset)
        assertEquals(XmlChar(0x0303), reader.currentChar)

        reader.advance()
        assertEquals(2, reader.currentOffset)
        assertEquals(XmlChar(0x0304), reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a sequence of Supplementary Multilingual Plane characters")
    fun from_a_sequence_of_supplementary_multilingual_plane_characters() {
        val reader = XmlCharReader()
        reader.reset("\uD83D\uDE01\uD83D\uDE03\uD83D\uDE04")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar(0x1F601), reader.currentChar)

        reader.advance()
        assertEquals(2, reader.currentOffset)
        assertEquals(XmlChar(0x1F603), reader.currentChar)

        reader.advance()
        assertEquals(4, reader.currentOffset)
        assertEquals(XmlChar(0x1F604), reader.currentChar)

        reader.advance()
        assertEquals(6, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(6, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a sequence of high surrogate codepoints")
    fun from_a_sequence_of_high_surrogate_codepoints() {
        val reader = XmlCharReader()
        reader.reset("\uD801\uD803\uD804")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar(0xD801), reader.currentChar)

        reader.advance()
        assertEquals(1, reader.currentOffset)
        assertEquals(XmlChar(0xD803), reader.currentChar)

        reader.advance()
        assertEquals(2, reader.currentOffset)
        assertEquals(XmlChar(0xD804), reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a sequence of low surrogate codepoints")
    fun from_a_sequence_of_low_surrogate_codepoints() {
        val reader = XmlCharReader()
        reader.reset("\uDC01\uDC03\uDC04")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar(0xDC01), reader.currentChar)

        reader.advance()
        assertEquals(1, reader.currentOffset)
        assertEquals(XmlChar(0xDC03), reader.currentChar)

        reader.advance()
        assertEquals(2, reader.currentOffset)
        assertEquals(XmlChar(0xDC04), reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }

    @Test
    @DisplayName("from a given range")
    fun from_a_given_range() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum dolor", 6, 11)

        assertEquals(6, reader.currentOffset)
        assertEquals(XmlChar('i'), reader.currentChar)

        reader.advance()
        assertEquals(7, reader.currentOffset)
        assertEquals(XmlChar('p'), reader.currentChar)

        reader.advance()
        assertEquals(8, reader.currentOffset)
        assertEquals(XmlChar('s'), reader.currentChar)

        reader.advance()
        assertEquals(9, reader.currentOffset)
        assertEquals(XmlChar('u'), reader.currentChar)

        reader.advance()
        assertEquals(10, reader.currentOffset)
        assertEquals(XmlChar('m'), reader.currentChar)

        reader.advance()
        assertEquals(11, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)

        reader.advance()
        assertEquals(11, reader.currentOffset)
        assertEquals(XmlCharReader.EndOfBuffer, reader.currentChar)
    }
}

@DisplayName("An XmlCharReader can")
class AnXmlCharReaderCan {
    @Test
    @DisplayName("read all characters matching a predicate")
    fun read_all_characters_matching_a_predicate() {
        val reader = XmlCharReader()
        reader.reset("123 456")

        assertEquals(0, reader.currentOffset)
        assertEquals(XmlChar('1'), reader.currentChar)

        reader.advanceWhile { it in Digit }
        assertEquals(3, reader.currentOffset)
        assertEquals(XmlChar(' '), reader.currentChar)
    }
}

// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.test.xml.model

import kotlinx.test.DisplayName
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

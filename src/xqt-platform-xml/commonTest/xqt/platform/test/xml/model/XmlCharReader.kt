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
        assertEquals(0, reader.bufferEndOffset)
    }

    @Test
    @DisplayName("from reset with a buffer")
    fun from_reset_with_a_buffer() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum")

        assertEquals("lorem ipsum", reader.buffer)
        assertEquals(11, reader.bufferEndOffset)
    }

    @Test
    @DisplayName("from reset with a buffer and end offset")
    fun from_reset_with_a_buffer_and_end_offset() {
        val reader = XmlCharReader()
        reader.reset("lorem ipsum", 5)

        assertEquals("lorem ipsum", reader.buffer)
        assertEquals(5, reader.bufferEndOffset)
    }
}

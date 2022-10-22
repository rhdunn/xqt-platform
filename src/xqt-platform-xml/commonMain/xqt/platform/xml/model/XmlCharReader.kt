// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml.model

/**
 * Creates a reader that enumerates the codepoints in a character sequence.
 */
class XmlCharReader {
    /**
     * Reset the reader to the specified character sequence.
     *
     * @param buffer The character sequence to read from.
     * @param startOffset The offset of the first codepoint in the buffer to read from.
     * @param bufferEndOffset The offset of the last codepoint in the buffer to read up to.
     */
    fun reset(buffer: CharSequence, startOffset: Int, bufferEndOffset: Int) {
        this.buffer = buffer
        this.currentOffset = startOffset
        this.bufferEndOffset = bufferEndOffset
    }

    /**
     * Reset the reader to the specified character sequence.
     *
     * @param buffer The character sequence to read from.
     * @param startOffset The offset of the first codepoint in the buffer to read from.
     */
    fun reset(buffer: CharSequence, startOffset: Int = 0): Unit = reset(buffer, startOffset, buffer.length)

    /**
     * The underlying UTF-16 character sequence.
     */
    var buffer: CharSequence = ""
        private set

    /**
     * The end of the buffer, or the point to read up to.
     */
    var bufferEndOffset: Int = 0
        private set

    /**
     * The offset of the current XmlChar in the buffer.
     */
    var currentOffset: Int = 0
        private set
}

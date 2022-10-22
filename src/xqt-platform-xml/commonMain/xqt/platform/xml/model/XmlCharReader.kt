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
        this.nextOffset = startOffset
        this.bufferEndOffset = bufferEndOffset
        advance()
    }

    /**
     * Reset the reader to the specified character sequence.
     *
     * @param buffer The character sequence to read from.
     * @param startOffset The offset of the first codepoint in the buffer to read from.
     */
    fun reset(buffer: CharSequence, startOffset: Int = 0): Unit = reset(buffer, startOffset, buffer.length)

    /**
     * Advance to the next XmlChar in the buffer.
     */
    fun advance() {
        currentOffset = nextOffset
        if (currentOffset == bufferEndOffset) {
            currentChar = EndOfBuffer
            return
        }

        val high = buffer[nextOffset]
        if (high.code in HighSurrogate && nextOffset + 1 != bufferEndOffset) {
            val low = buffer[nextOffset + 1]
            if (low.code in LowSurrogate) {
                currentChar = XmlChar(high, low)
                nextOffset += 2
                return
            }
        }

        currentChar = XmlChar(high)
        nextOffset += 1
    }

    /**
     * Advances to the next XmlChar in the buffer that does not match the predicate.
     *
     * This can be used to implement `T+` and `T*` constructs in lexical tokens.
     * For example, the lexical token:
     *
     *     Digits := [0-9]+
     *
     * can be implemented as:
     *
     *     if (reader.currentChar in Digit) {
     *         reader.advanceWhile { it in Digit }
     *     }
     */
    fun advanceWhile(predicate: (XmlChar) -> Boolean) {
        while (predicate(currentChar))
            advance()
    }

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

    /**
     * The value of the current XmlChar in the buffer.
     */
    var currentChar: XmlChar = EndOfBuffer
        private set

    private var nextOffset: Int = 0

    companion object {
        /**
         * Represents the end of the character sequence.
         */
        val EndOfBuffer: XmlChar = XmlChar(-1)

        private val HighSurrogate = 0xD800..0xDBFF
        private val LowSurrogate = 0xDC00..0xDFFF
    }
}

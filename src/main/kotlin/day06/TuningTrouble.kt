package day06

import readInput

class TuningTrouble(
    private val name: String
) {
    private fun readBuffers(): List<String> {
        return readInput(name)
    }

    private fun findMarkers(length: Int): List<Int> {
        return readBuffers().map { buffer ->
            var marker = length
            while (marker < buffer.length - 1) {
                val size = buffer.slice(IntRange(marker - length, marker - 1)).toSet().size
                if (size == length) {
                    break
                }
                marker += 1
            }
            return@map marker
        }
    }

    fun part1(): List<Int> {
        return findMarkers(4)
    }

    fun part2(): List<Int> {
        return findMarkers(14)
    }
}

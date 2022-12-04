package day04

import readInput
import kotlin.math.max
import kotlin.math.min

class CampCleanup(
    private val name: String
) {

    private fun readAssignments(): List<Assignment> {
        return readInput(name).map { pair ->
            val (left, right) = pair.split(",")
                .map { section ->
                    val (start, end) = section.split("-").map { it.toInt() }
                    Section(start, end)
                }
            Assignment(left, right)
        }
    }

    fun part1(): Int {
        return readAssignments()
            .filter { it.isFullyContained }
            .size
    }

    fun part2(): Int {
        return readAssignments()
            .filter { it.isOverlap }
            .size
    }
}

data class Section(
    val start: Int,
    val end: Int,
) {
    fun contains(other: Section): Boolean {
        return start <= other.start && end >= other.end
    }

    fun overlap(other: Section): Boolean {
        val maxStart = max(start, other.start)
        val minEnd = min(end, other.end)

        return maxStart <= minEnd
    }
}

data class Assignment(
    val left: Section,
    val right: Section
) {
    val isFullyContained: Boolean
        get() {
            return left.contains(right) || right.contains(left)
        }

    val isOverlap: Boolean
        get() = left.overlap(right)

}

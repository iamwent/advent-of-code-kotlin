package day04

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CampCleanupTest {

    private val name = "Day04_test"

    @Test
    fun part1() {
        val campCleanup = CampCleanup(name)
        assertEquals(2, campCleanup.part1())
    }

    @Test
    fun part2() {
        val campCleanup = CampCleanup(name)
        assertEquals(4, campCleanup.part2())
    }
}

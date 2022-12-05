package day05

import day04.CampCleanup
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SupplyStacksTest {

    private val name = "Day05_test"

    @Test
    fun part1() {
        val supplyStacks = SupplyStacks(name)
        assertEquals("CMZ", supplyStacks.part1())
    }

    @Test
    fun part2() {
        val supplyStacks = SupplyStacks(name)
        assertEquals("MCD", supplyStacks.part2())
    }
}

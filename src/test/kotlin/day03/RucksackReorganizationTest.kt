package day03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RucksackReorganizationTest {

    private val name = "Day03_test"

    @Test
    fun part1() {
        val reorganization = RucksackReorganization(name)
        assertEquals(157, reorganization.part1())
    }

    @Test
    fun part2() {
        val reorganization = RucksackReorganization(name)
        assertEquals(70, reorganization.part2())
    }

}

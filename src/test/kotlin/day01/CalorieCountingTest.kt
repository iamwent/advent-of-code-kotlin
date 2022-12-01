package day01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalorieCountingTest {

    private val name = "Day01_test"

    @Test
    fun part1() {
        val calorieCounting = CalorieCounting(name)
        assertEquals(24000, calorieCounting.part1())
    }

    @Test
    fun part2() {
        val calorieCounting = CalorieCounting(name)
        assertEquals(45000, calorieCounting.part2())
    }
}

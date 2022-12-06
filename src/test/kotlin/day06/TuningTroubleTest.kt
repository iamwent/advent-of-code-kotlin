package day06

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TuningTroubleTest {

    private val name = "Day06_test"

    @Test
    fun part1() {
        val tuningTrouble = TuningTrouble(name)
        assertEquals(listOf(7, 5, 6, 10, 11), tuningTrouble.part1())
    }

    @Test
    fun part2() {
        val tuningTrouble = TuningTrouble(name)
        assertEquals(listOf(19, 23, 23, 29, 26), tuningTrouble.part2())
    }
}

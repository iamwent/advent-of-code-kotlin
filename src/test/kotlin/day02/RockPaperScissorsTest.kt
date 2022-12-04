package day02

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RockPaperScissorsTest {

    private val name = "Day02_test"

    @Test
    fun part1() {
        val rps = RockPaperScissors(name)
        assertEquals(15, rps.part1())
    }

    @Test
    fun part2() {
        val rps = RockPaperScissors(name)
        assertEquals(12, rps.part2())
    }
}

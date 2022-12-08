package day08

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TreetopTreeHouseTest {

    private val name = "Day08_test"

    @Test
    fun part1() {
        val treetopTreeHouse = TreetopTreeHouse(name)
        assertEquals(21, treetopTreeHouse.part1())
    }

    @Test
    fun part2() {
        val treetopTreeHouse = TreetopTreeHouse(name)
        assertEquals(8, treetopTreeHouse.part2())
    }
}

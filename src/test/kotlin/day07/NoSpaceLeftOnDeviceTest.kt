package day07

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NoSpaceLeftOnDeviceTest {

    private val name = "Day07_test"

    @Test
    fun part1() {
        val device = NoSpaceLeftOnDevice(name)
        assertEquals(95437L, device.part1())
    }

    @Test
    fun part2() {
        val device = NoSpaceLeftOnDevice(name)
        assertEquals(24933642L, device.part2())
    }
}

package day01

import readText

class CalorieCounting(
    private val name: String
) {

    fun part1(): Int {
        return readCalories().max()
    }

    fun part2(): Int {
        return readCalories().sortedDescending().take(3).sum()
    }

    private fun readCalories(): List<Int> {
        return readText(name).split("\n\n")
            .map { calories -> calories.split("\n").sumOf { it.toInt() } }
    }
}

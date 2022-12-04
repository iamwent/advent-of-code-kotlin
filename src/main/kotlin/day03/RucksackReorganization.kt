package day03

import readInput

class RucksackReorganization(
    private val name: String
) {

    private fun rucksack(): List<String> {
        return readInput(name)
    }

    private fun getPriority(char: Char): Int {
        return if (char >= 'a') char - 'a' + 1 else char - 'A' + 27
    }

    fun part1(): Int {
        return rucksack()
            .map { rucksack ->
                val (left, right) = rucksack.chunked(rucksack.length / 2).map { it.toSet() }
                left.intersect(right)
            }
            .flatten()
            .sumOf { getPriority(it) }
    }

    fun part2(): Int {
        return rucksack().chunked(3)
            .map { group ->
                group.map { it.toSet() }.reduce { acc, chars -> acc.intersect(chars) }
            }
            .flatten()
            .sumOf { getPriority(it) }
    }

}

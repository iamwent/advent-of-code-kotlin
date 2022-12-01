fun main() {
    fun part1(calories: List<Int>): Int {
        return calories.max()
    }

    fun part2(calories: List<Int>): Int {
        return calories.sortedDescending().take(3).sum()
    }

    fun readCalories(name: String): List<Int> {
        return readText(name).split("\n\n")
            .map { calories -> calories.split("\n").sumOf { it.toInt() } }
    }

    // test if implementation meets criteria from the description, like:
    val testCalories = readCalories("Day01_test")
    check(part1(testCalories) == 24000)
    check(part2(testCalories) == 45000)

    val input = readCalories("Day01")
    println(part1(input))
    println(part2(input))
}

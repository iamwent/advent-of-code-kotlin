package day08

import readInput

class TreetopTreeHouse(
    private val name: String
) {

    private fun readMap(): List<List<Int>> {
        return readInput(name).map { it.map { height -> height.digitToInt() } }
    }

    fun part1(): Int {
        val map = readMap()
        val width = map.first().size
        val height = map.size

        fun isVisible(x: Int, y: Int): Boolean {
            val horizontal = listOf(map[y].slice(0 until x), map[y].slice((x + 1) until width))
            val vertical = listOf(0 until y, (y + 1) until height)
                .map { ys -> ys.map { map[it][x] } }
            return (horizontal + vertical).any { it.all { height -> height < map[y][x] } }
        }

        val interior = (1 until (width - 1))
            .flatMap { x -> (1 until (height - 1)).map { y -> x to y } }
            .filter { (x, y) -> isVisible(x, y) }
            .size

        return interior + width * 2 + (height - 2) * 2
    }

    fun part2(): Int {
        val map = readMap()
        val width = map.first().size
        val height = map.size

        fun scenicScore(x: Int, y: Int): Int {
            val horizontal = listOf(map[y].slice(0 until x).reversed(), map[y].slice((x + 1) until width))
            val vertical = listOf(y - 1 downTo 0, (y + 1) until height).map { ys -> ys.map { map[it][x] } }

            return (horizontal + vertical)
                .map { trees ->
                    val distance = trees.indexOfFirst { it >= map[y][x] }
                    return@map if (distance == -1) {
                        trees.size
                    } else {
                        distance + 1
                    }
                }
                .reduce(Int::times)
        }

        return (1 until (width - 1))
            .flatMap { x -> (1 until (height - 1)).map { y -> x to y } }
            .maxOf { (x, y) -> scenicScore(x, y) }
    }
}

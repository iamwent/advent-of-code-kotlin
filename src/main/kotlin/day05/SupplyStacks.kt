package day05

import readText
import java.util.*

class SupplyStacks(
    private val name: String
) {

    private fun read(): Pair<List<Stack<Char>>, List<Step>> {
        val (stacks, steps) = readText(name).split("\n\n")
        return readStacks(stacks) to readSteps(steps)
    }

    private fun readStacks(input: String): List<Stack<Char>> {
        val crateIndex = mutableListOf<Int>()
        val result = mutableListOf<Stack<Char>>()

        input.split("\n")
            .asReversed()
            .forEachIndexed { i, stack ->
                if (i == 0) {
                    stack.forEachIndexed { index, char ->
                        if (char.isDigit()) {
                            crateIndex.add(index)
                            result.add(Stack<Char>())
                        }
                    }
                    return@forEachIndexed
                }

                crateIndex.forEachIndexed { index, i ->
                    if (stack.length > i && stack[i].isLetter()) {
                        result[index].push(stack[i])
                    }
                }
            }

        return result
    }

    private fun readSteps(steps: String): List<Step> {
        return steps.split("\n")
            .map { step ->
                val (moves, from, to) = step.split(" ")
                    .chunked(2)
                    .map { it.last().toInt() }
                return@map Step(moves, from, to)
            }
    }

    fun part1(): String {
        val (stacks, steps) = read()

        steps.forEach { step ->
            repeat(step.moves) {
                val crate = stacks[step.from - 1].pop()
                stacks[step.to - 1].push(crate)
            }
        }

        return stacks.map { it.peek() }.joinToString("")
    }

    fun part2(): String {
        val (stacks, steps) = read()

        val temp = Stack<Char>()
        steps.forEach { step ->
            repeat(step.moves) {
                val crate = stacks[step.from - 1].pop()
                temp.push(crate)
            }
            repeat(step.moves) {
                val crate = temp.pop()
                stacks[step.to - 1].push(crate)
            }
        }

        return stacks.map { it.peek() }.joinToString("")
    }
}

data class Step(
    val moves: Int,
    val from: Int,
    val to: Int
)

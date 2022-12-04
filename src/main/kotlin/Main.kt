import day01.CalorieCounting
import day02.RockPaperScissors
import day03.RucksackReorganization
import day04.CampCleanup

fun main() {
    println("--- Day 1: Calorie Counting ---")
    val calorieCounting = CalorieCounting("Day01")

    println("How many total Calories is that Elf carrying? ${calorieCounting.part1()}")
    println("How many Calories are those Elves carrying in total? ${calorieCounting.part2()}")

    println("\n--- Day 2: Rock Paper Scissors ---\n")
    val rps = RockPaperScissors("Day02")
    println("What would your total score be if everything goes exactly according to your strategy guide? ${rps.part1()}")
    println("what would your total score be if everything goes exactly according to your strategy guide? ${rps.part2()}")

    println("\n--- Day 3: Rucksack Reorganization ---\n")
    val rr = RucksackReorganization("Day03")
    println("What is the sum of the priorities of those item types? ${rr.part1()}")
    println("What is the sum of the priorities of those item types? ${rr.part2()}")

    println("\n--- Day 4: Camp Cleanup ---\n")
    val cc = CampCleanup("Day04")
    println("In how many assignment pairs does one range fully contain the other? ${cc.part1()}")
    println("In how many assignment pairs do the ranges overlap? ${cc.part2()}")
}

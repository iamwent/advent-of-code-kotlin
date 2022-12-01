import day01.CalorieCounting

fun main() {
    println("--- Day 1: Calorie Counting ---")
    val calorieCounting = CalorieCounting("Day01")

    println("How many total Calories is that Elf carrying? ${calorieCounting.part1()}")
    println("How many Calories are those Elves carrying in total? ${calorieCounting.part2()}")
}

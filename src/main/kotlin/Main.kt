import day01.CalorieCounting
import day02.RockPaperScissors
import day03.RucksackReorganization
import day04.CampCleanup
import day05.SupplyStacks
import day06.TuningTrouble
import day07.NoSpaceLeftOnDevice
import day08.TreetopTreeHouse

fun main() {
    println("--- Day 1: Calorie Counting ---")
    val calorieCounting = CalorieCounting("Day01")

    println("How many total Calories is that Elf carrying? ${calorieCounting.part1()}")
    println("How many Calories are those Elves carrying in total? ${calorieCounting.part2()}")

    println("\n--- Day 2: Rock Paper Scissors ---")
    val rps = RockPaperScissors("Day02")
    println("What would your total score be if everything goes exactly according to your strategy guide? ${rps.part1()}")
    println("what would your total score be if everything goes exactly according to your strategy guide? ${rps.part2()}")

    println("\n--- Day 3: Rucksack Reorganization ---")
    val rr = RucksackReorganization("Day03")
    println("What is the sum of the priorities of those item types? ${rr.part1()}")
    println("What is the sum of the priorities of those item types? ${rr.part2()}")

    println("\n--- Day 4: Camp Cleanup ---")
    val cc = CampCleanup("Day04")
    println("In how many assignment pairs does one range fully contain the other? ${cc.part1()}")
    println("In how many assignment pairs do the ranges overlap? ${cc.part2()}")

    println("\n--- Day 5: Supply Stacks ---")
    val ss = SupplyStacks("Day05")
    println("After the rearrangement procedure completes, what crate ends up on top of each stack? ${ss.part1()}")
    println("After the rearrangement procedure completes, what crate ends up on top of each stack? ${ss.part2()}")

    println("\nDay 6: Tuning Trouble")
    val tt = TuningTrouble("Day06")
    println("How many characters need to be processed before the first start-of-packet marker is detected? ${tt.part1()}")
    println("How many characters need to be processed before the first start-of-packet marker is detected? ${tt.part2()}")

    println("\nDay 7: No Space Left On Device")
    val nslod = NoSpaceLeftOnDevice("Day07")
    println("What is the sum of the total sizes of those directories? ${nslod.part1()}")
    println("What is the total size of that directory? ${nslod.part2()}")

    println("\nDay 8: Treetop Tree House")
    val tth = TreetopTreeHouse("Day08")
    println("How many trees are visible from outside the grid? ${tth.part1()}")
    println("What is the highest scenic score possible for any tree? ${tth.part2()}")
}

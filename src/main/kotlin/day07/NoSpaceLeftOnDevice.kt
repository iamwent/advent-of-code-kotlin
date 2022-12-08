package day07

import readInput

class NoSpaceLeftOnDevice(
    private val name: String
) {

    private fun readDirectories(): Directory {
        var root = Directory("/")
        var pwd: Directory? = root
        return readInput(name)
            .drop(1)
            .fold(root) { acc, line ->
                when {
                    line == "\$ ls" -> {

                    }

                    line == "\$ cd .." -> {
                        pwd = pwd?.parent
                    }

                    line.startsWith("dir") -> {
                        val chileName = line.split(" ").last()
                        pwd?.addDirectory(Directory(chileName, pwd))
                    }

                    line.startsWith("\$ cd ") -> {
                        val childName = line.split(" ").last()
                        pwd = pwd?.cd(childName)
                    }

                    else -> {
                        val (size, name) = line.split(" ")
                        pwd?.addFile(File(size.toLong(), name))
                    }
                }

                acc
            }
    }

    private fun total(directory: Directory, max: Long): Long {
        val mySize = if (directory.size > max) 0 else directory.size
        val children = directory.children.sumOf { total(it, max) }
        return children + mySize
    }

    fun part1(): Long {
        return total(readDirectories(), 100000L)
    }

    fun part2(): Long {
        val root = readDirectories()
        val threshold = 30000000L - (70000000L - root.size)
        return root.sizes().sorted().first { it >= threshold }
    }
}

class Directory(
    val name: String,
    val parent: Directory? = null,
) {

    val children = mutableListOf<Directory>()

    val files = mutableListOf<File>()

    val size: Long
        get() = children.sumOf { it.size } + files.sumOf { it.size }

    fun addDirectory(child: Directory) {
        children.add(child)
    }

    fun addFile(file: File) {
        files.add(file)
    }

    fun cd(name: String): Directory {
        return children.first { it.name == name }
    }

    fun sizes(): List<Long> {
        return children.map { it.sizes() }.flatten() + size
    }
}

data class File(
    val size: Long,
    val name: String,
)

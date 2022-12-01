import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = file("$name.txt")
    .readLines()

fun readText(name: String): String = file("$name.txt").readText()

fun file(name: String): File {
    val path = ClassLoader.getSystemResource(name).file
    return File(path)
}

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

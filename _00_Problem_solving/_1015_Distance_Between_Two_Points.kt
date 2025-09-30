package _00_Problem_solving

import kotlin.math.*
fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toDouble()}
    val (x2, y2) = readLine()!!.split(" ").map { it.toDouble()}

    val first = (x2 - x1) * (x2 - x1)
    val second = (y2 - y1) * (y2 - y1)

    val distance = sqrt(first + second)

    println("%.4f".format(distance))
}
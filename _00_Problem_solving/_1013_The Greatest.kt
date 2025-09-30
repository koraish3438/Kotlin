package _00_Problem_solving

import kotlin.math.*

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    val formula1 = (a + b + abs(a - b)) / 2
    val formula2 = (formula1 + c + abs(formula1 - c)) / 2

    println("$formula2 eh o maior")
}
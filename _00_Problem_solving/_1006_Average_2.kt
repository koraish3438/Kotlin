package _00_Problem_solving

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()

    val avg = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5)
    println("MEDIA = %.1f".format(avg))
}
package _00_Problem_solving

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()

    val avg = (a * 3.5 + b * 7.5) / (3.5 + 7.5)
    println("MEDIA = %.5f".format(avg))
}
package _00_Problem_solving

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val r = sc.nextInt()
    val pi = 3.14159
    val formula = (4.0 / 3) * pi * r * r * r

    println("VOLUME = %.3f".format(formula))
}
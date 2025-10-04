package _00_Problem_solving
import kotlin.math.*

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

    val formula1 = b * b - 4 * a * c
    val formula2 = sqrt(b * b - 4 * a * c)

    val r1 = (- b + formula2) / (2 * a)

    val r2 = (- b - formula2) / (2 * a)


    if (a == 0.0 || formula1 < 0) {
        println("Impossivel calcular")
    }
    else {
        println("R1 = %.5f".format(r1))

        println("R2 = %.5f".format(r2))
    }
}
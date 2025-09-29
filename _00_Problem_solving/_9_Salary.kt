package _00_Problem_solving

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val monthDay = sc.nextInt()
    val time = sc.nextInt()
    val amountPerHour = sc.nextDouble()

    val salary = time * amountPerHour

    println("NUMBER = $monthDay")
    println("SALARY = U\$ %.2f".format(salary))
}
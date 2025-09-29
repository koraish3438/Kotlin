package _00_Problem_solving

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val name = sc.next()
    val salary = sc.nextDouble()
    val sell = sc.nextDouble()

    val percent = (sell * 15) / 100

    val finalSalary = salary + percent

    println("TOTAL = R\$ %.2f".format(finalSalary))
}
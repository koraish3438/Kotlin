package _00_Problem_solving

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toDouble()

    val distance = x / y

    println("%.3f km/l".format(distance))
}
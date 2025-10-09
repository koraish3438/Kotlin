package _00_Problem_solving

fun calculate (n: Int) {
    for (i in 1 .. n) {
        println("$i ${i * i} ${i * i * i}")
    }
}

fun main() {
    val n = readLine()!!.toInt()
    calculate(n)
}
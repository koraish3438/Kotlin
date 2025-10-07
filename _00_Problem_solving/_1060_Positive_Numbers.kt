package _00_Problem_solving

fun main() {
    var count = 0
    for (i in 1 .. 6) {
        val n = readLine()!!.toDouble()

        if (n > 0) {
            count++
        }
    }
    println("$count valores positivos")
}
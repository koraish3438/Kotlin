package _00_Problem_solving

fun main() {
    var i = 1
    while (i == 1) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        if (x == y) {
            break
        }
        else if (x < y) {
            println("Crescente")
        }
        else {
            println("Decrescente")
        }
    }
}
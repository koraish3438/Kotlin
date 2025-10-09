package _00_Problem_solving

fun pum (n: Int) {
    var num = 1
    for (i in 1 .. n) {
        println("$num ${num + 1} ${num + 2} PUM")
        num += 4
    }
}

fun main() {
    val n = readLine()!!.toInt()
    pum(n)
}
package _00_Problem_solving

fun printValue(x: Int, y: Int) {
    for (i in 1 .. y) {
        if(i % x == 0) {
            println(i)
        }
        else {
            print("$i ")
        }
    }
}

fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    printValue(x, y)
}
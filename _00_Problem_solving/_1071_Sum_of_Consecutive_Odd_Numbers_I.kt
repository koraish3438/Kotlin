package _00_Problem_solving

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    var sum = 0

    if (x < y) {
        for (i in  x until y) {
            if (i % 2 != 0) {
                sum += i
            }
        }
    }
    else{
        for (i in x - 1 downTo y + 1) {
            if (i % 2 != 0) {
                sum += i
            }
        }
    }

    println(sum)
}
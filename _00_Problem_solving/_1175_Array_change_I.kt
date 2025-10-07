package _00_Problem_solving

fun main() {
    val arr = IntArray(20)

    for (i in 0 until 20) {
        val input = readLine()
        arr[i] = input?.toIntOrNull() ?: 0
    }
    var j = 0
    var k = 19
    while (j < k) {
        var temp = arr[j]
        arr[j] = arr[k]
        arr[k] = temp
        j++
        k--
    }

    for (l in 0 until 20) {
        println("N[$l] = ${arr[l]}")
    }
}
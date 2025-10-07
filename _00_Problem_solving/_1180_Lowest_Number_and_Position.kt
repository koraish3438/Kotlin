package _00_Problem_solving

fun main() {
    val n = readLine()!!.toInt()

    var arr = IntArray(1000)

    val input = readLine()!!.trim()
    var numberOfList = input.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }

    for (i in 0 until n) {
        arr[i] = numberOfList[i]
    }

    var lowerValue = arr[0]
    var index = 0

    for (j in 1 until n){
        if (arr[j] < lowerValue) {
            lowerValue = arr[j]
            index = j
        }
    }

    println("Menor valor: $lowerValue")
    println("Posicao: $index")
}
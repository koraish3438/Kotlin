package _02_controlFlow._04_WhileLoop

fun main() {
    val arr = arrayOf(21,65,78,45,95,87,32,41)

    var index = 0
    val endPoint = arr.size

    while (index < endPoint) {
        println(arr[index])
        index++
    }
}
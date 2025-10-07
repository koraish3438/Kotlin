package _00_Problem_solving

fun main() {
//    val arr = arrayOfNulls<Double>(100)
//
//    for (i in 0 until 100) {
//        val input = readlnOrNull()
//        arr[i] = input!!.toDoubleOrNull()
//    }
//
//    for (j in 0 until 100) {
//        if (arr[j]!! >= -10 && arr[j]!! <= 10) {
//            println("A[$j] = ${arr[j]}")
//        }
//    }

    val arr = DoubleArray(100)

    for (i in 0 until 100) {
        val input = readLine()
        arr[i] = input?.toDoubleOrNull() ?: 0.0
    }

    for (j in arr.indices) {
        if (arr[j] <= 10) {
            println("A[$j] = ${arr[j]}")
        }
    }
}
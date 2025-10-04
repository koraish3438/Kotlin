package _00_Problem_solving

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }

//    if (b > c && d > a) {
//        if (c + d > a + b) {
//            if (c > 0 && d > 0) {
//                if (a % 2 == 0) {
//                   println("Valores aceitos")
//                }
//            }
//        }
//    }

    if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
        println("Valores aceitos")
    }
    else {
        println("Valores nao aceitos")
    }
}
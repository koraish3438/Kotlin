package _00_Problem_solving

fun main(args: Array<String>) {
    val a = readLine()!!.toDouble()

    if (a >= 0 && a <= 25) {
        println("Intervalo [0,25]")
    }
    else if (a > 25 && a <= 50) {
        println("Intervalo (25,50]")
    }
    else if (a > 50 && a <= 75) {
        println("Intervalo (50,75]")
    }
    else if (a > 75 && a <= 100) {
        println("Intervalo (75,100]")
    }
    else {
        println("Fora de intervalo")
    }
}
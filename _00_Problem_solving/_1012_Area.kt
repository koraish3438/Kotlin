package _00_Problem_solving

fun main() {
    val input = readLine()!!.split(" ")
    val a = input[0].toDouble()
    val b = input[1].toDouble()
    val c = input[2].toDouble()
    val pi = 3.14159

    val triangle = (a * c) / 2
    val circle = pi * c * c
    val trapezium = (((a + b) * c) / 2)
    val square = b * b
    val rectangle = a * b

    println("TRIANGULO: %.3f".format(triangle))
    println("CIRCULO: %.3f".format(circle))
    println("TRAPEZIO: %.3f".format(trapezium))
    println("QUADRADO: %.3f".format(square))
    println("RETANGULO: %.3f".format(rectangle))
}
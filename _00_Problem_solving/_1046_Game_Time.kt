package _00_Problem_solving

fun main(args: Array<String>) {
    var (startTime , endTime) = readLine()!!.split(" ").map { it.toInt() }

    var x = 0

    if (startTime < endTime) {
        x = endTime - startTime
    }
    else if (startTime > endTime) {
        x = (24 - startTime) + endTime
    }
    else if (startTime == endTime) {
        x = 24
    }

    println("O JOGO DUROU $x HORA(S)")
}
package _00_Problem_solving

fun main() {
    var count = 0
    var sum = 0.0

    for (i in 1..6) {
        var value = readLine()!!.toDouble()
        if (value > 0){
            count += 1
            sum += value
        }
    }

    if (count > 0) {
        val avg = sum / count
        println("$count valores positivos")
        println("%.1f".format(avg))
    }
}
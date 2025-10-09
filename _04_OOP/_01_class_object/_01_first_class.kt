package _04_OOP._01_class_object

class Pitha {
    var filling = ""
    var pices = 0

    fun displayInfo () {
        println("This Pitha made by $filling")
        println("There are $pices now")
    }
}

fun main() {
    val pitha = Pitha()

    pitha.filling = "coconut"
    pitha.pices = 50
    pitha.displayInfo()
}
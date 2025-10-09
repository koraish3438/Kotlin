package _04_OOP._02_constructor

class PrimaryConstructor(var brand: String, var model: String) {
    fun carInfo() {
        println(brand)
        println(model)
    }
}

fun main() {
    val pC = PrimaryConstructor("BMW", "X5")

    println(pC.brand)
    println(pC.model)
}
package _04_OOP._02_constructor

class SecondaryConstructor (var brand: String, var model: String, var year: Int = 2024) {
    constructor(brand: String, model: String): this(brand,model, 2025)

}

fun main() {
    val sC = SecondaryConstructor("BMW", "X5")

    println(sC.brand)
    println(sC.model)
    println(sC.year)
}
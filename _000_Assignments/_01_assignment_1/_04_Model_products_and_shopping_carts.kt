package _000_Assignments._01_assignment_1

abstract class Product(private var price: Int, private var quantity: Int) {
    fun getPrice() = price
    fun getQuantity() = quantity

    abstract fun getDiscountedPrice()
}

class Electronics(price: Int, quantity: Int): Product(price, quantity) {
    override fun getDiscountedPrice() {
        val totalPrice = getPrice() * getQuantity()
        val discountRate: Double = totalPrice * 0.20
        val discount = totalPrice - discountRate
        println("Your electronics product price with discount is : $discount")
    }
}

class Clothing(price: Int, quantity: Int): Product(price, quantity) {
    override fun getDiscountedPrice() {
        val totalPrice = getPrice() * getQuantity()
        val discountRate: Double = totalPrice * 0.10
        val discount = totalPrice - discountRate
        println("Your clothing product price with discount is : $discount")
    }
}

fun main() {
//    val eP: Product = Electronics(10000, 5)
//    val cP: Product = Clothing(5000, 10)
//
//    eP.getDiscountedPrice()
//
//    cP.getDiscountedPrice()

    val cart: List<Product> = listOf(Electronics(10000, 5), Clothing(5000, 10))

    for (i in cart) {
        i.getDiscountedPrice()
    }
}
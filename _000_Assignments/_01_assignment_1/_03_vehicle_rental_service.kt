package _000_Assignments._01_assignment_1

abstract class Vehicle (private var price: Int, private var isRental: Boolean) {
    fun getPrice() = price
    fun getStatus() = isRental

    abstract fun calculateRentalCost(days: Int)
}

class Car(price: Int, isRental: Boolean): Vehicle(price, isRental) {
    override fun calculateRentalCost(days: Int) {
        val perDay = 1000
        val rent = perDay * days
        println("Your rented Car price is : $rent")
    }
}

class Bike(price: Int, isRental: Boolean): Vehicle(price, isRental) {
    override fun calculateRentalCost(days: Int) {
        val perDay = 500
        val rent = perDay * days
        println("Your rented Bike price is : $rent")
    }
}

fun main() {
//    val vehicles: List<Vehicle> = listOf(
//        Car(1000000, "Yes"),
//        Bike(100000, "Yes")
//    )
//
//    for (v in vehicles) {
//        v.calculateRentalCost(10)
//    }

    val car: Vehicle = Car(1000000, true)
    val bike: Vehicle = Bike(100000, true)

    car.calculateRentalCost(30)

    bike.calculateRentalCost(10)
}
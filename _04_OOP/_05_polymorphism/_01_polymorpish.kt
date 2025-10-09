package _04_OOP._05_polymorphism

open class Animal {
    open fun sound() {
        println("Animal make sound")
    }
}

class Dog: Animal() {
    override fun sound() {
        println("Dog make sound")
    }
}

class Cat: Animal() {
    override fun sound() {
        println("Cat make sound")
    }
}

fun main() {
    val animal = Animal()
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    animal.sound()
    dog.sound()
    cat.sound()
}
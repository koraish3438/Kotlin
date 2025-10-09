package _04_OOP._03_inheritance

open class FirstClass {
    fun first () {
        println("Hello world 1")
    }
}

open class SecondClass : FirstClass() {
    fun second () {
        println("Hello world 2")
    }
}

class ThirdClass : SecondClass () {
    fun third () {
        println("Hello world 3")
    }
}

fun main() {

}
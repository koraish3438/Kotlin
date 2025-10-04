package _03_Functions

inline fun doSomething(action: () -> Unit) {
    println("Before Action")
    action()
    println("After action")
}

fun main() {
    doSomething{
        println("This is inline function")
    }
}
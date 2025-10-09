package _04_OOP._03_inheritance

open class Parent {
    val house = "Bogura"
    fun mySkill () {
        println("i am a Mobile Application Developer")
    }
}

class Child: Parent() {
    fun mySkills () {
        println("I am a learner")
    }
}

fun main() {
    val ob = Child()

    ob.mySkills()
    ob.mySkill()
    println(ob.house)
}
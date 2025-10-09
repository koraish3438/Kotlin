package _04_OOP._03_inheritance

interface Engine {
    fun startEngine()
}

interface MusicSystem {
    fun playMusic()
}

class BigCar : Engine, MusicSystem {
    override fun startEngine() {
        println("Start Engin")
    }

    override fun playMusic() {
        println("Play Music")
    }
}

fun main() {
    val car = BigCar()
    car.startEngine()
    car.playMusic()
}
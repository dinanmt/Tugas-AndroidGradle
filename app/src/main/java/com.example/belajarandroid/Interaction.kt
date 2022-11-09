package com.example.belajarandroid

interface Interaction {
    val name: String
    fun sayHai(name: String) {
        println("Hai $name, my name is ${this.name}")
    }
}

interface  Go : Interaction {
    fun go(){
        println("Go!")
    }
}

interface  MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
//class Human(override val name: String) : Interaction, Go {
//    override
//    fun sayHai(name: String) {
//        println("Hai $name, my name is ${this.name}")
}


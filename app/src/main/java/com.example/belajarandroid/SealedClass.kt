package com.example.belajarandroid

fun operation(
    value: Int,
    value2: Int, operation: Operation
):
        Int {
    return when (operation) {
        is Plus -> value + value2
        is Minus -> value - value2
        is Modulo -> value % value2

    }
}

fun main() {
    println(operation(1,2, Plus()))
    println(operation(10,5, Minus()))
    println(operation(20,3, Modulo()))

}
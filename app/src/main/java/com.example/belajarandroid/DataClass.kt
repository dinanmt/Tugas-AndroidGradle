package com.example.belajarandroid

fun main() {
    val product = Product(
        "Cimory",
        8000,
        "Minuman"
    )
//    println(product)

    val product2 = product.copy(name = "Ultramilk")

    println(product)
    println(product2)
}
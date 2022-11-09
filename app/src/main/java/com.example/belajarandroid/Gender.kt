package com.example.belajarandroid

enum class Gender(val description:String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println(description)
    }
}
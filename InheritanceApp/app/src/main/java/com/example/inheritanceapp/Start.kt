package com.example.inheritanceapp

fun main() {
//    val obj1 = BaseClass()
//    obj1.coreValues()
//
//    val obj2 = Secondary()
//    obj2.role()
//
//    val obj3 = Tertiary()
//    obj3.role()

//    val frank = Offspring()
//    frank.archer()
//    frank.role()
//    frank.coreValues()
//    frank.sing()

    println("Please enter a number")
    var number: Int
    try {
        // error phone code you want to execute
        number = readln().toInt()
        println("User entered $number")
    } catch (e: Exception) {
        // What should happen when an error occurs
        println("Error ${e.message}")
    } finally {
        number = 0
    }

}
package com.example.inheritanceapp

class Offspring:Secondary(), Archer, Singer {
    override fun archer() {
        super.archer()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}
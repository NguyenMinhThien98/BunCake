package com.example.buncake.model

abstract class Robot: RobotActions{
    private var name : String = ""
    private var modelYear : String = ""

    constructor(name: String, modelYear: String){
        this.name = name
        this.modelYear = modelYear
    }

    fun walk() {
        println("This Robot is walking now")
    }

    fun speak(message: String) {
        println("$name says: $message")
    }

    fun getName(): String {
        return this.name
    }
}
package com.example.buncake.model

class FiringRobot : Robot {
    constructor(name: String, modelYear: String)
            : super(name, modelYear)
    fun firing(){
        println("This Robot ${getName()} is firing now")
    }

    override fun start() {
      println("This firing robot is started")
    }

    override fun stop() {
        println("This firing robot is stopped")
    }


}
package basics

import java.awt.Dimension

abstract class Shape(
    var name : String
) {

    constructor(name: String , vararg dimensions: Double) : this(name)

    init {
        println("i am the super class")
    }

    abstract fun area(): Double

    abstract fun perimetre(): Double

    fun changeName(newName: String){
        name= newName
    }
}
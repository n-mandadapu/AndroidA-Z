package basics

abstract class Shape(
    var name : String
) {
    init {
        println("i am the super class")
    }

    abstract fun area(): Double

    abstract fun perimetre(): Double

    fun changeName(newName: String){
        name= newName
    }
}
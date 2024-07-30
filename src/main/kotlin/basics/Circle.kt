package basics

import kotlin.random.Random

class NegativeRadiusException : Exception("cant create a circle with negative radius")

class Circle(
    val radius : Double
) :Shape("Circle"){

    //val pi =3.141 only used by the circle class so should be only visible to circle class , shouldnt be accesseble by other classes
    //private val pi =3.141 // cannot be accesses by other classes
    //every time we create a class of the circle a value of pi is created for that object in memory instead we can use singleton objects

    companion object { //to make the class behave like singleton object just for a function or variables
        fun randomCircle(): Circle{ //this function doesnt need a object to be created to call it , also we cant use this method with the regular objects of Circle
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init{
        if (radius<0.0){
            throw NegativeRadiusException()
        }
        println("$name created with radius : $radius")
        println("area of the $name = ${area()}")
        println("perimetre of the $name = ${perimetre()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimetre() = 2 * radius * ImportantNumbers.PI
}
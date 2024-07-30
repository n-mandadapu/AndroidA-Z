package basics

class Circle(
    val radius : Double
) :Shape("Circle"){

    //val pi =3.141 only used by the circle class so should be only visible to circle class , shouldnt be accesseble by other classes
    //private val pi =3.141 // cannot be accesses by other classes
    //every time we create a class of the circle a value of pi is created for that object in memory instead we can use singleton objects


    init{
        println("$name created with radius : $radius")
        println("area of the $name = ${area()}")
        println("perimetre of the $name = ${perimetre()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimetre() = 2 * radius * ImportantNumbers.PI
}
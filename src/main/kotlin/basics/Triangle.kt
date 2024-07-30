package basics

import kotlin.math.sqrt

class Triangle(
   val a : Double,
   val b : Double,
   val c : Double
) :Shape("Triangle"){
    val p = perimetre()
    init{
        println("$name created with sides $a, $b, and $c")
        println("area of the $name is ${area()}")
        println("area of the $name is ${this.perimetre()}")
    }

    override fun perimetre() = a+b+c

    override fun area() = sqrt((p/2)*((p/2)-a)*((p/2)-b)*((p/2)-c))

}
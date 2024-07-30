package basics

import kotlin.random.Random

class Rectangle(//primary constructor
    val a:Double,
    val b:Double
) : Shape("Rectangle"){

    constructor(a: Double) : this(a,a)  //secondary constructor : making Square

    constructor(a: Int , b: Int) : this(a.toDouble(),b.toDouble()) // //secondary constructor : making Rectangle with integer

    companion object{
        fun randomRectangle() : Rectangle{
            val a = Random.nextDouble(10.0)
            val b = Random.nextDouble(10.0)
            return Rectangle(a,b)
        }
    }

    init {  // gets called when ever object is created
        println("$name created with a=$a and b=$b")
    }

    fun isSquare()= a==b

    override fun area(): Double {
        return a*b
    }

    override fun perimetre(): Double {
        return 2*(a+b)
    }

}
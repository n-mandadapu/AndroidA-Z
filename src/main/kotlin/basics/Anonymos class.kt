package basics

fun main(){
    val a= 3.0
    val b=4.0
    val hiegth = 2.0

    //we cannot instantiate an abstract class directly in Kotlin
    //for creating concise implementations of interfaces or extending classes on the fly
    val parllelogram = object : Shape("Parlellogram",a,b,hiegth){

        init {
            println("created the shape $name")
            println("area is : ${this.area()}")
            println("perimetre is : ${this.perimetre()}")
            println("am i a rectangle : ${isRectangle()}")
        }
        override fun area(): Double {
            return a*hiegth
        }

        override fun perimetre(): Double {
            return 2*(a+b)
        }

        fun isRectangle(): Boolean= hiegth==b
    }
}
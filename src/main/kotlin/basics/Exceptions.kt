package basics

fun main(){
    val division  = try {
        divide(5.0,0.0)
    }catch (e: DivideByZeroException){
       0.0
        //{println("you cant divide by zer")}
    }finally {
        println("Finally block")
    }
    println("result of Division = $division ")


    val input = try {
        readLine()?.toInt()
    }catch (e: NumberFormatException){
        0
       // println("doesnt seems like a number")
    }finally {
        println("this is finally")
    }
    println("input : $input")
}

class DivideByZeroException : Exception("You cant divide a number by a 0")

fun divide(a:Double,b:Double):Double{
    if (b==0.0){
        throw DivideByZeroException()
    }
    return a/b
}
package basics

fun main(){
    printPow(3,4)
}

fun multiplication(a:Int , b:Int)= a*b

fun printPow(base:Int,exponent:Int) : Int{
    var result=1
    for(i in 1..exponent){
        result *= base
    }
    print(result)
    return result
}
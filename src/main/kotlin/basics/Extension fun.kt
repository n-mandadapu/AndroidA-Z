package basics

fun main(){
    println("Please enter a number ")
    val input = readln()?.toInt()

    if(input!=null){
        if (input.isPrime()) {
            println("its a prime")
        }else{
            println("its not prime")
        }
    }
}

fun Int.isPrime(): Boolean{
    for(i in 2 until this -1){ //this refferes to the parametre
        if(this % i==0){
            return false
        }
    }
    return true
}
package basics

fun main(){
    val age = readln()?.toInt()

    when(age){
        in 0..5 ->println("Young kid")
        in 6..17 ->println("teenager")
        18->{
            println("You are 18 now")
            println("you are legally eligible")
        }
        19,20 -> println("Young adult")
        in 21..65 -> println("adult")
        else-> println("really old")
    }
}
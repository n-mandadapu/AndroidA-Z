package basics

fun main(){
    val userInput= readln() // always takes string
    //println(userInput?.uppercase()) //? here means userInput can me null, we cannot use function on null. ie if its null it prints null,or t it will call uppercase
    //println(userInput?.toInt() - 5) // doesnt work because if user inputs null we had to substract the 5 from null so we had to check the null manually
    if(userInput!=null)
        println(userInput.toInt() - 5) //it works howeveer if give anything otherthan number kotlin throws exception
}
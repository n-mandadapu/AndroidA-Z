package basics

fun main(){

    val myArray = arrayOf("hello","world","Kotlin")
    //val myArray = arrayOf(3,2,4,"hello","world")
    println(myArray)//prints [Ljava.lang.Integer;@4c873330 //print(myArray[3])-- 4th element of array
    val arrayLength= myArray.size
    var i=0
    while(i<arrayLength){
        println(myArray[i])
        i++
    }
    for (i in myArray){
        println(i)
    }
    for(i in 10 downTo 1 step 2){ // 1..5this is 1 to 5,we can do a to z by 'a'..'z' also you could do 10 downTo 1 step 2
        println(i)
    }

}
package basics

fun main(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val list1 = mutableListOf(1,2,3,"s")//can add or remove the elements in runtime

    array[0]=4 // arrays size cannot be changed
    // list[0]=4 list are immutavble , cant change the values
    list1.add(4)
    list1.remove(2)
    println(list1)//lists can be printed directly

}
package basics

fun main(){
//    var list =(1..20).toList()
//    println(list)
//    list =list.filter { it % 2 == 0 } // lamda functions are the function which take the fuctions as parametres
//    println(list)

    var triple =Triple<Int,String,Boolean>(3,"hello",true)
    var triple1 = Triple(3,"hello",true)

    val circle1 = Circle(5.0)
    val circle2 = Circle(7.0)
    val rectangle1= Rectangle(5.0)
    val rectangle2= Rectangle(4.0,5.5)
    val triangle1 = Triangle(4.0,4.0,5.0)
    val triangle2 = Triangle(4.0,4.0,5.0)

    var shapes = listOf(circle1,circle2,rectangle1,rectangle2,triangle2,triangle1)
    shapes = shapes.sortedBy { it.area() }.customFilter1{it.area()>20}
    for (shape in shapes){
        println("${shape.name} and its area is ${shape.area()}")
    }

}

fun <T : Shape> List<T>.customFilter1(filterFunction: (T)->(Boolean)): List<T>{ // now you can use this on any class types
    val resultList= mutableListOf<T>()
    for(item in this){
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}
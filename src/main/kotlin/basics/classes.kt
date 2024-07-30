package basics

fun main() {
    //default is public - can be accessisble from everywhere
    //private - can be accessible only form that particular class
    //protected - ca be accessisble from the inheririted children classes
    //we can make the methods and constructors private and protected
    val myRectangle = Rectangle(4.0,5.0)
    println("${myRectangle.name} area is ${myRectangle.area()}")
    println("${myRectangle.name} primetre is ${myRectangle.perimetre()}")
    println("is ${myRectangle.name} Square ? : ${myRectangle.isSquare()}")

    println("---------------------------------------------")

    val myCircle1= Circle(4.0)

    myCircle1.changeName("circle1")
    println(myCircle1.name)

    println("---------------------------------------------")
    val myCircle2= Circle(5.0)
    println(myCircle2.name)

    println("---------------------------------------------")

    val myTriangle = Triangle(4.0,5.0,6.0)

    //val myShape= Shape("Whatever") // we shoud not be able to do this because shape class only carries the property name but not the actual dimensions , this is where we shold use the abstract classes
}
package basics

fun main(){
    val array= intArrayOf(10,20,40)
    val max= getMax(1,2,3,4,5,6,*array,9,0,14)
    print(max)
}
fun getMax(vararg number: Int):Int{
    var max=number[0]
    for(i in number){
        if(i>max) {
            max = i
        }
    }
    return max
}
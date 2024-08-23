import java.util.Scanner

open interface demo{}

class KotlinClassDemo (val name: String, age:Int): demo{
    var age: Int
    init{
        this.age=age
    }
    constructor(age:Int) : this("Priya",age) {
        this.age=age
    }
}
fun main(){
//    val kotlinDemo = KotlinClassDemo("Ainsh", 22)
//    val kotlinDemo1 = KotlinClassDemo(23)
//    println(kotlinDemo.name +" "+ kotlinDemo.age)
//    //println(kotlinDemo)
//    println(kotlinDemo1.name+" "+kotlinDemo1.age)
    val s= Scanner(System.`in`)
    val n=s.nextInt()
    val arr:Array<IntArray> = Array(n,{IntArray(n)})
    println("Enter the elements:")
    for(i in arr.indices){
        for(j in arr[0].indices){
            arr[i][j]=s.nextInt()
        }
    }
    var sum:Int=0
    for(i in arr.indices){
        sum+=arr[i][i]
    }
    for(i in arr.indices){
        sum+=arr[i][arr.size-1-i]
    }
    if(arr.size%2!=0){
        val mid=arr.size/2
        sum-=arr[mid][mid]
        println(sum)
    }
    else{
        println(sum)
    }
}

//private operator fun Any.plus(s: String): Any {
//    return this.toString()+s
//}

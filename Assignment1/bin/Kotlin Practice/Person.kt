class Person(val name: String){
    val age:Int = 20
//    override fun toString():String{
//        return "Person(name=$name, age=$age)"
//    }
}

fun main(){
    val list= listOf(
        Person("Anish"),
        Person("Ankit"),
        Person("Aayush"),
        Person("Anurag"),
        Person("Ashwin")
    )

    val map= list.groupBy { it.age }
    println(map)
}


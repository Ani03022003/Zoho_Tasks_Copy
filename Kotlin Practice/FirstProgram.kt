fun max(a:Int,b:Int) = if(a>b) a else b

fun displaySeperator(char: Char='#', size: Int= 10 ){
    repeat(size) {
        println(char)
    }
}

fun main(){
    val a=30
    val b=20
    val big=when{
        a>b -> a
        else -> b
    }
    println(big)

    println(max(a,b))

    val c= mutableListOf(1,2,3,4,5,6,7,8,9)
    val d= listOf(1,2,3,4,5,6,7,8,9)

    println(listOf("1","2","3").joinToString(separator = "", prefix = "(", postfix = ")"))
    displaySeperator()
    println()
    displaySeperator(size=5, char='!')

    for((index,element) in d.withIndex()){
        println("$index: $element")
    }

    for(i in 9 until  1 step 2){
        print(i)
    }

    val e= mutableListOf(1,2,3,4,5,6,7,8,9)
    //val f: MutableList<> = mutableListOf()
    //f.add(e.map { it*it })
    println(e.none{it%2==0})
    //print(f)
    val f :Pair<List<Int>, List<Int>> = e.partition{it%2==0}
    println(f)
}
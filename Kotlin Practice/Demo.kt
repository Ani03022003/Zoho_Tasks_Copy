class CustomInt(val value: Int){
    override fun toString(): String {
        return value.toString()
    }
}

operator fun CustomInt.plus(other: CustomInt): CustomInt {
    return CustomInt(this.value - other.value)  // Custom behavior: subtraction instead of addition
}

fun main() {
//    val a = CustomInt(10)
//    val b = CustomInt(5)
//    println(a + b)  // Outputs: CustomInt(value=5)

    for(i in 10 downTo 1 step 2){
        println(i)
    }
}

import java.util.Scanner

fun main() {
    val numberList = mutableListOf<Int>()

    for (i in 1..10) {
        numberList.add(Scanner(System.`in`).nextInt())
    }

    println(numberList)

    var low = 0
    var high = numberList.size
    val num = Scanner(System.`in`).nextInt()
    while (low < high) {
        var mid = low + (high - low) / 2
        if (numberList[mid] == num) {
            println(numberList[mid])
            break
        } else if (numberList[mid] < num)
            low = mid + 1
        else
            high = mid - 1
    }
}
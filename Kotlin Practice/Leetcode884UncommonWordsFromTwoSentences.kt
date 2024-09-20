class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val str = "$s1 $s2".split(" ");

        val result = str.groupBy { it }.filter { it.value.size == 1 }.keys

        println(result)

        return result.toTypedArray()
    }
}

fun main() {
    val s = Solution()
    val s1 = "this apple is sweet"; val s2 = "this apple is sour"
    val arr = s.uncommonFromSentences(s1, s2)
    for( i in 0 until arr.size){
        println(arr[i])
    }
}
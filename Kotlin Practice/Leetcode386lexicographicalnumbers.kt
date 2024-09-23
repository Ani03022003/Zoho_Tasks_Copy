class Leetcode386lexicographicalnumbers {
    private val result = ArrayList<Int>()
    fun lexicalOrder(n: Int): List<Int> {
        for(i in 1..9){
            dfs(i, n)
        }
        return result
    }

    private fun dfs(i: Int, n: Int) {
        if(i>n){
            return
        }
        result.add(i)
        for (j in 0..9){
            dfs(i * 10 + j, n)
        }
    }

}

fun main(){
    val obj = Leetcode386lexicographicalnumbers()
    println(obj.lexicalOrder(2))
}
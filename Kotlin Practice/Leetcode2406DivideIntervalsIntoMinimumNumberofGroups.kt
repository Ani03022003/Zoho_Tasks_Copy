class Leetcode2406DivideIntervalsIntoMinimumNumberofGroups {
    fun minGroups(intervals: Array<IntArray>): Int {

        val events = mutableListOf<Pair<Int,Int>>()

        for(interval in intervals){
            val start = interval[0]
            val end = interval[1]

            events.add(Pair(start,1))
            events.add(Pair(end+1,-1))
        }

        events.sortWith(compareBy({it.first}, {it.second}))

        var maxGroups = 0
        var activeIntervals = 0

        for(event in events){
            activeIntervals += event.second
            maxGroups = maxOf(maxGroups, activeIntervals)
        }

        return maxGroups
    }
}

fun main(){
    val obj = Leetcode2406DivideIntervalsIntoMinimumNumberofGroups()
    val list = arrayOf(intArrayOf(5,10),
        intArrayOf(6,8),
        intArrayOf(1,5),
        intArrayOf(2,3),
        intArrayOf(1,10)
    )
    println(obj.minGroups(list))
}
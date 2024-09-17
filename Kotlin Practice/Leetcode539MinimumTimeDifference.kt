class Leetcode539MinimumTimeDifference {
    fun findMinDifference(timePoints: List<String>): Int {
        var time = timePoints.map { it ->
            val s = it.split(":")
            var t = s[0].toInt() * 60 + s[1].toInt()
            if (t == 0)
                t = 1440
            t
        }
        time = time.sorted()
        var minDiff = Int.MAX_VALUE
        var i = 0; var j = 1
        while(j<time.size){
            if(minDiff > time[j] - time[i])
                minDiff = time[j] - time[i]
            i++
            j++
        }
        println(time)
        return  minDiff
    }
}

fun main(){
    val obj = Leetcode539MinimumTimeDifference()
    val timePoints = listOf("00:00" , "23:59")
    print(obj.findMinDifference(timePoints))
}
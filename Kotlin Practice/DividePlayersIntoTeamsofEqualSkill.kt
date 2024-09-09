class DividePlayersIntoTeamsofEqualSkill {
    fun divide (skills : IntArray) : Int{
        val sortedSkills = skills.sortedArray().toMutableList()
        var teamSum = 0
        var chemistry = 0
        while(sortedSkills.isNotEmpty()){
            val m = sortedSkills[0]
            val n = sortedSkills[sortedSkills.size-1]
            if(teamSum == 0)
                teamSum = m + n
            if(teamSum != m + n){
                return -1
            }
            chemistry += m * n
            sortedSkills.removeFirst()
            sortedSkills.removeLast()
        }
        return chemistry
    }
}

fun main() {
    val s = DividePlayersIntoTeamsofEqualSkill()
    print(s.divide(intArrayOf(3,2,5,1,3,4)))
}
class Leetcode729MyCalendarI {

    private var bookings : MutableList<List<Int>> = mutableListOf()

    fun book(start: Int, end: Int): Boolean {
        if(bookings.isEmpty()){
            bookings.add(listOf(start, end))
        }
        else if(bookings.size == 1){
            if(bookings[0][1] <= start && end <= bookings[0][0]){
                bookings.add(listOf(start, end))
                bookings.sortBy { it[0] }
                return true
            }
            else{
                return false
            }
        }
        else{
            for(i in 0 until bookings.size-1){
                if(bookings[i][1] <= start && end <= bookings[i+1][0]){
                    bookings.add(listOf(start, end))
                    bookings.sortBy { it[0] }
                    return true
                }
                else{
                    return false
                }
            }
        }

        return true
    }

}

fun main(){
    val obj = Leetcode729MyCalendarI()
    println(obj.book(10, 20))
    println(obj.book(15, 25))
    println(obj.book(20, 30))
}
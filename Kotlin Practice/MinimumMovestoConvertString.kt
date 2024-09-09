class MinimumMovestoConvertString {
    fun minimumMoves(s : String) : Int{

        var count = 0;
        var i = 0;
        while(i < s.length){
            if(s[i] == 'X'){
                i += 3
                count++
            }
            else {
                i++
            }
        }
        //println(str)
        return count;
    }
}

fun main(){
    val m = MinimumMovestoConvertString();
    println(m.minimumMoves("XXX"))
}
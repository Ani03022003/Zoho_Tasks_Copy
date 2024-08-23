

fun isValidIdentifier(s: String): Boolean {
    fun isLetter(c:Char): Boolean = c in 'a'..'z'|| c in 'A'..'Z' || c =='_'
    fun isLetterOrDigit(c:Char): Boolean = isLetter(c) || c in '1'..'9'
    if(s.isEmpty()) return false
    if(!isLetter(s[0])) return false
    for(c:Char in s){
        if(!isLetterOrDigit(c))
            return false
    }
    return true
}

fun String.lastChar()=get(length-1)

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

    val c="abc".lastChar()
    print(c)
}
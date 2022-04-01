

fun main(){
    println(findTheDifference("abcd",  "abcde"))
    println(findTheDifference("a",  "aa"))
}

fun findTheDifference(s: String, t: String): Char {
    var S = 0 // count of ASCII of s
    var T = 0 // count of ASCII of t

    var s = s.toCharArray()
    var t = t.toCharArray()
    // count all ASCII values of string s
    for (ch in s) S += ch.code

    // count all ASCII values of string t
    for (ch in t) T += ch.code

    // At the end
    // difference of count of T-S will be our answer
    return (T - S).toChar()
}
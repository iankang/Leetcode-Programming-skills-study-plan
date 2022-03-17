fun main(){
    println(areAlmostEqual("bank", "kanb"))
    println(areAlmostEqual("attack", "defend"))
    println(areAlmostEqual("kelb", "kelb"))
}

fun areAlmostEqual(s1: String, s2: String): Boolean {
    val string1 = s1.toCharArray().toHashSet()
    val string2 = s2.toCharArray().toHashSet()
    return string1 == string2
}
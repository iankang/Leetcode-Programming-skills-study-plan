fun main(){
    println(areAlmostEqual("bank", "kanb"))
    println(areAlmostEqual("attack", "defend"))
    println(areAlmostEqual("kelb", "kelb"))
}

fun areAlmostEqual(s1: String, s2: String): Boolean {
    val a = s1.toCharArray().toList()
    val b = s2.toCharArray().toList()
    val n = s1.length
    val aList = mutableListOf<Char>()
    val bList = mutableListOf<Char>()
    for(i in 0 until n){
        if(a[i] != b[i]){
            aList.add(a[i])
            bList.add(b[i])
        }
    }
    if(aList.size == bList.size && bList.size == 0){
        return true
    }
    if (aList.size == bList.size &&
        bList.size == 2)
    {
        if (
            aList[0] == bList[1] &&
            aList[1] == bList[0]
        ) {
            return true
        }
    }
    return false
}
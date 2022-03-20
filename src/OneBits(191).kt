fun main(){
    println(hammingWeight(521))
    println(hammingWeight(2097152))
//    println(hammingWeight(11111111111111111111111111111101))
}
fun hammingWeight(n:Int):Int {
    val charArray = Integer.toBinaryString(n)
    var oneCount = 0
    val count = charArray.forEach{char ->

        if(char == "1".first()){
            oneCount+=1
        }
    }

    return oneCount
}
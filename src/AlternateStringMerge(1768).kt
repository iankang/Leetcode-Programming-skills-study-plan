fun main(){
    mergeAlternately("abcyuiweryuer", "pqr")
}
fun mergeAlternately(word1: String, word2: String): String {
    val charArray1 = word1.toCharArray()
    val charArray2 = word2.toCharArray()
    val result = charArray1.zip(charArray2)
    val charArray1Size = charArray1.size
    val charArray2Size = charArray2.size
    var resultString:String? = ""
    result.forEach {pair ->
        resultString+=pair.first
        resultString+=pair.second
    }
    if(charArray1Size!=charArray2Size){
        if(charArray1Size<charArray2Size) {
            resultString += String((charArray2.slice(IntRange(charArray1Size, charArray2Size.minus(1)))).toCharArray())
        }
        else
        {
            resultString+= String(charArray1.slice(IntRange(charArray2Size,charArray1Size.minus(1))).toCharArray())
        }
    }

    return resultString.toString()
}
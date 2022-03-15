fun main(){
    println(canMakeArithmeticProgression(intArrayOf(3,5,1)))
    println(canMakeArithmeticProgression(intArrayOf(1,2,4)))
    println(canMakeArithmeticProgression(intArrayOf(-509,-19,-439,-264,-404,-369,-299,-89,-229,-54,-194,16,-544,-159,-124,-474,-334)))
}

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    val sortedArr = arr.sortedArray()
    val initialDiff = Math.abs(sortedArr[0].minus(sortedArr[1]))
    for(i in 1 until sortedArr.size){
        val prevNum = sortedArr[i.minus(1)]
        val currNum = sortedArr[i]
        val diff = Math.abs(currNum.minus(prevNum))
        if(diff != initialDiff){
            return false
        }
    }
    return true
}
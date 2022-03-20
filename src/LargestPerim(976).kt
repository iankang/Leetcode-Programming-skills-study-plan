fun main(){
    println(largestPerimeter(intArrayOf(2,1,2)))
    println(largestPerimeter(intArrayOf(1,2,1)))
}

fun largestPerimeter(nums: IntArray): Int {
    val sortedLengths = nums.sortedDescending()
    if(sortedLengths.size>=3){
        val lastIndex = sortedLengths.size.minus(3)
        for(i in 0..lastIndex){
            if( sortedLengths[i] < sortedLengths[i + 2] + sortedLengths[i + 1]){
                return sortedLengths[i +2] + sortedLengths[i + 1] + sortedLengths[i]
            }

        }
        return 0

    }
    return 0
}
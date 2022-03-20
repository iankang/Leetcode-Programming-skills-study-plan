fun main() {
    println(sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
}

fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum: Int = 0
    arr.forEachIndexed { index, i ->
        if (index % 2 != 0) {
            val start = index
            var end = start.plus(index)
            if(end>arr.size){
                end = arr.size
            }
            for(j in arr){

            }
            println("start: $start end:$end")
            val sub = (index..end)
                .map { sub:Int -> arr[sub] }
                .toIntArray()
            sub.forEach { subNum -> println(subNum) }
        }
    }
    return 0
}
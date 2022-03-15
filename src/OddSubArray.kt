fun main(){
    println(sumOddLengthSubarrays(intArrayOf(1,4,2,5,3)))
}

fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum:Int = 0
    arr.forEachIndexed { index, i ->
        if(index%2!=0){
            println("Index: $index")
            for(j in 0 until index){
//                sum+=arr[]
                println(arr[j])
            }
        }
    }
    return 0
}
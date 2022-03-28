fun main() {
    println(sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
}

fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum = 0
    for (i in arr.indices) {
        var j = i
        while (j < arr.size) {
            for (k in i..j) {
                sum += arr[k]
            }
            j += 2
        }
    }
    return sum
}

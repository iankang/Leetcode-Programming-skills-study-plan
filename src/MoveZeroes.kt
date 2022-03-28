fun main(){
    moveZeroes(intArrayOf(0,1,0,3,12))
}

fun moveZeroes(nums: IntArray) {
    var count = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val x = nums[i]
            nums[i] = nums[count]
            nums[count] = x
            count++
        }
    }
}
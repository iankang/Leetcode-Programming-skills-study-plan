fun main(){
    moveZeroes(intArrayOf(0,1,0,3,12))
}

fun moveZeroes(nums:IntArray):Unit{
    nums.sort()
    val zeros = nums.filter { num -> num == 0 }.count()
    val count = nums.filterIndexedTo(nums.toMutableList()) { index: Int, i: Int ->
        i == 0
    }
   count.drop(zeros)
    println(count)
}q
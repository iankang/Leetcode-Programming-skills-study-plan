fun main() {
    arraySign(intArrayOf(-1, -2, -3, -4, 3, 2, 1))
    arraySign(intArrayOf(1, 5, 0, 2, -3))
    arraySign(intArrayOf(-1,1,-1,1,-1))
}

fun arraySign(nums: IntArray): Int {
    val negs = nums.filter { num -> num < 0 }.count()
    val isContain0 = nums.contains(0)
    return numberChecker(negs, isContain0)
}

fun numberChecker(negNumber: Int, containsZero: Boolean): Int {
    if (containsZero) {
        return 0
    }
    if (negNumber > 0) {
        if (negNumber % 2 != 0) {
            return -1
        }
    }
    return 1
}
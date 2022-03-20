fun main() {
    println( diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
    println(diagonalSum(arrayOf(intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1))))
    println(diagonalSum(arrayOf(intArrayOf(5))))
}

fun diagonalSum(mat: Array<IntArray>): Int {
    val size = mat.size
    var primary = 0
    var secondary = 0
    var centerVal = 0

    for (i in 0..mat.size.minus(1)) {
        if (size % 2 == 0) {
            primary += mat[i][i]
            secondary += mat[i][size.minus(i).minus(1)]
        } else {
            if (i != size.div(2)) {
                primary += mat[i][i]
                secondary += mat[i][size.minus(i).minus(1)]
            }
            centerVal = mat[size.div(2)][mat.size.div(2)]
        }
    }

    val final = primary + secondary + centerVal
    return final
}
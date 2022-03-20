fun main(){
    println(checkStraightLine(
        arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(3,4), intArrayOf(4,5), intArrayOf(5,6), intArrayOf(6,7))
    ))
    println(checkStraightLine(
        arrayOf(intArrayOf(1,1), intArrayOf(2,2), intArrayOf(3,4), intArrayOf(4,5), intArrayOf(5,6), intArrayOf(7,7))
    ))
    println(checkStraightLine(
        arrayOf(intArrayOf(0,0), intArrayOf(0,1), intArrayOf(0,-1))
    ))
    println(checkStraightLine(
        arrayOf(intArrayOf(0,0), intArrayOf(0,5), intArrayOf(5,5), intArrayOf(5,0))
    ))
    println(checkStraightLine(
        arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(3,5))
    ))
}
fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
     coordinates.forEachIndexed{ index, tuple ->

         if(index>1) {
             return calculateGradient(
                 coordinates[0].first(),
                 coordinates[0].last(),
                 coordinates[1].first(),
                 coordinates[1].last(),
                 tuple[0],
                 tuple[1]
             )
         }
    }
    return true
}

fun calculateGradient(x0:Int, y0:Int, x1:Int, y1:Int,x:Int, y:Int):Boolean{
    val dy = y1.minus(y0)
    val dx = x1.minus(x0)
    return dx.times(y.minus(y1)) == dy.times (x.minus(x1))

}
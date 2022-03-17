fun main(){
    println(maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))
    println(maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5))))
}
fun maximumWealth(accounts: Array<IntArray>): Int {
    var runningMax:Int = 0
    accounts.forEach { first ->
        var sum = 0
        first.forEach { second ->
            sum+=second
        }
        if(sum>runningMax){
            runningMax = sum
        }

    }
    return runningMax
}
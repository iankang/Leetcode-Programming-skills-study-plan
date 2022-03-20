fun main(){
    println(average(intArrayOf(4000,3000,1000,2000)))
    println(average(intArrayOf(1000,2000,3000)))
}

fun average(salary: IntArray): Double {
    val sortedSalary = salary.sortedArray().filterIndexed{ index, s -> (index != 0) && (index != salary.size.minus(1))}.average()
    return sortedSalary
}
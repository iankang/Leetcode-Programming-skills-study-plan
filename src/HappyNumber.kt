fun main() {
    println(isHappy(19))
    println(isHappy(2))
}

fun isHappy(n: Int): Boolean {
    var happy = n
    val usedNums = mutableSetOf<Int>()
    while (happy != 1 && !usedNums.contains(happy)) {
        usedNums.add(happy)
        happy = getTotalSum(happy)
        println("happy: $happy")

    }
    return happy == 1
}

fun getTotalSum(initialNumber: Int): Int {
    var totalSum = 0
    var n = initialNumber
    while (n > 0) {
        var singleDigit: Int = n.mod(10)
        totalSum += singleDigit.times(singleDigit)
        n = n.div(10)
    }
    return totalSum
}
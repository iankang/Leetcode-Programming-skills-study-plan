fun main(){
    println(subtractProductAndSum(234))
    println(subtractProductAndSum(4421))

}

fun subtractProductAndSum(n: Int): Int {
    val numberString = n.toString().split("").filter{num -> num != ""}.map{num -> num.toInt()}
    val sum = numberString.reduce{sum,element -> sum + element}
    val product = numberString.fold(1){sum, element -> sum * element}
    return product.minus(sum)
}
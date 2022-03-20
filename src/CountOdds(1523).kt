fun main(){
    println(countOdds(3,7))
    println(countOdds(8, 10))
}

fun countOdds(low: Int, high: Int): Int {
    var count:Int = 0
    for(number in low until high.plus(1)){
        if(number%2==1){
            count+=1
        }
    }
    return count
}
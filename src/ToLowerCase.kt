import java.util.*

fun main(){
    println(toLowerCase("Hello"))
    println(toLowerCase("here"))
    println(toLowerCase("LOVELY"))
}

fun toLowerCase(s: String): String {
    return s.lowercase(Locale.getDefault())
}
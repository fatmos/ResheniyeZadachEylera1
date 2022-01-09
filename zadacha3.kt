
fun main(){
    var delitel = 600851475143
    var delitel2 = 2L
    while (delitel !=1L){
        if (delitel % delitel2 == 0L){
            println("$delitel2"+" $delitel" )
            delitel = delitel / delitel2
        }
        else {
            delitel2++
        }
    }
    println(delitel2)
}
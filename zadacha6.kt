

fun main( ) {
    var z = 0
    var x = 0
    for (i in 1..100){
        z += i*i
        x += i
    }
    x *= x
    var raznost = x - z
    print(raznost)

}
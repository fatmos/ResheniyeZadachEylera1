fun chislo6znakov() {
    var N = 100
    var koren = 0
    var chislo6znakov = 100_000
    while (koren < chislo6znakov){
        N++
        koren = N * N

    }
    N = (N - 1 )
    print(N)
}

fun main( ) {
    //chislo6znakov(N)
    var num1 = 999
    var num2 = 999
    var list = mutableListOf< Int >()
    var i = 0

    while (num2 > 316 ) { // N= 316
        var polin = num1 * num2
        var polin1 = polin / 1000
        var polin2 = polin % 1000
        var repolin2 = polin2.toString().reversed().toInt()
        if (polin1 == polin2 && polin > 100_000){
            list.add(i,polin)
            i++
        }
        num1--
        if (num1 <316){
            num1 = 999
            num2--
        }

    }
    var z = list.sorted()
    print(z[0])
}
fun main(){
    var i = 0
    var b = 0
    var c = 0
    var d = 1
    while (i<=4000_000){
        i = b + d
        if (i % 2 ==0){
            c += i
        }
        b = d
        d = i

    }
    print(c)
}
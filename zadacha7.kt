

fun main( ) {
    var prost= mutableListOf(3)
    var number=3
    var count=3
    while( count<=10001){
        number+=2
        var prostNum=true
        for (i in prost){
            if (number<i*i){
                break
            }
            else if(number%i==0){

                    prostNum = false
                    break
                }

            }


        if (prostNum==true){
            prost.add(number)
            count+=1

             }

            }




    print(prost[-1])
}
package tictactoe
import kotlin.math.abs

fun main() {
    print("Enter cells: ")
    val kletka  = readLine()!!
    /*val varianti_pobed = listOf(0, 4, 8, 2, 4, 6, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 3, 6, 1, 4, 7, 2, 5, 8).chunked(3)
    var vsego_3_x = 0
    var vsego_3_o = 0
    val vsego_x = kletka.count { it =='X'}
    val vsego_o = kletka.count { it =='O'} // count O
    val countFree = kletka.count { it == '_' || it == ' '} // count space

    for (triplePos in varianti_pobed){
        var str = ""
        for (j in triplePos) str += kletka[j]
        when (str){
            "XXX" -> vsego_3_x++
            "OOO" -> vsego_3_o++

        }

    }*/
    print(kletka)


    println("---------\n" +
            "| ${kletka[0]} ${kletka[1]} ${kletka[2]} |\n" +
            "| ${kletka[3]} ${kletka[4]} ${kletka[5]} |\n" +
            "| ${kletka[6]} ${kletka[7]} ${kletka[8]} |\n" +
            "---------")
    /*println(when {
        abs(vsego_x - vsego_o)> 1 -> "Impossible"
        vsego_3_x > 0 && vsego_3_o > 0 -> "Impossible"
        vsego_3_x == 0 && vsego_3_o == 0 && countFree > 0 -> "Game not finished"
        vsego_3_x == 0 && vsego_3_o == 0 && countFree == 0 -> "Draw"
        vsego_3_x == 1 && vsego_3_o == 0 -> "X wins"
        vsego_3_x == 0 && vsego_3_o == 1 -> "O wins"
        else -> ""
    })*/
    do {
        println("Enter the coordinates: ")
        var vvod = readLine()!!.split(" ")

        if (vvod)
    }while()
// write your code here
}
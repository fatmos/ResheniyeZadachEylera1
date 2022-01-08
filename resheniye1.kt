var sum = 0
var i = 1
fun main(){
    while (i < 1000) {
        if (i % 3 == 0 || i % 5 == 0){
            sum += i
        }
        i += 1

    }
    println(sum)
    Matem()
}
fun Matem() {
    var troyka = 0
    var pyatorka = 0
    var pyatnadzat = 0
    var otvet = 0
    troyka = 1 * (3 + 6 + 9 + 12) // Начало последовательности чисел делящихся на 3
    troyka = 3 * (1 + 2 + 3 + 4) // Так все числа в этой последовательности кратны 3, то можем вынести 3 за скобки

/* Мы знаем первые числа последовательности .

   Если представить все числа кратные 3 , до числа 1000 , то можно эту последовательность
   переписать ,вынеся 3 за скобку , как во втором примере  ввиде :

   3 * (1 + 2 + 3 + 4 ... + ( 999 / 3 = 333 ) ) , 999 последнее число до 1000 которое делиться на 3 ,
    а до этого мы вынесли тройку из всех чисел последовательности за скобку ,значит
    последнее число в скобке 333.

    3 * (1 + 2 + 3 + 4 ... + 333 )
*/
    /*
    Чтобы найти числа в скобках (1 + 2 + 3 + 4 ... + 333 ) без пересчёта , можем воспользоваться трюком ,
    приведу аналогию на малых последовательностях :
    (1 + 2 + 3 + 4 )
    сложим её абстрактно пополам  1 + 2
                                  +   +
                                  4 + 3
    сумма чисел стоящих в столбик равна 5  , таких столбов 2 .

    Итог сумма последовательности равна  5 * 2
    __________________________________________
    Повторяем с последовательностью заканчивающейся на не чётном числе
    (1 + 2 + 3 + 4 + 5)

    ((1 + 2 + 3 + 4)     +     5)

    1 + 2
    +   +  5
    4 + 3

    Итог : 5 * 3
    ____________
    Делаем то же самое :

    (1 + 2 + 3 + 4 ... + 333 )


    Последовательность длинная , поэтому найдём середину последовательности ( 333 / 2 ) = 166 .
    166 это последнее число первой половины последовательности

        (    1  +  2  +  3  +  4 ... + 166 )
    Вторая часть последовательности:   +
    (333 + 332 + 331 + 330 + 329 ... + 167 )

                1  +  2 ...
           333  +     +    +
               332 + 331...

     166 * 333 + 333 = 167 * 333 | потому что столбцов 166 + 1
     */
    troyka = 3 * 167 * 333
    pyatorka = 5 * 100 * 199
    otvet = troyka + pyatorka
    // Тут такая вещь , что 15 кратно и 3, и 5  ,
    // поэтому   числа кратные 15 будут складываться с дубликатами ,
    // все числа в последовательности уникальны . Мы удаляем дубликаты
    pyatnadzat = (3 * 5) * 33 * 67
    otvet = otvet - pyatnadzat
    println(otvet)
}
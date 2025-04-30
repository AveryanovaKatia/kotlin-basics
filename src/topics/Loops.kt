package topics

/**
 * listOf() - создает неизменяемый список как ListOf в Java
 * mutableListOf() - создает изменяемый список как ArrayList в Java
 * intArrayOf() - создает массив из целых чисел
 * .. - две точки между цифрами - диапазон, включающий пограничные значения
 * until - диапазон, НЕ включающий пограничные значения
 * downTo - диапазон со значениями в убывающем порядке
 * step - шаг
 */

fun main() {

    // for each

    val items = listOf("apple", "banana", "orange")

    for(item in items)
        println(item)


    // while

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }


    // Диапазоны

    3..7 // 3,4,5,6,7
    println(5 in 3..7) // true
    for (i in 3..7)
        println("3 .. 7 --- $i")

    for (i in 3 until 7)
        println("3 until 7 --- $i")

    for (i in 7 downTo 3)
        println("7 downTo 3 --- $i")

    for (i in 0..100 step 10)
        println("0 .. 100 step 10 --- $i")

}
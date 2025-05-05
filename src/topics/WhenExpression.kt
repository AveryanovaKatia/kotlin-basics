package topics

/**
 * Альтернатива switch
 * Any - как Object в Java
 */

fun main() {

    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

fun testWhen(input: Any) {
    when(input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Строка длиной ${input.length} символов")
        else -> println("Что-то еще")
    }
}
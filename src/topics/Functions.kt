package topics

/**
 * fun - для создания функций - методов
 * Kotlin, в большинстве случаев, может предугадать тип возвращаемого значения
 * НО лучше всегда указывать тип возвращаемого значения
 * можно вразнобой передавать именованные аргументы
 * если функция ничего не возвращает - тип возвращаемого значения не нужен
 * в аргументах можно использовать vararg
 * чтоб превратить массив в набор аргументов - *
 */

fun main() {

    println(testSimple())
    println(testSimple2(5, 6))

    testNamedArguments(2, 3, 4)
    testNamedArguments(y = 3, z = 4, x = 2)

    testDefaultArguments()
    testDefaultArguments(2, 4)
    testDefaultArguments(y = 2)

    printEven(1, 2, 3, 4, 5, 6, 7, 8)
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 9, 10)

}

fun testSimple(): Int {
    return 5 + 5
}

fun testSimple2(x: Int, y: Int): Int = x + y

 /** если тело функции простое и помещается в одну строку
     равнозначная запись с :
        fun testSimple(): Int = 5 + 5
        fun testSimple2(x: Int, y: Int) = x + y
  */

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}


/**
 * vararg
*/

fun printEven(vararg numbers: Int) {
    numbers.forEach { e-> if (e % 2 == 0) println(e) }
}
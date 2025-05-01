package topics

/**
 * ? - если нужно чтоб в переменной мог лежать null
 * ?: - Elvis оператор
 * !! - оператор, который выбрасывает NPE если в переменной null
 */

fun main() {

    var a: String = "hello"
   // a = null так не получиться, NPE исключение

    println(a.length) // OK, все сработает


    var b: String? = "bye"
    b = null // OK, все сработает
    b = if((0..10).random() > 5) "asdf" else null // чтоб было не очевидно что там

    // println(b.length) так не получиться, NPE исключение

    // вернет длину b, если null вернет null (и никаких NPE исключений)
    println(b?.length)

        // удобно на цепочках:
        // bob.department.head.name -> (мб NPE)
        // bob?.department?.head?.name? -> (никаких NPE)


    // ?: - Elvis оператор
    val l = b?.length ?: -1


    // !! - оператор, который выбрасывает NPE если в переменной null
    b = if((0..10).random() > 5) "asdf" else null
    val t = b!!.length

}
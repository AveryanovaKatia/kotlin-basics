package topics

/**
 * Вторичный конструктор всегда должен вызывать первичный
 * data - создает методы equals, hashcode, toString и т.д.
 */

fun main() {

    val child = Person("Tom mini", "Marvolo", 1)
    val p1 = Person("Tom", "Redlle", 24, child)
    print(p1.firstName) // геттероф нет, обращаемся напрямую к полю

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2)
}


// первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {

    var children: MutableList<Person> = mutableListOf() //ArrayList

    // этот блок - тело первичного конструктора
    init {
        println("Person is created $firstName")
    }

    // вторичный конструктор
     constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
                children.add(child)
            }

    // конструктор без аргументов
    constructor():
            this("", "", -1)
}

data class Rectangle(var height: Double, var lengtn: Double) {

    var perimeter = (height + lengtn) * 2

    var test = 1
        get() = field + 1 // this
        set(value) {
            if(value < 0 ) println("Negative value")
            field = value
        }

    // эта функция - обычный метод класса
    fun area() = height * lengtn
}
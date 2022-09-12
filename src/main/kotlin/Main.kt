val varGlobal: String? = null

fun main() {
    println("Hello World")

    val nameOnlyRead: String = "yessine"
    var nameReassigned: String = "jaoua"

    when (varGlobal) {
        null -> println("hahaha")
        else -> println("lololo")
    }

    val greetingToPrint = when (nameReassigned) {
        null -> "Hi"
        else -> "Hello"
    }

    print("this is the message$greetingToPrint")

    val newArray = arrayOf("Hahaha", "Hahah2")
    println(newArray[0])

    newArray.forEach { println(it) }

    val map = mapOf(1 to "a" , 2 to "b" , 3 to "c")

    map.forEach{ (k, v) -> println(" $k  sldkjfsdf $v") }

    val map3 = mutableMapOf(1 to "a"  , 2 to "b")

    map3[5] = "d"

    println("this is the value of map3 $map3")

    val person = Person("sqdf" , "lksjdf")
    person.varHaha = "hahahahah"
    println(person.varHaha)
}



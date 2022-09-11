val varGlobal : String? = null

fun main(){
    println("Hello World")

    val nameOnlyRead : String = "yessine"
    var nameReassigned : String = "jaoua"

    when (varGlobal){
        null -> println("hahaha")
        else -> println("lololo")
    }

    val greetingToPrint = when(nameReassigned){
        null -> "Hi"
        else -> "Hello"
    }

    print("this is the message$greetingToPrint")

    fun haha() : String{
        return "yessine"
    }
    println(nameReassigned)
}
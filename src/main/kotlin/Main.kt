val varGlobal : String? = null

fun main(){
    println("Hello World")

    // for variables, we can use
    // val : only read ones  , but var : readable and reassigned

    // types in kotlin are non nullables by default
    // we should do String? for example
    val nameOnlyRead : String = "yessine"
    var nameReassigned : String = "jaoua"

    println(nameReassigned)
}
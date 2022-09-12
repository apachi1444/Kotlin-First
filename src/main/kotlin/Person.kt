open class Person(_firstName : String = "ajja", _lastName : String = "jaoau"){

    private val firstName : String
    private val lastName : String


    // we can do as much init blocks as we want
    init {
        firstName = _firstName
        lastName = _lastName
    }
    var varHaha : String? =null
        get() {
            println("this is the getter is $field")
            return field
        }

        set(value) {
            field = value
            println("haha")
        }
}

//----------------------------

/*
or we can do
class Person (val firstName : String , val lastName : String){
}

Class Person (val firstName : String = "Peter" , val lastName : String ="Jaoua" ){
}
*
*
* */

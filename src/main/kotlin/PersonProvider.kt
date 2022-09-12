interface PersonProvider {
    val providerInfo: String
    fun printName(person: Person) {
        println(providerInfo)
        person.varHaha
    }
}

open class PersonProviderImpl(override val providerInfo: String = "Hahahahahahah") : PersonProvider

fun main() {
    val personProvider = PersonSubClass()
    personProvider.printName(Person("sdkjqf", "sqdlkjf"))
}
package concepts.classes

class Company {
    var name: String = "defaultvalue"
        get() = field                     // getter
        set(value) { field = value }      // setter
    private val _age: Int = 20
    val age: Int
        get() {
            return _age
        }

    val printAge = {
        println("Age is: $_age")
    }
}
package Four_OOP_Properties

class Dog(name: String) : Animal(name) {

    override fun sayHello() {
        println("Hello, I'm " + super.name)
    }

}
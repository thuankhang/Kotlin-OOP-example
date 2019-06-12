package Four_OOP_Properties

class Cat(name: String) : Animal(name) {

    override fun sayHello() {
        println("Hi, I'm " + super.name)
    }

}
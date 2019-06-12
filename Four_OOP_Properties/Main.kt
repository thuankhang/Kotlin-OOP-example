package Four_OOP_Properties

object OopDemo {

    @JvmStatic
    fun main(args: Array<String>) {
        val cat = Cat("Tom")
        val dog = Dog("Milu")

        val zoo = Zoo()
        zoo.add(cat)
        zoo.add(dog)
        zoo.showListAnimal()
    }

}
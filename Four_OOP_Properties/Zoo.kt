package Four_OOP_Properties

import java.util.ArrayList

class Zoo {

    private val animals = ArrayList<Animal>()

    fun add(animal: Animal) {
        animals.add(animal)
    }

    fun remove(animal: Animal) {
        animals.remove(animal)
    }

    fun showListAnimal() {
        for (animal in animals) {
            animal.sayHello()
        }
    }

}
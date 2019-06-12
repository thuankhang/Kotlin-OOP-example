package Successor

internal open class Employee {
    var salary = 1000f
}

internal class Programmer : Employee() {
    var bonus = 150
}

object InheritanceSample1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Programmer()
        println("Programmer salary is: " + p.salary)
        println("Bonus of Programmer is: " + p.bonus)
    }
}

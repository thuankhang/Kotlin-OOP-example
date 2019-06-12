package Polyform

open class Bike {
    open fun run() {
        println("running")
    }
}

class Splender : Bike() {
    override fun run() {
        println("running safely with 60km")
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val b = Splender()
            b.run()
        }
    }
}

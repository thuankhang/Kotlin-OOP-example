package Abstract

object AbstractDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val e = Employee ("George W.", "Houston, TX", 43)

        println("\n Send mail check by using Employee reference --")
        e.mailCheck()
    }
}
package Abstract

 open class Employee( val name :String,  var address:String, val number:Int) {
init{
println("Building an Employee")
}
 fun computePay():Double {
println("Inside Employee Compute Pay")
return 0.0
}
 fun mailCheck() {
println(
    "Send a test mail to " + this.name
    + " " + this.address
)
}
override fun toString():String {
return "$name $address $number"
}
}
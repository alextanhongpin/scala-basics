// 01-variables.scala

// A val is immutable, once you assign a value to it, you cannot reassign another value
val x = 10
val y: Int = 20

// A var is mutable, you can still assign another value to it
var z: String = "Hello"
z = "World"

// Lazy variables are only executed when it is accessed for the first time while val is executed when it is defined
lazy val a = 100 * 100

println(x)
println(y)
println(z)
println(a)


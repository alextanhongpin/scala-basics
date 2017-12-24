case class FullName(firstName: String, lastName: String)
val name = FullName("john", "doe")
println("my name is " + name)

// Throws error: reassignment to val
// name.firstName = "car"
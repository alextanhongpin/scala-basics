// + Case classes can be pattern matched
// + Case classes automatically define hashcode and equals
// + Case classes automatically define getter methods for the constructor arguments.

case class Stuff(name: String, age: Int)
val s = Stuff("David", 45)

println(s)
println(s.name)
println(s.age)
// Parameters declared as a val
// Getter only (the params are immutable if you use val)
class Book(val title: String)
val b = new Book("Learn Scala")
println(b.title)


// Parameters declared as a var
// Getter and setters if you define the params with var
class Game(var name: String)
val g = new Game("Mario Run")
println(g.name)
g.name = "Meteor"
println(g.name)

// Paramater declared as a private val or var
class Language(private var title: String) {
  def printTitle { println(title) }
}
val lang = new Language("Scala")
lang.printTitle
// lang.title -> throw error


// Parameters without val/var
class Food(title: String) {}

class Toy (val title: String = "Yu-Gi-Oh")
val toy = new Toy()
println(toy.title)
val toy2 = new Toy("Pokemon")
println(toy2.title)
import scala.collection._

val mapping: collection.Map[String, String] = Map("Ron" -> "admin", "Sam" -> "analyst")

println(mapping, mapping.getClass)

val mapping2: collection.Map[String, String] = collection.mutable.Map("Ron" -> "admin", "Sam" -> "analyst")
println(mapping2, mapping2.getClass)

// Methods in Traversable trait
val xs: List[String] = List("1", "2", "3", "4")
val ys: List[String] = List("5", "6", "7", "8")
// The number of elements in the collection
println(xs.size)

// A collection consisting of both xs and ys
println(xs ++ ys)

// The collection obtained from applying the function f to every element in xs
println(xs map((x:String) => x + "0"))

// The collection obtained from applying the collection valued function f to every element in xs and concatenating the results
println(xs flatMap((x:String) => x.toList))

// The collection consisting of those elements of xs that satisfy the predicate p
println(xs filter((x:String) => x != "4"))

// An option containing the first element in xs that satisfies p, or None if no element qualifies
println(xs find((x:String) => x == "3"))

// Apply binary operation op between successive elements of xs, going left to right and starting with z. /: is alias for foldLeft
println(("Start" /: xs)((x, y) => x + y ))

// Apply binary operation op between successive elements of xs, going right to left and starting with z. :\ is alias for foldRight
println((xs :\ "End")((x, y) => x + y ))

// The first element of the collection (or some element, if no order is defined)
println(xs.head)

// The rest of the collection except xs.head
println(xs.tail)

// Produces a string that shows all elements of xs between separators sep
println(xs mkString "+")
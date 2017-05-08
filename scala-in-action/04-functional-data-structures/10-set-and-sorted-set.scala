import collection.immutable.SortedSet

val xs = Set("Lift", "Akka", "Play", "Scalaz", "Scala", "JS")
val ys = Set("JavaScript", "React", "Scala", "JS")


// Test whether x is an element of xs
println(xs contains "Lift")
println(xs("Lift"))


// Set containing all elements of xs and additional elements from ys
// It won't add the duplicate entries from ys
val zs = xs ++ ys
println(zs)

// The set intersection of xs and ys
println(xs & ys)
println(xs intersect ys)

// The set union of xs and ys
println(xs | ys)
println(xs union ys)

// The set difference of xs and ys
println(xs &~ ys)
println(xs diff ys)

// Add elements from ys to set xs as a side effect and return xs itself
// Only for mutable set
val xss = collection.mutable.Set("a", "b", "c")
val yss = collection.mutable.Set("b", "d", "e")
xss ++= yss
println(xss)


// If Boolean argument is true, add x to xs, otherwise remove x from xs
xss("c") = false
xss.update("z", true)
println(xss)


// Remove all elements from xs
xss.clear()
println(xss)


val frameworks = Set() + "Akka" + "Lift" + "Scalaz"
println(frameworks)

val updatedFrameworks = frameworks - "Lift"
println(updatedFrameworks)

val mFrameworks = collection.mutable.Set[String]()
mFrameworks += "Akka" += "Lift"
println(mFrameworks)


println(SortedSet(4, 5, 6) ++ SortedSet(1, 2, 3))
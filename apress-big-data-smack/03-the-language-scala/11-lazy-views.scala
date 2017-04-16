// 11-lazy-views.scala

// In functional programming we call something lazy when it doesn't appear until it is needed.
// A lazy view is a version of a collection computed and returned when it is actually needed.

val v = (0 to 25).view
println(v)

// To force the memory allocation of a view, use the force instruction
val f = v.force


// Let's create an array
val bigData = Array("B", "I", "G", "-", "D", "A", "T", "A")

// and view over the first elements
val view = bigData.view.slice(0, 4)

// we modify the View
view(0) = "F"
view(1) = "A"
view(2) = "S"
view(3) = "T"

println(bigData)
// 18-mutable-collections.scala

val immutableMap = Map(1 -> "a", 2 -> "b", 3 -> "c")
val newMap = immutableMap - 1 + (4 -> "d")
println(newMap)
println(immutableMap)

// Converting an immutable map to a mutable one 
// and changing it back
val m = Map(1 -> "a", 2 -> "b")
val b = m.toBuffer

b += (3 -> "c")

val newMap2 = b.toMap
println(newMap2)
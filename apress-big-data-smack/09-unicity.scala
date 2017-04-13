// 09-unicity.scala

val duplicated = List("A", "A", "B", "C", "C", "D")


// Use distinct
val u = duplicated.distinct
println(u)

// Convert to set
val s = duplicated.toSet
println(s)
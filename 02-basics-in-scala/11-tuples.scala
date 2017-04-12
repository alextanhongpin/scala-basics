// 11-tuples.scala
// - A tuple is an ordered container of two or more values of the same or different types
// - Unlike list or arrays, however, there is no way to iterate through elements in a tuple
// - It's purpose is only as a container for more than one value

// Tuples using values separated by a comma and surrounded by a pair of parantheses
val tuple = (1, false, "Scala")
println(tuple)


// Tuple using relation operator
val tuple2 = "title" -> "Beginning Scala"
println(tuple2)

// Accessing an element from tuple using index
println(tuple._3)
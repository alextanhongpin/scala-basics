// 10-ranges.scala

// Creating range using method to
println(1 to 5)
// prints 1,2,3,4,5

println(1 until 5)
// prints 1,2,3,4

val output = (1 to 20 by 4) map { i => i }
println(output)
// prints 1,5,9,13,17
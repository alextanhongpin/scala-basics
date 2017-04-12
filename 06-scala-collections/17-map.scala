// 17-map.scala

var p = Map(1 -> "David", 2 -> "Elwood")
p = p + (8 -> "Something")
println(p)

println(p(8))

println(p.get(10))
println(p.getOrElse(1000, "This is a default value"))

p -= 8
println(p)

println(p.contains(1))

println(p.keys.reduceLeft(_ max _))
println(p.values.reduceLeft((a, b) => if (a > b) a else b))
println(p.values.exists(_.contains("z")))

// Add a bunch of elements
p ++= List(5 -> "Cat", 6 -> "Dog")
println(p)

// Remove a bunch of elements
p --= List(8, 6)
println(p)
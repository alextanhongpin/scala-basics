// 12-reduxio.scala

println(List(8,6,22,2).reduceLeft(_ max _))

// Find the longest word
val x = List("Moose", "cow", "A", "Cat")
.reduceLeft((a, b) => if (a.length > b.length) a else b)

println(x)

// Find the shortest word
val y = List("Moose", "cow", "A", "Cat")
.reduceLeft((a, b) => if (a.length < b.length) a else b)

println(y)


val z = List(1,2,3,4).foldLeft(0)(_ + _)
println(z)

val a = List("b", "a", "elwood", "archer").foldLeft(0)(_ + _.length)
println(a)

val b = (1 to 3).toList
println(b)
val c = b.map(i => b.map(j => i * j))
println(c)
val d = b.flatMap(i => b.map(j => i * j))
println(d)

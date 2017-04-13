// 12-sorting.scala

// Sorting strings
val foo = List("San Fransico", "London", "New York", "Tokio").sorted
println(foo)

// Sorting numbers
val bar = List(10, 1, 8, 3.14, 5).sorted
println(bar)

// Ascending
val a = List(10,1,8,3.14,5).sortWith(_ < _)
println(a)

// Descending
val b = List(10,1,8,3.14,5).sortWith(_ > _)

// Ascending alphabetically
val c = List("San Fransico", "London", "New York", "Tokio").sortWith(_ < _)
println(c)

// Descending alphabetically
val d = List("San Fransico", "London", "New York", "Tokio").sortWith(_ > _)
println(d)

// Ascending by length
val e = List("San Fransico", "London", "New York", "Tokio").sortWith(_.length < _.length)
println(e)

// Descending by length
val f = List("San Fransico", "London", "New York", "Tokio").sortWith(_.length > _.length)
println(f)


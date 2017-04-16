// 08-splitting.scala

val sample = List(-12, -9, -3, 12, 18, 15)
println(sample)

// Separate our sample in two groups
val teens = sample.groupBy(_ > 10)
println(teens)

// To access the generated groups
val t = teens(true)
println(t)

val f = teens(false)
println(f)

// Partitions does the same as groupBy but it returns a List with two lists

val teens2 = sample.partition(_ > 10)
println(teens2)

// Span the list, in one list with the longest index who meets the predicate
val negs = sample.span(_ < 0)
println(negs)

// splitAt generates two lists, one before the index at N, and the rest
val splitted = sample.splitAt(2)
println(splitted)

// partition can assign the result to a tuple
val (foo, bar) = sample.partition(_ > 10)

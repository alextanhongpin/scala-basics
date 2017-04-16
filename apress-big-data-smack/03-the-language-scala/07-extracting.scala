// 07-extracting.scala

val magic = (0 to 9).toArray

// Without the first N elements
val d = magic.drop(3)
println(d)

// Without the element matching the predicate
val dw = magic.dropWhile(_ < 4)
println(dw)

// Without the last N elements
val dr = magic.dropRight(4)
println(dr)

// Just the first N elements
val t = magic.take(5)
println(t)

// Just the first elements matching a predicate (from left)
val tw = magic.takeWhile(_ < 4)
println(tw)

// Just the last N elements
val tr = magic.takeRight(3)
println(tr)

// The subsequence between the index A and B
val sl = magic.slice(1,7)
println(sl)


// Head, the first element
val h = magic.head
println(h)

// The head boxed (to prevent errors)
val hb = magic.headOption
println(hb)

// The list without the last element
val in = magic.init
println(in)

// The last element
val ta = magic.last
println(ta)

// The last boxed (to prevent errors)
val lo = magic.lastOption
println(lo)

// All the list without the first element (known as tail)
val tail = magic.tail
println(tail)

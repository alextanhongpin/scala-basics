// 18-ranges.scala

// to, to make a range from a to b
0 to 6

// until, to make a range from 0 to 7 (upper limit excluded)
0 until 6

// by, to specify a step
0 to 21 by 3

// to, also functions with chars
'a' to 'k'

// a range to List
val l = (0 to 16).toList

// a range to Array
val a = (0 to 16).toArray

// a range to Set
val s = (0 to 16).toSet

// Array has a range method (upper limit excluded)
val a2 = Array.range(0, 17)

// Vector has a range method (upper limit excluded)
val v = Vector.range(0, 10)

// List has a range method
val l2 = List.range(0, 17)

// A list with numbers in a range with a step of 5
val l3 = List.range(0, 50, 5)

// An ArrayBuffer with characters in a range
val ab = collection.mutable.ArrayBuffer.range('a', 'f')

// An old fashioned for loop using range
for (i <- 1 to 5) println(i)
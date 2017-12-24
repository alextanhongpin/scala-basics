// 12-if.scala

// If expression in Scala
if (true) println("Yes")

// Multiline if expression
if (true) {
  println("Line 1")
  println("Line 2")
}

// If/else
val i: Int = if (true) 10 else 20
println(i)

// Multiline else
val j: Int = if (true) 1
else {
  val j = System.currentTimeMillis
  (j % 100L).toInt
}


val x = 42
if (x == 42) println("Yes")

// Ternary operator
val y : Int = if (x == 42) 100 else 200
println(y)

// Multiline else

val i: Int = if (false) 1
else {
  val j = System.currentTimeMillis
  (j % 100L).toInt
}
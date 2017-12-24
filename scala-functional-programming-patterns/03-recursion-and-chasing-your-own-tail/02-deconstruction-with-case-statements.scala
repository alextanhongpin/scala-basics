val head :: tail = List(1, 2, 3, 4, 5)
println(head, tail)

val (x, y) = (7, 10)
println(x, y)

case class MyClass(x: Int, y: Int)

val p = MyClass(23, 45)
p match {
  case MyClass(a, b) => println(a + b)
}


// Written in infix form
p match {
  case a MyClass b => println(s"a=$a, b=$b")
}

(1 to 5).toList match {
  case :: (head, tail) => println(s"head=$head, tail=$tail")
  case Nil => println("empty list")
}
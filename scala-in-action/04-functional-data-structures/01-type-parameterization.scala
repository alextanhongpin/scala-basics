def position[A](xs: List[A], value: A): Int = {
	xs.indexOf(value)
}

val xs = List("One", "Two", "Three", "Four")
println("Found Two at index " + position(xs, "Two"))

val xs2 = List(1, 2, 3, 4, 5)
println("Found 3 at index " + position(xs2, 3))

// If the item is not found in the list,
// -1 will be returned
println("Not found with index" + position(xs2, 10))


// Implementation of Maybe
sealed abstract class Maybe[+A] {
	def isEmpty: Boolean
	def get: A
}

final case class Just[A](value: A) extends Maybe[A] {
	def isEmpty = false
	def get = value
}

case object Nil extends Maybe[Nothing] {
	def isEmpty = true
	def get = throw new NoSuchElementException("Nil.get")
}


def position2[A](xs: List[A], value: A): Maybe[Int] = {
	val index = xs.indexOf(value)
	if (index != -1) Just(index) else Nil
}

val xs3 = List(1, 2, 3, 4, 5)
println("Index of 1 is " + position2(xs3, 1))
println("Index of 100 is " + position2(xs3, 100))

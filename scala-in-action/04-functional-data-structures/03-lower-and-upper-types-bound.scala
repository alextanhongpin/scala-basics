

// Implementation of Maybe
sealed abstract class Maybe[+A] {
	def isEmpty: Boolean
	def get: A
	def getOrElse[B >: A](default: B): B = {
		if (isEmpty) default else get
	}
}

final case class Just[A](value: A) extends Maybe[A] {
	def isEmpty = false
	def get = value
}

case object Nil extends Maybe[scala.Nothing] {
	def isEmpty = true
	def get = throw new NoSuchElementException("Nil.get")
}

def position[A](xs: List[A], value: A): Maybe[Int] = {
	val index = xs.indexOf(value)
	if (index != -1) Just(index) else Nil
}

val xs = List("One", "Two", "Three")

println(position(xs, "One").get)
println(position(List(), "One").getOrElse(-1))
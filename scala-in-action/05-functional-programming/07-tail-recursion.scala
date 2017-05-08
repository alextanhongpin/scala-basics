// Head recursion: Perform the recursive call first and take the return value
// from the recursive function and calculate the result

def length[A](xs: List[A]): Int = xs match {
	case Nil => 0
	case x :: ys => 1 + length(ys)
}

// Tail recursion: Perform the calculation first and then execute the recursive call
// by passing the result of the current step to the next step


import scala.annotation.tailrec

def length2[A](xs: List[A]): Int = {
	// Marker to optimize tail recursion - You'll get a compiler warning if Scala compiler fails to optimize your tail recursive methods or functions
	@tailrec 
	def _length(xs: List[A], currentLength: Int): Int = xs match {
		case Nil => currentLength
		case x :: ys => _length(ys, currentLength + 1)
	}
	_length(xs, 0)
}

// Tail recursion is preferable - scala does tail cat optimization at compile
// time and the compiler transforms a tail recursive function into a loop
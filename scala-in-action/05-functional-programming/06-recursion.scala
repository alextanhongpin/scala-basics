// Imperative solution

var sum = 0
for (e <- List(1, 2, 3)) { sum += e }

// Recursive solution
def sum(xs: List[Int]): Int = xs match {
	case Nil => 0
	case x :: ys => x + sum(ys)
}

val xs = List(0, 1, 2, 3, 2, 1, 0)

def unique(xs: List[Int]): List[Int] = xs match {
	case Nil => Nil
	case x :: ys if(ys.contains(x)) => unique(ys)
	case x :: ys => unique(ys) :+ x
}
println(unique(xs))
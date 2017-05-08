// def foldLeft[B] (z:B)(f: (B, A) => B) : B
// def foldRight[B] (z:B)(f: (A, B) => B) : B

def map[A, B](xs: List[A], f: A => B): List[B] = {
	xs match {
		case List() => Nil
		case head :: tail => f(head) :: map(tail, f)
	}
}

def flatten[B](xss: List[List[B]]): List[B] = {
	xss match {
		case List() => Nil
		case head :: tail => head ::: flatten(tail)
	}
}


def map2[A, B](xs: List[A])(f: A => B): List[B] = {
	val startValue = List.empty[B]
	xs.foldRight(startValue){ f(_) :: _ }
}

def map3[A, B](xs: List[A])(f: A => B): List[B] = {
	val startValue = List.empty[B]
	xs.foldLeft(startValue)((a, x) => f(x) :: a).reverse
}



def flatten2[B](xss: List[List[B]]): List[B] = {
	val startValue = List.empty[B]
	xss.foldRight(startValue) { _ ::: _ }
}

// /: shorthand for foldLeft
// \: shorthand for fold right
println(List(1, 2, 3, 4).foldLeft(0) { _ + _ })
println(List(1, 2, 3, 4).foldLeft(0) { (a, b) => a + 1 })
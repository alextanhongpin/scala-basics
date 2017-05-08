// This program shows how to add 1 to 
// items in a list in various ways

val l = List(1, 2, 3)
println(l map { (x: Int) => x + 1})

println(l map { _ + 1})

def addOne(num: Int) = num + 1

println(l map addOne)


def addOnePlus (num: Int) = {
	def ++ = (x: Int) => x + 1
	++(num)
}

println(l map addOnePlus)

// Implementation of map using recursion
def map[A, B](xs: List[A], f: A => B): List[B] = {
	xs match {
		case List() => Nil
		case head :: tail => f(head) :: map(tail, f)
	}
}
println(map(l, addOne))
println(map(List(), addOne))

// Implementation of map using for comprehension

def map1[A, B](xs: List[A], f: A => B): List[B] = for (x <- xs) yield f(x)

println(map1(l, addOne))
println(map1(List(), addOne))


// Difference between flatMap and map
val sl = List("one", "two", "three")
println(sl map { _.toList })
println(sl flatMap { _.toList })
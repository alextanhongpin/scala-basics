object fold1 {
	def apply[A, B](xs: Traversable[A], defaultValue: B)(op: (B, A) => B) = 
		(defaultValue /: xs)(op)
}

println(fold1(List("1", "2", "3"), "0"){ _ + _ })
println(fold1(IndexedSeq("1", "2", "3"), "0"){ _ + _ })
println(fold1(Set("1", "2", "3"), "0"){ _ + _ })

trait Function1[-T1, +R] extends AnyRef {
	def apply(v: T1): R
}

object ++ extends Function1[Int, Int] {
	def apply(p: Int): Int = p + 1
}

object ++ extends (Int => Int) {
	def apply(p: Int): Int = p + 1
}

val ++ = (x: Int) => x + 1



val addOne: Int => Int = x => x + 1
val addTwo: Int => Int = x => x + 2
val addThree = addOne compose addTwo
val addThree = Int => Int = x => addOne(addTwo(x))
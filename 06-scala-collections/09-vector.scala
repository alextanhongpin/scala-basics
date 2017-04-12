// 09-vector.scala

val x = IndexedSeq(1,2,3)
println(x(0))

val a = Vector(1,2,3)
val b = a ++ Vector(4,5)
println(b)

val c = b.updated(0, "x")
println(c)

val d = b.take(3)
println(d)

val e = b.filter(_ > 2)
println(e)


var int = Vector(1)
int = int :+ 2
int = int :+ 3
println(int)
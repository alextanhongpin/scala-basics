// 05-invariant-class.scala

class Holder[T](var data: T)

def add(in: Holder[Int]) { in.data = in.data + 1 }

val h = new Holder(0)
add(h)
println(h.data)
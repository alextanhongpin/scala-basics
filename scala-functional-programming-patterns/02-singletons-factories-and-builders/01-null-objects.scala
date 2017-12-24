val m = List(Some("one"), None, Some("two"), None)

println(m)

for {
  Some(p) <- m
} println(p)


println(m.flatten)

// foreach and flatten can be used with Option
val p = Some("one")
val q = None
var r = Option(null)

println("p:")
p.foreach(println(_))

println("q:")
q.foreach(println(_))

println("r:")
r.foreach(println(_))

val s = List(List(1, 2), List(3, 4))
println(s.flatten)

def m(n: Option[Int]) = n.map(_ + 1)

val c1 = Some(10)
val c2 = None
println(m(c1), m(c2))

def m1(n: Int) = if (n >= 0 && n < 10) Some(n) else None

m1(1) foreach { x => println(x + 1) }
m1(100) foreach { x => println(x + 1) }
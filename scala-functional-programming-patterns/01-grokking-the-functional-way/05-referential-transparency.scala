import scala.collection.mutable.ListBuffer

def f1(x: Int, y: Int) = x * y
printf("f1 is %d\n", f1(10, 20))

def f(x: Int, y: Int, p: Int, q: Int) = x * y + p * q
printf("f is %d\n", f(10, 20, 30, 40))

// Rewrite f
def f2(x: Int, y: Int, p: Int, q: Int) = f1(x, y) + f1(p, q)
printf("f2 is %d\n", f2(10, 20, 30, 40))


val v = ListBuffer.empty[String]
v += "hello"
v += "world"
v += "greetings"
v += "from"
v += "secret"

println(v)
println(v.mkString("-"))
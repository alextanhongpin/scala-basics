// No parameters
def myMethod(): String = "Moof"

// Type inferencing
def anotherMethod() = "Lol"

def foo(a: Int):String = a.toString

// Multiple parameters
def f2(a: Int, b:Boolean):String = if (b) a.toString else "false"

// Repeat last parameter
def largest(as: Int*):Int = as.reduceLeft((a, b) => a max b)

println(largest(1))
println(largest(1,2,3))
println(largest(1,2,3,4,5,6,7,8,9))


def mkString[T](as: T*): String = as.foldLeft("")(_ + _.toString)
println(mkString(1,2,3,5))

// Abstract method
abstract class Base {
  def thing: toString
}
// Without override
class One extends Base {
  def thing = "Moof"
}
class Two extends One {
  override val thing = (new java.util.Date).toString
}

class Three extends One {
  override lazy val thing = super.thing + (new java.util.Date).toString
}
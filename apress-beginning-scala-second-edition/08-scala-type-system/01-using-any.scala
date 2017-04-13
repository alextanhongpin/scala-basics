// 01-using-any.scala

import scala.collection.mutable.ListBuffer

// Using Any
val list = ListBuffer[Any]()

val x = 2
list += x

class Book
list += new Book()

println(list)

// Value types
def test(int: AnyVal) = ()
test(5)
test(5.12)
test(new Object)
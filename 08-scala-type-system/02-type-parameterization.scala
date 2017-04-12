// 02-type-parameterization.scala

// Scala list of strings
val list: List[String] = List("A", "B", "C")

// Scala requires to specifyn type parameters
def test(s: Set) {} // This will not compile


// Specifying parameter types
def test(s: Set[AnyRef]){}
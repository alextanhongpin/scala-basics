val list = List("one", "two", "three", "Four", "five")
println(list)

// Method in scala
def hasUpperCase(s: String) = s.exists(_.isUpper)
println(hasUpperCase("heLLo"))

println("got:", list filter (hasUpperCase))
// 04-contravariant-parameter-type.scala

// Putable class
class Putable[-T] {
	def put(in: T){println("Putting " + in)}
}

def writeOnly(in: Putable[String]) { in.put("hello") }


val p = new Putable[AnyRef]
println(p)

writeOnly(p)
// 03-variance.scala

// A declaration like class Set[+A] means
// that Set is parameterized bz a type A
// The +A is called a variance annotation

// Immutable class Getable
class Getable[+T](val data: T)

def get(in: Getable[Any]) { println("It's " + in.data) }

// Instance of Getable
val gs = new Getable("String")
get(gs)


// Passing Double
def getNum(in: Getable[Number]) = in.data.intValue
def gd = new Getable(new java.lang.Double(33.3))
println(getNum(gd))


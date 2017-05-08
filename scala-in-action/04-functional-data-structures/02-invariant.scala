// ListBuffer is a mutable collection
import scala.collection.mutable.{ListBuffer}

val mxs: ListBuffer[String] = ListBuffer("pants")

// This will throw an error
// val everything: ListBuffer[Any] = mxs


// List is an immutable collection
val xs: List[String] = List("clothes")
val everything: List[Any] = xs

// Add to front
println(1 :: everything)

// Add to back
println(everything :+ 2)

println(everything)

// Hack to print type
// var result : Nothing = everything
var result : Nothing = everything :+ 2
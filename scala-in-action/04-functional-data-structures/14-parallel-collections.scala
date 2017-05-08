import scala.collection.parallel.immutable._

ParVector(10, 20, 30, 40, 50).map { x =>
println(Thread.currentThread.getName); x / 2}

// Converts vector to parallel counterpart to perform filter and 
// then converts back to vector again
Vector.range(1, 10000).par.filter(_ % 2 == 0).seq
// 04-setting-the-parallelism-level.scala

import scala.collection.parallel._

val parRange = (0 to 100).par

println(parRange.tasksupport)
println(parRange.tasksupport.parallelismLevel)

// Set the number of threads to 2
parRange.tasksupport = new ForkJoinTaskSupport(
  new scala.concurrent.forkjoin.ForkJoinPool(2)
)

println(parRange.tasksupport.parallelismLevel)

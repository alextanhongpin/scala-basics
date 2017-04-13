// 19-mutable-queue.scala


import scala.collection.mutable.Queue
var ints = Queue[Int]()

// Adding elements to the queue
ints += 1
println(ints)

// Adding multiple elements to the queue
ints += (2, 3)
println(ints)

// Using enqueue
ints.enqueue(4)
println(ints)
println(ints.dequeue)
println(ints)
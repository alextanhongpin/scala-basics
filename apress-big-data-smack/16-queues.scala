// 16-queues.scala

import scala.collection.mutable.Queue

// Here we create a queue of strings
var smack = new Queue[String]

// += operator, to add an element
smack += "Spark"

// += operator, to add multiple element
smack += ("Mesos", "Akka")

// ++= operator, to add a collection
smack ++= List("Cassandra", "Kafka")

// The queue power: enqueue
smack.enqueue("Scala")

// It's counterpart: dequeue
// Dequeue removes the first element of the queue
val next = smack.dequeue

// Remove the first element containing a k
smack.dequeueFirst(_.contains("k"))

// Remove all the elements beginning with A
smack.dequeueAll(_.startsWith("A"))
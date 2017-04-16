// 17-stacks.scala

import scala.collection.mutable.Stack

// Create a stack of strings
var smack = Stack[String]()

// push, to add elements on the top
smack.push("Spark")
smack.push("Mesos")

// push, to add multiple elements
smack.push("Akka", "Cassandra", "Kafka")

// pop, to take the last element inserted
val top = smack.pop

// top, to access the last element without etract it
println(smack.top)

// size, the Seq method to know the number of elements
println(smack.size)

// isEmpty, another seq method
println(smack.isEmpty)

// clear, to empty all the stack suddenly
println(smack.clear)
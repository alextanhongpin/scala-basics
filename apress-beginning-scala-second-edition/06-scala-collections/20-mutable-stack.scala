// 20-mutable-stack.scala

import scala.collection.mutable.Stack

// Creating a stack
var ints = Stack[Int]()

// Creating a stack
var s = Stack(1,2,3)
println(s)

s.push(4)
println(s)

s.push(5,6,7)
println(s)
var lastele = ints.pop
println(lastele)
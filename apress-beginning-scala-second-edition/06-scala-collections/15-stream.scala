// 15-stream.scala
val stream = 1 #:: 2 #:: 3 #:: Stream.empty
println(stream)
println(stream.getClass)


val stream2 = (1 to 10000).toStream
println(stream.getClass)
println(stream.head)
println(stream.tail)
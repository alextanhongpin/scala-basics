// 04-mapping.scala

val smack = Vector("spark", "mesos", "akka", "cassandra", "kafka")

// The long way
val cap = smack.map((e => e.capitalize))
println(cap)

// The short way
val cap2 = smack.map(_.capitalize)
println(cap2)

// Producing a vector of int
val lens = smack.map(_.size)
println(lens)

// Producing a vector of XML elements
val elem = smack.map(smack => <li>{smack}</li>)
println(elem)

// Capitalize with for/yield
val y = for (s <- smack) yield s.capitalize
println(y)
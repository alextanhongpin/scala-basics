// 02-for.scala

val smack = Traversable("Spark", "Mesos", "Akka", "Cassandra", "Kafka")

for (f <- smack) println(f)
for (f <- smack) println(f.toUpperCase)

var upSmack = for (s <- smack) yield s.toUpperCase
println(upSmack)

val smackMap = Map("S" -> "Spark", "M" -> "Mesos", "A" -> "Akka", "C" -> "Cassandra", "K" -> "Kafka")
for ((k,v) <- smackMap) println(s"letter: $k, means: $v")

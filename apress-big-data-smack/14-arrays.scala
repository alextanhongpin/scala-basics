// 14-arrays.scala

// In numeric, the biggest data type determines the Collection type
val a = Array(6.67e-11, 3.1415, 333F, 666L)
println(a)

// We can force manually the type
val b = Array[Number] (6.67e-11, 3.1415, 333F, 666L)
println(b)

// There are several ways to create and initialize arrays

// From range
val r = Array.range(0, 16)
println(r)

// From range with step
val rs = Array.range(-16, 16, 3)
println(rs)

// With fill
val f = Array.fill(3)("ha")
println(f)

// With Tabulate
val t = Array.tabulate(9)(n => n * n)
println(t)

// From list
val c = List("Spark", "Mesos", "Akka", "Cassandra", "Kafka").toArray
println(c)

// From string
val s = "ELONGATION".toArray
println(s)

// Scala arrays corresponds to Java Arrays
val bigData = Array("B", "I", "G", "-", "D", "A", "T", "A")

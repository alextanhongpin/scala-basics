// 10-merging.scala

val nega = collection.mutable.ListBuffer(-30, -20, -10)

// The result is assigned to the original collection,
// and it is mutable
nega ++ Seq(10,20,30)
println(nega)

val tech1 = Array("Scala", "Spark", "Mesos")
val tech2 = Array("Akka", "Cassandra", "Kafka")

val smack = tech1 ++ tech2


// Set Theory
val lang1 = Array("Java", "Scala", "Ceylon")
val lang2 = Array("Java", "JavaScript", "PHP")

// Intersection, the elements in both collections
val inter = lang1.intersect(lang2)

// Union, the elements in both collections
val addition = lang2.union(lang2)

// Use distinct to discriminate duplicates
val subtraction = lang1.union(lang2).distinct

// A-B is different than B-A
val dif1 = lang1 diff lang2
val diff2 = lang2 diff lang1

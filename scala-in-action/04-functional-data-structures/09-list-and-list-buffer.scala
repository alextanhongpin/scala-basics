import scala.collection.mutable.ListBuffer

val languages = Seq("Scala", "Haskell", "OCaml", "ML")

println(languages(1))
// println(languages(100))

val buf = ListBuffer(1.2, 2.3, 3.4, 4.5)

println(buf(2))
buf(2) = 10
println(buf(2))
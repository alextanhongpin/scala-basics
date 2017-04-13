// 06-filtering.scala

val dozen = List.range(1, 13)
val multipleOf3 = dozen.filter(_ % 3 == 0)
println(multipleOf3)

val languages = Set("Java", "Scala", "Clojure", "Ceylon")

val c = languages.filter(_.startsWith("C"))
println(c)

val s = languages.filter(_.length < 6)
println(s)
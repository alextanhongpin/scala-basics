// 07-pattern-matching-as-functions.scala

/*list.filter(a => a match {
  case s: String => true
  case _ => false
})*/

val output = List("A", "B", 1, 0, false, 'X').filter {
  case s: String => true
  case _ => false
}
println(output)


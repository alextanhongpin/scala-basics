// 11-transformation.scala

println(List("A", "Cat").map(s => s.toLowerCase))

println(List("A", "Cat").map(_.toLowerCase))

trait Person {
  def first: String
  def valid: Boolean
}
val d = new Person { def first = "David" }
val e = new Person { def first = "Elwood" }
val f = new Person { def first = "Archer" }

println(List(d,e,f).map(_.first))
println(List(d,e,f).map(n => <li>{n.first}</li>))

def validByAge(in: List[Person]) = 
in.filter(_.valid)
.map(_.first)
// 06-case-classes.scala

case class Person(val name: String, val age: Int, val valid: Boolean)
val p = Person("David", 45, true)
val m = Person("Martin", 44, true)

def older(p: Person): Option[String] = p match {
  case Person(name, age, true) if age > 35 => Some(name)
  case _ => None
}

println(older(p))
println(older(m))
println(older(Person("Fred", 73, false)))
println(older(Person("jorge", 20, true)))


case class MarriedPerson (
  override val name: String, 
  override val age: Int, 
  override val valid: Boolean, 
  spouse: Person
) extends Person(name, age, valid)

val sally = MarriedPerson("Sally", 24, true, p)

def mOlder(p: Person): Option[String] = p match {
  case Person(name, age, true) if age > 35 => Some(name)
  case MarriedPerson(name, _, _, Person(_, age, true))
  if age > 35 => Some(name)
  case _ => None
}

println(mOlder(p))
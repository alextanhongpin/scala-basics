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



// Another example
abstract class Food

case class Maggi(val name: String) extends Food
case class NasiLemak(val name: String) extends Food


class MaggiGoreng(override val name: String) extends Maggi(name)


val maggiGoreng = new MaggiGoreng("Mamak Maggi Goreng")
val nasiLemak = new NasiLemak("NasiLemak")
def matchFood(food: Food): String = {
  food match {
    case Maggi(name) => name
    case NasiLemak(name) => name
    case _ => "Not matched"
  }
}

println(matchFood(maggiGoreng))
println(matchFood(nasiLemak))
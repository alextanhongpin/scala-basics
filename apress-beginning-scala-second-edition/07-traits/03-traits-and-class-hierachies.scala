// 03-traits-and-class-hierachies.scala

abstract class LivingThings
abstract class Plant extends LivingThings
abstract class Fungus extends LivingThings
abstract class Animal extends LivingThings

// Trait hasLegs
trait HasLegs extends Animal {
	def walk () { println("Walking") }
}
// Explanation: Why does the trait extends the class?
// It means the compiler will only let you mix HasLegs into
// something that subclasses from Animal

// Trait hasWings
trait HasWings extends Animal {
	def flap () { println("Flap flap") }
}

// Trait Flies
trait Flies {
	this: HasWings => {
		def fly() {
			println("I'm flying")
		}
	}
}

abstract class Bird extends Animal with HasWings with HasLegs

// Concrete Birds
class Robin extends Bird with Flies
class Ostrict extends Bird

// Mammal behaviour
abstract class Mammal extends Animal {
	def bodyTemperature: Double
}

// KnowsName trait
trait KnowsName extends Animal {
	def name: String
}

// Dog has legs and know its name
class Dog(val name: String) extends Mammal with HasLegs with KnowsName {
	def bodyTemperature: Double = 99.3
}

// IgnoreNames trait

trait IgnoresName {
	this: KnowsName => 
	def ignoreName(when: String): Boolean
	def currentName(when: String): Option[String]= 
		if(ignoreName(when)) None else Some(name)
}

// Now we can define a Cat class that has legs, knows its name, and ignores its name except at dinner time

class Cat(val name: String) extends Mammal with HasLegs with KnowsName with IgnoreNames {
	def ignoreName(when: String) = when match {
		case "Dinner" => false
		case _ => true
	}
	def bodyTemperature: Double = 99.5
}

// Some Animal can be athletes, and runners are atheletes
// with legs
trait Athlete extends Animal

trait Runner {
	this: Athelete with HasLegs => 
	def run() {println("I'm running")}
}

// Person is mammal with legs and knows its name
class Person(val name: String) extends Mammal with
	HasLegs with KnowsName {
		def bodyTemperature: Double = 98.6
	}


// Biker trait
// A biker is a person but may only be added to an athlete
trait Biker extends Person {
	this: Athlete =>
	def ride() { println("I'm riding my bike") }
}

// Defining gender
trait Gender
trait Male extends Gender
trait Female extends Gender

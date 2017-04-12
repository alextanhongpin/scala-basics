// 02-methods-in-traits.scala

// Trait extending another trait
trait TraitB extends TraitA {
	def methodB
}

// Extending one trait
class ClassA extends TraitA {

}


// Extending multiple traits
class ClassA extends TraitA with TraitB {

}

// Extending class and traits
class ClassA extends ClassB with TraitA and TraitB {

}

// Concrete class must implement all abstract methods of trait
class ClassA extends TraitA {
	def methodA {}
	def methodAWithParam(param: String){}
	def methodWithReturnType: String
}

// Extending class not implementing abstract methods of trait must be abstract
abstract class ClassA extends TraitA {
	def methodA {}
	def methodAWithParam(param: String) {}
}

// Trait with implementation
trait Vehicle {
	def drive { println("Driving") } // Concrete method
	def race // Abstract method
}

// Subclass does not override the drive method of vehicle trait
class Car extends Vehicle {
	def race { ("Racing the car") }
}

// Subclass overrides the trait's drive method
class Boat extends Vehicle {
	override def drive { ("Float") }
	def race { ("Racing boat") }
}

// Trait with abstract and concrete fields
trait CarTrait {
	var door: Int
	var seat = 4
}

// Override keyword not necessary for var field
class Car extends CarTrait {
	var door = 4
	seat = 5
}

// Override keyword necessary for val field
trait CarTrait {
	val door: Int
}
class Car extends CarTrait {
	override val door = 5
}

// Trait definition cannot have parameters
class Car(door: Int) trait Car (door: Int) // Does not compile


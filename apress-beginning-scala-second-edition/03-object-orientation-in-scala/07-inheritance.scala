class Vehicle (speed: Int) {
  val mph: Int = speed
  def race () = println("Racing...")
}

class Car (speed: Int) extends Vehicle(speed) {
  override val mph: Int = speed
  override def race() = println("Racing car")
}
class Bike(speed: Int) extends Vehicle(speed) {
  override val mph: Int = speed
  override def race() = println("Racing bike")
}

val car = new Car(100)
println(car)
println(car.race())


val bike = new Bike(40)
println(bike)
println(bike.race())
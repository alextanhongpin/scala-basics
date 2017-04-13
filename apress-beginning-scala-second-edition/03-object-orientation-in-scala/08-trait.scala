class Vehicle (speed: Int) {
  val mph: Int = speed
  def race() = println("Racing")
}

trait flying {
  def fly() = println("Flying")
}
trait gliding {
  def gliding() = println("Gliding")
}

class Batmobile(speed: Int) extends Vehicle(speed) with flying with gliding {
  override val mph: Int = speed
  override def race() = println("Racing Batmobile")
  override def fly() = println("Flying Batmobile")
  override def gliding() = println("Gliding Batmobile")
}

val batmobile = new Batmobile(300)

batmobile.fly()
batmobile.race()
batmobile.gliding()
println(batmobile.mph)

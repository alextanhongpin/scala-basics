object Car {
  def drive { println("Drive car") }
}

trait Shape {
  def area: Double
}
object Shape {
  private class Circle(radius: Double) extends Shape {
    override val area = 3.14 * radius * radius
  }
  private class Rectangle (height: Double, length: Double) extends Shape {
    override val area = height * length
  }
  def apply(height: Double, length: Double) : Shape = new Rectangle(height, length)
  def apply(radius: Double) : Shape = new Circle(radius)
}
val circle = Shape(2)
println(circle)
println(circle.area)

val rectangle = Shape(2,3)
println(rectangle)
println(rectangle.area)
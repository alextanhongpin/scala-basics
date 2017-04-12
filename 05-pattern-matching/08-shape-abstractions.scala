// 08-shape-abstractions.scala

trait Shape
  case class Circle(radius: Double) extends Shape
  case class Square(length: Double) extends Shape
  case class Rectangle(h: Double, w: Double) extends Shape

object Shape {
  def area(shape: Shape): Double = shape match {
    case Circle(r) => r * r * Math.Pi
    case Square(l) => l * l
    case Rectangle(h, w) => h * w
  }

  def perimeter(shape: Shape) = shape match {
    case Circle(r) => 2 * r * Math.Pi
    case Square(l) => 4 * l
    case Rectangle(h, w) => h * 2 + w * 2
  }
}
// Define a supertype called Shape
class Shape {
  def area:Double = 0.0
}

class Rectangle(val width:Double, val height:Double) extends Shape {
  override def area:Double = width * height
}
class Circle(val radius:Double) extends Shape {
  override def area:Double = math.Pi * radius * radius
}

def draw(s:Shape){
  println(s.area)
}

println(new Rectangle(20, 30).area)
println(new Circle(20).area)
draw(new Circle(10))
// 01-trait-gliding.scala

trait Gliding {
  def gliding() {
    println("gliding")
  }
}

class Glider extends Gliding {
  override def toString = "glider"
}

val glider = new Glider
glider.gliding()

val g: Glider = glider
g.gliding()
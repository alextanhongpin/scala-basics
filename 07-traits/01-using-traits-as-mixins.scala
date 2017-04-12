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

// Overriding the trait's method
class Glider2 extends Gliding {
	override def toString = "glider"
	override def gliding() {
		println("Race for now " + toString)
	}
}

var gl = new Glider2
gl.gliding()

// Declaring methods in a trait
trait TraitA {
	def methodA
	def methodAWithParam(param: String)
	def methodWithReturnType: String
}

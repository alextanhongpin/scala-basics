package com.example.typeclasses


trait XmlConverter[A] {
	def toXML(a: A): String
}

case class Movie(name: String, year: Int, rating: Double)

object Converters {
	implicit object MovieConverter extends XmlConverter[Movie] {
		def toXml(a: Movie) = <movie>
			<name>{a.name}</name>
			<year>{a.year}</year>
			<rating>{a.rating}</rating>
		</movie>.toString
	}
}

object Main {
	import Converters._
	def toXml[A](a: A)(implicit converter: XmlConverter[A]) = converter.toXml(a)

	def main(args: Array[String]) = {
		val p = Movie("Inception", 2010, 10)
		toXml(p)
	}
}
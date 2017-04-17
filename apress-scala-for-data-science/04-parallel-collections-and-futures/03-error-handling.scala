// 03-error-handling.scala

import scala.util._
import scala.io.Source
// println (Vector(2, 0, 5).par.map {10 / _})

// val html = Source.fromURL("http://www.google.com")
// println(html)

// val html2 = Try { Source.fromURL("garbage") }
// println(html2)

val URLs = Vector("http://www.google.com", 
  "http://www.bbc.co.uk",
  "not-a-url"
)

// Fetch url in a fault tolerant manner
val pages = URLs.par.map { url =>
  url -> Try { Source.fromURL(url) }
}
println(pages)

val results = pages.collect {
  case(url, Success(it)) => url -> it.size
}
println(results)

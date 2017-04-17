// 01-limitations-of-parallel-collections.scala

import scala.collection.mutable

val sentence = "The quick bornw fox jumped over the lazy dog"

val characters = sentence.toVector
println(characters)

val charactersPar = characters.par
println(charactersPar)

val lettersPar = charactersPar.filter {_ != ' '}
println(lettersPar)

val lowerLettersPar = lettersPar.map {_.toLower}
println(lowerLettersPar)

var count = 0

(0 until 1000).par.foreach { i => count += 1 }
println(count)

val occurenceNumber = mutable.Map.empty[Char, Int]

lowerLettersPar.foreach { c => 
  occurenceNumber(c) = occurenceNumber.getOrElse(c, 0) + 1
}

println(occurenceNumber('e'))
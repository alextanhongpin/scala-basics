// 01-basic.scala

val sentence = "The quick bornw fox jumped over the lazy dog"

val characters = sentence.toVector
println(characters)

val charactersPar = characters.par
println(charactersPar)

val lettersPar = charactersPar.filter {_ != ' '}
println(lettersPar)

val lowerLettersPar = lettersPar.map {_.toLower}
println(lowerLettersPar)

val intermediateMap = lowerLettersPar.groupBy(identity)
println(intermediateMap)

val occurenceNumber = intermediateMap.mapValues{_.length}
println(occurenceNumber)
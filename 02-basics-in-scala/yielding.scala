// Yield will generate a new collectio

val books = List("Beginning Scala", "Beginning Groovy", "Beginning Java", "Scala in easy steps", "Scala in 24 hours")

var scalabooks = for{
  book <- books
  if book.contains("Scala")
} yield book

println(scalabooks)
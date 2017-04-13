val books = List("Beginning Scala", "Beginning Groovy", "Beginning Java", "Scala in easy steps", "Scala in 24 hours")

// Basic for expression
for (book <- books) {
  println(book)
}

// Using filter
for (book <- books
  if book.contains("Scala")
) println(book)

// Variable binding
for {book <- books
  bookVal = book.toUpperCase()
} println(bookVal)

// Using yield in for comprehension
var scalabooks = for{
  book <- books
  if book.contains("Scala")
} yield book

println(scalabooks)
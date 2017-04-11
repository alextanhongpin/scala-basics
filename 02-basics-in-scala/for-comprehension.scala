val books = List("Beginning Scala", "Beginning Groovy", "Beginning Java", "Scala in easy steps", "Scala in 24 hours")
for (book <- books)
println(book)

// Variable binding
for {book <- books
bookVal = book.toUpperCase()
} println(bookVal)


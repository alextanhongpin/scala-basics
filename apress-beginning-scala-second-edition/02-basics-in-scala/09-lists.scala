// 09-lists.scala

// Unlike array, elements of a list cannot be changed by assignment

// Creating an empty list
val empty: List[Nothing] = List()

// Creating a list of books
val books: List[String] = List("Beginning Scala", "Beginning Groovy", "Beginning Java")

// An empty list using nil
val empty = Nil

// Creating a list of books using a Tail Nil and ::
val books = "Beginning Java" :: ("Beginning Groovy" :: ("Beginning JavaScript" :: Nil))

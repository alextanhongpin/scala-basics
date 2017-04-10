// Empty list
val empty: List[Nothing] = List()
println(empty)

val books: List[String] = List("Beginning Scala", "Beginning Groovy", "Beginning Java")
println(books)

val emptyNil = Nil
println(emptyNil)

// Creating a List of Cars using Tail and Nil
val cars = "Proton Saga" :: ("Mercedes Bank" :: ("Myvi 1.6L" :: Nil))
println(cars.head)
println(cars.tail)
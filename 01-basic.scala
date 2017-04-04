// Basic Types
val hello = "hello"
val number = 20
val double = 2.0
val bool = true


// String Interpolation
val bookTitle = "Beginning Scala"
println(s"The Book Title is ${bookTitle}")

// Functions
def greet() = "Hello World"
println(greet())

// Functions without arguments
def greet2():String = {"Greeting with optional return type"}

// Functions with one argument
def square(x:Int):Int = {x*x}
println(square(2))

// Functions with two arguments
def add (x:Int, y:Int):Int = { x + y }
println(add(1,2))

// ARRAY
// * Empty array
var books = new Array[String](3)
println(books, books(0))

// * Array with items
var authors = Array("John Doe", "Jane Doe")
println(authors, authors(0))

// LIST
// * Empty list
var empty: List[Nothing] = List()

// * List with items
val fruits: List[String] = List("Apple", "Banana")
println(fruits)

// RANGES
println(1 to 5)
println(1 until 5)
println(0 to 10 by 2)

// TUPLES
val tuple = (1, false, "Scala")
println(tuple)

// * Tuple created using a relation operator
val tuple2 = "title" -> 2
println(tuple2)

var third = tuple._3
println(third)

if (10 > 1) println("10 is greater than 1")
if (-1 > 1) println("This is true") else println("This is false")

val alphabets = List("a", "b", "c", "d", "e", "f", "g")
for (a <- alphabets) {
  if (a.contains("g")) {
    println("this contains", a)
  } else {
    println(a)
  }
}

val y = for {x <- alphabets
  xVal = x.toUpperCase()
  if !xVal.contains("G")
} yield xVal

println(y)


44 match {
  case 44 => println("It is 44!")
  case _ => println("It is 40")
}


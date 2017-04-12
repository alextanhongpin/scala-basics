// 08-arrays.scala

// Array of strings
var books:Array[String] = new Array[String](3)
println(books)

// Simplifying array declarations
var books = new Array[String](3)

// Another way of array declaration
var books = Array("Beginning Scala", "Beginning Java", "Beginning Groovy")

// Assigning values or accessing individual elements
books(0) = "Something"
books(1) = "Good"
books(2) = "Is happening"
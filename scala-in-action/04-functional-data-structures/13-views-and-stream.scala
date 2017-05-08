// Normal list
val l1 = List(1, 2, 3, 4, 5).map(_ + 1)
println(l1)
println(l1.head) 


// List with views/projections
val l2 = List(1, 2, 3, 4, 5).view.map(_ + 1)
println(l2)
println(l2.head)


def strictProcessing = List(-2, -1, 0, 1, 2) map { 2 / _ }
// strictProcessing(0)


def nonStrictProcessing = List(-2, -1, 0, 1, 2).view map { 2 / _ }
println(nonStrictProcessing(0))

// println(nonStrictProcessing(2))

// Force strict processing
// nonStrictProcessing.force


// Example

import scala.io._
import scala.xml.XML

def tweets(handle: String) = {
	println("Processing tweets for " + handle)

	val source = Source.fromURL(new java.net.URL("http://search.twitter.com/search.atom?q=" + handle))
	val iterator = source.getLines()
	val builder = new StringBuilder
	for (line <- iterator) builder.append(line)
	XML.loadString(builder.toString)
}

// Get the search results for multiple users

// Problem: While creating the map, you're invoking the tweets function for all users
// val allTweets = Map("userA" -> tweets("userA"),
// 	"userB" -> tweets("userB"),
// 	"userC" -> tweets("userC"))

val allTweets = Map("userA" -> tweets _,
	"userB" -> tweets _,
	"userC" -> tweets _)

// Fetch a tweet for a user
// allTweets.view.map { t => t._2(t._1) }.head


// for ( t <- allTweets; if (t._1 == "userB")) t._2(t._1)


// Stream

println(List("zero", "one", "two", "three").zip(Stream.from(0)))

// def fib(n: Int): Int = n match {
// 	case 0 => 0
// 	case 1 => 1
// 	case n => fib(n - 1) + fib(n - 2)
// }

val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(t => t._1 + t._2)))

println(fib(20))
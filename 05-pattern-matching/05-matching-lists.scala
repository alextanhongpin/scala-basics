// 05-matching-lists.scala

val x = 1
val rest = List(2,3,4)
(x :: rest) match {
  case xprime :: restprime => println(xprime); println(restprime)
  case Nil => println("End")
}

// Using pattern matching to sum up all the ods ints
def sumOdd(in: List[Int]): Int = in match {
  case Nil => 0
  case x :: rest if x % 2 == 1 => x + sumOdd(rest)
  case _ :: rest => sumOdd(rest)
}
println(sumOdd(List(1,2,3,4,5,6)))


def noPairs[T](in: List[T]): List[T] = in match {
  case Nil => Nil
  // The first two elements in the lists are the same
  // so we'll call noPairs with a list that excludes
  // the duplicate element
  case a :: b :: rest if a == b => noPairs(a :: rest)
  // Return a list of the first element followed by noPairs
  case a :: rest => a :: noPairs(rest)
}

println(noPairs(List(1,2,3,3,3,4,1,1)))

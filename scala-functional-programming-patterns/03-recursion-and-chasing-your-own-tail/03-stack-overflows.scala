// val l = 1 to 20000
// count(l.toList)

import scala.annotation.tailrec


def count(list: List[Int]): Int = {
  @tailrec
  def countIt(l: List[Int], acc: Int): Int = l match {
    case Nil => acc
    case head :: tail => countIt(tail, acc + 1)
  }
  countIt(list, 0)
}


val c = count((1 to 20000).toList)
println(s"count = $c")
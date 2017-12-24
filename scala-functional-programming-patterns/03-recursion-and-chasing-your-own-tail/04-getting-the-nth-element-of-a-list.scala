import scala.annotation.tailrec

object NthElementOfList extends App {
  def nth(list: List[Int], n: Int): Option[Int] = {
    @tailrec
    def nthElem(list: List[Int], acc: (Int, Int)): Option[Int] = list match {
      case Nil => None
      case head :: tail => {
        if (acc._1 == acc._2)
          Some(head)
        else
          nthElem(tail, (acc._1 + 1, acc._2))
      }
    }
    nthElem(list, (0, n))
  }

  val bigList = (1 to 100000).toList
  println(nth(List(1, 2, 3, 4, 5), 100) getOrElse "No such elem")
  println(nth(List(1, 2, 3, 4, 5), 4) getOrElse "No such elem")
  println(nth(bigList, 1000) getOrElse "No such thing")
}
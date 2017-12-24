object Tree extends App {

  case class TreeNode(v: Int, 
                      left: Option[TreeNode] = None, 
                      right: Option[TreeNode] = None) {
  
    def add(av: Int) = insert(av).get

    def insert(av: Int): Option[TreeNode] = {
      def insertLeft(av: Int) = 
        left.flatMap(_.insert(av)) orElse 
          Option(TreeNode(av))
      
      def insertRight(av: Int) = 
        right.flatMap(_.insert(av)) orElse
          Option(TreeNode(av))
      
      av.compare(v) match {
        case 0 => Option(this)
        case -1 => Option(TreeNode(v, insertLeft(av), right))
        case 1 => Option(TreeNode(v, left, insertRight(av)))
      }
    }

    def traverseItInOrder(): Option[List[TreeNode]] = {
      val leftList = left.flatMap(x => x.traverseItInOrder()).getOrElse(Nil)
      var rightList = right.flatMap(x => x.traverseItInOrder()).getOrElse(Nil)
      val result = (leftList :+ this) ++ rightList
      Option(result)
    }

    def traverseInOrder() = {
      val result: Option[List[TreeNode]] = traverseItInOrder()
      result.getOrElse(Nil)
    }
  }

  val p = TreeNode(4).add(3).add(0).add(1).add(99).add(1).add(4)

  for {
    q <- p.traverseInOrder()
  } println(q.v)

  // Infix notation
  val list = List.fill(5)(1)

  println(list.mkString("-"))

  println(list mkString "-")
  println(None.orElse(Some(10))) // Invoking the orElse method on a None
  println(None orElse Some(10)) // the infix notation
  println(Some(10) orElse Some(20))

  val left = None
  val right = Option("hi")
  println(left orElse right)
}

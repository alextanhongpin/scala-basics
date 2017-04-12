// 01-basic.scala

// Pattern matching allows you to make a programmatic choice 
// between multiple conditions

// Printing numbers
def printNum(int: Int) {
  int match {
    case 0 => println("Zero")
    case 1 => println("One")
    case _ => println("More than 1")
  }
}

printNum(0)
printNum(1)
printNum(2)
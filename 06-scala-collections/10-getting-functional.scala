// 10-getting-functional.scala

println(List(1,2,3).filter(x => x % 2 == 1))

def isOdd(x: Int) = x % 2 == 1

println(List(1,2,3).filter(isOdd))

println("99 Red Balloons".toList.filter(Character.isDigit))

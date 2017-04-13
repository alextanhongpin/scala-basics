// 13-for-comprehension.scala

def isOdd(in: Int) = in % 2 == 0
def isEven(in: Int) = !isOdd(in)
val n = (1 to 10).toList
val o = n.filter(isEven).flatMap(i => n.filter(isOdd).map(j => i * j))
println(o)

val p = for {
  i <- n if isEven(i)
  j <- n if isOdd(j)
} yield i * j
println(p)
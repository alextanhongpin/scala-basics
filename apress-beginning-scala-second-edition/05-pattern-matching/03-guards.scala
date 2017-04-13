// 03-guards.scala

def fib2(in: Int): Int = in match {
  case n if n <= 0 => 0
  case 1 => 1
  case n => fib2(n - 1) + fib2(n - 2)
}

println(fib2(20))
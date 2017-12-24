val x = "hello world".toList.filter(_.isLetter).groupBy(x => x).map { y => 
  y._1 -> y._2
}
println(x)
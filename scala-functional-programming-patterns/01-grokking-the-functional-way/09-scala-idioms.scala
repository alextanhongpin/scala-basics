// Sum up two list of numbers
val d1 = List(1, 2, 3, 4, 5)
val d2 = List(1, 2, 3, 4, 5)

println((d1, d2).zipped map (_ + _))

val r = (1 to 100).map(_ * 2).filter(x => 
  x % 3 == 0 && 
  x % 4 == 0 &&
  x % 5 == 0)

println(r)
val add = (x: Int, y: Int) => x + y
println(add(1,2))

val areaOfRectangle:(Int, Int) => Int = (width: Int, height: Int) => {
  width * height
}

println(areaOfRectangle(5, 3))

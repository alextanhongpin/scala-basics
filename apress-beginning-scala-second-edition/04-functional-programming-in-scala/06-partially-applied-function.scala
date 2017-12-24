val add = (x: Int, y: Int) => x + y

val partiallyAdd = add(1, _:Int)

println(partiallyAdd(19))


val add: (Int, Int): Int = (x: Int, y: Int) => x + y

val partiallyAdd = (1, _:Int)
partiallyAdd(10)

val greet: (String, String) => String = (greeting: String, name: String) => greeting + " " + name


val greeter = greet("Awesome", _:String)
greeter("")
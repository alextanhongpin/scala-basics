val add = (x: Int, y: Int) => x + y

val partiallyAdd = add(1, _:Int)

println(partiallyAdd(19))

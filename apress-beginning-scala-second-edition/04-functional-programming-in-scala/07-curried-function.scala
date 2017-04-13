
val add = (x: Int, y: Int) => x + y
println(add(10,2))

def addCurried(x: Int)(y: Int) = x + y
println(addCurried(2)(40))

def addCurried2(x: Int) = (y: Int) => x + y
println(addCurried2(10)(30))
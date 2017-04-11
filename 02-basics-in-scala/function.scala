def hello():String = { "Hello World" }

println(hello)

// Functions with parameters
def square(i:Int) = {i * i}
println(square(2))

def add(x:Int, y:Int): Int = { x + y }
println(add(2,3))
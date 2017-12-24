def addThem(a: Int, b: Int) = a + b
def substractThem(a: Int, b: Int) = a - b
def multiplyThem(a: Int, b: Int) = a * b

def execute(f: (Int, Int) => Int, a: Int, b: Int) = f(a, b)

println(execute(addThem, 1, 2))
println(execute(substractThem, 1, 2))
println(execute(multiplyThem, 1, 2))
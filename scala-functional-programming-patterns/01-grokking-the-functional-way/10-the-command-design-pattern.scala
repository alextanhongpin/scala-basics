case class Command(f: Int => Unit)

def InvokeIt(i: Int, c: Command) = c.f(i)

def cmd1 = Command(x => println(s"***${x}***"))

def cmd2 = Command(x => println(s"---${x}---"))

println(InvokeIt(10, cmd1))
println(InvokeIt(10, cmd2))
def greeting() = (name:String) => { "Hello" + " " + name }

val greet = greeting()
println(greet("john"))
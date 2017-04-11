class SomeClass(val i :Int) extends AnyVal {
  def twice() = i * 2
}


val v = new SomeClass(9)
println(v.twice())
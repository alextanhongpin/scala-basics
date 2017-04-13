def nano() = {
  println("Getting nano")
  System.nanoTime
}

// Call by name
def delayed(t: => Long) = {
  println("Indelayed method")
  println("Param:" + t)
  t
}

delayed(nano())
println('\n')

// Call by reference
def notDelayed(t:Long) = {
  println("In notDelayedMethod")
  println("Param:" + t)
  t
}

notDelayed(nano())
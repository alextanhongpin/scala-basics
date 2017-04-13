// 15-try-catch.scala

// try/finally in Scala
try {
  throw new Exception("Some exception...")
} finally {
  println("This will always be printed")
}

// try/catch in Scala
try {
  file.write(stuff)
} catch {
  case e:java.io.IOException => // Handle IO Exception
  case n:NullPointerException => // Handle null pointer
}
try {
  throw new Exception("some exception...")
} finally {
  println("This will always be printed")
}
try{
  Integer.parseInt("dog")
} catch {case _ => 0}

try {
  Integer.parseInt("44")
} catch {case _ => 0}

// We mark the factorial function with @annotation.tailrec to instruct scala
// compiler that this function must be optimized for tail-recursion
// and that if annotated function cannot be optimized for tail-recursion
// the compiler should treat it as an error

@annotation.tailrec
def factorial(number: Int) : Int = {
  if (number == 1) {
    return 1
  }
  number * factorial (number - 1)
}
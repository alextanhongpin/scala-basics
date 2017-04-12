// 02-numeric-types.scala

// Byte - 8 bit signed value. Integers in the range from -128 to 127
// Short - 16 bit signed value. Integers in the range from -32768 to 32767
// Int - 32 bit signed value. Integers in the range from ...
// Long - 64 bit signed value.
// Float - 32 bit IEEE 754 single-precision float.
// Double - 64 bit IEEE 754 double-precision float.

// Scala supports the ability to automatically convert numbers from one type to another in the order
// Byte > Short > Int > Long > Float > Double

val x: Int = 10
val y: Float = x
// It is possible to convert int to float
println(y)

// ...but not possible to convert int to short
val z: Short = x
// Will throw error: type mismatch;
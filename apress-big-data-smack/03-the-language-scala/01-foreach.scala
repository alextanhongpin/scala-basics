// 01-foreach.scala

val zahlen = Vector("Eins", "Zwei", "Drei")

zahlen.forEach(s => print(s))
zahlen.forEach(print(_))

def printAChar(c: Char) {print(c)}
"SMACK".forEach(printAChar)

// 15-array-buffers.scala

val cities = collection.mutable.ArrayBuffer("San Fransisco", "New York")

// To add one element
cities += "London"

// To add multiple elements
cities += ("Tokio", "Beijing")

// To add another collection
cities += Seq("Paris", "Berlin")

// Append, to add multiple elements
cities.append("Sao Paulo", "Mexico")

val m = Map((1, "1st"), (2, "2nd"))
println(m)

// Alternative key -> value syntax
val n = Map(1 -> "1st", 2 -> "2nd")
println(n)

val key = 1
println(m(key))

// Throws error
// println(m(3))

println(m.get(key))
println(m.get(3))

val artists = Map("Pink Floyd" -> "Rock",
	"Michael Jackson" -> "Pop",
	"Led Zeppelin" -> "Rock")

println(artists filter { (t) => t._1 == "Led Zeppelin" })
println(artists filter { (t) => t._2 == "Rock" })


// The value associated with the key k in map ms, or the default value d if not found
// ms getOrElse (k, d)
println(artists getOrElse("Cro", "Paper" -> "Singer"))

// The map containing all mappings of ms as well as the mapping k -> v from key k to value v
// ms + (k -> v)
println(artists + ("Lola" -> "Unknown"))

// The map containing all mappings of ms as well as all key-value pairs of kvs
// ms + kvs
println(artists + ("1" -> "One", "2" -> "Two"))

// A map view containing only those mappings in ms where the key satisfies predicate p
// ms filterKeys p
println(artists filterKeys(k => k == "Michael Jackson"))

// A map view resulting from applying function f to each value associated with a key in ms
println(artists mapValues(k => k + "01"))

// Adds mapping from key k to value v to map ms as a side effect, overwriting any previous mapping of k
// ms(k) = v, ms.update(k, v)

import collection.mutable.Map
val k = collection.mutable.Map[Int, String]()
k += (1 -> "one")
k += (2 -> "two")
println(k)

k(1) = "satu"
println(k)

// If key k is defined in map ms, return its associated value. Otherwise, update ms with mapping k-> d and return d
// ms getOrElseUpdate(k, d)

println(k getOrElseUpdate(3, "Three"))
println(k)

// Remove all mappings from ms
// ms.clear()

k.clear()
println(k)
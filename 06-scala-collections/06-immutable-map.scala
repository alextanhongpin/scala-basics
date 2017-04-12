// 06-immutable-map.scala

// Using immutable map without requiring an import
val m = Map(1 -> "a", 2 -> "b")

// Using an immutable map with the prefix
val n = collection.immutable.Map(1 -> "a", 2 -> "b")

// Using an immutable sortedMap
val o = collection.immutable.SortedMap(1 -> "a", 2 -> "b")

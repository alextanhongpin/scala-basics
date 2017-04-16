// 05-flattening

val allies = List(List("Java", "Scala"), List("JavaScript", "PHP"))

val languages = allies.flatten
println(languages)

val jargon = allies.flatten.map(_.toUpperCase).sorted
println(jargon)

val webFriends = List("Java", "JS")
val javaFriends = List("Scala", "Clojure", "Ceylon")
val jsFriends = List("PHP", "Ceylon")

val friendsOfFriends = List(javaFriends, jsFriends)
println(friendsOfFriends)

val uniqueFriends = friendsOfFriends.flatten.distinct
println(uniqueFriends)

// Flattening a string produces a list of its chars
val stuff = List("SMACK", "Scala")
println(stuff.flatten)

// If a collection contains elements of type None,
// flattening removes them
// If a collection contains elements of type Some,
// flattening removes them

val boxes = Vector(Some("Something"), None, Some(3.14), None)
println(boxes.flatten)
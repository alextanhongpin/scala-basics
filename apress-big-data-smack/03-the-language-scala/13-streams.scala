// 13-streams.scala

val torrent = (0 to 9000000).toStream

println(torrent.head)
println(torrent.tail)
println(torrent.take(3))
println(torrent.filter(_ < 100))
println(torrent.filter(_ > 100))
println(torrent.map{_ * 2})

println(torrent(5))
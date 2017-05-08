case class Artist(name: String, genre: String)
case class ArtistWithAlbums(artist: Artist, albums: List[String])

val artists = List(Artist("Pink Floyd", "Rock"),
	Artist("Led Zeppelin", "Rock"),
	Artist("Michael Jackson", "Pop"),
	Artist("Above & Beyond", "Trance"))


val rockArtists = for(Artist(name, genre) <- artists; if genre == "Rock")
yield name

println(rockArtists)


artists withFilter {
	case Artist(name, genre) => genre == "Rock"
} map {
	case Artist(name, genre) => name
}


val artistWithAlbums = List(ArtistWithAlbums(Artist("Pink Floyd", "Rock"), List("Dark Side of the Moon", "Wall")),
	ArtistWithAlbums(Artist("Led Zeppelin", "Rock"), List("Presence")),
	ArtistWithAlbums(Artist("Michael Jackson", "Pop"), List("Bad", "Thriller")))


val rockAlbums = for { ArtistWithAlbums(artist, albums) <- artistWithAlbums 
	album <- albums
	if (artist.genre == "Rock")
} yield album

println(rockAlbums)
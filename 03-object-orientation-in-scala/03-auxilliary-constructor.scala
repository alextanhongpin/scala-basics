class Book(var title: String, var ISBN: Int) {


  def this(title: String) {
    this(title, 2222)
  }
  def this() {
    this("Beginning Erlang")
    this.ISBN = 1111
  }

  override def toString = s"$title ISBN - $ISBN"
}

val book1 = new Book
println(book1)

val book2 = new Book("Beginning Clojure")
println(book2)

val book3 = new Book("Beginning Scala", 3333)
println(book3)
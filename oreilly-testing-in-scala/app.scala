
import scala.io._
import org.json4s._
import org.json4s.native.JsonMethods._


object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")

    val response = Source.fromURL(
      "https://api.github.com/users/odersky"
    ).mkString

    // Parse the response into josn with json4s
    val jsonResponse = parse(response)

    val JObject(fields) = jsonResponse
    println(fields)

    val firstField = fields.head
    println(firstField)

    val JField("login", JString(value)) = firstField
    println(value)

    // Extract every string field in our fields list
    val allString = for {
      JField(key, JString(value)) <- fields
    } yield (key -> value)

    println(allString)

    // Search for specific fields
    val followerList = for {
      JField("followers", JInt(followers)) <- fields
    } yield followers
    println(followerList)

    // Extract the first value from this list using headOption
    val followers = followerList.headOption
    println(followers)

    // Extract multiple fields
    val x = {
      for {
        JField("login", JString(loginName)) <- fields
        JField("id", JInt(id)) <- fields
      } yield (id -> loginName)
    }.headOption
    println("Printing multiple fields")
    println(x)

    val y = jsonResponse \ "login"
    println(y)


    val jsonResponse2 = parse(Source.fromURL(
      "https://api.github.com/repos/pbugnion/s4ds"
    ).mkString)

    val JString(ownerLogin) = jsonResponse2 \ "owner" \ "login"
    println(ownerLogin)

    val jsonResponse3 = parse(Source.fromURL(
      "https://api.github.com/users/odersky/repos"
    ).mkString)

    val size = for {
      JInt(size) <- (jsonResponse3 \ "size")
    } yield size
    println(size)
  }



}

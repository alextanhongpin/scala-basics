import scala.io._
import org.json4s._
import org.json4s.native.JsonMethods._

object GitHubUser {

  implicit val formats = DefaultFormats

  case class User(id: Long, userName: String)

  def main(args: Array[String]) {

    // Extract username from argument list
    val name = args.headOption.getOrElse {
      throw new IllegalArgumentException(
        "Missing command line argument for user."
      )
    }
    val user = fetchUserFromUrl(
      s"https://api.github.com/users/$name"
    )
    println(user)
  }
  /** Query the GithubAPI corresponding to `url`
    *  and convert the response to a User.
    */
  def fetchUserFromUrl(url: String):User = {
    val response = Source.fromURL(url).mkString
    val jsonResponse = parse(response)
    extractUser(jsonResponse)
  }
  /** Helper method for transforming the response to a User */
  def extractUser(obj:JValue):User = {
    val transformedObject = obj.transformField {
      case ("login", name) => ("userName", name)
    }
    transformedObject.extract[User]
  }
}


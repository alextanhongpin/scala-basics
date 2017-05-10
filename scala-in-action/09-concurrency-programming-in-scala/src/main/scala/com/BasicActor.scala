import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.ActorRef
import akka.actor.Props
import com.WordCount._

case class Name(name: String)

class GreetingsActor extends Actor {
	def receive = {
		case Name(n) => println("Hello " + n)
	}
}

object BasicActor {

	def main(args: Array[String]): Unit = {
		val system = ActorSystem("greetings")
		val a: ActorRef = system.actorOf(Props[GreetingsActor], name = "greetings-actor")

		a ! Name("John Doe")

		// Thread.sleep(50)
		// system.shutdown

		val system2 = ActorSystem("word-count-system")

		val m = system.actorOf(Props[WordCountMaster], name = "master")
		m ! StartCounting("src/main/resources/", 2)
	}

}

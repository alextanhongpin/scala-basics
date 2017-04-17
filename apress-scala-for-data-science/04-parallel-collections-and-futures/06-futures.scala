// 06-futures.scala

import scala.io._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
import scala.xml.XML
import scala.concurrent.duration._

val url = "http://dev.markitondemand.com/MODApis/Api/v2/Quote?symbol=GOOG"
val response = Future { Source.fromURL(url).mkString }
println(response)

val strResponse = Future {
  Thread.sleep(10000)
  val res = Source.fromURL(url).mkString
  println("Finished fetching url")
  res
}
println(strResponse)


response.onComplete {
  case Success(s) => println(s)
  case Failure(e) => println(s"Error fetching page: $e")
  case _ => println("this is something")
}
val xmlResponse = strResponse.map { s =>
  println("Applying string to xml transformation")
  XML.loadString(s)
}

strResponse.onComplete {
  case Success(s) => println(s)
  case Failure(e) => println(s"Error fetching page: $e")
  case _ => println("this is something")
}

Await.ready(strResponse, 1 minute)

println(xmlResponse.value)
println("success")
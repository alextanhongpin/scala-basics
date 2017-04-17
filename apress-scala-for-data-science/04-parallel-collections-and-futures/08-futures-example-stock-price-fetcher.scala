// 08-futures-example-stock-price-fetcher.scala

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io._
import scala.xml.XML
import scala.util._

object StockPriceDemo extends App {

  /* Construct URL for stock symbol */
  def urlFor(stockSymbol: String) =
  ("http://dev.markitondemand.com/MODApis/Api/v2/Quote?" + s"symbol=${stockSymbol}")

  /* Build a future that fetches a stock price */
  def fetchStockPrice (stockSymbol: String):Future[BigDecimal] = {
    val url = urlFor(stockSymbol)
    val strResponse = Future { Source.fromURL(url).mkString }
    val xmlResponse = strResponse.map{ s => XML.loadString(s) }
    val price = xmlResponse.map {
      r => BigDecimal((r \ "LastPrice").text)
    }
    price
  }

  /* Command line interface */
  println("Enter symbol at prompt:")
  while (true) {
    val symbol = readLine("> ") // Wait for user input
    fetchStockPrice(symbol).onComplete { res => 
      println()
      res match {
        case Success(price) => println(s"$symbol: USD $price")
        case Failure(e) => println(s"Error fetching $symbol: $e")
      }
      print("> ")
    }
  }
}
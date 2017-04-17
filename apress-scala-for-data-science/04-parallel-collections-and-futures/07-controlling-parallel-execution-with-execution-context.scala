// 07-controlling-parallel-execution-with-execution-context.scala
import scala.io._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
import java.util.concurrent.Executors
val ec = ExecutionContext.fromExecutorService(
  Executors.newFixedThreadPool(16)
)

val f = Future { Thread.sleep(1000) }(ec)

// implicit val context = ec
ec.shutdown()
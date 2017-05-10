
type Closable = { def close: Unit }

def close(closable: { def close: Unit }) = {
	closable.close
}


type Profile = {
	def name: String
	def address: String
}

val myProfile = new {
	def name: "John"
	def address: "Earth"
}

// Without structural type
trait Worker {
	def salary: BigDecimal
		def bonusPercentage: Double
}

trait HourlyWorker {
	def hours: Int
	def salary: BigDecimal
}

case class FullTimeWorker(val salary: BigDecimal, ...) extends Worker
case class PartTimeWorker(val hours: Int, val salary: BigDecimal, ...) extends HourlyWorker
case class StudentWorker(val hours: Int, val salary: BigDecimal, ...) extends HourlyWorker

// With structural type
trait SalariedWorker {
	def salary: BigDecimal
}

trait Worker extends SalariedWorker {
	def bonusPercentage: Double
}
trait HourlyWorker extends SalariedWorker {
	def hours: Int
}

def amountPaidAsSalary(workers: Vector[SalariedWorker]) = {}

def amountPaidAsSalary2(workers: Vector[{ def salary: BigDecimal }]) = {}
package com.example.typeclasses
import scala.language.higherKinds


object PayrollSystemWithTypeClass {
	case class Employee(name: String, id: Long)

	trait PayrollProcessor[C[_], A] {
		def processPayroll(payees: Seq[A]): Either[String, Throwable]
	}

	case class USPayroll[A] (payees: Seq[A])(implicit processor: PayrollProcessor[USPayroll, A]) {
		def processPayroll = processor.processPayroll(payees)
	}

	case class CanadaPayroll[A] (payees: Seq[A])(implicit processor: PayrollProcessor[CanadaPayroll, A]) {
		def processPayroll = processor.processPayroll(payees)
	}
}

object PayrollSystemWithTypeClassExtension {
	import PayrollSystemWithTypeClass._

	case class JapanPayroll[A] (payees: Vector[A])(implicit processor: PayrollProcessor[JapanPayroll, A]) {
		def processPayroll = processor.processPayroll(payees)
	}
	case class Contractor(name: String)
}

object PayrollProcessor {
	import PayrollSystemWithTypeClass._

	implicit object USPayrollProcessor extends PayrollProcessor[USPayroll, Employee] {
		def processPayroll(payees: Seq[Employee]) = Left("us employees are processed")
	}

	implicit object USContractorPayrollProcessor extends PayrollProcessor[USPayroll, Contractor] {
		def processPayroll(payees: Seq[Contractor]) = Left("us contractors are processed")
	}
	implicit object CanadaPayrollProcessor extends PayrollProcessor[CanadaPayroll, Employee] {
		def processPayroll(payees: Seq[Employee]) = Left("us employees are processed")
	}
	implicit object CanadaContractorPayrollProcessor extends PayrollProcessor[CanadaPayroll, Contractor] {
		def processPayroll(payees: Seq[Contractor]) = Left("canada contractors are processed")
	}
}
object PayrollProcessorExtension {
	import PayrollSystemWithTypeClassExtension._
	import PayrollSystemWithTypeClass._

	implicit object JapanPayrollProcessor extends PayrollProcessor[JapanPayroll, Employee] {
		def processPayroll(payees: Seq[Employee]) = Left("Japan employees are processed")
	}
	implicit object JapanContractorPayrollProcessor extends PayrollProcessor[JapanPayroll, Contractor] {
		def processPayroll(payees: Seq[Contractor]) = Left("japan contractors are processed")
	}
}


object RunPayroll {
	import PayrollSystemWithTypeClass._
	import PayrollProcessor._
	import PayrollSystemWithTypeClassExtension._
	import PayrollProcessorExtension._

	def main(args: Array[String]): Unit = run
	def run = {
		val r = USPayroll(Vector(Employee("a", 1))).processPayroll
		println(r)
		val r1 = JapanPayroll(Vector(Employee("a", 1))).processPayroll
		val r2 = JapanPayroll(Vector(Contractor("a"))).processPayroll
	}
}
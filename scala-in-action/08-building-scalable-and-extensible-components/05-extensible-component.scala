case class Employee(name: String, id: Long)
case class Contractor(name: String)

trait Payroll {
	def processEmployee(employees: Vector[Employee]): Either[String, Throwable]
}

trait Payroll extends super.Payroll {
	def processEmployee(employees: Vector[Employee]): Either[String, Throwable]
	def processContractors(contractors: Vector[Contractor]): Either[String, Throwable]
}

class USPayroll extends Payroll {
	def processEmployee(employees: Vector[Employee]) = //...
}

class CanadaPayroll extends Payroll {
	def processEmployee(employees: Vector[Employee]) = //...
}

class JapanPayroll extends Payroll {
	def processEmployee(employees: Vector[Employee]) = //...
}
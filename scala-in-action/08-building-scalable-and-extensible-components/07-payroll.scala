trait PayrollSystem {
	case class Employee(name: String, id: Long)
	type P <: Payroll
	trait Payroll {
		def processEmployee(employees: Vector[Employee]): Either[String, Throwable]
	}
	def processPayroll(p: P): Either[String, Throwable]
}

trait USPayrollSystem extends PayrollSystem {
	class USPayroll extends Payroll {
		def processEmployees(employees: Vector[Employee]) = Left("US Payroll")
	}
}

trait CanadaPayrollSystem extends PayrollSystem {
	class CanadaPayroll extends Payroll {
		def processEmployees(employees: Vector[Employee]) = Left("Canada payroll")
	}
}

trait JapanPayrollSystem extends PayrollSystem {
	class JapanPayroll extends Payroll {
		def processEmployees(employees: Vector[Employee]) = Left("US Payroll")
	}
}

object USPayrollInstance extends USPayrollSystem {
	type P = USPayroll
	def processPayroll(p: USPayroll) = {
		val employees: Vector[Employee] = // ...
		val result = p.processEmployees(employees)
	}
}

trait ContractorPayrollSystem extends PayrollSystem {
	type P <: Payroll
	case class Contractor(name: String)

	trait Payroll extends super.Payroll {
		def processContractors(contractors: Vector[Contractor]): Either[String, Throwable]
	}
}

trait USContractorPayrollSystem extends USPayrollSystem with ContractorPayrollSystem {
	class USPayroll extends super.USPayroll with Payroll {
		def processContractors(contractors: Vector[Contractor]) = Left("US contract payroll")
	}
}

trait CanadaContractorPayrollSystem extends CanadaPayrollSystem with ContractorPayrollSystem {
	class CanadaPayroll extends super.CanadaPayroll with Payroll {
		def processContractors(contractors: Vector[Contractor]) = Left("Canada contract payroll")
	}
}

object RunNewPayroll {
	object USNewPayrollInstance extends USContractorPayrollSystem {
		type P = USPayroll
		def processPayroll(p: USPayroll) = {
			p.processEmployees(Vector(Employee("a", 1)))
			p.processContractors(Vector(Contractor("b")))
			Left("Payroll processed successfully")
		}
	}

	def main(args: Array[String]): Unit = run
	def run = {
		val usPayroll = new USPayroll
		USNewPayrollInstance.processPayroll(usPayroll)
	}
}

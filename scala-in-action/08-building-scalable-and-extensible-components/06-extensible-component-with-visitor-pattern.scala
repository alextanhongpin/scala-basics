case class Employee(name: String, id: Long)
case class Contractor(name: String)

case class USPayroll {
	def accept(v: PayrollVisitor) = v.visit(this)
}
case class CanadaPayroll {
	def accept(v: PayrollVisitor) = v.visit(this)
}

trait PayrollVisitor {
	def visit(payroll: USPayroll): Either[String, Throwable]
	def visit(payroll: CanadaPayroll): Either[String, Throwable]
}

class EmployeePayrollVisitor extends PayrollVisitor {
	def visit(payroll: USPayroll): Either[String, Throwable]
	def visit(payroll: CanadaPayroll): Either[String, Throwable]
}

class ContractorPayrollVisitor extends PayrollVisitor {
	def visit(payroll: USPayroll): Either[String, Throwable]
	def visit(payroll: CanadaPayroll): Either[String, Throwable]
}
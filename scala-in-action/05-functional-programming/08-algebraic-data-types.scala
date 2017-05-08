// ADT is a classification

object ADT {
	// No one else can extend the trait and create a new type of Account unless
	// it's defined in the same source file
	sealed trait Account

	case class CheckingAccount(accountId: String) extends Account
	case class SavingAccount(accountId: String, limit: Double) extends Account
	case class PremiumAccount(corporateId: String, accountHolder: String) extends Account

	// Total function : one that knows how to handle all the values of an algebraic data type and always produces a result
	def printAccountDetails(account: Account): Unit = account match {
		case CheckingAccount(accountId) =>
			println("Account id " + accountId)
		case SavingAccount(accountId, limit) => 
			println("Account id " + account + " limit " + limit)
		// It would fail on the following input: PremiumAccount(_, _)
		case PremiumAccount(corporateId, accountHolder) => {
			println("Corporate id " + corporateId + ", account holder " + accountHolder)
		}
             
	}
}
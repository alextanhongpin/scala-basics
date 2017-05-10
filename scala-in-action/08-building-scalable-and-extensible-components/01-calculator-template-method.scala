trait Calculator {
	def initialize: DbConnection
	def close(s: DbConnection): Unit
	def calculate(productId: String): Double = {
		val s = initialize
		val price = calculate(s, productId)
		close(s)
		price
	}
	def calculate(s: DbConnection, productId: String): Double
}
// This Calculator trait abstracts out the type that knows how to connect to 
// the data source
package abstractMember {
	trait Calculator {
		type S
		// initialize makes connection to the data source
		def initialize: S

		// close the connection
		def close(s: S): Unit
		def calculate(productId: String): Double = {
			val s = initialize
			val price = calculate(s, productId)
			close(s)
			price
		}
		def calculate(s: S, productIdL String): Double
	}
}


// Example: Using MongoDB as data source
class CostPlusCalculator extends Calculator {
	type S = MongoClient
	def initialize = new MongoClient
	def close(dao: MongoClient) = dao.close

	def calculate(source: MongoClient, productId: String) = {

	}
}
class MongoClient = {
	def close = {}
}
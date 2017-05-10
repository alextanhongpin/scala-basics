trait B = {
	def b: Unit = {}
}

trait A { self: B => 
	def a: Unit = b	
}

package selfTypeAnnotation {
	trait Connection {
		def query(q: String): String
	}

	trait Logger {
		def log(l: String): Unit
	}

	trait RequiredServices {
		def makeDatabaseConnection: Connection
		def logger: Logger
	}

	// Implement RequiredServices for test
	trait TestService extends RequiredServices {
		def makeDatabaseConnection = new Connection { def query(q: String) = "test"}
		def logger = new Logger { def log(l: String) = println(l) }
	}


	// The RequiredServices trait declares all the services that could be used by
	// the product finder
	trait ProductFinder { this: RequiredServices =>
		def findProduct(productId: String) = {
			val c = makeDatabaseConnection
			c.query("Find the lowest price")
			logger.log("querying database...")
		}
	}

	// Final object that composes all the trait
	object FinderSystem extends ProductFinder with TestService
}
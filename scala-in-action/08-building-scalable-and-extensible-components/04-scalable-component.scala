
trait OrderingSystem {
	type O <: Order
	type I <: Inventory
	type S <: Shipping

	trait Order { def placeOrder(i: I): Unit }
	trait Inventory { def itemExists(order: O): Boolean }
	trait Shipping { def scheduleShipping(order: O): Long }

	// Self type annotation with two mixin traits
	trait Ordering {this: I with S => 
		def placeOrder(o: O): Option[Long] = {
			if(itemExists(o)) {
				o.placeOrder(this)
				Some(scheduleShipping(o))
			}
			else None
		}
	}
}


object BookOrderingSystem extends OrderingSystem {
	type O = BookOrder
	type I = AmazonBookStore
	type S = UPS

	class BookOrder extends Order {
		def placeOrder(i: AmazonBookStore): Unit = {}
	}

	trait AmazonBookStore extends Inventory {
		def itemExists(o: BookOrder) = True
	}

	trait UPS extends Shipping {
		def scheduleShipping(order: BookOrder): Long = 0.0
	}
	object BookOrdering extends Ordering with AmazonBookStore with UPS
}

// import BookOrderingSystem._
// BookOrdering.placeOrder(new BookOrder)
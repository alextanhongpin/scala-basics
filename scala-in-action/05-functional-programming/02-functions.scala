// Class with method
class UseResource {
	def use(r: Resource): Boolean = {}
}

// Pure function
val use_func: Resource => Boolean = (new UseResource).use _
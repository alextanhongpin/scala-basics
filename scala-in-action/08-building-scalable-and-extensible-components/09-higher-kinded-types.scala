def fmap[A, B](xs: Vector[A], f: A => B): Vector[B] = xs map f

def fmap[A, B](r: Option[A], f: A => B): Option[B] = xs map f

// F[_] is a higher-kinded types , takes a parameter denoted by _
trait Mapper[F[_]] {
	def fmap[A, B](xs: F[A], f: A => B): F[B]
}

def VectorMapper = new Mapper[Vector] {
	def fmap[A, B](xs: Vector[A], f: A => B): Vector[B] = xs map f
}

def OptionMapper = new Mapper[Option] {
	def fmap[A, B](xs: Option[A], f: A => B): Option[B] = xs map f
}

// Using higher-kinded types, you can raise the abstraction level higher and define interfaces what work across various types

def Function0Mapper = new Mapper[Function0] {
	def fmap[A, B](r: Function0[A], f: A => B) = new Function0[B] {
		def apply = f(r.apply)
	}
}

val newFunction = Function0Mapper.fmap(() => "one", (s: String) => s.toUpperCase)
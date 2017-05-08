trait TaxStrategy { def taxIt(product: String): Double }

val taxIt: (TaxStrategy, String) => Double = (s, p) => s.taxIt(p)


class TaxFree extends TaxStrategy { override def taxIt(product: String) = 0.0 }

val taxFree = taxIt.curried(new TaxFree)

println(taxFree("SomeProduct"))


// Currying with method
def taxIt1(s: TaxStrategy, product: String) = { s.taxIt(product) }

val taxItF = taxIt1 _ 
println(taxItF)
println(taxItF.curried)


// Currying with multiple parameters
def taxIt2(s: TaxStrategy)(product: String) = { s.taxIt(product) }

val taxFree2 = taxIt2(new TaxFree) _
println(taxFree2("something"))
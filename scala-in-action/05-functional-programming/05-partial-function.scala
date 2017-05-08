def intToChar: PartialFunction[Int, Char] = {
	case 1 => 'a'
	case 3 => 'c'
}


println(intToChar(1))

def oneToFive: PartialFunction[Int, String] = {
    // val nums = Array("one", "two", "three", "four", "five")
    // def apply(i: Int) = nums(i-1)
    // def isDefinedAt(i: Int) = i > 0 && i < 6
	case 1 => "One"
	case 2 => "Two"
	case 3 => "Three"
	case 4 => "Four"
	case 5 => "Five"
}

def sixToTen: PartialFunction[Int, String] = {
	case 6 => "Six"
	case 7 => "Seven"
	case 8 => "Eight"
	case 9 => "Nine"
	case 10 => "Ten"
}

def oneToTen = oneToFive orElse sixToTen
println(oneToTen(4))
println(oneToTen(9))

sealed trait Claim { val claimId: Int }
case class Full(val claimId: Int) extends Claim
case class Partial(val claimId: Int, percentage: Double) extends Claim
case class Generic(val claimId: Int) extends Claim

case class Location(stateCode: Option[String], zipCode: Option[String])
case class Req(productId: String, location: Location, claim: Claim)

// PC stands for pricing criteria
type PC = Tuple2[Req, Option[Double]]

def handleFullClaim: PartialFunction[PC, PC] = {
	case (c@Req(id, 1, Full(claimId)), basePrice) => "something"
}

def handlePartialClaim: PartialFunction[PC, PC] = {
	case (c@Req(id, 1, Partial(claimId, percentage)), basePrice) => "something"
}

def handleZipCode: PartialFunction[PC, PC] = {
	case (c@Req(id, Location(_, Some(zipCode)), _), price) => "something"
}

def handleStateCode: PartialFunction[PC, PC] = {
	case (c@Req(id, Location(Some(stateCode), _), _), price) => "something"
}


// Combine with orElse or andThen
def claimHandlers = handleFullClaim orElse handlePartialClaim
def locationHandlers = handleZipCode orElse handleStateCode
def priceCalculator: PartialFunction[PC, PC] =
	claimHandlers andThen locationHandlers

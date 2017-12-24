object Builder extends App {
  case class UsedCar(make: String,
                     model: String,
                     kmDriven: Int,
                     yearOfManufacturing: Int,
                     hasGPS: Boolean = false,
                     hasAc: Boolean = false,
                     hasAirBags: Boolean = false,
                     hasAbs: Boolean = false) {
    require(yearOfManufacturing > 1970, "Incorrect year")
    require(checkMakeAndModel(), "Incorrect make and model")

    def checkMakeAndModel() = if (make == "Marutti") {
      model == "alto"
    } else if (make == "Toyota") {
      model == "Corolla"
    } else {
      true
    }
  }

  val usedMarutti = UsedCar(model = "alto", make = "Marutti", kmDriven = 10000, yearOfManufacturing = 1980, hasAbs = true, hasAirBags = true)
  println(usedMarutti)

  val usedCorolla = usedMarutti.copy(make = "Toyota", model = "Corolla")
  println(usedCorolla)

  // val wrongModel = usedCorolla.copy(model = "alto")
}
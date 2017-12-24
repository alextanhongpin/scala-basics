trait Currency {
  def getConversionRateToIndianRupee: String
}

object CurrencyConverter {
  private object EuroToRupee extends Currency {
    override def getConversionRateToIndianRupee = "82"
  }

  private object DollarToRupee extends Currency {
    override def getConversionRateToIndianRupee = "60"
  }

  private object NoIdea extends Currency {
    override def getConversionRateToIndianRupee = "No Idea"
  }

  // The currency factory method
  def apply(s: String): Currency = {
    if (s == "Dollar")
      DollarToRupee
    else if (s == "Euro")
      DollarToRupee
    else
      NoIdea
  }
}

val c = CurrencyConverter("KL")
println(c.getConversionRateToIndianRupee)
object TotalCostDonuts {
  def main(args: Array[String]): Unit = {
    val pricePerDonut = 2.50
    val numberOfDonuts = 10
    val totalCost = pricePerDonut * numberOfDonuts
    println(s"The total cost for buying $numberOfDonuts Glazed donuts is: $$${totalCost}")
  }
}

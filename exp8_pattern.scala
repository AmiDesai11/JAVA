object PatternPrinting {
  def main(args: Array[String]): Unit = {
    // Pattern 1: Printing stars in increasing order
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print("*")
      }
      println()
    }
  }
}

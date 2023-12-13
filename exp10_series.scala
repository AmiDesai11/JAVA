object SeriesValues {
  def main(args: Array[String]): Unit = {
    def seriesValue(a: Double, n: Int): Double = {
      def factorial(num: Int): Double = {
        if (num <= 1) 1
        else num * factorial(num - 1)
      }

      (1 to n).map(x => Math.pow(a, x) / factorial(x)).sum
    }

    val value = seriesValue(2, 5) // Example values, change as needed
    println(s"The value of the series is: $value")
  }
}

object SumOrTripleSum {
  def main(args: Array[String]): Unit = {
    def sumOrTripleSum(a: Int, b: Int): Int = {
      if (a == b) 3 * (a + b)
      else a + b
    }

    val num1 = 5
    val num2 = 5 // Change values as needed
    val result = sumOrTripleSum(num1, num2)
    println(s"The result is: $result")
  }
}

object MultiplicationOfNumbers {
  def main(args: Array[String]): Unit = {
    def multiplyNumbers(numbers: Int*): Long = {
      if (numbers.isEmpty) 0
      else numbers.product
    }

    val result = multiplyNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"The multiplication of the first 10 numbers is: $result")
  }
}

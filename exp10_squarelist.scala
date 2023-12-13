object SumOfSquares {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5) // Example list, change it as needed
    val sumOfSquares = numbers.map(x => x * x).sum
    println(s"The sum of squares of the given list is: $sumOfSquares")
  }
}

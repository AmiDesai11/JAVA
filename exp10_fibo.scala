object Fibonacci {
  def main(args: Array[String]): Unit = {
    def fib(n: Int): Int = {
      if (n <= 1) n
      else fib(n - 1) + fib(n - 2)
    }

    val n = 6 // Change 'n' to get the desired Fibonacci number
    val result = fib(n)
    println(s"The $n-th Fibonacci number is: $result")
  }
}

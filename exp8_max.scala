object exp8_max {
  def main(args: Array[String]): Unit = {
    // Function to find the maximum of three numbers
    def findMax(a: Int, b: Int, c: Int): Int = {
      if (a >= b && a >= c) {
        a
      } else if (b >= a && b >= c) {
        b
      } else {
        c
      }
    }
    
    // Predefined values
    val num1 = 25
    val num2 = 48
    val num3 = 37
    
    // Finding the maximum number
    val maxNumber = findMax(num1, num2, num3)
    
    // Displaying the maximum number
    println(s"The maximum number among $num1, $num2, and $num3 is: $maxNumber")
  }
}

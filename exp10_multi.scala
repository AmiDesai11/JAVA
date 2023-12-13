object CheckMultiple {
  def main(args: Array[String]): Unit = {
    // Function to check if a number is a multiple of 3 or 7
    def checkMultiple(num: Int): Unit = {
      if (num % 3 == 0 && num % 7 == 0) {
        println(s"$num is a multiple of both 3 and 7.")
      } else if (num % 3 == 0) {
        println(s"$num is a multiple of 3.")
      } else if (num % 7 == 0) {
        println(s"$num is a multiple of 7.")
      } else {
        println(s"$num is neither a multiple of 3 nor 7.")
      }
    }

    // Given positive number to check
    val number = 21 // You can change this number to test different values

    // Check if the number is a multiple of 3 or 7
    checkMultiple(number)
  }
}

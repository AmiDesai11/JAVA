object StringInterpolationDemo {
  def main(args: Array[String]): Unit = {
    val name = "Alice"
    val age = 30
    val city = "Wonderland"

    // Using s-interpolator to embed variables and expressions within a string
    val message = s"Hello, my name is $name. I am $age years old and I live in $city."
    println(message)

    // Using f-interpolator for formatted strings
    val formattedMessage = f"Hello, $name. You will be turning ${age + 1} next year."
    println(formattedMessage)

    // Using raw-interpolator to ignore escape characters
    val rawString = raw"Raw string with \n escape characters."
    println(rawString)
  }
}

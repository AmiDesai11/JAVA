object NumberToWords {
  def main(args: Array[String]): Unit = {
    // Function to convert a single digit to word
    def digitToWord(digit: Int): String = digit match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
      case _ => ""
    }

    // Function to convert a given number to words
    def numberToWords(number: Int): String = {
      var num = number
      var result = ""
      
      while (num > 0) {
        val digit = num % 10
        result = digitToWord(digit) + " " + result
        num = num / 10
      }
      
      result.trim()
    }

    // Given number
    val givenNumber = 123

    // Convert the given number to words
    val words = numberToWords(givenNumber)

    // Display the number in words
    println(s"The number $givenNumber in words is: $words")
  }
}

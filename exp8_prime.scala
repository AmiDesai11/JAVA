object PrimeNumberCheck {
  def main(args: Array[String]): Unit = {
    // Function to check if a number is prime
    def isPrime(number: Int): Boolean = {
      if (number <= 1)
        return false
      var i = 2
      var isPrimeNumber = true
      
      // Using a do-while loop to check for divisibility
      do{
        if (number % i == 0) {
          isPrimeNumber = false
        }
        i += 1
      } while (i * i <= number && isPrimeNumber)
      
      isPrimeNumber
    }

    // Given number to check for primality
    val givenNumber = 17

    // Check if the given number is prime
    val isGivenNumberPrime = isPrime(givenNumber)

    // Display the result
    if (isGivenNumberPrime) {
      println(s"$givenNumber is a prime number.")
    } else {
      println(s"$givenNumber is not a prime number.")
    }
  }
}

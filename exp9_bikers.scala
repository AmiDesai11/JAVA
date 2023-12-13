object RaceQualification {
  def main(args: Array[String]): Unit = {
    // Function to calculate average speed of racers
    def calculateAverageSpeed(speeds: Array[Double]): Double = {
      speeds.sum / speeds.length
    }

    // Function to find qualifying racers based on average speed
    def findQualifyingRacers(speeds: Array[Double], averageSpeed: Double): Array[Double] = {
      speeds.filter(_ > averageSpeed)
    }

    // Taking input for speeds of five racers
    println("Enter speeds of the five racers:")
    val speeds = new Array[Double](5)
    for (i <- 0 until 5) {
      print(s"Enter speed of racer ${i + 1}: ")
      speeds(i) = scala.io.StdIn.readDouble()
    }

    // Calculating average speed
    val averageSpeed = calculateAverageSpeed(speeds)

    // Finding qualifying racers based on average speed
    val qualifyingRacers = findQualifyingRacers(speeds, averageSpeed)

    // Displaying the speed of qualifying racers
    if (qualifyingRacers.isEmpty) {
      println("No racer qualified for the race.")
    } else {
      println("Speeds of qualifying racers:")
      qualifyingRacers.foreach(speed => println(speed))
    }
  }
}

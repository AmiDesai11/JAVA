class exp9_circle {
  private var radius: Double = 0.0
  private var area: Double = 0.0

  // Method to accept radius
  def acceptRadius(r: Double): Unit = {
    if (r > 0) {
      radius = r
    } else {
      println("Radius should be a positive number.")
    }
  }

  // Method to calculate area
  def calculateArea(): Unit = {
    area = math.Pi * radius * radius
  }

  // Method to display the area
  def displayArea(): Unit = {
    println(s"The area of the circle with radius $radius is: $area")
  }
}

object CircleDemo {
  def main(args: Array[String]): Unit = {
    val circle = new exp9_circle()

    // Accepting radius
    circle.acceptRadius(5.0) // You can change the radius value here

    // Calculating area
    circle.calculateArea()

    // Displaying the area
    circle.displayArea()
  }
}

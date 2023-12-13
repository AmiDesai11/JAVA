class exp9-rectangle(var length: Double, var breadth: Double) {
  def area(): Double = {
    length * breadth
  }

  def perimeter(): Double = {
    2 * (length + breadth)
  }
}

class Square(side: Double) extends Rectangle(side, side)

object Main {
  def main(args: Array[String]): Unit = {
    // Creating an object of Rectangle
    val rectangle = new Rectangle(5.0, 8.0)

    // Printing area and perimeter of Rectangle
    println("Rectangle:")
    println(s"Area: ${rectangle.area()}")
    println(s"Perimeter: ${rectangle.perimeter()}")

    // Creating an object of Square
    val square = new Square(4.0)

    // Printing area and perimeter of Square
    println("\nSquare:")
    println(s"Area: ${square.area()}")
    println(s"Perimeter: ${square.perimeter()}")
  }
}

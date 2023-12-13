abstract class Shape {
  def rectangleArea(length: Double, breadth: Double): Double
  def squareArea(side: Double): Double
  def circleArea(radius: Double): Double
}

class Area extends Shape {
  override def rectangleArea(length: Double, breadth: Double): Double = length * breadth
  override def squareArea(side: Double): Double = side * side
  override def circleArea(radius: Double): Double = Math.PI * radius * radius
}

object Main {
  def main(args: Array[String]): Unit = {
    val shape = new Area()

    val rectangleArea = shape.rectangleArea(5.0, 8.0)
    val squareArea = shape.squareArea(4.0)
    val circleArea = shape.circleArea(3.0)

    println(s"Area of Rectangle: $rectangleArea")
    println(s"Area of Square: $squareArea")
    println(s"Area of Circle: $circleArea")
  }
}

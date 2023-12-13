class Shape {
  def printShape(): Unit = {
    println("This is shape")
  }
}

class Rectangle extends Shape {
  override def printShape(): Unit = {
    println("This is rectangular shape")
  }
}

class Circle extends Shape {
  override def printShape(): Unit = {
    println("This is circular shape")
  }
}

class Square extends Rectangle {
  def printSquare(): Unit = {
    println("Square is a rectangle")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val square = new Square()

    // Call method of 'Shape' class by object of 'Square' class
    square.printShape()

    // Call method of 'Rectangle' class by object of 'Square' class
    square.printSquare()
  }
}
